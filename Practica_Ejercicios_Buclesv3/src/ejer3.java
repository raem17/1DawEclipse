import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		int acuPares = 0;
		int acuImpares = 0;
		int acuPrimos = 0;
		int cont = 0;
		
		
		for (int i = 1; i < 101; i++) {
			
			cont = 0; // el contador es para la parte de los primos
			
			// Pares
			if (i % 2 == 0) {
				acuPares = acuPares + i;
			}
			
			// Impares
			if (i % 2 != 0) {
				acuImpares = acuImpares + i;
			}
			
			// Primos
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && i != 1) {
				acuPrimos = acuPrimos + i;
			}
		}
		
		
		System.out.println("La suma de todos los números pares del 1 al 100 es: " + acuPares);
		
		System.out.println("La suma de todos los números impares del 1 al 100 es: " + acuImpares);
		
		System.out.println("La suma de todos los números primos del 1 al 100 es: " + acuPrimos);
		
		
		scnum.close();
	}

}
