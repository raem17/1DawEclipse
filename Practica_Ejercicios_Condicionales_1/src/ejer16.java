import java.util.*;
public class ejer16 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		
		System.out.println("Introduzca el primer número:");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número:");
		num2 = scnum.nextDouble();
		
		System.out.println("Introduzca el tercer número:");
		num3 = scnum.nextDouble();
		
		
		if (num1 >= num2 && num2 >= num3) {
			System.out.println(num1 + " > " + num2 + " > " + num3);
		}
		
		else if (num1 >= num3 && num3 >= num2) {
			System.out.println(num1 + " > " + num3 + " > " + num2);
		}
		
		else if (num2 >= num1 && num1 >= num3) {
			System.out.println(num2 + " > " + num1 + " > " + num3);
		}
		
		else if (num2 >= num3 && num3 >= num1) {
			System.out.println(num2 + " > " + num3 + " > " + num1);
		}
		
		else if (num3 >= num1 && num1 >= num2) {
			System.out.println(num3 + " > " + num1 + " > " + num2);
		}
		
		else {
			System.out.println(num3 + " > " + num2 + " > " + num1);
		}
		
		
		scnum.close();
		
	}

}