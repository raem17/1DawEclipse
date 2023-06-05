import java.util.Scanner;

public class ejer1 {
	
	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		int num = 0;
		
		
		System.out.println("Introduzca un número comprendido entre el 1 y el 7:");
		num = scnum.nextInt();
		
		
		if (num == 1) {
			System.out.println("Lunes.");
		}
		
		else if (num == 2) {
			System.out.println("Martes.");
		}
		
		else if (num == 3) {
			System.out.println("Miércoles.");
		}
		
		else if (num == 4) {
			System.out.println("Jueves.");
		}
		
		else if (num == 5) {
			System.out.println("Viernes.");
		}
		
		else if (num == 6) {
			System.out.println("Sábado.");
		}
		
		else if (num == 7) {
			System.out.println("Domingo.");
		}
		
		else {
			System.out.println("No ha introducido correctamente el número.");
		}
		
		
		scnum.close();
		sctxt.close();
	}
}
