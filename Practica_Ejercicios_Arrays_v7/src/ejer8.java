import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [10];
		int num = 0;
		
		
		// El usuario rellena el array 1
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Array 1. Introduzca un número:");
			numeros1 [i] = scnum.nextInt();
		}
		
		// Se pide un número al usuario
		System.out.println("Introduzca un número:");
		num = scnum.nextInt();
		
		// Se crea un nuevo array con una posición más
		int [] numeros2 = new int [11];
		
		// La primera posición del nuevo array será el número pedido al usuario
		numeros2 [0] = num;
		
		// Se rellena el resto de posiciones del array 2 con las posiciones del array 1
		for (int i = 1, j = 0; i < numeros2.length; i++, j++) {
			numeros2 [i] = numeros1 [j];
		}
		
		// Se imprimen las posiciones del array 2
		System.out.println("Contenido del array 2:");
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Posición " + i + ": " + numeros2 [i]);
		}
		
		scnum.close();
	}

}
