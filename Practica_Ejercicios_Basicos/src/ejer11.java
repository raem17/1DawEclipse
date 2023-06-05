import java.util.*;

public class ejer11 {

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
		
		resultado = Math.pow(num1, num2);
		resultado = Math.pow(resultado, num3);
		
		System.out.println("Elevando " + num1 + " a " + num2 + ", y a su vez, elevando este resultado a " + num3 + ", el resultado final es igual a: " + resultado);
		
		scnum.close();
	}

}
