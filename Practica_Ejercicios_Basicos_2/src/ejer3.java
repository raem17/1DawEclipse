
import java.util.*;
public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num1, num2, num3, sumanum, raiz;
		
		
		System.out.println("Introduzca el primer número.");
		num1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo número.");
		num2 = scnum.nextDouble();
			
		System.out.println("Introduzca el tercer número.");
		num3 = scnum.nextDouble();
		
		
		sumanum = num1 + num2 + num3;
		raiz = Math.sqrt(sumanum);
		
		
		System.out.println("El resultado de la raíz cuadrada de la suma de " + num1 + " + " + num2 
		+ " + " + num3 + " es igual a: " + raiz);
		
		scnum.close();
		
	}

}
