package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clubes")
public class ClubEntity {
	
	/**
	 * Yo soy una entity, me encargo de hacer coincidir el estado de un objeto con la tabla 
	 * donde lo persistimos.
	 * 
	 * No tengo comportamiento de negocio, tampoco de acceso a los datos. Posea una serie de instrucciones
	 * para hacer mi trabajo.
	 * */
	@Id
	@Column(name="id_club")
	private Integer idClub;
	private String nombre;
	@Column(name="nrozona")
	private int zona;

	public ClubEntity() {}
	
	
	public ClubEntity(Integer idClub, String nombre, int zona) {
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
