package negocio;

import dao.JugadorDAO;
import dto.JugadorDTO;

public class Jugador {
	/**
	 * Yo soy un objeto de negocio, asi que tengo datos y comportamiento que permite modificar los datos.
	 * */
	
	private String tipo;
	private Integer numero;
	private String nombre;
	private int categoria;
	private Club club;
	
	public Jugador(String tipo, Integer numero, String nombre) {
		super();
		this.tipo = tipo;
		this.numero = numero;
		this.nombre = nombre;
	}
	
	public void save(){
		JugadorDAO.getInstance().grabar(this);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
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
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	
	public void dummyMetodo()
	{
		System.out.println("Soy un objeto de negocio por lo que tengo comportamiento");
	}
	
	public JugadorDTO toDTO()
	{
		return new JugadorDTO(tipo, numero, nombre, categoria, club.getNombre());
	}
}
