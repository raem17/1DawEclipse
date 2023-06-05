import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [5];
		int [] numeros2 = new int [5];
		int [] numeros3 = new int [5];
		
		
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Array 1 - Introduzca un número nº " + (i + 1));
			numeros1 [i] = scnum.nextInt();
			
			System.out.println("Array 2 - Introduzca un número nº " + (i + 1));
			numeros2 [i] = scnum.nextInt();
		}
		
		// Se rellena el tercer array con el producto de las posiciones de los dos primeros arrays
		for (int i = 0; i < numeros3.length; i++) {
			numeros3 [i] = (numeros1 [i]) * (numeros2 [i]);
		}
		
		// Imprimimos las posiciones del array 3
		System.out.println("Contenido del array:");
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println("Posición " + i + ": " + numeros3[i]);
		}
		
		scnum.close();
	}

}
