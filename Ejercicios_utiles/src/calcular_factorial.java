import java.util.Scanner;

public class calcular_factorial {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
		int factorial = 1;
		int num = 0;
		
		
		System.out.println("Introduce un número:");
		num = scnum.nextInt(); 
		
		
		for (int i = num; i > 0; i--) {
			
			factorial=factorial*i;
		}
		
		
		System.out.println("El factorial de " + num + " es: " + factorial);
		
		scnum.close();
	}

}
