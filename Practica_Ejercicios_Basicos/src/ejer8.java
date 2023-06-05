import java.util.*;
public class ejer8 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1, num2;
		double resultado;
		
		System.out.println("Introduzca el primer número.");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número.");
		num2 = scnum.nextDouble();
		
		resultado = Math.pow(num1, num2);
		
		System.out.println("El resultado de " + num1 + " elevado a " + num2 + " es igual a: " + resultado);
		
		scnum.close();
	}

}