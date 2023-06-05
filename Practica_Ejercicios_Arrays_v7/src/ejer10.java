import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		
		/*El programa tiene un fallo, en caso de rellenar el array 1 con números repetidos
		 *  (Ej: 1,1,2,3,4), el resultado no es el esperado. En cualquier otro caso, funciona. */
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [5];
		int [] numeros2 = new int [5];
		int cont = 0;
		
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
		
		// Con dos bucles, se compara cada posición del array 2 con las posiciones del array 1
		for (int i = 0; i < numeros1.length; i++) {
			for (int j = 0; j <numeros1.length; j++) {
				if (numeros2[i] == numeros1 [j]) {
					cont++;
				}
			}
		} 
		
		
		System.out.println("Nº de veces que en el array 2 aparecen números del array 1: " + cont);
		
		scnum.close();
	}

}
