import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
		double factorial = 1;
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
