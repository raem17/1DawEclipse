package Ejercicios_String_v1;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String [] nombres = new String [10];
		
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduzca su nombre:");
			nombres [i] = sctxt.nextLine();
			
			// Reemplazo las "o" y las "a" por "0" y por "X" con el método replace
			nombres [i] = nombres [i].replace("o", "0");
			nombres [i] = nombres [i].replace("a", "X");
		}
		
		
		System.out.println("Contenido del array:");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Posición: " + i + ": " + nombres[i]);
		}
		
		
		sctxt.close();
	}

}
