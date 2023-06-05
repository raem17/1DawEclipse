import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int edad = 0;
		int cont = 0;
		int acuEdades = 0;
		
		do {

			System.out.println("Introduzca su edad:");
			edad = scnum.nextInt();
			
			if (edad > 17) {
				cont++;
			}
			
			acuEdades = acuEdades + edad;
			
		} while (edad > 0);
		
		System.out.println("Alumnos mayores de edad: " + cont);

		System.out.println("La suma de todas las edades es igual a: " + acuEdades);
		
		scnum.close();
	}

}
