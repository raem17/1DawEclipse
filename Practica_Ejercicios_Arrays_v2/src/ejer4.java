import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [10];
		int contPositivos = 0;
		int contNegativos = 0;
		int contCeros = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Introduzca un número nº " + (i + 1));
			numeros [i] = scnum.nextInt();
			
			if (numeros [i] > 0) {
				contPositivos++;
			}
			
			else if (numeros [i] < 0) {
				contNegativos++;
			}
			
			else {
				contCeros++;
			}
		}
		
		
		// Se recorre el array
		System.out.println("Contenidos del array: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + i + ": " + numeros[i]);
		}
		
		
		System.out.println("Números positivos en el array: " + contPositivos);
		System.out.println("Números negativos en el array: " + contNegativos);
		System.out.println("Números 0 en el array: " + contCeros);
		
		scnum.close();
	}

}
