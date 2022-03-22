package realityCanto;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

import criterios.Filtrar;

public class Coach {
	private String nombre;
	private ArrayList<ElementoParticipante> equipo;
	private Filtrar comport;

	public Coach(String nombre) {
		this.nombre = nombre;
		this.equipo = new ArrayList<>();
		this.comport = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setComportamiento(Filtrar cc) {
		comport = cc;
	}

	public ArrayList<ElementoParticipante> getEquipo() {
		ArrayList<ElementoParticipante> copia = new ArrayList<>(equipo);
		return copia;
	}

	public void addParticipanteAequipo(ElementoParticipante p) {
		if (!(comport == null) && (comport.cumple(p))) {

			equipo.add(p);
		} else if (comport == null) {
			equipo.add(p);
		}

	}

	public ArrayList<String> obtenerInstrumentosQueTocan() {
		ArrayList<String> instrumentos = new ArrayList<>();
		for (ElementoParticipante p : equipo) {
			ArrayList<String> instrumentosParticipante = p.getInstrumentos();
			for (String s : instrumentosParticipante) {
				if (!instrumentos.contains(s)) {
					instrumentos.add(s);
				}
			}
		}
		return instrumentos;
	}

	public ArrayList<String> obtenerIdiomasQueCantan() {
		ArrayList<String> idiomas = new ArrayList<>();
		for (ElementoParticipante p : equipo) {
			ArrayList<String> idiomasParticipante = p.getIdiomas();
			for (String s : idiomasParticipante) {
				if (!idiomas.contains(s)) {
					idiomas.add(s);
				}
			}
		}
		return idiomas;
	}

	public ArrayList<String> obtenerGenerosPreferidos() {
		ArrayList<String> generos = new ArrayList<>();
		for (ElementoParticipante p : equipo) {
			ArrayList<String> generosParticipante = p.getGenerosMusicalesPreferidos();
			for (String s : generosParticipante) {
				if (!generos.contains(s)) {
					generos.add(s);
				}
			}
		}
		Collections.sort(generos);
		return generos;
	}

	public double obtenerPromedioEdad() {
		double suma = 0;

		for (ElementoParticipante p : equipo) {
			suma += p.getEdad();

		}
		if (!(equipo.size() == 0)) {
			return suma / equipo.size();
		}
		return 0;
	}

	public ArrayList<ElementoParticipante> filtrarParticipantesSegunCriterio(Filtrar f) {
		ArrayList<ElementoParticipante> participantesCumplen = new ArrayList<>();
		for (ElementoParticipante e : equipo) {

			participantesCumplen.addAll(e.buscar(f));
		}
		return participantesCumplen;

	}

	public ArrayList<ElementoParticipante> ordenarPorMejores(Comparator comp) {
		ArrayList<ElementoParticipante> participantesO = new ArrayList<>(equipo);
		Collections.sort(participantesO, comp);
		Collections.reverse(participantesO);
		return participantesO;

	}
	// agrego el metodo que me faltaba puede interpretar un tema

	public ArrayList<ElementoParticipante> participantesQuePuedenCantarCancion(Cancion c) {
		ArrayList<ElementoParticipante> participantesCumplen = new ArrayList<>();
		for (ElementoParticipante elementoParticipante : equipo) {
			if (c.puedeCantar(elementoParticipante)) {
				participantesCumplen.add(elementoParticipante);
			}

		}
		return participantesCumplen;
	}

}
