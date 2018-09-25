package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.ClubEntity;
import entities.JugadorEntity;
import exceptions.ClubException;
import exceptions.JugadorException;
import hbt.HibernateUtil;
import negocio.Club;
import negocio.Jugador;

public class JugadorDAO {

	/** Yo soy un DAO, asi que no tengo estado, mas que las variable que necesito para instanciarme.
	 *  Nunca voy a tener un método de negocio dentro mio
	 * */
	private static JugadorDAO instancia;
	
	private JugadorDAO() {}
	
	public static JugadorDAO getInstance() {
		if(instancia == null)
			instancia = new JugadorDAO();
		return instancia;
	}

	public Jugador getJugadorById(String tipo, Integer numero) throws JugadorException {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		JugadorEntity je = (JugadorEntity) session.createQuery("from JugadorEntity where id.tipo = ? and id.numero = ?")
					.setParameter(0, tipo)
					.setParameter(1, numero)
					.uniqueResult();
		if(je != null)
			return toNegocio(je);
		else 
			throw new JugadorException("El jugador solicitado no existe");
	}
	
	public void grabar(Jugador jugador){
		JugadorEntity je = toEntity(jugador);
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(je);
		session.getTransaction().commit();
		session.close();
		
	}

	Jugador toNegocio(JugadorEntity je){
		Jugador jugador = new Jugador(je.getIdJugador().getTipo(), je.getIdJugador().getNumero(), je.getNombre());
		jugador.setCategoria(je.getCategoria());
		jugador.setClub(ClubDAO.getInstance().toNegocio(je.getClub()));
		return jugador;
	}
	
	JugadorEntity toEntity(Jugador jugador){
		JugadorEntity je = new JugadorEntity(jugador.getTipo(), jugador.getNumero(), jugador.getNombre());
		Club club = null;
		try {
			club = ClubDAO.getInstance().findByID(jugador.getClub().getIdClub());
		} catch (ClubException e) { 
			e.printStackTrace();
		}
		ClubEntity ce = ClubDAO.getInstance().toEntity(club);
		je.setClub(ce);
		je.setCategoria(jugador.getCategoria());
		return je;
	}

}
