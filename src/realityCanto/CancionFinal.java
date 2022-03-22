package realityCanto;

import java.util.ArrayList;

public class CancionFinal extends Cancion {
	private int cantidadIntegrantesNecesarios;
	private ArrayList<String> instrumentosNecesarios;

	public CancionFinal(String titulo, String idioma, int cantidad) {
		super(titulo, idioma);
		this.cantidadIntegrantesNecesarios = cantidad;
		this.instrumentosNecesarios = new ArrayList<>();
	}

	public void setCantidadIntegrantesNecesarios(int cantidadIntegrantesNecesarios) {
		this.cantidadIntegrantesNecesarios = cantidadIntegrantesNecesarios;
	}

	public void addInstrumento(String instrumento) {
		instrumentosNecesarios.add(instrumento);

	}

	@Override
	public boolean puedeCantar(ElementoParticipante p) {
		int contador = 0;
		if (super.puedeCantar(p)) {
			for (String i : this.instrumentosNecesarios) {
				if (p.getInstrumentos().contains(i)) {
					contador++;
				}

				if (contador >= this.cantidadIntegrantesNecesarios) {
					return true;
				}
			}
		}
		return false;

	}

}
