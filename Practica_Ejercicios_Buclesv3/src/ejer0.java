import java.util.Scanner;

public class ejer0 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		
		
		System.out.println("Introduzca el num1:"); // Repeticiones de tablas
		num1 = scnum.nextInt();
		
		System.out.println("Introduzca el num2:"); // Hasta que tabla mostrar
		num2 = scnum.nextInt();
						
			
		for (int i = 0; i < num1; i++) {	
			for (int factor2 = 1; factor2 < 11; factor2++) {
				for (int factor1 = 1; factor1 <= num2; factor1++) {
					System.out.print(factor1 + " x " + factor2  + " = " + (factor1 * factor2) + "	");	
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
		scnum.close();
	
	}

}
