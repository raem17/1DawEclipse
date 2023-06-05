package Ejercicios_String_v1;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nom = "";
		String ape = "";
		String dni = "";
		String datos = "";

		
		System.out.println("Introduzca su nombre:");
		nom = sctxt.nextLine();
		
		System.out.println("Introduzca su apellido:");
		ape = sctxt.nextLine();
		
		System.out.println("Introduzca su dni:");
		dni = sctxt.nextLine();
		
		
		// Método concat: concatena strings especificados, en este caso, concateno nom con ape y dni, y lo guardo en la clase "datos"
		datos = nom.concat(ape).concat(dni);
		
		
		System.out.println(datos);
		
		sctxt.close();
	}

}
