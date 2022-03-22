package criterios;

import realityCanto.ElementoParticipante;

public class FiltrarAnd extends Filtrar {
	private Filtrar f1;
	private Filtrar f2;
	
	

	public FiltrarAnd(Filtrar f1, Filtrar f2) {
		this.f1 = f1;
		this.f2 = f2;
	}



	@Override
	public boolean cumple(ElementoParticipante p) {
		// TODO Auto-generated method stub
		return f1.cumple(p)&&f2.cumple(p);
	}

}
