package dto;

import java.io.Serializable;

public class ClubDTO implements Serializable{

	private static final long serialVersionUID = -4564959959497640310L;
	private Integer idClub;
	private String nombre;
	private int zona;
	
	/**
	 * Yo soy un DTO, asi que tengo solo estado, no tengo comportamiento de ningun tipo, solo acciones asociadas a la presentacion y/o trasferencia de datos
	 * */
	
	public ClubDTO() {}

	public ClubDTO(Integer idClub, String nombre, int zona) {
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
	
}
