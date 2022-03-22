package criterios;

import realityCanto.ElementoParticipante;

public class FiltrarPorInstrumento extends Filtrar {
	private String instrumento;
	
	public FiltrarPorInstrumento(String instrumento) {
		super();
		this.instrumento = instrumento;
	}

	@Override
	public boolean cumple(ElementoParticipante p) {
		// TODO Auto-generated method stub
		return p.tocaInstrumento(instrumento);
		//return p.getInstrumentos().contains(instrumento);
	}

}
