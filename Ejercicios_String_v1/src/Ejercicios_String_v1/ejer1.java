package Ejercicios_String_v1;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		String direccion = "";
		
		
		System.out.println("Introduzca su nombre:");
		nombre = sctxt.nextLine();
		
		System.out.println("Introduzca su dirección:");
		direccion = sctxt.nextLine();
		
		// Sumo las 2 longitudes que me devuelve el método lenght y se imprimen
		System.out.println(nombre.length() + direccion.length());
		
		sctxt.close();
	}

}
