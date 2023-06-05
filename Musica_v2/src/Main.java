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
			case 5: mostrarListadoArtistasXLetra(conexionBD);
				
				break;
			case 6: eliminarCancion(conexionBD); 
				
				break;
			case 7: eliminarArtista(conexionBD);
				
				break;
			case 8: altaArtista(conexionBD);
				
				break;
			case 9: altaGrupo(conexionBD);
				
				break;
			case 10: insertarArtistaEnGrupo(conexionBD);
			
				break;
			case 11: insertarCancionEnDisco(conexionBD);
			
				break;
			case 12: eliminarArtistaEnGrupo(conexionBD);
			
				break;
			case 13: System.out.println("Ha salido del programa.");
			
				break;

			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc != 13);
	}
	
	public static void mostrarMenu() {
		System.out.println("Introduzca una opción:\n");
		System.out.println("1.	Listado Artistas.");
		System.out.println("2.	Listado de canciones.");
		System.out.println("3.	Listado de discos.");
		System.out.println("4.	Listado de grupos.");
		System.out.println("5.	Listado de Artistas con primera letra del nombre igual a una letra pedida por el usuario.");
		System.out.println("6.	Elimina una canción solicitada al usuario.");
		System.out.println("7.	Eliminar un artista solicitando el nombre.");
		System.out.println("8.	Insertar Artista.");
		System.out.println("9.	Insertar Grupo Musical.");
		System.out.println("10.	Inserta un artista en un grupo.");
		System.out.println("11.	Inserta una canción en un disco.");
		System.out.println("12.	Elimina un artista de un grupo.");
		System.out.println("13.	Salir.");
		System.out.print("--> ");
	}
	
	public static void eliminarCancion (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el título de la canción que desea eliminar:");
		String titulo = sctxt.nextLine();
		
		if (conexionBD.existeCancion(titulo)) {
			conexionBD.eliminarCancion(titulo);
			
			System.out.println("Se ha dado de baja la canción correctamente.");
		} else {
			System.out.println("La canción no existe.");
		}
		
	}
	
	public static void eliminarArtista (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del artista que desea eliminar:");
		String nombre = sctxt.nextLine();
		
		if (conexionBD.existeArtista(nombre)) {
			conexionBD.eliminarArtista(nombre);
			
			System.out.println("Se ha dado de baja al artista correctamente.");
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
		
		if (!conexionBD.existeArtista(nombre)) {
			conexionBD.altaArtista(nombre, dni);
			
			System.out.println("Se ha dado de alta al artista correctamente.");
		} else {
			System.out.println("Ya existe un artista llamado: " + nombre + ".");
		}
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
	
	public static void mostrarListadoArtistasXLetra(BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca la letra en maýusculas:");
		char letra = sctxt.nextLine().charAt(0);
		
		ArrayList<String> datosArtistas = conexionBD.devolverListadoArtistasXLetra(letra);
		
		for (int i = 0; i < datosArtistas.size(); i++) {
			System.out.println(datosArtistas.get(i));
		}
	}
	
	public static void altaGrupo (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		
		System.out.println("Introduzca el código del grupo:");
		int cod = scnum.nextInt();
		
		if (!conexionBD.existeGrupo(cod)) {
			System.out.println("Introduzca el nombre del grupo:");
			String nombre = sctxt.nextLine();
			
			System.out.println("Introduzca el año de la creación del grupo en formato numérico:");
			String año = sctxt.nextLine().trim();
			
			System.out.println("Introduzca el mes de la creación del grupo en formato numérico:");
			String mes = sctxt.nextLine().trim();
			
			System.out.println("Introduzca el día de la creación del grupo en formato numérico:");
			String dia = sctxt.nextLine().trim();
			
			String fecha = año + "-" + mes + "-" + dia + " 00:00:00";
			
			System.out.println("Introduzca el nombre del país del grupo:");
			String pais = sctxt.nextLine();
			
			conexionBD.altaGrupo(cod, nombre, fecha, pais);
			
			System.out.println("Se ha dado de alta al grupo correctamente");
			
		} else {
			System.out.println("El grupo con el código '" + cod + "' ya existe.");
		}
	}
	
	public static void insertarArtistaEnGrupo (BDController conexionBD) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Listado de artistas:\n");
		mostrarListadoArtistas(conexionBD);
		System.out.println("Listado de grupos:\n");
		mostrarListadoGrupos(conexionBD);
		
		System.out.println("Introduzca el DNI del artista:");
		String dni = sctxt.nextLine();
		
		System.out.println("Introduzca el código del grupo:");
		int codGrupo = scnum.nextInt();
		
		System.out.println("Introduzca la función del artista:");
		String funcion = sctxt.nextLine();
		
		if (conexionBD.existeDNIArtista(dni) && conexionBD.existeGrupo(codGrupo)) {
			if (!conexionBD.existeRegistroEn_T_Pertenece(dni, codGrupo)) {
				conexionBD.insertarArtistaEnGrupo(dni, codGrupo, funcion);
				System.out.println("Se ha insertado al artista en el grupo correctamente.");
			} else {
				System.out.println("Ya existe un registro en la tabla.");
			}
			
		} else {
			System.out.println("El DNI del artista o el código del grupo no existen.");
		}
	}
	
	public static void insertarCancionEnDisco (BDController conexionBD) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Listado de canciones:\n");
		mostrarListadoCanciones(conexionBD);
		System.out.println("Listado de discos:\n");
		mostrarListadoDiscos(conexionBD);
		
		System.out.println("Introduzca el título de la canción:");
		String tituloCan = sctxt.nextLine();
		
		System.out.println("Introduzca el nombre del disco:");
		String nombreDisco = sctxt.nextLine();
		
		if (conexionBD.existeCancion(tituloCan) && conexionBD.existeDisco(nombreDisco)) {
			int codCancion = conexionBD.devolverCodCancion(tituloCan);
			int codDisco = conexionBD.devolverCodDisco(nombreDisco);
			
			if (!conexionBD.existeRegistroEn_T_Esta(codCancion, codDisco)) {
				conexionBD.insertarCancionEnDisco(codCancion, codDisco);
				System.out.println("Se ha insertado la canción en el disco correctamente.");

			} else {
				System.out.println("Ya existe un registro en la tabla.");
			}
			
		} else {
			System.out.println("La canción o el disco no existen.");
		}
	}
	
	public static void eliminarArtistaEnGrupo (BDController conexionBD) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del artista:");
		String nombreArt = sctxt.nextLine();
		
		System.out.println("Introduzca el nombre del grupo:");
		String nombreGrupo = sctxt.nextLine();
		
		String dni = conexionBD.devolverDniArtista(nombreArt);
		int codGrupo = conexionBD.devolverCodGrupo(nombreGrupo);
		
		if (conexionBD.existeDNIArtista(dni) && conexionBD.existeGrupo(codGrupo)) {
			if (conexionBD.existeRegistroEn_T_Pertenece(dni, codGrupo)) {
				conexionBD.eliminarArtistaDeGrupo(dni);
				System.out.println("Se ha eliminado el registro correctamente.");
				
			} else {
				System.out.println("No existe un registro en la tabla.");
			}
			
		} else {
			System.out.println("El DNI del artista o el código del grupo no existen.");
		}
	}

}
