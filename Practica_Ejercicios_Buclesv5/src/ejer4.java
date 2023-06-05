import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		double num1 = 0;
		double acuNumeros = 0;
		
		
		do {
			System.out.println("Introduzca un número:");
			num1 = scnum.nextInt();
			
			acuNumeros = acuNumeros + num1;
			
		}while (num1 != 0);
		
		System.out.println("La suma de todos los números introducidos es: " + acuNumeros);
		
		
		scnum.close();
	}

}
