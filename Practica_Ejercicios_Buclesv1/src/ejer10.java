import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		double numMin = 0;
		double numMax = 0;
		double numEnRango = 0;
		int i = 0;
		
		System.out.println("Introduzca el valor mínimo de un rango de números:");
		numMin = scnum.nextDouble();
		
		System.out.println("Introduzca el valor máximo de un rango de números:");
		numMax = scnum.nextDouble();
		
		
		while (i < 1) {
			
			System.out.println("Introduzca un número dentro del rango:");
			numEnRango = scnum.nextDouble();
			
			if (numEnRango >= numMin && numEnRango <= numMax) {
				i++;
			}
		}
		
		System.out.println("Número dentro del rango.");
		
		scnum.close();
				
	}

}
