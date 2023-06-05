import java.util.ArrayList;

public class Liga {
	private String nombre;
	private String categoria;
	private ArrayList<Equipo> equipos;
	private ArrayList<Encuentro> partidos;
	
	public Liga() {
		super();
	}
	
	public Liga(String nombre, String categoria, ArrayList<Equipo> equipos, ArrayList<Encuentro> partidos) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.equipos = equipos;
		this.partidos = partidos;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the equipos
	 */
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	/**
	 * @param equipos the equipos to set
	 */
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	/**
	 * @return the partidos
	 */
	public ArrayList<Encuentro> getPartidos() {
		return partidos;
	}
	/**
	 * @param partidos the partidos to set
	 */
	public void setPartidos(ArrayList<Encuentro> partidos) {
		this.partidos = partidos;
	}
	@Override
	public String toString() {
		return "Liga [nombre=" + nombre + ", categoria=" + categoria + ", equipos=" + equipos + ", partidos=" + partidos
				+ "]";
	}
	
	// Métodos
	
	// 3
	public int numPartidosArbitro (Arbitro datosArbitro) {
		int cont = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getArbitro().getDni().equalsIgnoreCase(datosArbitro.getDni())) {
				cont++;
			}
		}
		
		return cont;
	}
	
	// 7
	public int numGolesNomEquipo (String nombreEquipo) {
		int golesEquipoRolLocal = 0; // Los goles del equipo X cuando ocupan el rol de equipo local
		int golesEquipoRolVisit = 0; // Ídem para equipo visitante
		int golesTotalesEquipo = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(nombreEquipo)) {
				golesEquipoRolLocal = golesEquipoRolLocal + this.partidos.get(i).getGoles_eq_local();
			} else if (this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(nombreEquipo)) {
				golesEquipoRolVisit = golesEquipoRolVisit + this.partidos.get(i).getGoles_eq_visit();
			}
		}
		
		golesTotalesEquipo = golesEquipoRolLocal + golesEquipoRolVisit;
		
		return golesTotalesEquipo;
	}
	
	// 8
	public int numGolesRecibNomEquipo (String nombreEquipo) {
		int golesEquipoVisit = 0; // Goles del equipo enemigo cuando el equipo X ocupa el rol de equipo local
		int golesEquipoLocal = 0; // Goles del equipo enemigo cuando el equipo X ocupa el rol de equipo visitante
		int golesTotalesRecibidosEquipo = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(nombreEquipo)) {
				golesEquipoVisit = golesEquipoVisit + this.partidos.get(i).getGoles_eq_visit();
			} else if (this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(nombreEquipo)) {
				golesEquipoLocal = golesEquipoLocal + this.partidos.get(i).getGoles_eq_local();
			}
		}
		
		golesTotalesRecibidosEquipo = golesEquipoLocal + golesEquipoVisit;
		
		return golesTotalesRecibidosEquipo;
	}
	
	// 9
	public ArrayList<Jugador> devolverJugadoresMinutosMin() {
		ArrayList<Jugador> jugadoresMinutosMin = new ArrayList<Jugador>();
		double minutosMin = this.equipos.get(0).getJugadores().get(0).getDatos().getMinutos_jugados()+1;
		
		
		for (int i = 0; i < this.equipos.size(); i++) {
			for (int j = 0; j < this.equipos.get(i).getJugadores().size(); j++) {
				if (this.equipos.get(i).getJugadores().get(j).getDatos().getMinutos_jugados() < minutosMin) {
					minutosMin = this.equipos.get(i).getJugadores().get(j).getDatos().getMinutos_jugados();
				}
			}
		}
		
		for (int i = 0; i < this.equipos.size(); i++) {
			for (int j = 0; j < this.equipos.get(i).getJugadores().size(); j++) {
				if (this.equipos.get(i).getJugadores().get(j).getDatos().getMinutos_jugados() ==  minutosMin) {
					jugadoresMinutosMin.add(this.equipos.get(i).getJugadores().get(j));
				}
			}
		}
		
		return jugadoresMinutosMin;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void imprimirClasificaciones() {
		ArrayList<Clasificacion> datosClasificaciones = new ArrayList<Clasificacion>();
		
		/* 
		 * Se insertan todos los nombres y datos de los equipos (del array de equipos de la liga) en datosClasificacion ya que se presupone
		 * que no hay equipos repetidos en el array de equipos. Por lo que, el tamaño de datosClasificaciones será igual al de equipos.
		*/
		for (int i = 0; i < this.equipos.size(); i++) {
			Clasificacion datosClasi = new Clasificacion(this.equipos.get(i).getNombre(), partidosJugadosEquipo(this.equipos.get(i)), partidosGanadosEquipo(this.equipos.get(i)), partidosEmpatadosEquipo(this.equipos.get(i)), partidosPerdidosEquipo(this.equipos.get(i)), numGolesEquipo(this.equipos.get(i)), numGolesEnContraEquipo(this.equipos.get(i)), puntosEquipo(this.equipos.get(i)));
			datosClasificaciones.add(datosClasi);
		}
		
		// 2ª parte: ordenarlo
		ordenarClasisXPuntosEnDescen(datosClasificaciones);
		
		// 3ª parte: imprimir clasificaciones ordenadas
		System.out.println("Pos" + "          " + "Equipo"+ "          " + "P.Jugados" + "     " + "P.Ganados" + "     " + "P.Empatados" + "     " + "P.Perdidos" + "     " + "G.Favor" + "     " + "G.Contra" + "     " + "Puntos");
		for (int i = 0; i < datosClasificaciones.size(); i++) {
			System.out.println(" " + (i+1) + "       " + datosClasificaciones.get(i).getNombre_equipo() + "               " + datosClasificaciones.get(i).getP_jugados() + "   " + datosClasificaciones.get(i).getP_ganados() + "   " + datosClasificaciones.get(i).getP_empatados() + "   " + datosClasificaciones.get(i).getP_perdidos() + "   " + datosClasificaciones.get(i).getG_favor() + "   " + datosClasificaciones.get(i).getG_contra() + "   " + datosClasificaciones.get(i).getPuntos());
		}
	}
	
	// Metodo aux
	public int partidosJugadosEquipo (Equipo datosEquipo) {
		int partidos = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(datosEquipo.getNombre()) || this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(datosEquipo.getNombre())) {
				partidos++;
			}
		}
		
		return partidos;
	}
	
	// Metodo aux
	public int partidosGanadosEquipo (Equipo datosEquipo) {
		int partGanados = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			// Rol equipo local
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(datosEquipo.getNombre()) && this.partidos.get(i).getGoles_eq_local() > this.partidos.get(i).getGoles_eq_visit()) {
				partGanados++;
				
				// (Dentro del else if) Rol equipo visitante
			} else if (this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(datosEquipo.getNombre()) && this.partidos.get(i).getGoles_eq_visit() > this.partidos.get(i).getGoles_eq_local()) {
				partGanados++;
			}
		}
		
		return partGanados;
	}
	
	// Metodo aux
	public int partidosEmpatadosEquipo (Equipo datosEquipo) {
		int partEmpatados = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			// Rol equipo local
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(datosEquipo.getNombre()) && this.partidos.get(i).getGoles_eq_local() == this.partidos.get(i).getGoles_eq_visit()) {
				partEmpatados++;
				
				// (Dentro del else if) Rol equipo visitante
			} else if (this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(datosEquipo.getNombre()) && this.partidos.get(i).getGoles_eq_visit() == this.partidos.get(i).getGoles_eq_local()) {
				partEmpatados++;
			}
		}
		
		return partEmpatados;
	}
	
	// Metodo aux
	public int partidosPerdidosEquipo (Equipo datosEquipo) {
		int partPerdidos = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			// Rol equipo local
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(datosEquipo.getNombre()) && this.partidos.get(i).getGoles_eq_local() < this.partidos.get(i).getGoles_eq_visit()) {
				partPerdidos++;
				
				// (Dentro del else if) Rol equipo visitante
			} else if (this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(datosEquipo.getNombre()) && this.partidos.get(i).getGoles_eq_visit() < this.partidos.get(i).getGoles_eq_local()) {
				partPerdidos++;
			}
		}
		
		return partPerdidos;
	}
	
	// Metodo aux
	public int numGolesEquipo (Equipo datosEquipo) {
		int goles = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(datosEquipo.getNombre())) {
				goles = goles + this.partidos.get(i).getGoles_eq_local();
			} else if (this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(datosEquipo.getNombre())) {
				goles = goles + this.partidos.get(i).getGoles_eq_visit();
			}
		}
		
		
		return goles;
	}
	
	// Metodo aux
	public int numGolesEnContraEquipo (Equipo datosEquipo) {
		int golesEnContra = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(datosEquipo.getNombre())) {
				golesEnContra = golesEnContra + this.partidos.get(i).getGoles_eq_visit();
			} else if (this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(datosEquipo.getNombre())) {
				golesEnContra = golesEnContra + this.partidos.get(i).getGoles_eq_local();
			}
		}
		
		return golesEnContra;
	}
	
	// Metodo aux
	public int puntosEquipo (Equipo datosEquipo) {
		int puntos = 0;
		
		puntos = puntos + (partidosGanadosEquipo(datosEquipo) * 2);
		puntos = puntos + partidosEmpatadosEquipo(datosEquipo);
		
		return puntos;
	}
	
	public void ordenarClasisXPuntosEnDescen (ArrayList<Clasificacion> datosClasificaciones) {
		Clasificacion clasiAux;
		
		for (int i = 0; i < datosClasificaciones.size(); i++) {
			for (int j = 0; j < datosClasificaciones.size()-1; j++) {
				if (datosClasificaciones.get(j+1).getPuntos() > datosClasificaciones.get(j).getPuntos()) {
					clasiAux = datosClasificaciones.get(j+1);
					datosClasificaciones.set(j+1, datosClasificaciones.get(j));
					datosClasificaciones.set(j, clasiAux);
				}
			}
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void mostrarPartidosGolesNum (int numGoles) {
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).golesTotales() > numGoles) {
				System.out.println(this.partidos.get(i).getEquipo_local().getNombre() + "  " + this.partidos.get(i).getGoles_eq_local() + ":" + this.partidos.get(i).getGoles_eq_visit() + "  " + this.partidos.get(i).getEquipo_visit().getNombre());
			}
		}
	}
	
	public ArrayList<String> clasiPichichi() {
		ArrayList<Jugador> datosJuga = new ArrayList<Jugador>();
		
		for (int i = 0; i < this.equipos.size(); i++) {
			for (int j = 0; j < this.equipos.get(i).getJugadores().size(); j++) {
				datosJuga.add(this.equipos.get(i).getJugadores().get(j));
			}
		}
		
		// Burbuja
		Jugador aux;
		for (int i = 0; i < datosJuga.size(); i++) {
			for (int j = 0; j < datosJuga.size()-1; j++) {
				if (datosJuga.get(j+1).getDatos().getGoles() > datosJuga.get(j).getDatos().getGoles()) {
					aux = datosJuga.get(j+1);
					datosJuga.set(j+1, datosJuga.get(j));
					datosJuga.set(j, aux);
				}
			}
		}
		
		
		ArrayList<String> clasi = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			clasi.add((i+1) + ". "+ datosJuga.get(i).getNombre() + " " + datosJuga.get(i).getApellidos()+ " " + datosJuga.get(i).getDatos().getGoles() + " goles.");
		}
		
		return clasi;
	}
	
	// M1 v5
	public int numPartPerdJug(String dni) {
		int partPerd = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			// Si equipo visitante es perdedor
			if (this.partidos.get(i).getGoles_eq_local() > this.partidos.get(i).getGoles_eq_visit()) {
				for (int j = 0; j < this.partidos.get(i).getEquipo_visit().getJugadores().size(); j++) {
					if (this.partidos.get(i).getEquipo_visit().getJugadores().get(j).getDni().equalsIgnoreCase(dni)) {
						partPerd++;
						break;
					}
				}
			}
			
			// Si equipo local es perdedor
			if (this.partidos.get(i).getGoles_eq_local() < this.partidos.get(i).getGoles_eq_visit()) {
				for (int j = 0; j < this.partidos.get(i).getEquipo_local().getJugadores().size(); j++) {
					if (this.partidos.get(i).getEquipo_local().getJugadores().get(j).getDni().equalsIgnoreCase(dni)) {
						partPerd++;
						break;
					}
				}
			}
		}
		
		return partPerd;
	}
	
	// M2 v5
	public int numPartidosMas10Goles() {
		int cont = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).golesTotales() > 10) {
				cont++;
			}
		}
		
		return cont;
	}
	
	// M3 v5
	public String equipoGanadorGoleador() {
		// 1ª parte
		// Creo arrayList de equipos ganadores (EquipoGanador: clase creada para el desarrollo de este método)
		ArrayList<EquipoGanador> datosEGanadores = new ArrayList<EquipoGanador>();
		
		// Recorro arrayList de partidos
		for (int i = 0; i < this.partidos.size(); i++) {
			// Si el equipo local es ganador
			if (this.partidos.get(i).getGoles_eq_local() > this.partidos.get(i).getGoles_eq_visit()) {
				if (!existeEquipoGanador(this.partidos.get(i).getEquipo_local().getNombre(), datosEGanadores)) {
					EquipoGanador datosGanador = new EquipoGanador(this.partidos.get(i).getEquipo_local().getNombre(), this.partidos.get(i).getGoles_eq_local());
					datosEGanadores.add(datosGanador);
				} else {
					for (int j = 0; j < datosEGanadores.size(); j++) {
						if (datosEGanadores.get(j).getNombre_equipo().equalsIgnoreCase(this.partidos.get(i).getEquipo_local().getNombre())) {
							datosEGanadores.get(j).añadirGoles(this.partidos.get(i).getGoles_eq_local());
							break;
						}
					}
				}
			}
			
			// Si el equipo visitante es ganador
			if (this.partidos.get(i).getGoles_eq_local() < this.partidos.get(i).getGoles_eq_visit()) {
				if (!existeEquipoGanador(this.partidos.get(i).getEquipo_visit().getNombre(), datosEGanadores)) {
					EquipoGanador datosGanador = new EquipoGanador(this.partidos.get(i).getEquipo_visit().getNombre(), this.partidos.get(i).getGoles_eq_visit());
					datosEGanadores.add(datosGanador);
				} else {
					for (int j = 0; j < datosEGanadores.size(); j++) {
						if (datosEGanadores.get(j).getNombre_equipo().equalsIgnoreCase(this.partidos.get(i).getEquipo_visit().getNombre())) {
							datosEGanadores.get(j).añadirGoles(this.partidos.get(i).getGoles_eq_visit());
							break;
						}
					}
				}
			}
		}
		
		// 2ª parte
		int golesMax = datosEGanadores.get(0).getGoles()-1;
		String nombreEquipoMax = "";
		
		for (int i = 0; i < datosEGanadores.size(); i++) {
			if (datosEGanadores.get(i).getGoles() > golesMax) {
				golesMax = datosEGanadores.get(i).getGoles();
				nombreEquipoMax = datosEGanadores.get(i).getNombre_equipo();
			}
		}
		
		return nombreEquipoMax;
	}
	
	// Método aux
	static boolean existeEquipoGanador (String nombreEquipo, ArrayList<EquipoGanador> datosGanadores) {
		boolean existeEquipo = false;
		
		for (int i = 0; i < datosGanadores.size(); i++) {
			if (datosGanadores.get(i).getNombre_equipo().equalsIgnoreCase(nombreEquipo)) {
				existeEquipo = true;
			}
		}
		
		return existeEquipo;
	}
	
	// M1 v6
	public void mediaGolesEncuentro() {
		int acu = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			acu = acu + this.partidos.get(i).golesTotales();
		}
		
		int media = acu / this.partidos.size();
		
		System.out.println("Media de goles por partido: " + media);
	}
	
	// M2 v6
	public String equipoMediaGolesMax() {
		ArrayList<Estadis_Equipo> datosEstadisEquipos = new ArrayList<Estadis_Equipo>();
		
		// 1ª parte
		for (int i = 0; i < this.partidos.size(); i++) {
			// Si es equipo local
			if (!Main.existeEquipoEnEstadis(this.partidos.get(i).getEquipo_local().getNombre(), datosEstadisEquipos)) {
				Estadis_Equipo datosEquipo = new Estadis_Equipo(this.partidos.get(i).getEquipo_local().getNombre(), this.partidos.get(i).getGoles_eq_local(), 0, 1, 0, 0);
				datosEstadisEquipos.add(datosEquipo);
			} else {
				for (int j = 0; j < datosEstadisEquipos.size(); j++) {
					if (datosEstadisEquipos.get(j).getNombre().equalsIgnoreCase(this.partidos.get(i).getEquipo_local().getNombre())) {
						datosEstadisEquipos.get(j).añadirGolesMarcados(this.partidos.get(i).getGoles_eq_local());
						datosEstadisEquipos.get(j).añadirPartidosJugados(1);
						break;
					}
				}
			}
			
			// Si es equipo visitante
			if (!Main.existeEquipoEnEstadis(this.partidos.get(i).getEquipo_visit().getNombre(), datosEstadisEquipos)) {
				Estadis_Equipo datosEquipo = new Estadis_Equipo(this.partidos.get(i).getEquipo_visit().getNombre(), this.partidos.get(i).getGoles_eq_visit(), 0, 1, 0, 0);
				datosEstadisEquipos.add(datosEquipo);
			} else {
				for (int j = 0; j < datosEstadisEquipos.size(); j++) {
					if (datosEstadisEquipos.get(j).getNombre().equalsIgnoreCase(this.partidos.get(i).getEquipo_visit().getNombre())) {
						datosEstadisEquipos.get(j).añadirGolesMarcados(this.partidos.get(i).getGoles_eq_visit());
						datosEstadisEquipos.get(j).añadirPartidosJugados(1);
						break;
					}
				}
			}
		}
		
		// 2ª parte
		double mediaMax = datosEstadisEquipos.get(0).mediaGolesXPartido()-1;
		String equipoMediaMax = "";

		for (int i = 0; i < datosEstadisEquipos.size(); i++) {
			if (datosEstadisEquipos.get(i).mediaGolesXPartido() > mediaMax) {
				mediaMax = datosEstadisEquipos.get(i).mediaGolesXPartido();
				equipoMediaMax = datosEstadisEquipos.get(i).getNombre();
			}
		}
		
		return equipoMediaMax;
	}
	
	// M3 v6
	public String equipoGolesRecibidosMax() {
		ArrayList<Estadis_Equipo> datosEstadisEquipos = new ArrayList<Estadis_Equipo>();
		
		// 1ª parte
		for (int i = 0; i < this.partidos.size(); i++) {
			// Si el equipo es local
			if (!Main.existeEquipoEnEstadis(this.partidos.get(i).getEquipo_local().getNombre(), datosEstadisEquipos)) {
				Estadis_Equipo datosEquipo = new Estadis_Equipo(this.partidos.get(i).getEquipo_local().getNombre(), 0, this.partidos.get(i).getGoles_eq_visit(), 0, 0, 0);
				datosEstadisEquipos.add(datosEquipo);
			} else {
				for (int j = 0; j < datosEstadisEquipos.size(); j++) {
					if (datosEstadisEquipos.get(j).getNombre().equalsIgnoreCase(this.partidos.get(i).getEquipo_local().getNombre())) {
						datosEstadisEquipos.get(j).añadirGolesRecibidos(this.partidos.get(i).getGoles_eq_visit());
						break;
					}
				}
			}
			
			// Si el equipo es visitante
			if (!Main.existeEquipoEnEstadis(this.partidos.get(i).getEquipo_visit().getNombre(), datosEstadisEquipos)) {
				Estadis_Equipo datosEquipo = new Estadis_Equipo(this.partidos.get(i).getEquipo_visit().getNombre(), 0, this.partidos.get(i).getGoles_eq_local(), 0, 0, 0);
				datosEstadisEquipos.add(datosEquipo);
			} else {
				for (int j = 0; j < datosEstadisEquipos.size(); j++) {
					if (datosEstadisEquipos.get(j).getNombre().equalsIgnoreCase(this.partidos.get(i).getEquipo_visit().getNombre())) {
						datosEstadisEquipos.get(j).añadirGolesRecibidos(this.partidos.get(i).getGoles_eq_local());
						break;
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
	
	// M4 v6
	public String equipoGolesMarcadosMax() {
		ArrayList<Estadis_Equipo> datosEstadisEquipos = new ArrayList<Estadis_Equipo>();
		
		// 1ª parte
		for (int i = 0; i < this.partidos.size(); i++) {
			// Si es equipo local
			if (!Main.existeEquipoEnEstadis(this.partidos.get(i).getEquipo_local().getNombre(), datosEstadisEquipos)) {
				Estadis_Equipo datosEquipo = new Estadis_Equipo(this.partidos.get(i).getEquipo_local().getNombre(), this.partidos.get(i).getGoles_eq_local(), 0, 0, 0, 0);
				datosEstadisEquipos.add(datosEquipo);
			} else {
				for (int j = 0; j < datosEstadisEquipos.size(); j++) {
					if (datosEstadisEquipos.get(j).getNombre().equalsIgnoreCase(this.partidos.get(i).getEquipo_local().getNombre())) {
						datosEstadisEquipos.get(j).añadirGolesMarcados(this.partidos.get(i).getGoles_eq_local());
						break;
					}
				}
			}
			
			// Si es equipo visitante
			if (!Main.existeEquipoEnEstadis(this.partidos.get(i).getEquipo_visit().getNombre(), datosEstadisEquipos)) {
				Estadis_Equipo datosEquipo = new Estadis_Equipo(this.partidos.get(i).getEquipo_visit().getNombre(), this.partidos.get(i).getGoles_eq_visit(), 0, 0, 0, 0);
				datosEstadisEquipos.add(datosEquipo);
			} else {
				for (int j = 0; j < datosEstadisEquipos.size(); j++) {
					if (datosEstadisEquipos.get(j).getNombre().equalsIgnoreCase(this.partidos.get(i).getEquipo_visit().getNombre())) {
						datosEstadisEquipos.get(j).añadirGolesMarcados(this.partidos.get(i).getGoles_eq_visit());
						break;
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
	
	// M7 v6
	public String nombreJugadorNoEjemplar() {
		String nombreJuga = "";
		int tarjetasMax = this.equipos.get(0).getJugadores().get(0).getDatos().tarjetasTotal()-1;
		
		for (int i = 0; i < this.equipos.size(); i++) {
			for (int j = 0; j < this.equipos.get(i).getJugadores().size(); j++) {
				if (this.equipos.get(i).getJugadores().get(j).getDatos().tarjetasTotal() > tarjetasMax) {
					tarjetasMax = this.equipos.get(i).getJugadores().get(j).getDatos().tarjetasTotal();
					nombreJuga = this.equipos.get(i).getJugadores().get(j).getNombre();
				}
			}
		}
		
		return nombreJuga;
	}
	
	// M1 v7
	public ArrayList<String> nomJugaGolMaxYArbitroPartidosMax () {
		ArrayList<String> nombres = new ArrayList<String>();
		
		// 1ª parte
		int golesMax = this.equipos.get(0).getJugadores().get(0).getDatos().getGoles()-1;
		String jugaGolesMax = "";
		
		for (int i = 0; i < this.equipos.size(); i++) {
			for (int j = 0; j < this.equipos.get(i).getJugadores().size(); j++) {
				if (this.equipos.get(i).getJugadores().get(j).getDatos().getGoles() > golesMax) {
					golesMax = this.equipos.get(i).getJugadores().get(j).getDatos().getGoles();
					jugaGolesMax = this.equipos.get(i).getJugadores().get(j).getNombre();
				}
			}
		}
		
		nombres.add(jugaGolesMax);
		
		// 2ª parte
		ArrayList<Estadis_Arbitro> datosArbitros = new ArrayList<Estadis_Arbitro>();
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (!Main.existeArbitro(this.partidos.get(i).getArbitro().getDni(), datosArbitros)) {
				Estadis_Arbitro datosAribitro = new Estadis_Arbitro(this.partidos.get(i).getArbitro().getNombre(), this.partidos.get(i).getArbitro().getDni(), 1);
				datosArbitros.add(datosAribitro);
			} else {
				for (int j = 0; j < datosArbitros.size(); j++) {
					if (datosArbitros.get(j).getDni().equalsIgnoreCase(this.partidos.get(i).getArbitro().getDni())) {
						datosArbitros.get(j).añadirPartidos(1);
						break;
					}
				}
			}
		}
		
		// 3ª parte
		int partArbitradosMax = datosArbitros.get(0).getPartidos_arbitrados()-1;
		String arbitroMax = "";
		
		for (int i = 0; i < datosArbitros.size(); i++) {
			if (datosArbitros.get(i).getPartidos_arbitrados() > partArbitradosMax) {
				partArbitradosMax = datosArbitros.get(i).getPartidos_arbitrados();
				arbitroMax = datosArbitros.get(i).getNombre();
			}
		}
		
		nombres.add(arbitroMax);
		
		return nombres;
	}
	
	// M2 v7
	public ArrayList<String> dosJugasGolesMaxYDosEquiposGolesMax() {
		ArrayList<String> nombres = new ArrayList<String>();
		
		// 1ª parte
		ArrayList<Jugador> datosJugadores = new ArrayList<Jugador>();
		
		for (int i = 0; i < this.equipos.size(); i++) {
			for (int j = 0; j < this.equipos.get(i).getJugadores().size(); j++) {
				if (!Main.existeJugador(this.equipos.get(i).getJugadores().get(j).getDni(), datosJugadores)) {
					Estadistica datos = new Estadistica(this.equipos.get(i).getJugadores().get(j).getDatos().getGoles(), 0, 0, 0, 0, 0, 0);
					Jugador juga = new Jugador(this.equipos.get(i).getJugadores().get(j).getNombre(), null, null, datos, null, this.equipos.get(i).getJugadores().get(j).getDni());
					datosJugadores.add(juga);
				}
			}
		}
		
		// 2ª parte
		Jugador jugaAux;
		for (int i = 0; i < datosJugadores.size(); i++) {
			for (int j = 0; j < datosJugadores.size()-1; j++) {
				if (datosJugadores.get(j+1).getDatos().getGoles() > datosJugadores.get(j).getDatos().getGoles()) {
					jugaAux = datosJugadores.get(j+1);
					datosJugadores.set(j+1, datosJugadores.get(j));
					datosJugadores.set(j, jugaAux);
				}
			}
		}
		
		// Se añaden los nombres de los 2 jugadores más goleadores
		nombres.add(datosJugadores.get(0).getNombre());
		nombres.add(datosJugadores.get(1).getNombre());
		
		// 3ª parte
		ArrayList<EquipoGanador> datosEGanadores = new ArrayList<EquipoGanador>();
		
		// Recorro arrayList de partidos
		for (int i = 0; i < this.partidos.size(); i++) {
			// Si es equipo local
			if (!existeEquipoGanador(this.partidos.get(i).getEquipo_local().getNombre(), datosEGanadores)) {
				EquipoGanador datosGanador = new EquipoGanador(this.partidos.get(i).getEquipo_local().getNombre(), this.partidos.get(i).getGoles_eq_local());
				datosEGanadores.add(datosGanador);
			} else {
				for (int j = 0; j < datosEGanadores.size(); j++) {
					if (datosEGanadores.get(j).getNombre_equipo().equalsIgnoreCase(this.partidos.get(i).getEquipo_local().getNombre())) {
						datosEGanadores.get(j).añadirGoles(this.partidos.get(i).getGoles_eq_local());
						break;
					}
				}
			}
			
			// Si es equipo visitante
			if (!existeEquipoGanador(this.partidos.get(i).getEquipo_visit().getNombre(), datosEGanadores)) {
				EquipoGanador datosGanador = new EquipoGanador(this.partidos.get(i).getEquipo_visit().getNombre(), this.partidos.get(i).getGoles_eq_visit());
				datosEGanadores.add(datosGanador);
			} else {
				for (int j = 0; j < datosEGanadores.size(); j++) {
					if (datosEGanadores.get(j).getNombre_equipo().equalsIgnoreCase(this.partidos.get(i).getEquipo_visit().getNombre())) {
						datosEGanadores.get(j).añadirGoles(this.partidos.get(i).getGoles_eq_visit());
						break;
					}
				}
			}
		}
		
		// 4ª parte
		EquipoGanador equipAux;
		for (int i = 0; i < datosEGanadores.size(); i++) {
			for (int j = 0; j < datosEGanadores.size()-1; j++) {
				if (datosEGanadores.get(j+1).getGoles() > datosEGanadores.get(j).getGoles()) {
					equipAux = datosEGanadores.get(j+1);
					datosEGanadores.set(j+1, datosEGanadores.get(j));
					datosEGanadores.set(j, equipAux);
				}
			}
		}
		
		// Se guarda el nombre de los 2 equipos más goleadores
		nombres.add(datosEGanadores.get(0).getNombre_equipo());
		nombres.add(datosEGanadores.get(1).getNombre_equipo());
		
		return nombres;
	}
	
	// M3 v7
	public String marcadorRepeMax() {
		ArrayList<Estadis_Marcador> datosMarcadores = new ArrayList<Estadis_Marcador>();
		
		// 1ª parte
		for (int i = 0; i < this.partidos.size(); i++) {
			String marcaActual = this.partidos.get(i).getGoles_eq_local() + " - " + this.partidos.get(i).getGoles_eq_visit();
			
			if (!Main.existeMarcador(marcaActual, datosMarcadores)) {
				Estadis_Marcador datosEstadisMarca = new Estadis_Marcador(marcaActual, 1);
				datosMarcadores.add(datosEstadisMarca);
			} else {
				for (int j = 0; j < datosMarcadores.size(); j++) {
					if (datosMarcadores.get(j).getMarcador().equalsIgnoreCase(marcaActual)) {
						datosMarcadores.get(j).agregarRepeticiones(1);
						break;
					}
				}
			}
		}
		
		// 2ª parte
		int repesMax = datosMarcadores.get(0).getNum_repeticiones()-1;
		String marcadorMax = "";
		
		for (int i = 0; i < datosMarcadores.size(); i++) {
			if (datosMarcadores.get(i).getNum_repeticiones() > repesMax) {
				repesMax = datosMarcadores.get(i).getNum_repeticiones();
				marcadorMax = datosMarcadores.get(i).getMarcador();
			}
		}
		
		return marcadorMax;
	}
	
	// M4 v7
	public Equipo equipoArbitradoMax (Arbitro datosArbitro) {
		ArrayList<Equipo_Arbitrado> datosEArbitrados = new ArrayList<Equipo_Arbitrado>();
		
		// 1ª parte
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getArbitro().getDni().equalsIgnoreCase(datosArbitro.getDni())) {
				// Si es equipo local
				if (!Main.existeEArbitrado(this.partidos.get(i).getEquipo_local().getNombre(), datosEArbitrados)) {
					Equipo_Arbitrado datosEArbitrado = new Equipo_Arbitrado(this.partidos.get(i).getEquipo_local().getNombre(), 1);
					datosEArbitrados.add(datosEArbitrado);
				} else {
					for (int j = 0; j < datosEArbitrados.size(); j++) {
						if (datosEArbitrados.get(j).getNombre().equalsIgnoreCase(this.partidos.get(i).getEquipo_local().getNombre())) {
							datosEArbitrados.get(j).agregarNumVecesArbitrado(1);
							break;
						}
					}
				}
				
				// Si es equipo visitante
				if (!Main.existeEArbitrado(this.partidos.get(i).getEquipo_visit().getNombre(), datosEArbitrados)) {
					Equipo_Arbitrado datosEArbitrado = new Equipo_Arbitrado(this.partidos.get(i).getEquipo_visit().getNombre(), 1);
					datosEArbitrados.add(datosEArbitrado);
				} else {
					for (int j = 0; j < datosEArbitrados.size(); j++) {
						if (datosEArbitrados.get(j).getNombre().equalsIgnoreCase(this.partidos.get(i).getEquipo_visit().getNombre())) {
							datosEArbitrados.get(j).agregarNumVecesArbitrado(1);
							break;
						}
					}
				}
			}
		}
		
		// 2ª parte
		int nArbitradoMax = datosEArbitrados.get(0).getVeces_arbitrado()-1;
		String nomEquipoArbiMax = "";
		
		for (int i = 0; i < datosEArbitrados.size(); i++) {
			if (datosEArbitrados.get(i).getVeces_arbitrado() > nArbitradoMax) {
				nArbitradoMax = datosEArbitrados.get(i).getVeces_arbitrado();
				nomEquipoArbiMax = datosEArbitrados.get(i).getNombre();
			}
		}
		
		// 3ª parte
		Equipo datosEquipoArbiMax = new Equipo();
		
		for (int i = 0; i < this.equipos.size(); i++) {
			if (this.equipos.get(i).getNombre().equalsIgnoreCase(nomEquipoArbiMax)) {
				datosEquipoArbiMax = this.equipos.get(i);
				break;
			}
		}
		
		return datosEquipoArbiMax;
	}
	
	// M5 v7
	public String fechaGolesMaxEquipoGolesMin() {
		String fechaGolesMax = "";
		int golesTotalesMax = -10;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(equipoGolesRecibidosMin()) || this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(equipoGolesRecibidosMin())) {
				if (this.partidos.get(i).golesTotales() > golesTotalesMax) {
					golesTotalesMax = this.partidos.get(i).golesTotales();
					fechaGolesMax = this.partidos.get(i).getFecha();
				}
			}
		}
		
		return fechaGolesMax;
	}
	
	// Metodo aux para M5 v7
	public String equipoGolesRecibidosMin() {
		ArrayList<Estadis_Equipo> datosEstadisEquipos = new ArrayList<Estadis_Equipo>();
		
		// 1ª parte
		for (int i = 0; i < this.partidos.size(); i++) {
			// Si el equipo es local
			if (!Main.existeEquipoEnEstadis(this.partidos.get(i).getEquipo_local().getNombre(), datosEstadisEquipos)) {
				Estadis_Equipo datosEquipo = new Estadis_Equipo(this.partidos.get(i).getEquipo_local().getNombre(), 0, this.partidos.get(i).getGoles_eq_visit(), 0, 0, 0);
				datosEstadisEquipos.add(datosEquipo);
			} else {
				for (int j = 0; j < datosEstadisEquipos.size(); j++) {
					if (datosEstadisEquipos.get(j).getNombre().equalsIgnoreCase(this.partidos.get(i).getEquipo_local().getNombre())) {
						datosEstadisEquipos.get(j).añadirGolesRecibidos(this.partidos.get(i).getGoles_eq_visit());
						break;
					}
				}
			}
			
			// Si el equipo es visitante
			if (!Main.existeEquipoEnEstadis(this.partidos.get(i).getEquipo_visit().getNombre(), datosEstadisEquipos)) {
				Estadis_Equipo datosEquipo = new Estadis_Equipo(this.partidos.get(i).getEquipo_visit().getNombre(), 0, this.partidos.get(i).getGoles_eq_local(), 0, 0, 0);
				datosEstadisEquipos.add(datosEquipo);
			} else {
				for (int j = 0; j < datosEstadisEquipos.size(); j++) {
					if (datosEstadisEquipos.get(j).getNombre().equalsIgnoreCase(this.partidos.get(i).getEquipo_visit().getNombre())) {
						datosEstadisEquipos.get(j).añadirGolesRecibidos(this.partidos.get(i).getGoles_eq_local());
						break;
					}
				}
			}
		}
		
		// 2ª parte
		double golesReciMin = datosEstadisEquipos.get(0).getGoles_recibidos()+1;
		String equipoGolesReciMin = "";

		for (int i = 0; i < datosEstadisEquipos.size(); i++) {
			if (datosEstadisEquipos.get(i).getGoles_recibidos() < golesReciMin) {
				golesReciMin = datosEstadisEquipos.get(i).getGoles_recibidos();
				equipoGolesReciMin = datosEstadisEquipos.get(i).getNombre();
			}
		}
		
		return equipoGolesReciMin;
	}
	
	// M6 v7
	public String nomArbiEquipoLocalGolesMaxYEquipoVisitGoleador() {
		String nomArbitro = "";
		String nomEquipoGoleador = equipoGolesMarcadosMax();
		int golesMaxEquipoLocal = this.partidos.get(0).getGoles_eq_local()-1;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(nomEquipoGoleador)) {
				if (this.partidos.get(i).getGoles_eq_local() > golesMaxEquipoLocal) {
					nomArbitro = this.partidos.get(i).getArbitro().getNombre();
				}
			}
		}
		
		return nomArbitro;
	}
	
}
