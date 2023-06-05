import java.util.*;
public class ejer10 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1 = 0;
		double num2 = 0;
		
		
		System.out.println("Introduzca el primer número:");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número:");
		num2 = scnum.nextDouble();
		
		
		if (num1 < num2) {
			System.out.println("El primer número es menor que el segundo.");
		}
		
		else if (num1 > num2) {
			System.out.println("El segundo número es menor que el primero.");
		}
			
		else {
			System.out.println("Los dos números son iguales.");
		}
			
		
		scnum.close();
		
	}

}