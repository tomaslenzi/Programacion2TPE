package comparadores;

import java.util.Comparator;

import realityCanto.ElementoParticipante;

public class ComparadorBatallaIdiomas implements Comparator<ElementoParticipante> {

	@Override
	public int compare(ElementoParticipante p1, ElementoParticipante p2) {
		// TODO Auto-generated method stub
		//return p1.getIdiomas().size() - p2.getIdiomas().size();
		return p1.cantidadIdiomas() - p2.cantidadIdiomas();
	}

}
