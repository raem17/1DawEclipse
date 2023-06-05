package Ejercicios_String_v1;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";

		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		// Método replace: reemplaza la substring especificada por otra especificada, en este programa reemplaza los espacios por nada
		System.out.println(frase.replace(" ", ""));
		
		sctxt.close();
	}

}
