import java.util.*;
public class ejer15 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1 = 0;
		double num2 = 0;
		
		
		System.out.println("Introduzca el primer número:");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número:");
		num2 = scnum.nextDouble();
		
		
		if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
		}
		
		else if (num1 < num2) {
			System.out.println(num2 + " > " + num1);
		}
			
		else {
			System.out.println(num1 + " = " + num2);
		}
			
		
		scnum.close();
		
	}

}