import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [5];
		int contPrimos = 0;
		int cont = 0; // Para primos
		
		// Se rellena el array 1
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros [i] = scnum.nextInt();
		}
		
		
		// Se cuentan los primos en el array
		for (int i = 0; i < numeros.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros [i]; aux++) {
				if (numeros [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros [i] != 1) {
				contPrimos++;
			}
		}
		
		
		// Se crea el array de primos
		int [] numerosPrimos = new int [contPrimos];
		
		
		// Se meten los primos del array numeros en el arrayPrimos de manera inversa
		for (int i = numeros.length-1, z = 0; i >= 0; i--) {
			cont = 0;
			
			for (int aux = 2; aux < numeros [i]; aux++) {
				if (numeros [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros [i] != 1) {
				numerosPrimos [z] = numeros [i];
				z++;
			}
		}
		
		
		// Se imprimen las posiciones del array de primos inverso
		System.out.println("Contenido del array de primos:");
		for (int i = 0; i < numerosPrimos.length; i++) {
			System.out.println("Posición " + i + ": " + numerosPrimos [i]);
		}
		
		
		scnum.close();
	}

}
