import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

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
