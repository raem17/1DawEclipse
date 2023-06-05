import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		double num1 = 0;	
		
		
		do {
			System.out.println("Introduzca un número:");
			num1 = scnum.nextInt();
			
			if (num1 % 2 == 0) {
				System.out.println("Es par");
				System.out.println();
			}
			
			else if (num1 % 2 != 0) {
				System.out.println("Es impar");
				System.out.println();
			}
			
		}while (num1 != 0);
		
		
		scnum.close();
	}

}
