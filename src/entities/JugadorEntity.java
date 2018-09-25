package entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="jugadores")
public class JugadorEntity {

	/**
	 * Yo soy una entity, me encargo de hacer coincidir el estado de un objeto con la tabla 
	 * donde lo persistimos.
	 * 
	 * No tengo comportamiento de negocio, tampoco de acceso a los datos. Posea una serie de instrucciones
	 * para hacer mi trabajo.
	 * */
	
	@EmbeddedId
	private IdJugador id; 
	private String nombre;
	@Column(name="categori") //AGRGE
	private int categoria;
	@ManyToOne()
	@JoinColumn(name="club") //@JoinColumn(name="id_club")
	private ClubEntity club;
	
	public JugadorEntity() {} 
	
	public JugadorEntity(String tipo, Integer numero, String nombre) {
		super();
		this.id = new IdJugador();
		this.id.setTipo(tipo);
		this.id.setNumero(numero);
		this.nombre = nombre;
	}
	
	public IdJugador getIdJugador(){
		return this.id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public ClubEntity getClub() {
		return club;
	}
	public void setClub(ClubEntity club) {
		this.club = club;
	}
	
	public void dummyMetodo()
	{
		System.out.println("Soy un objeto de negocio por que tengo comportamiento");
	}
	
}
