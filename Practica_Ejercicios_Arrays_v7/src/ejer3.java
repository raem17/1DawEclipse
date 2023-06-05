import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int num = 0;
		
		// El usuario rellena el array
		System.out.println("Introduzca la longitud del array (mínimo 4):");
		num = scnum.nextInt();
		
		int [] numeros = new int [num];
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros [i] = scnum.nextInt();
		}
		
		System.out.println("Primer número del array: " + numeros [0]);
		System.out.println("Último número del array: " + numeros [numeros.length-1]);
		System.out.println("Antepenúltimo número del array: " + numeros [numeros.length-3]);
		System.out.println("Segundo número del array: " + numeros [1]);
		System.out.println("Tercer número del array: " + numeros [2]);
		System.out.println("Cuarto número del array: " + numeros [3]);
		
		scnum.close();

	}

}
