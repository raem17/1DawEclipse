import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [2];
		int [] numeros2 = new int [2];
		int [] numeros3 = new int [2];
		int contPrimos1 = 0;
		int contPrimos2 = 0;
		int contPrimos3 = 0;
		int contPrimosTotales = 0;
		int cont = 0; // Para primos
		
		
		// Se rellenan los 3 arrays
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Array 1. Posición " + i + ". Introduzca un número:");
			numeros1 [i] = scnum.nextInt();
			
			System.out.println("Array 2. Posición " + i + ". Introduzca un número:");
			numeros2 [i] = scnum.nextInt();
			
			System.out.println("Array 3. Posición " + i + ". Introduzca un número:");
			numeros3 [i] = scnum.nextInt();
		}
		
		
		// Se cuentan los primos en el array 1
		for (int i = 0; i < numeros1.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros1 [i]; aux++) {
				if (numeros1 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros1 [i] != 1) {
				contPrimos1++;
			}
		}
		
		// Se cuentan los primos en el array 2
		for (int i = 0; i < numeros2.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros2 [i]; aux++) {
				if (numeros2 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros2 [i] != 1) {
				contPrimos2++;
			}
		}
		
		// Se cuentan los primos en el array 3
		for (int i = 0; i < numeros3.length; i++) {
			cont = 0;
			
			for (int aux = 2; aux < numeros3 [i]; aux++) {
				if (numeros3 [i] % aux == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && numeros3 [i] != 1) {
				contPrimos3++;
			}
		}
		
		
		contPrimosTotales = contPrimos1 + contPrimos2 +contPrimos3;

		// Se crea el array de primos
		int [] numerosPrimos = new int [contPrimosTotales];
		
		
		// Si hay algún primo en el array 1
		if (contPrimos1 > 0) {
			// Se meten los primos del array 1 en el array de primos
			for (int i = 0, z = 0; i < contPrimos1; i++) {
				cont = 0;
				
				for (int aux = 2; aux < numeros1 [i]; aux++) {
					if (numeros1 [i] % aux == 0) {
						cont++;
					}
				}
				
				if (cont == 0 && numeros1 [i] != 1) {
					numerosPrimos [z] = numeros1 [i];
					z++;
				}
			}
			
			// Si hay algún primo en el array 2
			if (contPrimos2 > 0) {
				// Se meten los primos del array 2 en el array de primos
				for (int i = 0, z = contPrimos1; i < (contPrimos1 + contPrimos2); i++) {
					cont = 0;
					
					for (int aux = 2; aux < numeros2 [i]; aux++) {
						if (numeros2 [i] % aux == 0) {
							cont++;
						}
					}
					
					if (cont == 0 && numeros2 [i] != 1) {
						numerosPrimos [z] = numeros2 [i];
						z++;
					}
				}
				
				// Si hay algún primo en el array 3
				if (contPrimos3 > 0) {
					// Se meten los primos del array 3 en el array de primos
					for (int i = 0, z = (contPrimos1 + contPrimos2); i < contPrimosTotales; i++) {
						cont = 0;
						
						for (int aux = 2; aux < numeros3 [i]; aux++) {
							if (numeros3 [i] % aux == 0) {
								cont++;
							}
						}
						
						if (cont == 0 && numeros3 [i] != 1) {
							numerosPrimos [z] = numeros3 [i];
							z++;
						}
					}
				}
			} else if (contPrimos2 == 0 && contPrimos3 > 0) { // Si no hay ningún primo en el array 2 pero sí en el array 3
				// Se meten los primos del array 3 en el array de primos
				for (int i = 0, z = contPrimos1; i < (contPrimos1 + contPrimos3); i++) {
					cont = 0;
					
					for (int aux = 2; aux < numeros3 [i]; aux++) {
						if (numeros3 [i] % aux == 0) {
							cont++;
						}
					}
					
					if (cont == 0 && numeros3 [i] != 1) {
						numerosPrimos [z] = numeros3 [i];
						z++;
					}
				}
			}
		} else if (contPrimos1 == 0 && contPrimos2 > 0) { // Si no hay ningún primo en el array 1, pero sí en el array 2
			for (int i = 0, z = 0; i < contPrimos2; i++) {
				cont = 0;
				
				for (int aux = 2; aux < numeros2 [i]; aux++) {
					if (numeros2 [i] % aux == 0) {
						cont++;
					}
				}
				
				if (cont == 0 && numeros2 [i] != 1) {
					numerosPrimos [z] = numeros2 [i];
					z++;
				}
			}
			
			// Si hay algún primo en el array 3
			if (contPrimos3 > 0) {
				// Se meten los primos del array 3 en el array de primos
				for (int i = 0, z = contPrimos2; i < (contPrimos1 + contPrimos2); i++) {
					cont = 0;
					
					for (int aux = 2; aux < numeros3 [i]; aux++) {
						if (numeros3 [i] % aux == 0) {
							cont++;
						}
					}
					
					if (cont == 0 && numeros3 [i] != 1) {
						numerosPrimos [z] = numeros3 [i];
						z++;
					}
				}
			}
			
		} else if (contPrimos1 == 0 && contPrimos2 == 0 && contPrimos3 > 0) { // Si no hay primos en los arrays 1 y 2, pero sí en el array 3
			// Se meten los primos del array 3 en el array de primos
			for (int i = 0, z = 0; i < contPrimos3; i++) {
				cont = 0;
				
				for (int aux = 2; aux < numeros3 [i]; aux++) {
					if (numeros3 [i] % aux == 0) {
						cont++;
					}
				}
				
				if (cont == 0 && numeros3 [i] != 1) {
					numerosPrimos [z] = numeros3 [i];
					z++;
				}
			}
		}

		
		// Se imprimen las posiciones del array de primos
		System.out.println("Contenido del array de primos:");
		for (int i = 0; i < numerosPrimos.length; i++) {
			System.out.println("Posición " + i + ": " + numerosPrimos [i]);
		}
		
		
		scnum.close();
		
	}

}
