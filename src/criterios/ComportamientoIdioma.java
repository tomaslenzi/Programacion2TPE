package criterios;

import java.util.ArrayList;
//borrar
import realityCanto.ElementoParticipante;

public class ComportamientoIdioma extends Filtrar {
	private ArrayList<String> idiomas = new ArrayList<>();
	
	public void addIdioma(String i) {
		idiomas.add(i);
	}
	@Override
	public boolean cumple(ElementoParticipante p) {
		// TODO Auto-generated method stub
		
		return p.getIdiomas().containsAll(idiomas);
		//return p.conoceIdioma().containsAll(idiomas);
	}

}
