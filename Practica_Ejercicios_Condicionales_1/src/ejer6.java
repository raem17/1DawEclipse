import java.util.*;
public class ejer6 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num = 0;
		
		
		System.out.println("Introduzca un número:");
		num = scnum.nextDouble();
		
		
		if (num > 0) {
			System.out.println("El número es positivo.");
		}
		
		else if (num < 0) {
			System.out.println("El número es negativo.");
		}
		
		else {
			System.out.println("El número es igual a 0.");
		}
			
		
		scnum.close();
		
	}

}