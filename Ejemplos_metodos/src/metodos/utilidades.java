package metodos;

public class utilidades {
	
	// Se le pasa un int. Devuelve un booleano en función de si es primo o no.
	static boolean esPrimo(int num) {
		boolean primo = false;
		int cont = 0;
		
		
		for (int i = 2; i < num; i++) {
			
			if (num % i == 0) {
				cont++;
			}
		}
		
		if (cont == 0 && num != 1) {
			primo = true;
		}
		
		else {
			primo = false;
		}
		
		return primo; // Deveulve un boolean
	}
	
	// Se crea un menú que muestre un menú
	static void mostrarMenu() {
		
		System.out.println("Seleccione una opción del menú:");
		System.out.println("");
		System.out.println("1. Opción 1");
		System.out.println("2. Opción 2");
		System.out.println("3. Opción 3");
		System.out.println("4. Opción 4");
		System.out.println("5. Opción 5");
		System.out.println("6. Opción 6");
		System.out.println("7. Opción 7");
		System.out.println("8. Salir");
	}
	
	// Se le pasa 4 ints. Devuelve el resultado de multiplicar los 4
	static int multi(int n1, int n2, int n3, int n4) {
		
		int resul = 0;
		resul = n1*n2*n3*n4;
		return resul;
	}
	
	// Método que recibe una cadena y elimina los espacios en blanco
	static String cadenaLimpia (String cadena) {
		
		String cadenaLimpia = "";
		
		cadena = cadena.trim();
		
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' ') {
				cadenaLimpia = cadenaLimpia + cadena.charAt(i);			
			} else if (cadena.charAt(i+1) != ' ') {
				cadenaLimpia = cadenaLimpia + cadena.charAt(i);
			}
		}
		
		return cadenaLimpia;
	}
	
	// Método que recibe una cadena y devuelve el nº de palabras
	static int nPalabrasEnCadena (String cadena) {
		
		int numPalabras = 0;
		
		cadena = cadenaLimpia(cadena);
		
		String [] subCadenas = cadena.split(" ");
		
		numPalabras = subCadenas.length;
		
		return numPalabras;
	}
	
	// Método que cuenta vocales
	static int numVocales (String cadena) {
		
		int nVocales = 0;
		String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
		
		
		for (int i = 0; i < cadena.length(); i++) {
			if (vocales.contains(String.valueOf(cadena.charAt(i)))) {
				nVocales++;
			}
		}
		
		return nVocales;
	}
	
	// Método que cuenta consonantes
	static int numConsonantes (String cadena) {
		
		int nConsonantes = 0;
		String Consonantes = "qwrtypsdfghjklñzxcvbnmQWRTYPSDFGHJKLÑZXCVBNM";
		
		
		for (int i = 0; i < cadena.length(); i++) {
			if (Consonantes.contains(String.valueOf(cadena.charAt(i)))) {
				nConsonantes++;
			}
		}
		
		return nConsonantes;
	}
	
	// Método que recibe una cadena y devuelve un array de enteros con el nº de veces que aparece cada vocal
	static int [] contadorCadaVocal (String cadena) {
		int [] nVocales = new int [5];
		
		for (int i = 0; i < cadena.length(); i++) {
			char letraActual = cadena.charAt(i);
			
			if (letraActual == 'a'|| letraActual == 'A' || letraActual == 'á' || letraActual == 'Á') {
				nVocales [0]++;
			} else if (letraActual == 'e' || letraActual == 'E' || letraActual == 'é' || letraActual == 'É') {
				nVocales [1]++;
			} else if (letraActual == 'i' || letraActual == 'I' || letraActual == 'í' || letraActual == 'Í') {
				nVocales [2]++;
			} else if (letraActual == 'o' || letraActual == 'O' || letraActual == 'ó' || letraActual == 'Ó') {
				nVocales [3]++;
			} else if (letraActual == 'u'|| letraActual == 'U' || letraActual == 'ú' || letraActual == 'Ú') {
				nVocales [4]++;
			}
		}
		
		
		return nVocales;
	}
}
