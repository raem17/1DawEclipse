import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [10];
		int contPares = 0;
		int contImpares = 0;
		
		
		// Se rellena el array 1
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Introduzca un número:");
			numeros1 [i] = scnum.nextInt();
		}
		
		// Se cuentan los números pares e impares del array 1
		for (int i = 0; i < numeros1.length; i++) {
			if (numeros1 [i] % 2 == 0) {
				contPares++;
			}
			
			else if (numeros1 [i] % 2 != 0) {
				contImpares++;
			}
		}
		
		// Se crean dos arrays con la longitud de los contadores
		int [] numerosPares = new int [contPares];
		int [] numerosImpares = new int [contImpares];
		
		
		/* Se meten los números pares del array 1 dentro del array de pares.
		 Se meten los números impares del array 1 dentro del array de impares.
		 Para eso creo dos variables nuevas dentro del for: "j" y "z"*/
		
		for (int i = 0, j = 0, z = 0; i < numeros1.length; i++) {
			if (numeros1 [i] % 2 == 0) {
				numerosPares [j] = numeros1 [i];
				j++;
			}
			
			else if (numeros1 [i] % 2 != 0) {
				numerosImpares [z] = numeros1 [i];
				z++;
			}
		}
		
		
		// Se imprimen las posiciones del array de pares
		System.out.println("Contenido del array de pares:");
		for (int i = 0; i < numerosPares.length; i++) {
			System.out.println("Posición " + i + ": " + numerosPares [i]);
		}
		
		// Se imprimen las posiciones del array de impares
		System.out.println("");
		System.out.println("Contenido del array de impares:");
		for (int i = 0; i < numerosImpares.length; i++) {
			System.out.println("Posición " + i + ": " + numerosImpares [i]);
		}
		
		scnum.close();
	}

}
