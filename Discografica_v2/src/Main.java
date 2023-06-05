import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		
		// Declaro un array de 12 objetos de tipo cancion.
		Cancion[] canciones = new Cancion[12];
		
		// Llamo al método que rellena el array de canciones con canciones reales
		Main.rellenarCanciones(canciones);
		
		// Array de discos formado por un solo disco
		Disco [] datosDiscos = new Disco [1];
		datosDiscos[0] = new Disco("Viento", 2000, 15015445, "Yo mismo", canciones);
		
		// Array de discos recopilatorios formado por dos discos recopilatorios
		DiscoRecopilatorio [] datosDiscosRecopilatorios = new DiscoRecopilatorio [2];
		datosDiscosRecopilatorios[0] = new DiscoRecopilatorio("Estaciones", 1256856, datosDiscos);
		datosDiscosRecopilatorios[1] = new DiscoRecopilatorio("Years", 123454, datosDiscos);
		
		
		int opc=0;
		do {
			//Llamo al método que muestra el menú de nuestra aplicación.
			Main.mostrarMenu();
			opc=scnum.nextInt();
			
			switch(opc) {
				case 1: mostrarTitulosCanciones(canciones);
					break;
				case 2: mostrarTitulosCancionesDuracion4(canciones);
					break;
				case 3: mostrarDuracionCancionTituloMax(canciones);
					break;
				case 4: mostrarTitulosCancionesSeparadosXComas(canciones);
					break;
				case 5: mostrarSumaDuracionCanciones(canciones);
					break;
				case 6: 
					System.out.println("");
					
					for (int i = 0; i < duracionCanciones(canciones).length; i++) {
						System.out.println(duracionCanciones(canciones)[i]);
						
					}
					
					break;
				case 7: mostrarDatosCancionesDisco(datosDiscos);
					break;
				case 8: mostrarTituloDiscoDeCancion(datosDiscos);
					break;
				case 9: 
					System.out.println("");
					System.out.println("Introduzca la letra:");
					char letra = sctxt.nextLine().charAt(0);
					
					for (int i = 0; i < titulosDiscosXLetra(datosDiscos, letra).length; i++) {
						System.out.println(titulosDiscosXLetra(datosDiscos, letra)[i]);
					}
					
					
					break;
				case 10: System.out.println(discoDuracionMax(datosDiscos).toString());
					break;
				case 11: nVecesCancionEnDiscos(datosDiscos);;
					break;
				case 12: mostrarDuracionCancionesTituloDisco_a_e(datosDiscos);
					break;
				case 13: vaciarCancionesDiscoXNombre(datosDiscos);
					break;
				case 14: mostrarTituloPrimeraUltimaCancionDiscoRecopilatorio(datosDiscosRecopilatorios[0]);
					break;
				case 15: mostrarDatosDiscoRecopilarioDuracionMax(datosDiscosRecopilatorios);
					break;
				case 16: mostrarDatosDiscoRecopilarioDuracionMin(datosDiscosRecopilatorios);
					break;
				case 17: mostrarTitulo2DiscosRecopilatoriosDuracionMax(datosDiscosRecopilatorios);
					break;
				case 18: mostrarTitulo2DiscosRecopilatoriosDuracionMin(datosDiscosRecopilatorios);
					break;
				case 19: mostrarDatosDiscosRecopProductor(datosDiscosRecopilatorios);
					break;
				case 20: mostrarDatosDiscosRecopAñoPubli(datosDiscosRecopilatorios);
					break;
				case 21: System.out.println("Ha salido del menú.");
					break;
				default : 
					System.out.println("");
					System.out.println("Opción incorrecta.");
			}		
		} while(opc != 21);
		
		scnum.close();
		sctxt.close();
		
	}
	
	
	/**
	 * Método que muestra en pantalla el menú de opciones del ejercicio en el que est�s.
	 */
	public static void mostrarMenu() {
		System.out.println("");
		System.out.println("Elija una opción del menú:");
		System.out.println("");
		System.out.println("1. Mostrar todos los títulos de las canciones que hay en un array de canciones, unicamente los\r\n"
				+ "títulos, a modo de listado con las canciones numeradas, 1….2..3..4...");
		System.out.println("");
		System.out.println("2. Mostrar todos los títulos de las canciones que hay en un array de canciones pero solo de las\r\n"
				+ "canciones que su duración no exceda de 4 minutos.");
		System.out.println("");
		System.out.println("3. Mostrar la duración de la canción con mayor longitud en el título que hay en un array de\r\n"
				+ "canciones, y puede que necesite mosrtar algún atributo más de esa canción.");
		System.out.println("");
		System.out.println("4. Mostrar todos títulos de las canciones de un array de canciones separados por comas.");
		System.out.println("");
		System.out.println("5. Mostrar la duración de la suma de todas las canciones de un array de canciones.");
		System.out.println("");
		System.out.println("6. Mostrar todas las duraciones de todas las canciones de un array de canciones. (El método\r\n"
				+ "devolverá un array de duraciones).");
		System.out.println("");
		System.out.println("7. Mostrar los datos de las canciones de un disco que quiera el usuario de un array de discos, el\r\n"
				+ "usuario dará el título del disco. Los datos de las canciones se mostrarán de la siguiente manera:\r\n"
				+ "Titulo Cancion 1: Pausa - Duración: 1,4\r\n"
				+ "Titulo Cancion 2: El Baile - Duración: 2,4");
		System.out.println("");
		System.out.println("8. Mostrar el título del disco donde se encuentre un título de una canción pedida al\r\n"
				+ "usuario, de un array de discos."); 
		System.out.println("");
		System.out.println("9. Mostrar todos los títulos de los discos que empiezan por una letra pedida al usuario, de un array\r\n"
				+ "de discos.(El método devolverá un array con los títulos de los discos).");
		System.out.println("");
		System.out.println("10. Mostrar los datos del disco con mayor duración de un array de discos.(El método devolverá el\r\n"
				+ "disco con mayor duración).");
		System.out.println("");
		System.out.println("11. Mostrar en pantalla el nº de veces que aparece una misma canción en varios discos. El título de\r\n"
				+ "la canción debes pedírsela al usuario.");
		System.out.println("");
		System.out.println("12. Mostrar la duración de todas las canciones de los discos de un array de discos, pero solo de los\r\n"
				+ "discos que su título empiece por la letra a o por la e.");
		System.out.println("");
		System.out.println("13. Introducir un título de un disco y vaciar todo su array de canciones.");
		System.out.println("");
		System.out.println("14. Mostrar el título de la primera y última canción de un disco recopilatorio");
		System.out.println("");
		System.out.println("15. Mostrar los datos del disco recopilatorio que tenga mayor duración de un array de discos\r\n"
				+ "recopilatorios.");
		System.out.println("");
		System.out.println("16. Mostrar los datos del disco recopilatorio que tenga menor duración, de un array de discos\r\n"
				+ "recopilatorios.");
		System.out.println("");
		System.out.println("17. Mostrar el Título de los 2 discos recopilatorios con mayor duración de un array de discos\r\n"
				+ "recopilatorios.");
		System.out.println("");
		System.out.println("18. Mostrar el Título de los 2 discos recopilatorios con menor duración de un array de discos\r\n"
				+ "recopilatorios.");
		System.out.println("");
		System.out.println("19. Mostrar los datos de los discos recopilatorios que tengan discos producidos por un productor\r\n"
				+ "pedido al usuario.");
		System.out.println("");
		System.out.println("20. Mostrar los datos de los discos recopilatorios que tengan discos publicados antes de un año\r\n"
				+ "pedido al usuario.");
		System.out.println("");
		System.out.println("21. Salir");
	}
	
	/**
	 * Método que rellena el array de canciones con 12 canciones del fantastico grupo Indie Izal.
	 * @param canciones (Array de objetos de la clase Cancion)
	 */
	public static void rellenarCanciones(Cancion[] canciones) {
		canciones[0]=new Cancion("La mujer de verde", 2.1);
		canciones[1]=new Cancion("Copacabana", 3.9);
		canciones[2]=new Cancion("Pausa", 3);
		canciones[3]=new Cancion("Que bien", 3);
		canciones[4]=new Cancion("Pánico Práctico", 3.6);
		canciones[5]=new Cancion("El pozo", 3);
		canciones[6]=new Cancion("La increible historia del hombre que no sabía volar", 3);
		canciones[7]=new Cancion("Autoterapia", 4.3);
		canciones[8]=new Cancion("Bill Murray", 1);
		canciones[9]=new Cancion("El baile", 6);
		canciones[10]=new Cancion("Magia y efectos especiales", 4);
		canciones[11]=new Cancion("Pequeña gran revolución", 2);
	}
	
	
	static void mostrarTitulosCanciones (Cancion [] datosCanciones) {
		System.out.println("");
		
		for (int i = 0; i < datosCanciones.length; i++) {
			System.out.println((i+1) + ". " + datosCanciones[i].getTitulo());
		}
	}
	
	
	static void mostrarTitulosCancionesDuracion4 (Cancion [] datosCanciones) {
		System.out.println("");
		
		for (int i = 0; i < datosCanciones.length; i++) {
			if (datosCanciones[i].getDuracion() < 4) {
				System.out.println((i+1) + ". " + datosCanciones[i].getTitulo());
			}
		}
	}
	
	
	static void mostrarDuracionCancionTituloMax (Cancion [] datosCanciones) {
		System.out.println("");
		int longitudMax = datosCanciones[0].getTitulo().length()-1;
		int pos = 0;
		
		
		for (int i = 0; i < datosCanciones.length; i++) {
			if (datosCanciones[i].getTitulo().length() > longitudMax) {
				longitudMax = datosCanciones[i].getTitulo().length();
				pos = i;
			}
		}
		
		System.out.println("Título: " + datosCanciones[pos].getTitulo() + ".\n"
				+ "Duración: " + datosCanciones[pos].getDuracion());
	}
	
	
	static void mostrarTitulosCancionesSeparadosXComas (Cancion [] datosCanciones ) {
		System.out.println("");
		
		for (int i = 0; i < datosCanciones.length; i++) {
			System.out.print(datosCanciones[i].getTitulo() + ", ");
		}
	}
	
	
	static void mostrarSumaDuracionCanciones (Cancion [] datosCanciones ) {
		System.out.println("");
		double sumaDuracion = 0.0;
		
		
		for (int i = 0; i < datosCanciones.length; i++) {
			sumaDuracion = sumaDuracion + datosCanciones[i].getDuracion();
		}
		
		System.out.printf("%.2f", sumaDuracion);
		System.out.print(" minutos.");
	}
	
	
	static double [] duracionCanciones (Cancion [] datosCanciones ) {
		double [] duracionesCanciones = new double [datosCanciones.length];
		
		
		for (int i = 0; i < datosCanciones.length; i++) {
			duracionesCanciones[i] = datosCanciones[i].getDuracion();
		}
		
		
		return duracionesCanciones;
	}
	
	
	static void mostrarDatosCancionesDisco (Disco [] datosDiscos) {
		System.out.println("");
		Scanner sctxt = new Scanner(System.in);
		
		
		System.out.println("");
		boolean existe = false;
		
		System.out.println("Introduzca el título del disco:");
		String tituloDisco = sctxt.nextLine();
		
		
		for (int i = 0; i < datosDiscos.length; i++) {
			if (datosDiscos[i].getTitulo().equals(tituloDisco)) {
				for (int j = 0; j < datosDiscos[i].getCanciones().length; j++) {
					System.out.println("Título Canción " + (j+1) + ": " + datosDiscos[i].getCanciones()[j].getTitulo() + " - Duración: " + datosDiscos[i].getCanciones()[j].getDuracion());
					existe = true;
				}
			}
		}
		
		
		if (existe == false) {
			System.out.println("El disco no existe.");
		}
	}
	
	
	static void mostrarTituloDiscoDeCancion (Disco [] datosDiscos) {
		System.out.println("");
		Scanner sctxt = new Scanner(System.in);
		boolean existe = false;
		
		
		System.out.println("Introduzca el título de la canción:");
		String tituloCancion = sctxt.nextLine();
		
		
		for (int i = 0; i < datosDiscos.length; i++) {
			for (int j = 0; j < datosDiscos[i].getCanciones().length; j++) {
				if (datosDiscos[i].getCanciones()[j].getTitulo().equals(tituloCancion)) {
					System.out.println(datosDiscos[i].getTitulo());
					existe = true;
				}
			}
		}
		
		if (existe == false) {
			System.out.println("La canción no existe.");
		}
	}
	
	
	static String [] titulosDiscosXLetra (Disco [] datosDiscos, char letra) {
		boolean existe = false;
		int cont = 0;
		
		
		for (int i = 0; i < datosDiscos.length; i++) {
			if (datosDiscos[i].getTitulo().startsWith(String.valueOf(letra))) {
				cont++;
				existe = true;
			}
		}
		
		
		String [] titulosDiscosXLetra = new String [cont];
		int indice = 0;
		
		for (int i = 0; i < datosDiscos.length; i++) {
			if (datosDiscos[i].getTitulo().startsWith(String.valueOf(letra))) {
				titulosDiscosXLetra[indice] = datosDiscos[i].getTitulo();
				indice++;
			}
		}
		
		
		if (existe == false) {
			System.out.println("No existe ningún título de ninguna canción que empiece por la letra introducida.");
		}
		
		
		return titulosDiscosXLetra;
	}
	
	
	static Disco discoDuracionMax (Disco [] datosDiscos) {
		double [] duraciones = new double [datosDiscos.length];
		
		
		for (int i = 0; i < datosDiscos.length; i++) {
			for (int j = 0; j < datosDiscos[i].getCanciones().length; j++) {
				duraciones[i] = duraciones[i] + datosDiscos[i].getCanciones()[j].getDuracion();
			}
		}
		
		double duracionMax = duraciones[0]-1;
		int posicion = 0;
		
		
		for (int i = 0; i < duraciones.length; i++) {
			if (duraciones[i] > duracionMax) {
				duracionMax = duraciones[i];
				posicion = i;
			}
		}
		
		return datosDiscos[posicion];
	}
	
	
	static void nVecesCancionEnDiscos (Disco [] datosDiscos) {
		Scanner sctxt = new Scanner(System.in);
		String tituloCancion = "";
		int cont = 0;
		
		
		System.out.println("Introduzca el título de una canción:");
		tituloCancion = sctxt.nextLine();
		
		
		for (int i = 0; i < datosDiscos.length; i++) {
			for (int j = 0; j < datosDiscos[i].getCanciones().length; j++) {
				if (datosDiscos[i].getCanciones()[j].getTitulo().equals(tituloCancion)) {
					cont++;
				}
			}
		}
		
		System.out.println("Número de veces que aparece la canción en los discos: " + cont);
	}
	
	
	static void mostrarDuracionCancionesTituloDisco_a_e (Disco [] datosDiscos) {
		boolean existe = false;
		
		for (int i = 0; i < datosDiscos.length; i++) {
			if (datosDiscos[i].getTitulo().startsWith("a") || datosDiscos[i].getTitulo().startsWith("e")) {
				existe = true;
				for (int j = 0; j < datosDiscos[i].getCanciones().length; j++) {
					System.out.println("Duración: " + datosDiscos[i].getCanciones()[j].getDuracion());
				}
			}
		}
		
		if (existe == false) {
			System.out.println("No hay ningún título de disco que empiece por la letra a o la e.");
		}
	}
	
	
	// 13
	static void vaciarCancionesDiscoXNombre (Disco [] datosDiscos) {
		Scanner sctxt = new Scanner(System.in);
		boolean existe = false;
		
		
		System.out.println("Introduzca el título de un disco:");
		String tituloDisco = sctxt.nextLine();
		
		
		for (int i = 0; i < datosDiscos.length; i++) {
			if (datosDiscos[i].getTitulo().equals(tituloDisco)) {
				for (int j = 0; j < datosDiscos[i].getCanciones().length; j++) {
					datosDiscos[i].getCanciones()[j].vaciarDatos();
					existe = true;
				}
			}
		}
		
		
		if (existe == false) {
			System.out.println("El disco no existe. No se ha podido realizar la operación.");
		}
	}
	
	
	// 15
	static void mostrarTituloPrimeraUltimaCancionDiscoRecopilatorio (DiscoRecopilatorio datosDiscoRecopilatorio) {
		int posUltimoDisco = datosDiscoRecopilatorio.getDatosDiscos().length-1;
		int posUltimaCancionDeUltimoDisco = datosDiscoRecopilatorio.getDatosDiscos()[posUltimoDisco].getCanciones().length-1;
		
		
		System.out.println("Título 1: " + datosDiscoRecopilatorio.getDatosDiscos()[0].getCanciones()[0].getTitulo() +  
		" - Título 2: " + datosDiscoRecopilatorio.getDatosDiscos()[posUltimoDisco].getCanciones()[posUltimaCancionDeUltimoDisco].getTitulo());
	}
	
	
	// Método auxiliar 1
	static double calcularDuracionDisco (Disco datosDisco) {
		double duracionDisco = 0;
		
		for (int i = 0; i < datosDisco.getCanciones().length; i++) {
			duracionDisco = duracionDisco + datosDisco.getCanciones()[i].getDuracion();
		}
		
		return duracionDisco;
	}
	
	
	// Método auxiliar 2
	static double calcularDuracionDiscoRecopilatorio (DiscoRecopilatorio datosDiscoRecopilatorio) {
		double duracionDiscoRecop = 0;
		
		for (int i = 0; i < datosDiscoRecopilatorio.getDatosDiscos().length; i++) {
			duracionDiscoRecop = duracionDiscoRecop + calcularDuracionDisco(datosDiscoRecopilatorio.getDatosDiscos()[i]);
		}
		
		return duracionDiscoRecop;
	}
	
	// 16
	static void mostrarDatosDiscoRecopilarioDuracionMax (DiscoRecopilatorio [] datosDiscosRecopilatorios) {
		double duracionMax = calcularDuracionDiscoRecopilatorio(datosDiscosRecopilatorios[0])-1;
		int pos = 0;
		
		
		for (int i = 0; i < datosDiscosRecopilatorios.length; i++) {
			if (calcularDuracionDiscoRecopilatorio(datosDiscosRecopilatorios[i]) > duracionMax) {
				duracionMax = calcularDuracionDiscoRecopilatorio(datosDiscosRecopilatorios[i]);
				pos = i;
			}
		}
		
		
		datosDiscosRecopilatorios[pos].mostrarDatos();
	}
	
	
	//17
	static void mostrarDatosDiscoRecopilarioDuracionMin (DiscoRecopilatorio [] datosDiscosRecopilatorios) {
		double duracionMin = calcularDuracionDiscoRecopilatorio(datosDiscosRecopilatorios[0])+1;
		int pos = 0;
		
		
		for (int i = 0; i < datosDiscosRecopilatorios.length; i++) {
			if (calcularDuracionDiscoRecopilatorio(datosDiscosRecopilatorios[i]) < duracionMin) {
				duracionMin = calcularDuracionDiscoRecopilatorio(datosDiscosRecopilatorios[i]);
				pos = i;
			}
		}
		
		
		datosDiscosRecopilatorios[pos].mostrarDatos();
	}
	
	
	// 18
	static void mostrarTitulo2DiscosRecopilatoriosDuracionMax (DiscoRecopilatorio [] datosDiscosRecopilatorios) {
		DiscoRecopilatorio [] datosDiscosRecopilatoriosDuracionMax = new DiscoRecopilatorio [2];
		DiscoRecopilatorio aux;
		
		
		// De mayor a menor
		for (int i = 0; i < datosDiscosRecopilatorios.length; i++) {
			for (int j = 0; j < datosDiscosRecopilatorios.length-1; j++) {
				if (calcularDuracionDiscoRecopilatorio(datosDiscosRecopilatorios[j+1]) > calcularDuracionDiscoRecopilatorio(datosDiscosRecopilatorios[j])) {
					aux = datosDiscosRecopilatorios[j+1];
					datosDiscosRecopilatorios[j+1] = datosDiscosRecopilatorios[j];
					datosDiscosRecopilatorios[j] = aux;
				}
			}
		}
		
		
		for (int i = 0; i < datosDiscosRecopilatoriosDuracionMax.length; i++) {
			datosDiscosRecopilatoriosDuracionMax[i] = datosDiscosRecopilatorios[i];
			
			System.out.println(datosDiscosRecopilatoriosDuracionMax[i].getTitulo());
		}
	}
	
	
	// 19
	static void mostrarTitulo2DiscosRecopilatoriosDuracionMin (DiscoRecopilatorio [] datosDiscosRecopilatorios) {
		DiscoRecopilatorio [] datosDiscosRecopilatoriosDuracionMin = new DiscoRecopilatorio [2];
		DiscoRecopilatorio aux;
		
		
		// De menor a mayor
		for (int i = 0; i < datosDiscosRecopilatorios.length; i++) {
			for (int j = 0; j < datosDiscosRecopilatorios.length-1; j++) {
				if (calcularDuracionDiscoRecopilatorio(datosDiscosRecopilatorios[j+1]) < calcularDuracionDiscoRecopilatorio(datosDiscosRecopilatorios[j])) {
					aux = datosDiscosRecopilatorios[j+1];
					datosDiscosRecopilatorios[j+1] = datosDiscosRecopilatorios[j];
					datosDiscosRecopilatorios[j] = aux;
				}
			}
		}
		
		
		for (int i = 0; i < datosDiscosRecopilatoriosDuracionMin.length; i++) {
			datosDiscosRecopilatoriosDuracionMin[i] = datosDiscosRecopilatorios[i];
			
			System.out.println(datosDiscosRecopilatoriosDuracionMin[i].getTitulo());
		}
	}
	
	
	// Método auxiliar para 20
	static boolean existeProductorEnDiscoRecopilatorio (DiscoRecopilatorio datosDiscoRecopilatorio, String productor) {
		boolean existeProductor = false;
		
		for (int i = 0; i < datosDiscoRecopilatorio.getDatosDiscos().length; i++) {
			if (datosDiscoRecopilatorio.getDatosDiscos()[i].getProductor().equals(productor)) {
				existeProductor = true;
			}
		}
		
		return existeProductor;
	}
	
	
	//20
	static void mostrarDatosDiscosRecopProductor (DiscoRecopilatorio [] datosDiscosRecopilatorios) {
		Scanner sctxt = new Scanner(System.in);
		boolean existe = false;
		
		System.out.println("Introduzca el nombre del productor del disco:");
		String productor = sctxt.nextLine();
		
		
		for (int i = 0; i < datosDiscosRecopilatorios.length; i++) {
			if (existeProductorEnDiscoRecopilatorio(datosDiscosRecopilatorios[i], productor)) {
				datosDiscosRecopilatorios[i].mostrarDatos();
				System.out.println("");
				existe = true;
			}
		}
		
		if (existe == false) {
			System.out.println("No existe ningún disco producido por el productor introducido.");
		}
	}
	
	
	// Método auxiliar para 21
	static boolean existeAñoPubliEnDiscoRecop (DiscoRecopilatorio datosDiscoRecopilatorio, int año) {
		boolean existeDiscoAño = false;
		
		for (int i = 0; i < datosDiscoRecopilatorio.getDatosDiscos().length; i++) {
			if (datosDiscoRecopilatorio.getDatosDiscos()[i].getAñopublicacion() < año) {
				existeDiscoAño = true;
			}
		}
		
		return existeDiscoAño;
	}
	
	
	// 21
	static void mostrarDatosDiscosRecopAñoPubli (DiscoRecopilatorio [] datosDiscosRecopilatorios) {
		Scanner scnum = new Scanner(System.in);
		boolean existe = false;
		
		System.out.println("Introduzca el año de publicación del disco:");
		int año = scnum.nextInt();
		
		
		for (int i = 0; i < datosDiscosRecopilatorios.length; i++) {
			if (existeAñoPubliEnDiscoRecop(datosDiscosRecopilatorios[i], año)) {
				datosDiscosRecopilatorios[i].mostrarDatos();
				System.out.println("");
				existe = true;
			}
		}
		
		if (existe == false) {
			System.out.println("No existe ningún disco publicado antes del año introducido.");
		}
	}
}


