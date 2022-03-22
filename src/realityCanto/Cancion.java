package realityCanto;

import java.util.ArrayList;

public class Cancion {
	private String titulo;
	private String idioma;
	private ArrayList<String> generosDeLaCancion;

	public Cancion(String titulo, String idioma) {
		super();
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosDeLaCancion = new ArrayList<>();

	}

	public String getTitulo() {
		return titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void addGenero(String genero) {
		generosDeLaCancion.add(genero);

	}

	public ArrayList<String> getGenerosDeLaCancion() {
		ArrayList<String> copia = new ArrayList<>(generosDeLaCancion);
		return copia;
	}

	public boolean puedeCantar(ElementoParticipante p) {
		if (p.getIdiomas().contains(this.getIdioma())) {
			for (String genero : generosDeLaCancion)
				if ((p.getGenerosMusicalesPreferidos().contains(genero)))
					return true;
		}

		return false;
	}

}
