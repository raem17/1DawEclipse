import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [10];
		
		
		// Se rellena el array 1
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Introduzca un número:");
			numeros1 [i] = scnum.nextInt();
		}
		
		
		// Se crea un nuevo array
		int [] numeros2 = new int [16];
		
		// Las 3 primera posiciones del array 2 serán ceros
		numeros2 [0] = 0;
		numeros2 [1] = 0;
		numeros2 [2] = 0;
		
		// Las 3 últimas posiciones del array 2 serán ceros
		numeros2 [13] = 0;
		numeros2 [14] = 0;
		numeros2 [15] = 0;
		
		
		// Se rellena el resto de posiciones del array 2 con las posiciones del array 1
		for (int i = 3, z = 0; i < 13; i++, z++) {
			numeros2 [i] = numeros1 [z];
		}
		
		
		// Se imprimen las posiciones del array 2
		System.out.println("Contenido del array 2:");
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Posición " + i + ": " + numeros2 [i]);
		}
		
		
		scnum.close();
	}

}
