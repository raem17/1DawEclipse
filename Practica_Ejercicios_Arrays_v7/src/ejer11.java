import java.util.Scanner;
import java.util.Arrays;
public class ejer11 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [10];
		
		
		// El usuario rellena el array 
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros [i] = scnum.nextInt();
		}
		
		
		// Se ordena el array de menor a mayor con el método Arrays.sort
		Arrays.sort(numeros);
		
		
		// Se imprimen las posiciones del array
		System.out.println("Contenido del array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + i + ": " + numeros [i]);
		}
		
		scnum.close();
	}

}
