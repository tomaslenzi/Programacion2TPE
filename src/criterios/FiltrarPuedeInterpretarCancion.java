package criterios;

import realityCanto.Cancion;
import realityCanto.ElementoParticipante;

public class FiltrarPuedeInterpretarCancion extends Filtrar {
	private Cancion cancion;
	
	

	public FiltrarPuedeInterpretarCancion(Cancion cancion) {
		super();
		this.cancion = cancion;
	}



	@Override
	public boolean cumple(ElementoParticipante p) {
		// TODO Auto-generated method stub
		return cancion.puedeCantar(p);
	}

}
