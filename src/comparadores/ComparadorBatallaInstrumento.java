package comparadores;

import java.util.Comparator;

import realityCanto.ElementoParticipante;

public class ComparadorBatallaInstrumento implements Comparator<ElementoParticipante>{

	@Override
	public int compare(ElementoParticipante p1, ElementoParticipante p2) {
		// TODO Auto-generated method stub
		//return p1.getInstrumentos().size() - p2.getInstrumentos().size();
		return p1.cantidadInstrumentos()-p2.cantidadInstrumentos();
	}

}
