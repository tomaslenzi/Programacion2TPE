package realityCanto;

import java.util.Comparator;

import comparadores.ComparadorBatallaGeneros;
import comparadores.ComparadorBatallaInstrumento;
import criterios.ComportamientoIdioma;

import criterios.Filtrar;
import criterios.FiltrarAnd;
import criterios.FiltrarOr;
import criterios.FiltrarPorEdad;
import criterios.FiltrarPorGeneroMusical;
import criterios.FiltrarPorIdioma;
import criterios.FiltrarPorInstrumento;
import criterios.FiltrarPuedeInterpretarCancion;

public class MainReality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reality programaCanto = new Reality("Eurovision");

		Filtrar comportamientoGenero = new FiltrarPorGeneroMusical("rock");
		ComportamientoIdioma comportamientoIdioma = new ComportamientoIdioma();

		comportamientoIdioma.addIdioma("aleman");
		comportamientoIdioma.addIdioma("ingles");

		Filtrar comportamientoInstrumento = new FiltrarPorInstrumento("piano");
		FiltrarAnd comportamientoAnd = new FiltrarAnd(comportamientoInstrumento, comportamientoIdioma);
		FiltrarAnd comportamientoAnd2 = new FiltrarAnd(comportamientoAnd, comportamientoGenero);

		Cancion ca1 = new Cancion("black dog", "ingles");
		ca1.addGenero("hard rock");
		ca1.addGenero("rock");

		CancionFinal ca2 = new CancionFinal("ramble on", "ingles", 3);
		ca2.addGenero("rock");
		ca2.addInstrumento("guitarra");
		ca2.addInstrumento("bateria");
		ca2.addInstrumento("bajo");

		Participante p1 = new Participante("pepe", "asad", 20);
		Participante p2 = new Participante("john", "asdd", 30);
		Participante p3 = new Participante("carlos", "asfd", 26);
		Participante p4 = new Participante("carla", "asfd", 22);

		Participante p5 = new Participante("william", "asad", 20);
		Participante p6 = new Participante("sonia", "asdd", 30);
		Participante p7 = new Participante("jack", "asfd", 26);
		Participante p8 = new Participante("gertrude", "asfd", 22);

		Coach coach1 = new Coach("tomas");
		Coach coachExigente = new Coach("coach 2");
		coachExigente.setComportamiento(comportamientoAnd2);

		Grupo g1 = new Grupo("los ramones");
		Grupo g2 = new Grupo("los escarbadientes");

		p1.addInstrumento("guitarra");
		p2.addInstrumento("bateria");
		p1.addInstrumento("piano");
		p2.addInstrumento("piano");
		p3.addInstrumento("guitarra");
		p3.addInstrumento("bajo");
		p4.addInstrumento("guitarra");
		p4.addInstrumento("acordeon");

		p5.addInstrumento("piano");
		p5.addInstrumento("bateria");
		p5.addInstrumento("saxofon");
		p6.addInstrumento("acordeon");
		p6.addInstrumento("piano");
		p6.addInstrumento("bandoneon");
		p6.addInstrumento("clavicordio");
		p7.addInstrumento("trompeta");
		p7.addInstrumento("piano");
		p8.addInstrumento("piano");
		p8.addInstrumento("arpa");
		p8.addInstrumento("oboe");

		p1.addIdioma("ingles");
		p1.addIdioma("espaniol");
		p1.addIdioma("aleman");
		p2.addIdioma("ingles");
		p3.addIdioma("aleman");
		p3.addIdioma("ingles");
		p4.addIdioma("ingles");

		p5.addIdioma("ingles");
		p6.addIdioma("latin");

		p6.addIdioma("ingles");

		p7.addIdioma("chino");
		p7.addIdioma("ingles");
		p8.addIdioma("frances");
		p8.addIdioma("ingles");
		p8.addIdioma("aleman");

		p1.addGeneroMusical("rock");
		p1.addGeneroMusical("blues");
		p1.addGeneroMusical("pop");
		p2.addGeneroMusical("blues");
		p2.addGeneroMusical("rock");

		p3.addGeneroMusical("salsas");
		p3.addGeneroMusical("rock");
		p3.addGeneroMusical("pop");
		p4.addGeneroMusical("pop");
		p4.addGeneroMusical("salsa");
		p4.addGeneroMusical("rock");

		p5.addGeneroMusical("rock");
		p5.addGeneroMusical("pop");
		p5.addGeneroMusical("tango");
		p6.addGeneroMusical("pop");
		p6.addGeneroMusical("rock");
		p7.addGeneroMusical("pop");
		p7.addGeneroMusical("rock");
		p8.addGeneroMusical("rock");

		g1.addMiembro(p2);
		g1.addMiembro(p3);
		g1.addMiembro(p4);

		g2.addMiembro(p5);
		g2.addMiembro(p6);

		Filtrar filtroIdiomas = new FiltrarPorIdioma("ingles");
		Filtrar filtroIdioma2 = new FiltrarPorIdioma("ingles");
		Filtrar filtroEdad = new FiltrarPorEdad(22);
		Filtrar filtrarGenroMusical = new FiltrarPorGeneroMusical("pop");
		Filtrar filtrarAnd = new FiltrarAnd(filtroIdioma2, filtrarGenroMusical);
		Filtrar filtrarOr = new FiltrarOr(filtrarAnd, filtroIdiomas);
		Filtrar filtrarCancion = new FiltrarPuedeInterpretarCancion(ca1);

		coach1.addParticipanteAequipo(p1);
		coach1.addParticipanteAequipo(g1);

		coachExigente.addParticipanteAequipo(g2);
		coachExigente.addParticipanteAequipo(p7);
		coachExigente.addParticipanteAequipo(p8);

		programaCanto.addCoach(coachExigente);
		programaCanto.addCoach(coach1);

		Comparator<ElementoParticipante> comparInstrumentos = new ComparadorBatallaInstrumento();
		Comparator<ElementoParticipante> comparGenero = new ComparadorBatallaGeneros();
		programaCanto.setCriterioBatalla(comparGenero);
		programaCanto.setCriterioEmpate(comparInstrumentos);

		// System.out.println(programaCanto.batalla(p8, p1));

		// System.out.println(programaCanto.ganador(p4, p6));
		// System.out.println(coach1.filtrarParticipantesSegunCriterio(filtroIdiomas));
		// System.out.println(coachExigente.filtrarParticipantesSegunCriterio(filtroIdiomas));

		// System.out.println(coachExigente.getEquipo());

		// --------------------------------------------
		// System.out.println(g1.getCopia(filtroIdiomas));
		// System.out.println(coach1.ordenarPorMejores(comparGenero));

		// System.out.println(g1.getEdad());
		// System.out.println(g1.getInstrumentos());
		// System.out.println(g1.getInstrumentos2());

		// System.out.println(g1.getIdiomas());
		// System.out.println(g1.getIdiomas2());
		// System.out.println(coach1.obtenerPromedioEdad());

		//

		// System.out.println(coachExigente.obtenerPromedioEdad());
		// System.out.println(coach1.obtenerPromedioEdad());
		// System.out.println(coachExigente.getEquipo());
		// System.out.println(coach1.participantesQuePuedenCantarCancion(ca1));
		// System.out.println(coach1.filtrarParticipantesSegunCriterio(filtrarCancion));
		System.out.println(programaCanto.batalla(p1, p5));

		System.out.println(programaCanto.ganador(p5, p1));

	}

}
