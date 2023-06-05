package metodos;

import java.util.Scanner;

public class pruebaMetodos {

	public static void main(String[] args) {
		
		//mostrarMenu(); //Busca el método de forma local, en este caso no funciona
		utilidades.mostrarMenu();// Busca el método en otra clase
		
		Scanner scnum = new Scanner (System.in);
		int num = 0;
		
		
		System.out.println("Introduzca un número:");
		num = scnum.nextInt();
		
		if (utilidades.esPrimo(num) == true) {
			System.out.println("Es primo.");
		} else {
			System.out.println("No es primo.");
		}
		
		
		scnum.close();
	}
	


}
