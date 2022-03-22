package comparadores;

import java.util.Comparator;

import realityCanto.ElementoParticipante;

public class ComparadorBatallaGeneros implements Comparator<ElementoParticipante>{

	@Override
	public int compare(ElementoParticipante p1, ElementoParticipante p2) {
		// TODO Auto-generated method stub
		
		//borrar
		//return p1.getGenerosMusicalesPreferidos().size() - p2.getGenerosMusicalesPreferidos().size();
		return p1.cantidadGeneros() - p2.cantidadGeneros();
		
	}

}
