import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		double num = 0;
		double contPositivos = 0;
		double acuPositivos = 0;
		double mediaPositivos = 0;
		
		double contNegativos = 0;
		double acuNegativos = 0;
		double mediaNegativos = 0;
		
		double contCeros = 0;
		
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Introduzca un número:");
			num = scnum.nextDouble();
			
			if (num > 0) {
				contPositivos++;
				acuPositivos = acuPositivos + num;
			}
			
				else if (num < 0) {
					contNegativos++;
					acuNegativos = acuNegativos + num;
				}
			
				else {
					contCeros++;
				}
		}
		
		mediaPositivos = acuPositivos / contPositivos;
		
		mediaNegativos = acuNegativos / contNegativos;
		
		
		System.out.println("La media de todos los números positivos es: " + mediaPositivos);
		
		System.out.println("La media de todos los números negativos es: " + mediaNegativos);
		
		System.out.println("Cantidad de ceros: " + contCeros);
		
		
		scnum.close();
	}

}
