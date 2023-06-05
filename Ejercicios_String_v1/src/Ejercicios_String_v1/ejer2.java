package Ejercicios_String_v1;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String ciudad = "";
		
		
		System.out.println("Introduzca su ciudad natal:");
		ciudad = sctxt.nextLine();
		
		// El método toUpperCase devuelve todos los carácteres del string en mayúsculas
		ciudad = ciudad.toUpperCase();
		
		// Imprimo con el método charAt la longitud-1 (lenght()-1) del string "ciudad" (se imprime el último carácter)
		System.out.println(ciudad.charAt(ciudad.length()-1));
		
		sctxt.close();
	}

}
