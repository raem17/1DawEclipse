import java.util.*;
public class ejer7 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1 = 0;
		double num2 = 0;
		double res = 0;
		
		
		System.out.println("Introduzca el primer número:");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número:");
		num2 = scnum.nextDouble();
		
		
		res = num1 + num2;
		
		
		if (res < 50) {
			System.out.println("La suma de " + num1 + " + " + num2 + " es menor que 50.");
		}
		
		else if (res > 50) {
			System.out.println("La suma de " + num1 + " + " + num2 + " es mayor que 50.");
		}
		
		else {
			System.out.println("La suma de " + num1 + " + " + num2 + " es igual a 50.");
		}
			
		
		scnum.close();
		
	}

}