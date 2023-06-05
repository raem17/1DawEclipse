import java.util.*;
public class ejer13 {

	public static void main(String[] args) {
		Scanner scnum = new Scanner (System.in);
		double radio;
		
		System.out.println("Introduzca el radio del círculo en cm.");
		radio = scnum.nextDouble();
		
		System.out.print("El área del círculo es ");
		System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
		System.out.print(" cm");
		
		scnum.close();
	}

}