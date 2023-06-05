

import java.util.Scanner;

public class comprobar_numero_primo {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int num = 0;
		int cont = 0;
		
		System.out.println("Introduzca un número:");
		num = scnum.nextInt();
		
		
		for (int i = 2; i < num; i++) {
			
			if (num % i == 0) {
				cont++;
			}
		}
		
		if (cont == 0 && num != 1 && num != 0) {
			System.out.println("Es primo.");
		}
		
		else {
			System.out.println("No es primo.");
		}
		
		
		scnum.close();
	}

}
