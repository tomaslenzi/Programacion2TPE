package realityCanto;

import java.util.ArrayList;

import criterios.Filtrar;

public class Participante extends ElementoParticipante {

	private String apellido;
	private int edad;
	private ArrayList<String> generosMusicalesPreferidos;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;

	public Participante(String nombre, String apellido, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.edad = edad;
		this.generosMusicalesPreferidos = new ArrayList<>();
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}

	public void addGeneroMusical(String generoMusical) {
		if (!generosMusicalesPreferidos.contains(generoMusical)) {
			generosMusicalesPreferidos.add(generoMusical);

		}
	}

	public void addIdioma(String idioma) {
		if (!idiomas.contains(idioma)) {
			idiomas.add(idioma);

		}
	}

	public void addInstrumento(String instrumento) {
		if (!instrumentos.contains(instrumento)) {
			instrumentos.add(instrumento);

		}
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public int getEdad() {
		return edad;
	}

	@Override
	public ArrayList<String> getGenerosMusicalesPreferidos() {
		ArrayList<String> copia = new ArrayList<>(generosMusicalesPreferidos);
		return copia;
	}

	@Override
	public ArrayList<String> getIdiomas() {
		ArrayList<String> copia = new ArrayList<>(idiomas);
		return copia;
	}

	@Override
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> copia = new ArrayList<>(instrumentos);
		return copia;
	}

	@Override
	public String toString() {
		return "Participante ||Nombre: " + getNombre() + "|Apellido: " + apellido + "|Edad: " + edad + "||\n";
	}

	@Override
	public boolean conoceIdioma(String s) {
		// TODO Auto-generated method stub
		return idiomas.contains(s);
	}

	@Override
	public boolean prefiereGenero(String s) {
		// TODO Auto-generated method stub
		return generosMusicalesPreferidos.contains(s);
	}

	@Override
	public boolean tocaInstrumento(String s) {
		// TODO Auto-generated method stub
		return instrumentos.contains(s);
	}

	@Override
	public ArrayList<ElementoParticipante> buscar(Filtrar f) {
		ArrayList<ElementoParticipante> resultado = new ArrayList<>();
		if (f.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}

}
