import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [25];
		
		// El usuario rellena el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros [i] = scnum.nextInt();
		}
		
		
		System.out.println("");
		System.out.println("Contenido del array: ");
		
		// Se imprime el array de forma inversa
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.println(numeros [i]);
		}
		
		scnum.close();
	}

}
