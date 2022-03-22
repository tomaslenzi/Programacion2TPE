package realityCanto;

import java.util.ArrayList;
import criterios.Filtrar;

public class Grupo extends ElementoParticipante {

	private ArrayList<ElementoParticipante> miembros;

	public Grupo(String nombre) {

		super(nombre);
		this.miembros = new ArrayList<>();
	}

	public void addMiembro(ElementoParticipante p) {
		miembros.add(p);
	}

	@Override
	public int getEdad() {

		int edad = 0;
		for (ElementoParticipante p : miembros) {
			edad += p.getEdad();

		}
		if (!(miembros.size() == 0))
			return edad / miembros.size();
		else {
			return 0;
		}
	}

	@Override
	public ArrayList<String> getGenerosMusicalesPreferidos() {
		boolean first = true;
		ArrayList<String> copiaGeneros = new ArrayList<>();

		for (ElementoParticipante p : miembros) {
			if (first) {
				copiaGeneros.addAll(p.getGenerosMusicalesPreferidos());
				first = false;
			} else {
				copiaGeneros.retainAll(p.getGenerosMusicalesPreferidos());
			}

		}

		return copiaGeneros;

	}

	@Override
	public ArrayList<String> getIdiomas() {
		ArrayList<String> idiomas = new ArrayList<>();
		for (ElementoParticipante p : miembros) {
			ArrayList<String> idiomasParticipante = p.getIdiomas();
			for (String s : idiomasParticipante) {
				if (!idiomas.contains(s)) {
					idiomas.add(s);
				}
			}
		}
		return idiomas;
	}

	@Override
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> instrumentos = new ArrayList<>();
		for (ElementoParticipante p : miembros) {
			ArrayList<String> instrumentosParticipante = p.getInstrumentos();
			for (String s : instrumentosParticipante) {
				if (!instrumentos.contains(s)) {
					instrumentos.add(s);
				}
			}
		}
		return instrumentos;
	}

	@Override
	public String toString() {
		return "Nombre del grupo: " + getNombre() + " | Integrantes:\n" + miembros;
	}

	public boolean tieneMiembros() {
		return !miembros.isEmpty();
	}

	@Override
	public boolean conoceIdioma(String s) {
		// TODO Auto-generated method stub
		return this.getIdiomas().contains(s);
	}

	@Override
	public boolean prefiereGenero(String s) {
		// TODO Auto-generated method stub
		return this.getGenerosMusicalesPreferidos().contains(s);
	}

	@Override
	public boolean tocaInstrumento(String s) {
		// TODO Auto-generated method stub
		return this.getInstrumentos().contains(s);
	}

	@Override
	public ArrayList<ElementoParticipante> buscar(Filtrar f) {
		ArrayList<ElementoParticipante> resultado = new ArrayList<>();
		if (f.cumple(this)) {
			resultado.add(this);
		} else {
			for (ElementoParticipante p : miembros) {
				resultado.addAll(p.buscar(f));
			}
		}
		return resultado;
	}

}
