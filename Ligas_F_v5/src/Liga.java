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
				if (!existeEquipo(this.partidos.get(i).getEquipo_local().getNombre(), datosEGanadores)) {
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
				if (!existeEquipo(this.partidos.get(i).getEquipo_visit().getNombre(), datosEGanadores)) {
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
	static boolean existeEquipo (String nombreEquipo, ArrayList<EquipoGanador> datosGanadores) {
		boolean existeEquipo = false;
		
		for (int i = 0; i < datosGanadores.size(); i++) {
			if (datosGanadores.get(i).getNombre_equipo().equalsIgnoreCase(nombreEquipo)) {
				existeEquipo = true;
			}
		}
		
		return existeEquipo;
	}
	
	
}
