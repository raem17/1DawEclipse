package metodos;

import java.util.Scanner;

public class pruebaMetodos3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		int nPalabras = 0;
		
		
		System.out.println("Introduzca una cadena:");
		cadena = sctxt.nextLine();
		
		
		nPalabras = utilidades.nPalabrasEnCadena(cadena);
		
				
		System.out.println("Hay " + nPalabras + " palabras en la cadena de caracteres.");
		
		sctxt.close();
	}

}
