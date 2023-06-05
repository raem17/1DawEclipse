import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [10];
		int [] numeros2 = new int [10];
		int [] numeros3 = new int [20];
		
		// El usuario rellena el array 1
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Array 1. Introduzca un número:");
			numeros1 [i] = scnum.nextInt();
		}
		
		// El usuario rellena el array 2
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Array 2. Introduzca un número:");
			numeros2 [i] = scnum.nextInt();
		}
		
		// Se rellena el array 3 con las posiciones del array 1
		for (int i = 0; i < numeros1.length; i++) {
			numeros3 [i] = numeros1 [i];
		}
		
		// Se rellena el resto del array 3 con las posiciones del array 2, para eso creo una variable j para las posiciones del array 2.
		for (int i = numeros1.length, j = 0; i < (numeros1.length + numeros2.length); i++, j++) {
			numeros3 [i] = numeros2 [j];
		}
		
		// Se imprimen las posiciones del array 3
		System.out.println("Contenido del array 3:");
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println("Posición " + i + ": " + numeros3[i]);
		}
		
		
		scnum.close();
	}

}
