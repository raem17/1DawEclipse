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
	static int numPartidosArbitroLigas (Arbitro datosArbitro, ArrayList<Liga> datosLigas) {
		int acu = 0;
		
		for (int i = 0; i < datosLigas.size(); i++) {
			acu = acu + datosLigas.get(i).numPartidosArbitro(datosArbitro);
		}
		
		return acu;
	}
	
	// 6
	static ArrayList<String> devolverNomApeJugadoresTituMaxLigas(ArrayList<Club> datosClubes) {
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
	
	static Pais devolverPaisEquipoMaxGol(ArrayList<Pais> datosPaises) {
		Pais paisEquipoGolMax = new Pais();
		int golesEquipoMax = datosPaises.get(0).getLigas().get(0).getEquipos().get(0).golesTotales()-1;
		
		for (int i = 0; i < datosPaises.size(); i++) {
			for (int j = 0; j < datosPaises.get(i).getLigas().size(); j++) {
				for (int z = 0; z < datosPaises.get(i).getLigas().get(j).getEquipos().size(); z++) {
					if (datosPaises.get(i).getLigas().get(j).getEquipos().get(z).golesTotales() > golesEquipoMax) {
						golesEquipoMax = datosPaises.get(i).getLigas().get(j).getEquipos().get(z).golesTotales();
						paisEquipoGolMax = datosPaises.get(i);
					}
				}
			}
		}
		
		return paisEquipoGolMax;
	}
	
	static void mostrarDatosEstadisEquipos5Rojas (ArrayList<Liga> datosLigas) {
		for (int i = 0; i < datosLigas.size(); i++) {
			for (int j = 0; j < datosLigas.get(i).getEquipos().size(); j++) {
				if (datosLigas.get(i).getEquipos().get(j).existeJugadorCon5Rojas()) {
					for (int z = 0; z < datosLigas.get(i).getEquipos().get(j).getJugadores().size(); z++) {
						datosLigas.get(i).getEquipos().get(j).getJugadores().get(z).getDatos().imprimirDatos();
					}
				}
			}
		}
	}
	
	static void mostrarPaises20 (ArrayList<Pais> datosPaises) {
		for (int i = 0; i < datosPaises.size(); i++) {
			if (datosPaises.get(i).existeEquiposCon21Jugas()) {
				System.out.println(datosPaises.get(i).getNombre());
			}
		}
	}
	
	static ArrayList<String> nombresEquipos5Goles(ArrayList<Liga> datosLigas) {
		ArrayList<String> nombresEquipos = new ArrayList<String>();
		
		for (int i = 0; i < datosLigas.size(); i++) {
			for (int j = 0; j < datosLigas.get(i).getPartidos().size(); j++) {
				if (datosLigas.get(i).getPartidos().get(j).golesTotales() >= 5) {
					nombresEquipos.add(datosLigas.get(i).getPartidos().get(j).getEquipo_local().getNombre());
					nombresEquipos.add(datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getNombre());
				}
			}
		}
		
		eliminarStringsDuplicados(nombresEquipos);
		
		return nombresEquipos;
	}
	
	// Método aux
	static void eliminarStringsDuplicados (ArrayList<String> cadenas) {
		int cont = 0;
		
		for (int i = 0; i < cadenas.size(); i++) {
			cont = 0;
			
			for (int j = 0; j < cadenas.size(); j++) {
				if (cadenas.get(i).equalsIgnoreCase(cadenas.get(j))) {
					cont++;
				}
			}
			
			if (cont > 1) {
				cadenas.remove(i);
			}
		}
	}
	
	static String nombreJugadorMinutosMax(ArrayList<Liga> datosLigas) {
		String nombreJugadorMinutosMax = "";
		double minutosMax = datosLigas.get(0).getPartidos().get(0).getEquipo_local().getJugadores().get(0).getDatos().getMinutos_jugados()-1;
		
		for (int i = 0; i < datosLigas.size(); i++) {
			for (int j = 0; j < datosLigas.get(i).getPartidos().size(); j++) {
				if (datosLigas.get(i).getPartidos().get(j).existeEmpate()) {
					// Recorro jugadores del equipo local
					for (int j2 = 0; j2 < datosLigas.get(i).getPartidos().get(j).getEquipo_local().getJugadores().size(); j2++) {
						if (datosLigas.get(i).getPartidos().get(j).getEquipo_local().getJugadores().get(j2).getDatos().getMinutos_jugados() > minutosMax) {
							minutosMax = datosLigas.get(i).getPartidos().get(j).getEquipo_local().getJugadores().get(j2).getDatos().getMinutos_jugados();
							nombreJugadorMinutosMax = datosLigas.get(i).getPartidos().get(j).getEquipo_local().getJugadores().get(j2).getNombre();
						}
					}
					
					// Recorro jugadores del equipo visitante
					for (int j2 = 0; j2 < datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getJugadores().size(); j2++) {
						if (datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getJugadores().get(j2).getDatos().getMinutos_jugados() > minutosMax) {
							minutosMax = datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getJugadores().get(j2).getDatos().getMinutos_jugados();
							nombreJugadorMinutosMax = datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getJugadores().get(j2).getNombre();
						}
					}
				}
			}
		}
		
		return nombreJugadorMinutosMax;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Método auxiliar
	static boolean existeEquipoEnEstadis (String nombreEquipo, ArrayList<Estadis_Equipo> datosEstadis) {
		boolean existeEquipo = false;
		
		for (int i = 0; i < datosEstadis.size(); i++) {
			if (datosEstadis.get(i).getNombre().equalsIgnoreCase(nombreEquipo)) {
				existeEquipo = true;
			}
		}
		
		return existeEquipo;
	}
	
	// M4 v5
	static void mostrarNombreJugaGolesMax(ArrayList<Liga> datosLigas) {
		int golesMax = datosLigas.get(0).getEquipos().get(0).getJugadores().get(0).getDatos().getGoles()-1;
		String nomJugaGolMax = "";
		
		for (int i = 0; i < datosLigas.size(); i++) {
			for (int j = 0; j < datosLigas.get(i).getEquipos().size(); j++) {
				for (int z = 0; z < datosLigas.get(i).getEquipos().get(j).getJugadores().size(); z++) {
					if (datosLigas.get(i).getEquipos().get(j).getJugadores().get(z).getDatos().getGoles() > golesMax) {
						golesMax = datosLigas.get(i).getEquipos().get(j).getJugadores().get(z).getDatos().getGoles();
						nomJugaGolMax = datosLigas.get(i).getEquipos().get(j).getJugadores().get(z).getNombre();
					}
				}
			}
		}
		
		System.out.println("Nombre del jugador más goleador: " + nomJugaGolMax);
	}
	
	// M5 v6
	static String equipoGolesRecibidosMaxEnLigas(ArrayList<Liga> datosLigas) {
		ArrayList<Estadis_Equipo> datosEstadisEquipos = new ArrayList<Estadis_Equipo>();
		
		// 1ª parte
		for (int i = 0; i < datosLigas.size(); i++) {
			for (int j = 0; j < datosLigas.get(i).getPartidos().size(); j++) {
				// Si el equipo es local
				if (!existeEquipoEnEstadis(datosLigas.get(i).getPartidos().get(j).getEquipo_local().getNombre(), datosEstadisEquipos)) {
					Estadis_Equipo datosEquipo = new Estadis_Equipo(datosLigas.get(i).getPartidos().get(j).getEquipo_local().getNombre(), 0, datosLigas.get(i).getPartidos().get(j).getGoles_eq_visit(), 0, 0, 0);
					datosEstadisEquipos.add(datosEquipo);
				} else {
					for (int z = 0; z < datosEstadisEquipos.size(); z++) {
						if (datosEstadisEquipos.get(z).getNombre().equalsIgnoreCase(datosLigas.get(i).getPartidos().get(j).getEquipo_local().getNombre())) {
							datosEstadisEquipos.get(z).añadirGolesRecibidos(datosLigas.get(i).getPartidos().get(j).getGoles_eq_visit());
							break;
						}
					}
				}
				
				// Si el equipo es visitante
				if (!existeEquipoEnEstadis(datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getNombre(), datosEstadisEquipos)) {
					Estadis_Equipo datosEquipo = new Estadis_Equipo(datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getNombre(), 0, datosLigas.get(i).getPartidos().get(j).getGoles_eq_local(), 0, 0, 0);
					datosEstadisEquipos.add(datosEquipo);
				} else {
					for (int z = 0; z < datosEstadisEquipos.size(); z++) {
						if (datosEstadisEquipos.get(z).getNombre().equalsIgnoreCase(datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getNombre())) {
							datosEstadisEquipos.get(z).añadirGolesRecibidos(datosLigas.get(i).getPartidos().get(j).getGoles_eq_local());
							break;
						}
					}
				}
			}
		}
		
		// 2ª parte
		double golesReciMax = datosEstadisEquipos.get(0).getGoles_recibidos()-1;
		String equipoGolesReciMax = "";

		for (int i = 0; i < datosEstadisEquipos.size(); i++) {
			if (datosEstadisEquipos.get(i).getGoles_recibidos() > golesReciMax) {
				golesReciMax = datosEstadisEquipos.get(i).getGoles_recibidos();
				equipoGolesReciMax = datosEstadisEquipos.get(i).getNombre();
			}
		}
		
		return equipoGolesReciMax;
	}
	
	// M6 v6
	static String equipoGolesMarcadosMaxEnLigas(ArrayList<Liga> datosLigas) {
		ArrayList<Estadis_Equipo> datosEstadisEquipos = new ArrayList<Estadis_Equipo>();
		
		// 1ª parte
		for (int i = 0; i < datosLigas.size(); i++) {
			for (int j = 0; j < datosLigas.get(i).getPartidos().size(); j++) {
				// Si el equipo es local
				if (!existeEquipoEnEstadis(datosLigas.get(i).getPartidos().get(j).getEquipo_local().getNombre(), datosEstadisEquipos)) {
					Estadis_Equipo datosEquipo = new Estadis_Equipo(datosLigas.get(i).getPartidos().get(j).getEquipo_local().getNombre(), datosLigas.get(i).getPartidos().get(j).getGoles_eq_local(), 0, 0, 0, 0);
					datosEstadisEquipos.add(datosEquipo);
				} else {
					for (int z = 0; z < datosEstadisEquipos.size(); z++) {
						if (datosEstadisEquipos.get(z).getNombre().equalsIgnoreCase(datosLigas.get(i).getPartidos().get(j).getEquipo_local().getNombre())) {
							datosEstadisEquipos.get(z).añadirGolesMarcados(datosLigas.get(i).getPartidos().get(j).getGoles_eq_local());
							break;
						}
					}
				}
				
				// Si el equipo es visitante
				if (!existeEquipoEnEstadis(datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getNombre(), datosEstadisEquipos)) {
					Estadis_Equipo datosEquipo = new Estadis_Equipo(datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getNombre(), datosLigas.get(i).getPartidos().get(j).getGoles_eq_visit(), 0, 0, 0, 0);
					datosEstadisEquipos.add(datosEquipo);
				} else {
					for (int z = 0; z < datosEstadisEquipos.size(); z++) {
						if (datosEstadisEquipos.get(z).getNombre().equalsIgnoreCase(datosLigas.get(i).getPartidos().get(j).getEquipo_visit().getNombre())) {
							datosEstadisEquipos.get(z).añadirGolesMarcados(datosLigas.get(i).getPartidos().get(j).getGoles_eq_visit());;
							break;
						}
					}
				}
			}
		}
		
		// 2ª parte
		double golesMarcadosMax = datosEstadisEquipos.get(0).getGoles_marcados()-1;
		String equipoGolesMarcadosMax = "";

		for (int i = 0; i < datosEstadisEquipos.size(); i++) {
			if (datosEstadisEquipos.get(i).getGoles_marcados() > golesMarcadosMax) {
				golesMarcadosMax = datosEstadisEquipos.get(i).getGoles_marcados();
				equipoGolesMarcadosMax = datosEstadisEquipos.get(i).getNombre();
			}
		}
		
		return equipoGolesMarcadosMax;
	}
	
	
}
