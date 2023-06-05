import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
	
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		String letras3aposicion = "";
		
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Introduzca un nombre:");
			nombre = sctxt.nextLine();
			letras3aposicion = letras3aposicion + nombre.charAt(2);
		}
		
		
		System.out.println("String generado: " + letras3aposicion);
		
		sctxt.close();
	}

}
