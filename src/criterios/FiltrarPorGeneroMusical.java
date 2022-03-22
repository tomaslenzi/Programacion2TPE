package criterios;

import realityCanto.ElementoParticipante;

public class FiltrarPorGeneroMusical extends Filtrar {
	private String generoMusical;
	

	public FiltrarPorGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}


	@Override
	public boolean cumple(ElementoParticipante p) {
		// TODO Auto-generated method stub
		//return p.getGenerosMusicalesPreferidos().contains(generoMusical);
		return p.prefiereGenero(generoMusical);
	}

}
