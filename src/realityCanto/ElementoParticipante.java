package realityCanto;

import java.util.ArrayList;

import criterios.Filtrar;

public abstract class ElementoParticipante {

	private String nombre;

	public ElementoParticipante(String nombre) {
		super();
		this.nombre = nombre;
	}

	public abstract int getEdad();

	public abstract ArrayList<String> getGenerosMusicalesPreferidos();

	public abstract ArrayList<String> getIdiomas();

	public abstract ArrayList<String> getInstrumentos();

	public abstract ArrayList<ElementoParticipante> buscar(Filtrar f);

	// ------------------------otra correcion
	public abstract boolean conoceIdioma(String s);

	public abstract boolean prefiereGenero(String s);

	public abstract boolean tocaInstrumento(String s);

	/// -----------------------------------------agregado correccion
	public int cantidadIdiomas() {
		return getIdiomas().size();
	}

	public int cantidadGeneros() {
		return getGenerosMusicalesPreferidos().size();
	}

	public int cantidadInstrumentos() {
		return getInstrumentos().size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}