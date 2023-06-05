import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		String cadenaPosicionesImpares = "";
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();

		
		
		for (int i = 0; i < cadena.length(); i++) {
			if (i % 2 != 0) {
				cadenaPosicionesImpares = cadenaPosicionesImpares + cadena.charAt(i);
			}
		}
		
		
		System.out.println("Cadena formada con los caracteres de las posiciones impares de la primera cadena: '" + cadenaPosicionesImpares + "'");
		
		sctxt.close();
	}

}
