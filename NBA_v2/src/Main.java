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
			case 8: System.out.println("Ha salido del programa.");
				break;
			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc != 8);
		
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
		System.out.println("8.	Salir.\n");
	}
	
	public static void listadoEquipos (BDController conexionBD) {
		ArrayList<Equipo> datosEquipos = conexionBD.devolverEquipos();
		
		for (int i = 0; i < datosEquipos.size(); i++) {
			datosEquipos.get(i).mostrarDatos();
			System.out.println("");
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

}
