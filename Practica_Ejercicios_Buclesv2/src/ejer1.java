import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		double altura = 0;
		double max = 0;
		int cont = 0;
		int contArbolMasAlto = 0;
		
								
		do {
			
			System.out.println("Introduzca la altura del árbol en cm:");
			altura = scnum.nextDouble();
			
						
			if (max < altura) { 
				max = altura;
				contArbolMasAlto = cont;
			}
			
			cont++;
												
		} while (altura != -1);
		
		
		max = max /100;
		
		System.out.println("Árbol más alto: " + "Árbol " + contArbolMasAlto + " – " + max + " metros.");
		
		scnum.close();
		
	}

}
