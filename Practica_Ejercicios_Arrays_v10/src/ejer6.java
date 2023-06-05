import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [10];
		int [] numeros2 = new int [10];
		int cont = 0; // Para primos
		int [] contadoresNoPrimos = new int [2];
		
		
		// El usuario rellena los 2 arrays
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Array 1. Introduzca un número:");
			numeros1 [i] = scnum.nextInt();
			
			System.out.println("Array 2. Introduzca un número:");
			numeros2 [i] = scnum.nextInt();
		}
		
		
		// Se cuentan los no primos en el array 1
		for (int i = 0; i < numeros1.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros1 [i]; aux++) {
				if (numeros1 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont > 0 || numeros1 [i] == 1) {
				contadoresNoPrimos [0]++;
			}
		}
		
		
		// Se cuentan los no primos en el array 2
		for (int i = 0; i < numeros2.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros2 [i]; aux++) {
				if (numeros2 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont > 0 || numeros2 [i] == 1) {
				contadoresNoPrimos [1]++;
			}
		}
		
		
		// Se crea el array de números no primos con la longitud de la suma de los contadores
		int [] numerosNoPrimos = new int [contadoresNoPrimos [0] + contadoresNoPrimos [1]];
		
		
		// Se recorre el array 1 y se comprueba los números no primos, después se meten en el array numerosNoPrimos  
		for (int i = 0, z = 0; i < numeros1.length; i++) { 
			cont = 0;
			
			for (int aux = 2; aux < numeros1 [i]; aux++) {
				if (numeros1 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont > 0 || numeros1 [i] == 1) {
				numerosNoPrimos [z] = numeros1 [i];
				z++;
			}
		}
		
		
		// Se recorre el array 2 y se comprueba los números no primos, después se meten en el array numerosNoPrimos  
		for (int i = 0, z = contadoresNoPrimos [0]; i < numeros2.length; i++) { 
			cont = 0;
			
			for (int aux = 2; aux < numeros2 [i]; aux++) {
				if (numeros2 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont > 0 || numeros2 [i] == 1) {
				numerosNoPrimos [z] = numeros2 [i];
				z++;
			}
		}
		

		// Se imprime el contenido del array
		System.out.println("Array numerosNoPrimos:");
		for (int i = 0; i < numerosNoPrimos.length; i++) {
			System.out.println("Posición: " + i + ": " + numerosNoPrimos [i]);
		}
		
		scnum.close();
	}

}
