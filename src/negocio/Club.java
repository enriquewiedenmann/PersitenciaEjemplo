package negocio;

public class Club {

	/**
	 * Yo soy un objeto de negocio, asi que tengo datos y comportamiento que permite modificar los datos.
	 * */
	private Integer idClub;
	private String nombre;
	private int zona;	

	public Club(Integer idClub, String nombre, int zona) {
		this.idClub = idClub;
		this.nombre = nombre;
		this.zona = zona;
	}

	public Integer getIdClub() {
		return idClub;
	}

	public void setIdClub(Integer idClub) {
		this.idClub = idClub;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}
	
	public void dummyMetodo()
	{
		System.out.println("Soy un objeto de negocio por lo que tengo comportamiento");
	}
}
