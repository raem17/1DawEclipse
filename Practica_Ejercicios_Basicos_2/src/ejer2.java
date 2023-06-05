
import java.util.*;
public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1, exp;
		
		System.out.println("Introduzca un número.");
		num1 = scnum.nextDouble();
		
		exp = Math.exp(num1);
		
		System.out.println("El exponencial de " + num1 + " es: " + exp);
		
		scnum.close();
		
	}

}
