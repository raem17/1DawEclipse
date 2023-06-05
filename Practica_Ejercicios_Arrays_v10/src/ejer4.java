import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [5];
		int [] numeros2 = new int [5];
		int [] numeros3 = new int [5];
		int [] numeros4 = new int [5];
		int cont = 0; // Para primos
		
		
		// El usuario rellena los 4 arrays
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Array 1. Introduzca un número:");
			numeros1 [i] = scnum.nextInt();
			
			System.out.println("Array 2. Introduzca un número:");
			numeros2 [i] = scnum.nextInt();
			
			System.out.println("Array 3. Introduzca un número:");
			numeros3 [i] = scnum.nextInt();
			
			System.out.println("Array 4. Introduzca un número:");
			numeros4 [i] = scnum.nextInt();
		}
		
		
		// Se comprueba qué números son primos en el array 1 y se sustituyen por el 0
		for (int i = 0; i < numeros1.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros1 [i]; aux++) {
				if (numeros1 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros1 [i] != 1) {
				numeros1 [i] = 0;
			}
		}
		
		
		// Se comprueba qué números son primos en el array 2 y se sustituyen por el 0
		for (int i = 0; i < numeros2.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros2 [i]; aux++) {
				if (numeros2 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros2 [i] != 1) {
				numeros2 [i] = 0;
			}
		}
		
		
		// Se comprueba qué números son primos en el array 3 y se sustituyen por el 0
		for (int i = 0; i < numeros3.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros3 [i]; aux++) {
				if (numeros3 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros3 [i] != 1) {
				numeros3 [i] = 0;
			}
		}
		
		
		// Se comprueba qué números son primos en el array 4 y se sustituyen por el 0
		for (int i = 0; i < numeros4.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros4 [i]; aux++) {
				if (numeros4 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros4 [i] != 1) {
				numeros4 [i] = 0;
			}
		}
		
		
		// Se imprime el contenido del array 1
		System.out.println("Array 1:");
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Posición: " + i + ": " + numeros1 [i]);
		}
		
		// Se imprime el contenido del array 2
		System.out.println("Array 2:");
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Posición: " + i + ": " + numeros2 [i]);
		}
		
		// Se imprime el contenido del array 3
		System.out.println("Array 3:");
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println("Posición: " + i + ": " + numeros3 [i]);
		}
		
		// Se imprime el contenido del array 4
		System.out.println("Array 4:");
		for (int i = 0; i < numeros4.length; i++) {
			System.out.println("Posición: " + i + ": " + numeros4 [i]);
		}
		
		scnum.close();
	}

}
