import java.util.*;
public class ejer8 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num = 0;
		
		
		System.out.println("Introduzca un sueldo mensual: ");
		num = scnum.nextDouble();
		
		
		if (num >= 1000) {
			System.out.println("Eres afortunado.");
		}
		
		else {
			System.out.println("Eres un héroe.");
		}
			
		
		scnum.close();
		
	}

}