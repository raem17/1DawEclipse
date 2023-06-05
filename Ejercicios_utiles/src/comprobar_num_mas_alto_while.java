

import java.util.Scanner;

public class comprobar_num_mas_alto_while {

	public static void main(String[] args) {

		Scanner scnum = new Scanner (System.in);
		double nota = 0;
		double Acunotas = 0;
		double cont = 0;
		double max = 0;
		
		
		System.out.println("Introduzca una nota:");
		nota = scnum.nextDouble();
		
		
		while (nota != -1) {
			
			cont++;
			
			Acunotas = Acunotas + nota;
			
			if (max < nota) { // Comprueba qué número es el más alto
				max = nota;
			}
			
			System.out.println("Introduzca una nota:");
			
			nota = scnum.nextInt();
		}
		
		Acunotas = Acunotas / cont;
		
		System.out.println("La nota media es: " + Acunotas);
		System.out.println("La nota más alta es: " + max);
		
		scnum.close();
	}

}
