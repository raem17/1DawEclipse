import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [10];
		int contCreciente = 0;
		int contDecreciente = 0;
		
		// El usuario rellena el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros [i] = scnum.nextInt();
		}
		
		
		// Con un for se evalúa si las posiciones continuas del array son mayores o menores, y según eso un contador se incrementa
		for (int i = 0, j = 1; j < numeros.length; i++, j++) {
			if (numeros [i] < numeros [j]) {
				contCreciente++;
			}
			
			else if (numeros [i] > numeros [j]) {
				contDecreciente++;
			}
		}
		
		
		if (contCreciente == numeros.length-1) {
			System.out.println("Los números están ordenados de forma creciente.");
		} else if (contDecreciente == numeros.length-1) {
			System.out.println("Los números están ordenados de forma decreciente.");
		} else {
			System.out.println("Los números están desordenados.");
		}
		

		scnum.close();
	}

}
