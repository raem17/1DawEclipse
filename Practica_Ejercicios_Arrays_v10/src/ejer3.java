import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [5];
		int [] numeros2 = new int [5];
		int [] numeros3 = new int [5];
		int cont = 0; // Para primos
		int [] contadoresPrimos = new int [3];
		
		
		// El usuario rellena los 3 arrays
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Array 1. Introduzca un número:");
			numeros1 [i] = scnum.nextInt();
			
			System.out.println("Array 2. Introduzca un número:");
			numeros2 [i] = scnum.nextInt();
			
			System.out.println("Array 3. Introduzca un número:");
			numeros3 [i] = scnum.nextInt();
		}
		
		
		// Se cuentan los primos en el array 1
		for (int i = 0; i < numeros1.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros1 [i]; aux++) {
				if (numeros1 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros1 [i] != 1) {
				contadoresPrimos [0]++;
			}
		}
		
		
		// Se cuentan los primos en el array 2
		for (int i = 0; i < numeros2.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros2 [i]; aux++) {
				if (numeros2 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros2 [i] != 1) {
				contadoresPrimos [1]++;
			}
		}
		
		
		// Se cuentan los primos en el array 3
		for (int i = 0; i < numeros3.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros3 [i]; aux++) {
				if (numeros3 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros3 [i] != 1) {
				contadoresPrimos[2]++;
			}
		}
		
		
		// Se comprueba cuál es el array con más primos, o en su defecto, empatan dependiendo de la situación
		if (contadoresPrimos [0] > contadoresPrimos [1] && contadoresPrimos [0] > contadoresPrimos [2]) {
			System.out.println("El array 1 es el array con más números primos.");
		} else if (contadoresPrimos [1] > contadoresPrimos [0] && contadoresPrimos [1] > contadoresPrimos [2]) {
			System.out.println("El array 2 es el array con más números primos.");
		} else if (contadoresPrimos [2] > contadoresPrimos [0] && contadoresPrimos [2] > contadoresPrimos [1]) {
			System.out.println("El array 3 es el array con más números primos.");
		} else if (contadoresPrimos [0] == contadoresPrimos [1] && contadoresPrimos [1] > contadoresPrimos [2]) {
			System.out.println("Hay un empate entre el array 1 y 2.");
		} else if (contadoresPrimos [0] == contadoresPrimos [2] && contadoresPrimos [2] > contadoresPrimos [1]) {
			System.out.println("Hay un empate entre el array 1 y 3.");
		} else if(contadoresPrimos [1] == contadoresPrimos [2] && contadoresPrimos [2] > contadoresPrimos [0]) {
			System.out.println("Hay un empate entre el array 2 y 3.");
		} else if ( (contadoresPrimos [0] == contadoresPrimos [1] && contadoresPrimos [1] == contadoresPrimos [2]) && contadoresPrimos [0] > 0 || contadoresPrimos [1] > 0 || contadoresPrimos [2] > 0 ) {
			System.out.println("Hay un empate entre los 3 arrays.");
		} else if (contadoresPrimos [0] == 0 && contadoresPrimos [1] == 0 && contadoresPrimos [2] == 0) {
			System.out.println("No se ha introducido ningún primo en ningún array.");
		}
		
		scnum.close();
	}

}
