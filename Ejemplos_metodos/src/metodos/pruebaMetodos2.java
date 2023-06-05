package metodos;

import java.util.Scanner;

public class pruebaMetodos2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int num1= 0, num2 = 0, num3 = 0, num4 = 0;
		
		
		System.out.println("Introduzca un número 1:");
		num1 = scnum.nextInt();
		
		System.out.println("Introduzca un número 2:");
		num2 = scnum.nextInt();
		
		System.out.println("Introduzca un número 3:");
		num3 = scnum.nextInt();
		
		System.out.println("Introduzca un número 4:");
		num4 = scnum.nextInt();
		
		
		System.out.println("El resultado de multiplicar los 4 números es: " + utilidades.multi(num1, num2, num3, num4));
		
		scnum.close();
	}
	

}
