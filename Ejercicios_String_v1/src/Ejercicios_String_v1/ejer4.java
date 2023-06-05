package Ejercicios_String_v1;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nomApe = "";
		int contAntonio = 0;
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca su nombre y apellido:");
			nomApe = sctxt.nextLine();
			
			// Convierto todos los carácteres del string nomApe en minúsculas para el método contains, ya que este es case sensitive
			nomApe = nomApe.toLowerCase();
			
			/* El método contains devuelve un true o un false en función de si el string contiene la secuencia especificada de 
			 chars, en este caso "antonio". Entonces lo que hago es comprobar si en el string existe la palabra "antonio"*/
			if (nomApe.contains("antonio") == true) {
				contAntonio++;
			}
		}
		
		
		System.out.println("Número de Antonios: " + contAntonio);
		
		sctxt.close();
	}

}
