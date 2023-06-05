import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int num1 = 0;
		
		
		System.out.println("Introduzca un número:");
		num1 = scnum.nextInt();
		int [] numeros1 = new int [num1];
		
		
		// El usuario rellena el array 1
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Rellene el array 1. Introduzca un número nº " + (i + 1));
			numeros1 [i] = scnum.nextInt();
		}
		
		
		// Si la longitud del array 1 es par:
		
		if (numeros1.length % 2 == 0) {
			int [] numeros2 = new int [num1 / 2];
			int [] numeros3 = new int [num1 / 2];
			
			// Se rellena el array 2 con la primera mitad del array 1
			for (int i = 0; i < numeros2.length; i++) {
				numeros2 [i] = numeros1 [i];
			}
			
			//Se rellena el array 3 con la segunda mitad del array 1
			for (int i = 0, j = numeros3.length; i < numeros3.length; i++, j++) {
				numeros3 [i] = numeros1 [j];
			}
			
			
			// Se imprimen las posiciones del array 1
			System.out.println("Contenido del array 1:");
			for (int i = 0; i < numeros1.length; i++) {
				System.out.println("Posición " + i + ": " + numeros1[i]);
			}
			
			// Se imprimen las posiciones del array 2
			System.out.println("");
			System.out.println("Contenido del array 2:");
			for (int i = 0; i < numeros2.length; i++) {
				System.out.println("Posición " + i + ": " + numeros2[i]);
			}
			
			// Se imprimen las posiciones del array 3
			System.out.println("");
			System.out.println("Contenido del array 3:");
			for (int i = 0; i < numeros3.length; i++) {
				System.out.println("Posición " + i + ": " + numeros3[i]);
			}
		}
		
		
		// Si la longitud del array 1 es impar:
		
		else if (numeros1.length % 2 != 0) {
			int [] numeros2 = new int [num1 / 2];
			int [] numeros3 = new int [num1 / 2];
			int [] numeros4 = new int [1];
			
			// Se rellena el array 2 con la primera mitad del array 1
			for (int i = 0; i < numeros2.length; i++) {
				numeros2 [i] = numeros1 [i];
			}
			
			//Se rellena el array 3 con la segunda mitad (omitiendo la ultima posicion) del array 1
			for (int i = 0, j = numeros3.length; i < numeros3.length; i++, j++) {
				numeros3 [i] = numeros1 [j];
			}
			
			//Se rellena el array 4 con la ultima posición del array 1
			for (int i = 0, j = numeros1.length-1; i < numeros4.length; i++, j++) {
				numeros4 [i] = numeros1 [j];
			}
			
			
			// Se imprimen las posiciones del array 1
			System.out.println("Contenido del array 1:");
			for (int i = 0; i < numeros1.length; i++) {
				System.out.println("Posición " + i + ": " + numeros1[i]);
			}
			
			// Se imprimen las posiciones del array 2
			System.out.println("");
			System.out.println("Contenido del array 2:");
			for (int i = 0; i < numeros2.length; i++) {
				System.out.println("Posición " + i + ": " + numeros2[i]);
			}
			
			// Se imprimen las posiciones del array 3
			System.out.println("");
			System.out.println("Contenido del array 3:");
			for (int i = 0; i < numeros3.length; i++) {
				System.out.println("Posición " + i + ": " + numeros3[i]);
			}
			
			// Se imprimen las posiciones del array 4
			System.out.println("");
			System.out.println("Contenido del array 4:");
			for (int i = 0; i < numeros4.length; i++) {
				System.out.println("Posición " + i + ": " + numeros4[i]);
			}
			
		}
		
		scnum.close();
	}

}
