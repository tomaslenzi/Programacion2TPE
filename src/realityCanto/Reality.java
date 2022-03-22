package realityCanto;

import java.util.ArrayList;
import java.util.Comparator;

public class Reality {
	private String nombre;
	private ArrayList<Coach> jurados;
	private ArrayList<Cancion> canciones;
	private Comparator criterioBatalla;
	private Comparator criterioEmpate;

	public Reality(String nombre) {
		this.nombre = nombre;
		this.jurados = new ArrayList<>();
		this.canciones = new ArrayList<>();

	}

	public void addCancion(Cancion c) {
		canciones.add(c);
	}

	public void addCoach(Coach c) {
		jurados.add(c);
	}

	public void setCriterioBatalla(Comparator comp) {
		this.criterioBatalla = comp;
	}

	public void setCriterioEmpate(Comparator comp) {
		this.criterioEmpate = comp;
	}

	public ElementoParticipante batalla(ElementoParticipante p1, ElementoParticipante p2) {
		ElementoParticipante ganador = null;

		int resultado = criterioBatalla.compare(p1, p2);
		if (resultado > 0) {
			ganador = p1;
			return ganador;
		} else if (resultado < 0) {
			ganador = p2;
			return ganador;
		} else if (resultado == 0) {
			resultado = criterioEmpate.compare(p1, p2);
			if (resultado > 0) {
				ganador = p1;
				return ganador;
			} else if (resultado < 0) {
				ganador = p2;
				return ganador;

			}
		}
		return ganador;
	}

	public String ganador(ElementoParticipante p1, ElementoParticipante p2) {

		int resultado = criterioBatalla.compare(p1, p2);
		if (resultado > 0) {
			resultado = 1;
		} else if (resultado < 0) {
			resultado = -1;
		} else if (resultado == 0) {
			resultado = criterioEmpate.compare(p1, p2);

		}

		if (resultado > 0) {
			return p1.getNombre();
		} else if (resultado < 0) {
			return p2.getNombre();
		}

		return "Empate";
	}

}
