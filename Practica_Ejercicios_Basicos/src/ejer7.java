import java.util.*;
public class ejer7 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1, num2, num3;
		double resultado;
		
		System.out.println("Introduzca el primer número.");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número.");
		num2 = scnum.nextDouble();
		
		System.out.println("Introduzca el tercer número.");
		num3 = scnum.nextDouble();
		
		resultado = num1 * num2 * num3;
		
		System.out.println("El resultado de " + num1 + " x " + num2 + " x " + num3 + " es igual a: " + resultado);
		
		scnum.close();
	}

}
