package criterios;

import realityCanto.ElementoParticipante;

public class FiltrarPorEdad extends Filtrar {
	private int edad;
	

	public FiltrarPorEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public boolean cumple(ElementoParticipante p) {
		
		return p.getEdad()>edad;
	}

}
