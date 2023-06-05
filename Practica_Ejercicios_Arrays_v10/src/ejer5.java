import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [10];
		int cont = 0; // Para primos
		
		// El usuario rellena el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros [i] = scnum.nextInt();
		}
		
		
		// Se comprueba qué números son primos en el array y se sustituyen por un número pedido al usuario
		for (int i = 0; i < numeros.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros [i]; aux++) {
				if (numeros [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros [i] != 1) {
				System.out.println("Se ha encontrado un primo en el array, sustitúyalo:");
				numeros [i] = scnum.nextInt();
			}
		}
		
		
		// Se imprime el contenido del array
		System.out.println("Array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición: " + i + ": " + numeros [i]);
		}
		
		scnum.close();
	}

}
