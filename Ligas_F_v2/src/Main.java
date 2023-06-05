import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Prueba de "imprimir clasificaciones"
		
		Equipo datosEquipoB = new Equipo("Barcelona", null);
		Equipo datosEquipoR = new Equipo("Real Madrid", null);
		Equipo datosEquipoBe = new Equipo("Real Betis", null);
		Equipo datosEquipoAt = new Equipo("Atlético de Madrid", null);
		
		ArrayList<Equipo> equips = new ArrayList<Equipo>();
		equips.add(datosEquipoB);
		equips.add(datosEquipoR);
		equips.add(datosEquipoBe);
		equips.add(datosEquipoAt);
		
		
		
		Encuentro encu1 = new Encuentro(datosEquipoB, datosEquipoR, null, null, 5, 2, null);
		Encuentro encu2 = new Encuentro(datosEquipoAt, datosEquipoR, null, null, 4, 1, null);
		Encuentro encu3 = new Encuentro(datosEquipoAt, datosEquipoBe, null, null, 1, 1, null);
		Encuentro encu4 = new Encuentro(datosEquipoBe, datosEquipoB, null, null, 1, 5, null);
		Encuentro encu5 = new Encuentro(datosEquipoAt, datosEquipoB, null, null, 2, 2, null);
		
		ArrayList<Encuentro> encus = new ArrayList<Encuentro>();
		encus.add(encu1);
		encus.add(encu2);
		encus.add(encu3);
		encus.add(encu4);
		encus.add(encu5);
		
		Liga liga = new Liga("Santander", null, equips, encus);
		
		liga.imprimirClasificaciones();
	}

	// Métodos
	
	// 4
	static ArrayList<Jugador> devolverJugadoresPosicion (ArrayList<Liga> datosLigas, String posicion) {
		ArrayList<Jugador> datosJugadoresPosi = new ArrayList<Jugador>();
		
		for (int i = 0; i < datosLigas.size(); i++) {
			for (int j = 0; j < datosLigas.get(i).getEquipos().size(); j++) {
				for (int z = 0; z < datosLigas.get(i).getEquipos().get(j).getJugadores().size(); z++) {
					if (datosLigas.get(i).getEquipos().get(j).getJugadores().get(z).getPosicion().equalsIgnoreCase(posicion)) {
						datosJugadoresPosi.add(datosLigas.get(i).getEquipos().get(j).getJugadores().get(z));
					}
				}
			}
		}
		
		return datosJugadoresPosi;
	}
	
	// 5
	public int numPartidosArbitroLigas (Arbitro datosArbitro, ArrayList<Liga> datosLigas) {
		int acu = 0;
		
		for (int i = 0; i < datosLigas.size(); i++) {
			acu = acu + datosLigas.get(i).numPartidosArbitro(datosArbitro);
		}
		
		return acu;
	}
	
	// 6
	public ArrayList<String> devolverNomApeJugadoresTituMaxLigas(ArrayList<Club> datosClubes) {
		ArrayList<String> nomApeJugadoresTituMax = new ArrayList<String>();
		int tituMax = datosClubes.get(0).getEquipos().get(0).getJugadores().get(0).getDatos().getTitularidades()-1;
		
		
		for (int i = 0; i < datosClubes.size(); i++) {
			for (int j = 0; j < datosClubes.get(i).getEquipos().size(); j++) {
				for (int z = 0; z < datosClubes.get(i).getEquipos().get(j).getJugadores().size(); z++) {
					if (datosClubes.get(i).getEquipos().get(j).getJugadores().get(z).getDatos().getTitularidades() > tituMax) {
						tituMax = datosClubes.get(i).getEquipos().get(j).getJugadores().get(z).getDatos().getTitularidades();
					}
				}
			}
		}
		
		for (int i = 0; i < datosClubes.size(); i++) {
			for (int j = 0; j < datosClubes.get(i).getEquipos().size(); j++) {
				for (int z = 0; z < datosClubes.get(i).getEquipos().get(j).getJugadores().size(); z++) {
					if (datosClubes.get(i).getEquipos().get(j).getJugadores().get(z).getDatos().getTitularidades() == tituMax) {
						nomApeJugadoresTituMax.add(datosClubes.get(i).getEquipos().get(j).getJugadores().get(z).getNombre() + " " + datosClubes.get(i).getEquipos().get(j).getJugadores().get(z).getApellidos());
					}
				}
			}
		}
		
		return nomApeJugadoresTituMax;
	}
	
}
