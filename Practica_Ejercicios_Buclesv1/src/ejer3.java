import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);		
		double num1 = 0;
		double num2 = 0;
		
		System.out.println("Introduzca un número entero mínimo:");
    	num1 = scnum.nextDouble();
    	
    	System.out.println("Introduzca un número entero máximo:");
    	num2 = scnum.nextDouble();
		
		for (double i = num1; i <= num2; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		scnum.close();
	}

}
