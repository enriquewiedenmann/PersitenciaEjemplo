package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class IdJugador implements Serializable {

	private static final long serialVersionUID = -4159205769589750744L;
	@Column(name="tipodoc")
	private String tipo;
	@Column(name="nrodoc")
	private Integer numero;
	
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
	
}
