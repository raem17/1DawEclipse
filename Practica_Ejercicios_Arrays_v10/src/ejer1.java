import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [5];
		int cont = 0; // Para primos
		int contPrimos = 0;
		
		
		// El usuario rellena el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros [i] = scnum.nextInt();
		}
		
			
		// Se recorre el array contando los números primos
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
		
		
		// Si los 5 números introducidos son primos se imprime un mensaje sino se imprime otro
		if (contPrimos == 5) {
			System.out.println("Los 5 números son primos.");
		}else {
			System.out.println("Los 5 números no son primos.");
		}
		
		scnum.close();
	}

}
