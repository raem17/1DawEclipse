import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numerosPrincipal = new int [50];

		int [] numeros1 = new int [10];
		int [] numeros2 = new int [10];
		int [] numeros3 = new int [10];
		int [] numeros4 = new int [10];
		int [] numeros5 = new int [10];
		
		
		// El usuario rellena el array principal
		for (int i = 0; i < numerosPrincipal.length; i++) {
			System.out.println("Rellene el array 1. Introduzca un número nº " + (i + 1));
			numerosPrincipal [i] = scnum.nextInt();
		}
		
		
		// Se rellena el array 1 con números del array principal
		for (int i = 0; i < numeros1.length; i++) {
			numeros1 [i] = numerosPrincipal [i];
		}
		
		// Se rellena el array 2 con números del array principal
		for (int i = 0, j = 10; i < numeros2.length; i++, j++) {
			numeros2 [i] = numerosPrincipal [j];
		}
		
		// Se rellena el array 3 con números del array principal
		for (int i = 0, j = 20; i < numeros3.length; i++, j++) {
			numeros3 [i] = numerosPrincipal [j];
		}
		
		// Se rellena el array 4 con números del array principal
		for (int i = 0, j = 30; i < numeros4.length; i++, j++) {
			numeros4 [i] = numerosPrincipal [j];
		}
		
		// Se rellena el array 5 con números del array principal
		for (int i = 0, j = 40; i < numeros5.length; i++, j++) {
			numeros5 [i] = numerosPrincipal [j];
		}
		
		
		// Se imprimen las posiciones del array principal
		System.out.println("Contenido del array principal:");
		for (int i = 0; i < numerosPrincipal.length; i++) {
			System.out.println("Posición " + i + ": " + numerosPrincipal[i]);
		}
		
		// Se imprimen las posiciones del array 1
		System.out.println("");
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
		
		// Se imprimen las posiciones del array 5
		System.out.println("");
		System.out.println("Contenido del array 5:");
		for (int i = 0; i < numeros5.length; i++) {
			System.out.println("Posición " + i + ": " + numeros5[i]);
		}
		
		scnum.close();
	}

}
