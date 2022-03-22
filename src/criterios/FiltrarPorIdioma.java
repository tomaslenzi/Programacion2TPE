package criterios;

import realityCanto.ElementoParticipante;

public class FiltrarPorIdioma extends Filtrar {
	private String idioma;
	
	public FiltrarPorIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public boolean cumple(ElementoParticipante p) {
		// TODO Auto-generated method stub
		//return p.getIdiomas().contains(idioma);
		return p.conoceIdioma(idioma);
	}

}
