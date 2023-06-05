import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		BDController conexionBD = new BDController();
		
		int opc = 0;
		do {
			mostrarMenu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1: mostrarListadoArtistas(conexionBD);
				
				break;
			case 2: mostrarListadoCanciones(conexionBD);
				
				break;
			case 3: mostrarListadoDiscos(conexionBD);
				
				break;
			case 4: mostrarListadoGrupos(conexionBD);
				
				break;
			case 5: eliminarCancion(conexionBD);
				
				break;
			case 6: eliminarArtista(conexionBD);
				
				break;
			case 7: altaArtista(conexionBD);
				
				break;
			case 8: altaCancion(conexionBD);
				
				break;
			case 9: System.out.println("Ha salido del programa.");
				
				break;

			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc != 9);
	}
	
	public static void mostrarMenu() {
		System.out.println("Introduzca una opción:\n");
		System.out.println("1.	Listado Artistas.");
		System.out.println("2.	Listado de canciones.");
		System.out.println("3.	Listado de discos.");
		System.out.println("4.	Listado de grupos.");
		System.out.println("5.	Elimina una canción solicitada al usuario.");
		System.out.println("6.	Eliminar un artista solicitando el nombre.");
		System.out.println("7.	Insertar Artista.");
		System.out.println("8.	Insertar Canción.");
		System.out.println("9.	Salir.");
		System.out.print("--> ");
	}
	
	public static void eliminarCancion (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el título de la canción que desea eliminar:");
		String titulo = sctxt.nextLine();
		
		if (conexionBD.existeCancion(titulo)) {
			conexionBD.eliminarCancion(titulo);
		} else {
			System.out.println("La canción no existe.");
		}
		
	}
	
	public static void eliminarArtista (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del artista que desea eliminar:");
		String nombre = sctxt.nextLine();
		
		if (conexionBD.existeArtista(nombre)) {
			conexionBD.eliminarArtista(nombre);;
		} else {
			System.out.println("El artista no existe.");
		}
		
	}
	
	public static void altaArtista (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el dni del artista:");
		String dni = sctxt.nextLine();
		
		System.out.println("Introduzca el nombre del artista:");
		String nombre = sctxt.nextLine();
		
		conexionBD.altaArtista(nombre, dni);
	}
	
	public static void altaCancion (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		
		System.out.println("Introduzca el código de la canción:");
		int cod = scnum.nextInt();
		
		System.out.println("Introduzca el título de la canción:");
		String titulo = sctxt.nextLine();
		
		System.out.println("Introduzca la duración de la canción:");
		double duracion = scnum.nextDouble();
		
		conexionBD.altaCancion(cod, titulo, duracion);
	}
	
	public static void mostrarListadoArtistas(BDController conexionBD) {
		ArrayList<String> datosArtistas = conexionBD.devolverListadoArtistas();
		
		for (int i = 0; i < datosArtistas.size(); i++) {
			System.out.println(datosArtistas.get(i));
		}
	}
	
	public static void mostrarListadoCanciones(BDController conexionBD) {
		ArrayList<String> datosCanciones = conexionBD.devolverListadoCanciones();
		
		for (int i = 0; i < datosCanciones.size(); i++) {
			System.out.println(datosCanciones.get(i));
		}
	}
	
	public static void mostrarListadoDiscos(BDController conexionBD) {
		ArrayList<String> datosDiscos = conexionBD.devolverListadoDiscos();
		
		for (int i = 0; i < datosDiscos.size(); i++) {
			System.out.println(datosDiscos.get(i));
		}
	}
	
	public static void mostrarListadoGrupos(BDController conexionBD) {
		ArrayList<String> datosGrupos = conexionBD.devolverListadoGrupos();
		
		for (int i = 0; i < datosGrupos.size(); i++) {
			System.out.println(datosGrupos.get(i));
		}
	}

}
