import java.util.*;
public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num = 0;
		
		
		System.out.println("Introduzca un número:");
		num = scnum.nextDouble();
		
		
		if (num > 100) {
			System.out.println("Es mayor que 100.");
		}
		
		else if (num < 100) {
			System.out.println("No es mayor que 100.");
		}
		
		else {
			System.out.println("Es igual a 100.");
		}
			
		
		scnum.close();
		
	}

}