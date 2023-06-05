import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [10];
		
		int contPositivos = 0;
		int acuPositivos = 0;
		int mediaPositivos = 0;
		
		int contNegativos = 0;
		int acuNegativos = 0;
		int mediaNegativos = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Introduzca un número nº " + (i + 1));
			numeros [i] = scnum.nextInt();
			
			
			if (numeros [i] > 0) {
				contPositivos++;
				acuPositivos = acuPositivos + numeros [i];
			}
			
			else if (numeros [i] < 0) {
				contNegativos++;
				acuNegativos = acuNegativos + numeros [i];
			}

		}
		
		
		if (acuPositivos > 0) {
			mediaPositivos = acuPositivos / contPositivos;
		}
		
		if (acuNegativos < 0) {
			mediaNegativos = acuNegativos / contNegativos;
		}
		
		
		// Se recorre el array
		System.out.println("Contenido del array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + i + ": " + numeros[i]);
		}
		
		
		System.out.println("La media de los números positivos en el array es: " + mediaPositivos);
		System.out.println("La media de los números negativos en el array es: " + mediaNegativos);
		
		scnum.close();
	}

}
