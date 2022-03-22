package comparadores;

import java.util.Comparator;

import realityCanto.ElementoParticipante;

public class ComparadorAnd implements Comparator<ElementoParticipante>{
	private Comparator c1;
	private Comparator c2;
	
	

	public ComparadorAnd(Comparator c1, Comparator c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}



	@Override
	public int compare(ElementoParticipante p1, ElementoParticipante p2) {
		
		int resultado = c1.compare(p1, p2);
		if (resultado == 0) {
			return c2.compare(p1, p2);
		}
		return resultado;
	




	}

}
