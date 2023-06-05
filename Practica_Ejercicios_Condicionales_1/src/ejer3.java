import java.util.*;
public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1 = 0;
		double num2 = 0;
		double res = 0;
		
		
		System.out.println("Introduzca el primer número:");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número:");
		num2 = scnum.nextDouble();
		
		
		res = num1 * num2;
		
		
		if (res < 200) {
			System.out.println("La multiplicación de " + num1 + " * " + num2 + " no es mayor que 200.");
		}
		
		else if (res > 200) {
			System.out.println("La multiplicación de " + num1 + " * " + num2 + " es mayor que 200.");
		}
		
		
		else {
			System.out.println("La multiplicación de " + num1 + " * " + num2 + " es igual a 200.");
		}
			
		
		scnum.close();
		
	}

}