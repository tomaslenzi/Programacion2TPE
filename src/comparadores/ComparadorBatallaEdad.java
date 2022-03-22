package comparadores;

import java.util.Comparator;

import realityCanto.ElementoParticipante;

public class ComparadorBatallaEdad implements Comparator<ElementoParticipante>{

	@Override
	public int compare(ElementoParticipante p1, ElementoParticipante p2) {
		// TODO Auto-generated method stub
		return (int) (p1.getEdad() - p2.getEdad());
	}

}
