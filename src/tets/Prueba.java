package tets;

import controlador.Controlador;
import dto.JugadorDTO;
import exceptions.JugadorException;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controlador.getInstancia().nuevoJugador("AAA", 11223344, "Juan Cacho Perez", 2);
		System.out.println("WW");
		try {
			JugadorDTO aux = Controlador.getInstancia().getJugadorByDNI("AAA", 11223344);
			System.out.println(aux.toString());
		} catch (JugadorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
