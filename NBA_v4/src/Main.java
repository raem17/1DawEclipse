import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		BDController conexionBD = new BDController();
		
		int opc = 0;
		do {
			mostrarMenu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1: altaJugador(conexionBD);
				break;
			case 2: bajaJugador(conexionBD);
				break;
			case 3: listadoEquipos(conexionBD);
				break;
			case 4: listadoJugadores(conexionBD);
				break;
			case 5: altaEstadistica(conexionBD);
				break;
			case 6: bajaEstadistica(conexionBD);
				break;
			case 7: conexionBD.generarArchivoJugasMas30ppp();
				break;
			case 8: listadoPartidos2Equipos(conexionBD);
				break;
			case 9: listadoEquiposOrdXdivision(conexionBD);
				break;
			case 10: listadoEquipoGanador(conexionBD);
				break;
			case 11: listadoJugasUsuario(conexionBD);
				break;
			case 12: //
				break;
			case 13: //
				break;
			case 14: //
				break;
			case 15: System.out.println("Ha salido del programa.");
				break;
			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc != 15);
		
	}
	
	public static void mostrarMenu(){
		System.out.println("\nIntroduzca una opción del menú:");
		System.out.println("1.	Alta Jugador.");
		System.out.println("2.	Baja Jugador.");
		System.out.println("3.	Listado de equipos.");
		System.out.println("4.	Listado de Jugadores.");
		System.out.println("5.	Alta Estadística.");
		System.out.println("6.	Baja Estadística.");
		System.out.println("7.	Genera un archivo de texto llamado “Jugones.txt”que contenga los datos de todos los jugadores que tengan más de 30 ppp en sus estadisticas.");
		System.out.println("8.	Listado de partidos de 2 equipos pedidos al usuario.");
		System.out.println("9.	Listado de todos los equipos ordenados por división.");
		System.out.println("10.	Listado de todos los partidos ganados por un equipo pedido al usuario.");
		System.out.println("11.	Listado de Jugadores de una procedencia pedida al usuario, que jueguen en una conferencia pedida al usuario, "
				+ "en una división pedida al usuario y que jueguen en equipos que no sean de una ciudad pedida al usuario.");
		System.out.println("12.	Listado de Jugadores de la Conferencia Este.");
		System.out.println("13.	Listado de Jugadores de la División Pacifico.");
		System.out.println("14.	Inserta un jugador en la base de datos, los datos del jugador o jugadores estarán en un archivo llamado 'altaJugador.txt'.");
		System.out.println("15.	Salir.\n");
	}
	
	public static void listadoEquipos (BDController conexionBD) {
		ArrayList<Equipo> datosEquipos = conexionBD.devolverEquipos();
		
		for (int i = 0; i < datosEquipos.size(); i++) {
			datosEquipos.get(i).mostrarDatos();			System.out.println("");
		}
	}
	
	public static void listadoJugadores (BDController conexionBD) {
		ArrayList<Jugador> datosJugadores = conexionBD.devolverJugadores();
		
		for (int i = 0; i < datosJugadores.size(); i++) {
			datosJugadores.get(i).mostrarDatos();
			System.out.println("");
		}
	}
	
	public static void altaJugador (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		
		System.out.println("Introduzca el código del jugador:");
		int codigo = scnum.nextInt();
		
		if (!conexionBD.existeJugador(codigo)) {
			listadoEquipos(conexionBD);
			
			System.out.println("Introduzca el nombre del equipo del jugador:");
			String nombreEquipo = sctxt.nextLine().trim();
			
			if (conexionBD.existeEquipo(nombreEquipo)) {
				Jugador nuevoJuga = new Jugador();
				nuevoJuga.setCodigo(codigo);
				nuevoJuga.setNombre_equipo(nombreEquipo);
				
				System.out.println("Introduzca el nombre del jugador:");
				nuevoJuga.setNombre(sctxt.nextLine().trim());
				
				System.out.println("Introduzca la procedencia del jugador:");
				nuevoJuga.setProcedencia(sctxt.nextLine().trim());
				
				System.out.println("Introduzca la altura del jugador en este formato (X-Y) y en metros:");
				nuevoJuga.setAltura(sctxt.nextLine().trim());
								System.out.println("Introduzca el peso del jugador en kg:");
				nuevoJuga.setPeso(scnum.nextInt());
				
				System.out.println("Introduzca la posición del jugador:");
				nuevoJuga.setPosicion(sctxt.nextLine().trim());
				
				conexionBD.altaJugador(nuevoJuga);
				
				System.out.println("\nAlta exitosa.");
				
			} else {
				System.out.println("El equipo no existe.");
			}
			
		} else {
			System.out.println("El código del jugador ya existe.");
		}
	}
	
	public static void bajaJugador (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		
		System.out.println("Introduzca el código del jugador que se dará de baja:");
		int codigo = scnum.nextInt();
		
		if (conexionBD.existeJugador(codigo)) {
			conexionBD.bajaJugador(codigo);
			
			System.out.println("\nBaja exitosa");
			
		} else {
			System.out.println("El código del jugador no existe.");
		}
	}
	
	public static void altaEstadistica (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		Estadistica nuevaEstadi = new Estadistica();
		
		System.out.println("Introduzca el código del jugador:");
		nuevaEstadi.setJugador(scnum.nextInt());
		
		if (conexionBD.existeJugador(nuevaEstadi.getJugador())) {
			System.out.println("Introduzca la temporada en este formato (00/00):");
			nuevaEstadi.setTemporada(sctxt.nextLine().trim());
			
			if (!conexionBD.existeEstadistica(nuevaEstadi.getJugador(), nuevaEstadi.getTemporada())) {
				System.out.println("Introduzca los puntos por partido:");
				nuevaEstadi.setPuntos_por_partido(scnum.nextDouble());
				
				System.out.println("Introduzca las asistencias por partido:");
				nuevaEstadi.setAsistencias_por_partido(scnum.nextDouble());
				
				System.out.println("Introduzca los tapones por partido:");
				nuevaEstadi.setTapones_por_partido(scnum.nextDouble());
				
				System.out.println("Introduzca los rebotes por partido:");
				nuevaEstadi.setRebotes_por_partido(scnum.nextDouble());
				
				conexionBD.altaEstadistica(nuevaEstadi);
				
				System.out.println("Alta exitosa.");
				
			} else {
				System.out.println("Ya existe una estadística con el mismo jugador y temporada.");
			}
			
		} else {
			System.out.println("El código del jugador no existe.");
		}
	}
	
	public static void bajaEstadistica (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		
		System.out.println("Introduzca el código del jugador:");
		int codJuga = scnum.nextInt();
		
		System.out.println("Introduzca la temporada en este formato (00/00):");
		String tempo = sctxt.nextLine().trim();
		
		if (conexionBD.existeEstadistica(codJuga, tempo)) {
			conexionBD.bajaEstadistica(codJuga, tempo);
			
			System.out.println("Baja exitosa.");
			
		} else {
			System.out.println("No existe una estadística con el código del jugador y temporada introducida.");
		}
	}
	
	public static void listadoPartidos2Equipos (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del primer equipo:");
		String equipo1 = sctxt.nextLine().trim();
		
		if (conexionBD.existeEquipo(equipo1)) {
			System.out.println("Introduzca el nombre del segundo equipo:");
			String equipo2 = sctxt.nextLine().trim();
			
			if (conexionBD.existeEquipo(equipo2)) {
				ArrayList<String> listadoPartidos = conexionBD.devolverListadoPartidos2Equipos(equipo1, equipo2);
				
				for (int i = 0; i < listadoPartidos.size(); i++) {
					System.out.println(listadoPartidos.get(i));
				}
				
			} else {
				System.out.println("El segundo equipo no existe.");
			}
			
		} else {
			System.out.println("El primer equipo no existe.");
		}
		
	}
	
	public static void listadoEquiposOrdXdivision (BDController conexionBD) {
		ArrayList<Equipo> datosEquipos = conexionBD.devolverEquiposOrdXDivision();
		
		for (int i = 0; i < datosEquipos.size(); i++) {
			datosEquipos.get(i).mostrarDatos();			
			System.out.println("");
		}
	}
	
	public static void listadoEquipoGanador (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del equipo:");
		String nombreEquipo = sctxt.nextLine().trim();
		
		if (conexionBD.existeEquipo(nombreEquipo)) {
			ArrayList<String> listadoPartidos = conexionBD.devolverPartidosEquipoGanador(nombreEquipo);
			
			for (int i = 0; i < listadoPartidos.size(); i++) {
				System.out.println(listadoPartidos.get(i));		
			}
			
		} else {
			System.out.println("El equipo no existe.");
		}
	}
	
	public static void listadoJugasUsuario(BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca la procedencia:");
		String procedencia = sctxt.nextLine();
		
		System.out.println("Introduzca la conferencia:");
		String conferencia = sctxt.nextLine();
		
		System.out.println("Introduzca la división:");
		String division = sctxt.nextLine();
		
		System.out.println("Introduzca la ciudad:");
		String ciudad = sctxt.nextLine();
		
		ArrayList<Jugador> listadoJugas = conexionBD.devolverJugadoresUsuario(procedencia, conferencia, division, ciudad);
		
		if (listadoJugas.size() > 0) {
			for (int i = 0; i < listadoJugas.size(); i++) {
				listadoJugas.get(i).mostrarDatos();
			}
			
		} else {
			System.out.println("No hay ningún jugador que cumpla con los criterios introducidos.");
		}
	}

}
