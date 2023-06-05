
import java.util.*;
public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1, num2, num3, num4, exp1, exp2, exp3, exp4, res;
		
		System.out.println("Introduzca el primer número.");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número.");
		num2 = scnum.nextDouble();
		
		System.out.println("Introduzca el tercer número.");
		num3 = scnum.nextDouble();
		
		System.out.println("Introduzca el cuarto número.");
		num4 = scnum.nextDouble();
		
		
		exp1 = Math.pow(num1, 5);
		
		exp2 = Math.pow(num2, 5);
		
		exp3 = Math.pow(num3, 5);
		
		exp4 = Math.pow(num4, 5);
		
		res = exp1 + exp2 + exp3 + exp4;
		
		
		System.out.println("El resultado de elevar a 5 cada número y sumar sus resultados es: " + res);
		
		scnum.close();
	}

}
