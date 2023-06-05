import java.util.*;
public class ejer12 {

	public static void main(String[] args) {
		Scanner scnum = new Scanner (System.in);
		double base, altura, area;
		
		System.out.println("Introduzca la base del triángulo en cm.");
		base = scnum.nextDouble();
		
		System.out.println("Introduzca la altura del triángulo en cm.");
		altura = scnum.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.println("El área del triángulo es igual a: " + area + " cm");
		
		scnum.close();
	}

}
