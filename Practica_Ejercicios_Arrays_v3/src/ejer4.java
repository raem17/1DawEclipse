import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int num = 0;
		
		
		System.out.println("Introduzca un número:");
		num = scnum.nextInt();
		int [] numeros = new int [num];
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número nº " + (i + 1));
			numeros [i] = scnum.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros [i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		scnum.close();
		
	}

}
