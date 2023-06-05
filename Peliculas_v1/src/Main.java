import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		
		String ruta = "peliculas.txt";
		File archivo = new File(ruta);
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		// Se verifica que el archivo existe, sino se crea
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Se crean e insertan los objetos película en el ArrayList creado con anterioridad
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			try {
				linea = br.readLine();
				
				while (linea != null) {
					Pelicula nuevaPeli = new Pelicula(devolverNumXPosicion(linea, 0), devolverCadenaXPosicion(linea, 1), devolverNumXPosicion(linea, 2), devolverCadenaXPosicion(linea, 3), devolverNumXPosicion(linea, 4));
					peliculas.add(nuevaPeli);
					linea = br.readLine();
				}
				
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Menú para el usuario
		int opc = 0;
		do {
			mostrarMenu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1: altaPelicula(peliculas);
				break;
			case 2: bajaPelicula(peliculas);
				break;
			case 3: consultaPeliculas(peliculas);
				break;
			case 4: consultaDatosPelicula(peliculas);
				break;
			case 5: System.out.println("Ha salido del programa.");
				break;
			default: System.out.println("Opción incorrecta.");
				break;
			}
		} while (opc != 5);
		
		// Se actualizan los datos del archivo de texto
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			
			for (int i = 0; i < peliculas.size(); i++) {
				String nuevaLinea = peliculas.get(i).getCod_peli() + " || " + peliculas.get(i).getNombre_peli() + " || " + peliculas.get(i).getAnnio_estreno() + " || " + peliculas.get(i).getNombre_actor_prota() + " || " + peliculas.get(i).getCoste_produccion();
				bw.write(nuevaLinea);
				bw.newLine();
			}
			
			bw.close(); // Importante
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		scnum.close();
	}
	
	// Métodos
	
	// Métodos auxiliares
	public static String devolverCadenaXPosicion (String linea, int posicion) {
		String cadena = "";
		
		cadena = linea.split("\\|\\|")[posicion];
		cadena = cadena.trim();
		
		return cadena;
	}
	
	public static int devolverNumXPosicion (String linea, int posicion) {
		String cadena = "";
		
		cadena = linea.split("\\|\\|")[posicion];
		cadena = cadena.trim();
		
		int num = Integer.valueOf(cadena);
		
		return num;
	}
	
	// Métodos del programa
	public static void mostrarMenu() {
		System.out.println("\nIntroduzca una opción del menú:\n");
		System.out.println("1. Dar de alta una película.");
		System.out.println("2. Dar de baja una película.");
		System.out.println("3. Mostrar un listado con todas las películas.");
		System.out.println("4. Consultar datos de una película por su código.");
		System.out.println("5. Salir.");
	}
	
	public static void altaPelicula(ArrayList<Pelicula> datosPelis) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		Pelicula nuevaPeli = new Pelicula();
		
		System.out.println("Introduzca el código de la película:");
		nuevaPeli.setCod_peli(scnum.nextInt());
		
		System.out.println("Introduzca el nombre de la película:");
		nuevaPeli.setNombre_peli(sctxt.nextLine());
		
		System.out.println("Introduzca el año de estreno de la película:");
		nuevaPeli.setAnnio_estreno(scnum.nextInt());
		
		System.out.println("Introduzca el nombre del actor protagonista de la película:");
		nuevaPeli.setNombre_actor_prota(sctxt.nextLine());
		
		System.out.println("Introduzca el coste de producción de la película:");
		nuevaPeli.setCoste_produccion(scnum.nextInt());
		
		datosPelis.add(nuevaPeli);
		
		System.out.println("\nSe ha realizado la operación correctamente\n");
	}
	
	public static void bajaPelicula(ArrayList<Pelicula> datosPelis) {
		Scanner scnum = new Scanner(System.in);
		int codPeli = 0;
		boolean existe = false;
		
		System.out.println("Introduzca el código de la película que desea dar de baja:");
		codPeli = scnum.nextInt();
		
		for (int i = 0; i < datosPelis.size(); i++) {
			if (datosPelis.get(i).getCod_peli() == codPeli) {
				existe = true;
				break;
			}
		}
		
		if (existe == true) {
			/* Revisar, no se puede borrar todos los objetos (que tengan un mismo código) del array porque la longitud del array va disminuyendo al borrar un objeto.
			 * Por lo que nunca se recorre completamente el array.
			 * */
			// Se establece que se elimine un solo objeto con el mismo código
			for (int i = 0; i < datosPelis.size(); i++) {
				if (datosPelis.get(i).getCod_peli() == codPeli) {
					datosPelis.remove(i);
					break;
				}
			}
			
			System.out.println("\nSe ha realizado la operación correctamente\n");
		} else {
			System.out.println("No existe ninguna película con el código introducido.");
		}
	}
	
	public static void consultaPeliculas(ArrayList<Pelicula> datosPelis) {
		for (int i = 0; i < datosPelis.size(); i++) {
			System.out.println(datosPelis.get(i).getNombre_peli());
		}
	}
	
	public static void consultaDatosPelicula(ArrayList<Pelicula> datosPelis) {
		Scanner scnum = new Scanner(System.in);
		int codPeli = 0;
		boolean existe = false;
		
		System.out.println("Introduzca el código de la película de la que desa ver sus datos:");
		codPeli = scnum.nextInt();
		
		for (int i = 0; i < datosPelis.size(); i++) {
			if (datosPelis.get(i).getCod_peli() == codPeli) {
				existe = true;
				break;
			}
		}
		
		if (existe == true) {
			for (int i = 0; i < datosPelis.size(); i++) {
				if (datosPelis.get(i).getCod_peli() == codPeli) {
					datosPelis.get(i).mostrarDatos();
					break;
				}
			}
		} else {
			System.out.println("No existe ninguna película con el código introducido.");
		}
	}

}
