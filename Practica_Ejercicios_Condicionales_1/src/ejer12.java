import java.util.*;
public class ejer12 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1 = 0;
		double num2 = 0;
		
		
		System.out.println("Introduzca el primer número:");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número:");
		num2 = scnum.nextDouble();
		
		
		if (num1 == num2) {
			System.out.println("Los dos números son iguales.");
		}
			
		else {
			System.out.println("Los dos números no son iguales.");
		}
			
		
		scnum.close();
		
	}

}