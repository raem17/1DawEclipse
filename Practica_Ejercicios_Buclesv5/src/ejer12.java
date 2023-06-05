import java.util.Scanner;

public class ejer12 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		double nota = 0;
		int contSus = 0;
		
		
		for (int i=0; i < 5; i++) {
			
			System.out.println("Introduzca una nota:");
			nota = scnum.nextDouble();
			
			if (nota < 5) {
				contSus++;
			}
		}
		
		if (contSus > 0) {
			System.out.println("Hay algún suspenso.");
		} 
		
		else {
			System.out.println("No hay suspensos.");
		}
		
		
		scnum.close();
	}

}
