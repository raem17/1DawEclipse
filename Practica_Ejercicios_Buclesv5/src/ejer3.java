import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		double num1 = 0;
		int contador = 0;
		
		
		do {
			System.out.println("Introduzca un número:");
			num1 = scnum.nextInt();
			
			if (num1 > 0) {
				contador++;
			}
			
		}while (num1 > 0);
		
		System.out.println("Número de números introducidos: " + contador);
		
		
		scnum.close();
	}

}
