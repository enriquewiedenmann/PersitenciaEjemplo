package controlador;

import dao.ClubDAO;
import dao.JugadorDAO;
import dto.JugadorDTO;
import exceptions.ClubException;
import exceptions.JugadorException;
import negocio.Club;
import negocio.Jugador;

public class Controlador {

	private static Controlador instancia;

	private Controlador() { }
	
	public static Controlador getInstancia(){
		if(instancia == null)
			instancia = new Controlador();
		return instancia;
	}
	
	public JugadorDTO getJugadorByDNI(String tipo, Integer numero) throws JugadorException
	{
		return JugadorDAO.getInstance().getJugadorById(tipo, numero).toDTO();
	}
	
	public void nuevoJugador(String tipo, int numero, String nombre, Integer idClub)
	{
		Club club;
		try {
			club = ClubDAO.getInstance().findByID(idClub);
			Jugador jugador = new Jugador(tipo,numero,nombre);
			jugador.setClub(club);
			jugador.setCategoria(88);
			jugador.save();
		} catch (ClubException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
