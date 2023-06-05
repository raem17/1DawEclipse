package Ejercicios_String_v1;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String direccion = "";
		
		
		System.out.println("Introduzca su dirección:");
		direccion = sctxt.nextLine();
		
		/* Con los métodos toUpperCase y toLowerCase convierto todos los carácteres del string "direccion", en sus respectivos 
		casos, en mayúsculas y minúsculas*/
		System.out.println(direccion.toUpperCase() + " " + direccion.toLowerCase());
		
		sctxt.close();
	}

}
