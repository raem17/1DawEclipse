import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [10];
		int contPrimos = 0;
		int cont = 0; // Para primos
		int contPares = 0;
		int contImpares = 0;
		
		
		// Se rellena el array 1
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros [i] = scnum.nextInt();
		}
		
		
		// Se cuentan los primos, pares e impares en el array de números
		for (int i = 0; i < numeros.length; i++) {
			cont = 0;
			
			// Primos
			for (int aux = 2; aux < numeros [i]; aux++) {
				if (numeros [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros [i] != 1) {
				contPrimos++;
			}
			
			// Pares e impares
			if (numeros [i] % 2 == 0) {
				contPares++;
			}
			
			else if (numeros [i] % 2 != 0) {
				contImpares++;
			}
		}
		
		
		// Se crea el array de primos
		int [] numerosPrimos = new int [contPrimos];
		
		// Se crean los arrays de pares e impares
		int [] numerosPares = new int [contPares];
		int [] numerosImpares = new int [contImpares];
		
		
		/* Creo tres variales: a, b y c
		 a para las posiciones del array de primos
		 b para las posiciones del array de pares
		 c para las posiciones del array de impares */
		for (int i = 0, a = 0, b = 0, c = 0; i < numeros.length; i++) {
			cont = 0;
			
			// // Se meten los primos del array numeros en el arrayPrimos
			for (int aux = 2; aux < numeros [i]; aux++) {
				if (numeros [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros [i] != 1) {
				numerosPrimos [a] = numeros [i];
				a++;
			}
			
			/* Se meten los pares del array numeros en el arrayPares
			 * Se meten los impares del array numeros en el arrayImpares*/
			if (numeros [i] % 2 == 0) {
				numerosPares [b] = numeros [i];
				b++;
			} else if (numeros [i] % 2 != 0) {
				numerosImpares [c] = numeros [i];
				c++;
			}
		}
		
		
		// Se imprimen las posiciones del array de primos
		System.out.println("Contenido del array de primos:");
		for (int i = 0; i < numerosPrimos.length; i++) {
			System.out.println("Posición " + i + ": " + numerosPrimos [i]);
		}
		
		// Se imprimen las posiciones del array de pares
		System.out.println("");
		System.out.println("Contenido del array de pares:");
		for (int i = 0; i < numerosPares.length; i++) {
			System.out.println("Posición " + i + ": " + numerosPares [i]);
		}
		
		// Se imprimen las posiciones del array de impares
		System.out.println("");
		System.out.println("Contenido del array de impares:");
		for (int i = 0; i < numerosImpares.length; i++) {
			System.out.println("Posición " + i + ": " + numerosImpares [i]);
		}
		
		
		scnum.close();
	}

}
