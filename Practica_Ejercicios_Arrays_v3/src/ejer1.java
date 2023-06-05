import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [10];
		int acuNumeros = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número nº " + (i + 1));
			numeros [i] = scnum.nextInt();
			acuNumeros = acuNumeros + numeros [i]; // Acumulador de números
		}
		
		// Imprimimos las posiciones del array
		System.out.println("Contenido del array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + i + ": " + numeros[i]);
		}
		
		System.out.println("La suma de todos los números del array es: " + acuNumeros);
		
		scnum.close();
	}

}
