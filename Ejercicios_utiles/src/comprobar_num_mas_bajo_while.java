

import java.util.Scanner;

public class comprobar_num_mas_bajo_while {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double nota = 0;
		double Acunotas = 0;
		double cont = 0;
		double max = 0;
		double min = 10;
		
		
		System.out.println("Introduzca una nota:");
		nota = scnum.nextDouble();
		
		
		while (nota != -1) {
			
			cont++;
			
			Acunotas = Acunotas + nota;
			
			if (max < nota) {
				max = nota;
			}
			
			if (min > nota) { // Comprueba qué número es el más bajo
				min = nota;
			}
			
			System.out.println("Introduzca una nota:");
			
			nota = scnum.nextInt();
		}
		
		Acunotas = Acunotas / cont;
		
		System.out.println("La nota media es: " + Acunotas);
		System.out.println("La nota más baja es: " + min);
		
		scnum.close();
	}

}
