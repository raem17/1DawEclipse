import java.util.Scanner;

public class ejer3 {

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
		
		
		System.out.println("Suspensos: " + contSus);
		
		scnum.close();
		
	}

}
