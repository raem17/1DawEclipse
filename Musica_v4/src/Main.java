import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
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
			case 13: System.out.println("Título de la canción más larga: " + conexionBD.devolverTituloDuracionMax());
			
				break;
				
			case 14: mostrarListadoCancionesDuracionMenorX(conexionBD);
				
				break;
				
			case 15: mostrarListadoCancionesXDisco(conexionBD);
				
				break;
				
			case 16: generarTitulosCancionesXGrupo(conexionBD);
				
				break;
				
			case 17: mostrarNombresArtistasXGrupo(conexionBD);
			
				break;

			case 18: mostrarTituloDiscosMin7Canciones(conexionBD);
			
				break;

			case 19: mostrarCancionesEnNingunDisco(conexionBD);
			
				break;

			case 20: mostrarArtistasEnNingunGrupo(conexionBD);
			
				break;

			case 21: System.out.println("Ha salido del programa.");
			
				break;

			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc != 21);
	}
	
	public static void mostrarMenu() {
		System.out.println("\nIntroduzca una opción:\n");
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
		System.out.println("13.	Muestra en pantalla el título de la canción más larga.");
		System.out.println("14.	Listado de canciones con duración menor a una duración pedida al usuario.");
		System.out.println("15.	Listado de canciones de un disco.");
		System.out.println("16.	Genera un archivo de texto con todas las canciones de un grupo pedido al usuario.");
		System.out.println("17.	Listado del nombre de los artistas de un grupo pedido al usuario");
		System.out.println("18.	Mostrar el título de todos los discos que tienen más de 6 canciones.");
		System.out.println("19.	Listado de canciones que no están en ningún disco.");
		System.out.println("20.	Listado de artistas que no están en ningún grupo. ");
		System.out.println("21.	Salir.");
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
	
	public static void mostrarListadoCancionesDuracionMenorX (BDController conexionBD) {
		Scanner scnum = new Scanner(System.in);
		
		System.out.println("Introduzca una duración (número entero):");
		int duracion = scnum.nextInt();
		
		ArrayList<String> datosCanciones = conexionBD.devolverListadoCancionesDuracionMenorX(duracion);
		
		for (int i = 0; i < datosCanciones.size(); i++) {
			System.out.println(datosCanciones.get(i));
		}
	}
	
	public static void mostrarListadoCancionesXDisco (BDController conexionBD) {
		Scanner sctxt = new Scanner(System.in);
		ArrayList<String> listadoCanciones = new ArrayList<String>();
		
		System.out.println("Introduzca el nombre del disco:");
		String nombreDisco = sctxt.nextLine();
		
		if (conexionBD.existeDisco(nombreDisco)) {
			int codDisco = conexionBD.devolverCodDisco(nombreDisco);
			listadoCanciones = conexionBD.devolverListadoCancionesXDisco(codDisco);
			
			for (int i = 0; i < listadoCanciones.size(); i++) {
				System.out.println(listadoCanciones.get(i));
			}
			
		} else {
			System.out.println("El disco no existe.");
		}

	}
	
	public static void generarTitulosCancionesXGrupo (BDController conexionBD) {
		Scanner scnum = new Scanner(System.in);
		
		System.out.println("Introduzca el código del grupo:");
		int codGrupo = scnum.nextInt();
		
		if (conexionBD.existeGrupo(codGrupo)) {
			String ruta = conexionBD.devolverNombreGrupoXCod(codGrupo) + ".txt";
			
			conexionBD.generarArchivoCancionesGrupo(ruta, codGrupo);
		} else {
			System.out.println("El grupo no existe.");
		}
	}
	
	public static void mostrarNombresArtistasXGrupo (BDController conexionBD) {
		ArrayList<String> nombresArtistas = new ArrayList<String>();
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del grupo:");
		String nombre = sctxt.nextLine();
		
		int codGrupo = conexionBD.devolverCodGrupo(nombre);
		if (conexionBD.existeGrupo(codGrupo)) {
			nombresArtistas = conexionBD.devolverNombresArtistasXGrupo(nombre);
			
			for (int i = 0; i < nombresArtistas.size(); i++) {
				System.out.println(nombresArtistas.get(i));
			}
		} else {
			System.out.println("El grupo no existe.");
		}
	}
		
	public static void mostrarTituloDiscosMin7Canciones (BDController conexionBD) {
		ArrayList<String> titulosDiscos = conexionBD.devolverTituloDiscosMin7Canciones();
		if (titulosDiscos.size() > 0) {
			for (int i = 0; i < titulosDiscos.size(); i++) {
				System.out.println(titulosDiscos.get(i));
			}
		} else {
				System.out.println("No hay ningún disco que tenga más de 6 canciones.");
		}
	}
	
	public static void mostrarCancionesEnNingunDisco (BDController conexionBD) {
		ArrayList<String> titulosDiscos = conexionBD.devolverTituloCancionesEnNingunDisco();
		if (titulosDiscos.size() > 0) {
			for (int i = 0; i < titulosDiscos.size(); i++) {
				System.out.println(titulosDiscos.get(i));
			}
		} else {
				System.out.println("No hay ninguna canción que no esté en ningún disco.");
		}
	}
	
	public static void mostrarArtistasEnNingunGrupo (BDController conexionBD) {
		ArrayList<String> nombresArtistas = conexionBD.devolverNombresArtistasEnNingunGrupo();
		if (nombresArtistas.size() > 0) {
			for (int i = 0; i < nombresArtistas.size(); i++) {
				System.out.println(nombresArtistas.get(i));
			}
		} else {
			System.out.println("No hay ningún artista que no esté en ningún grupo.");
		}
	}
	
}
