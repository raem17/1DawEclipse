
import java.util.*;
public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1, num2, num3, res;
		
		System.out.println("Introduzca el primer número.");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número.");
		num2 = scnum.nextDouble();
		
		System.out.println("Introduzca el tercer número.");
		num3 = scnum.nextDouble();
		
		
		res = (num1 + num2 + num3) / Math.PI;
		
		
		System.out.println("El resultado de sumar " + num1 + " + " + num2 + " + " + num3 + " y dividirlo"
		+ " entre pi es igual a: " + res);
		
		scnum.close();
	}

}
