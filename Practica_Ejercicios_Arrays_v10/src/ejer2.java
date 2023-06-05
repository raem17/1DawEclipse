import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [20];
		int cont = 0; // Para primos
		int contPrimos = 0;
		
		
		// El usuario rellena el array
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
		
		
		// Si hay más de 15 primos se imprime un mensaje sino se imprime otro
		if (contPrimos > 15) {
			System.out.println("Hay más de 15 primos.");
		}else {
			System.out.println("No hay más de 15 primos.");
		}
		
		scnum.close();
	}

}
