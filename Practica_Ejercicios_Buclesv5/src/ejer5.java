import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		double num1 = 0;
		double acuNumeros = 0;
		double cont = 0;
		double media = 0;
		
		
		System.out.println("Introduzca un número:");
		num1 = scnum.nextInt();
		
		acuNumeros = acuNumeros + num1;
		
		cont++;
		
		
		while (num1 > 0) {
			System.out.println("Introduzca un número:");
			num1 = scnum.nextInt();
			
			if (num1 > 0) {
				acuNumeros = acuNumeros + num1;
				cont++;
			}
		}
		
		media = acuNumeros/cont;
		
		System.out.println("La media de todos los números introducidos es: " + media);
		
		
		scnum.close();
	}

}
