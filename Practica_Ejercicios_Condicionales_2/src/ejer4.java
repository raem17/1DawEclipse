import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int puntos = 0;
		
		
		System.out.println("Estudiante, introduzca sus puntos:");
		puntos = scnum.nextInt();
		
		
		if (puntos > 0 && puntos >= 45 ) {
			System.out.println("Puedes optar a Biología.");
		}
		
		if (puntos > 0 && puntos >= 79 ) {
			System.out.println("Puedes optar a Empresariales.");
		}
		
		if (puntos > 0 && puntos >= 90 ) {
			System.out.println("Puedes optar a Derecho.");
		}
		
		if (puntos > 0 && puntos >= 100 ) {
			System.out.println("Puedes optar a Sistemas.");
		}
		
		if (puntos > 0 && puntos >= 120 ) {
			System.out.println("Puedes optar a Informática.");
		}
		
		
		scnum.close();
	}

}
