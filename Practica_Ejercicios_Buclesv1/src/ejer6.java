import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num = 0;
		double cuadradoDeNum = 0;
		
		System.out.println("Introduzca un número:");
		num = scnum.nextDouble();
		
		while (num != 0) {
					
			if (num % 2 == 0) {
				System.out.println("Es par.");
			}
			
			else {
				System.out.println("No es par.");
			}
			
			if (num > 0) {
				System.out.println("Es positivo.");
			}
			
			cuadradoDeNum = Math.pow(num, 2);
			
			System.out.println("Su cuadrado es: " + cuadradoDeNum);
			
			System.out.println("Introduzca un número:");
			num = scnum.nextDouble();
			
		}
		
		scnum.close();
	
	}

}
