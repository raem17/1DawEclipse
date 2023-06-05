import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
	
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		cadena = sustituirEspaciosPorAsteriscos(cadena);
		
		System.out.println(cadena);
		
		sctxt.close();
	}	
	
	// Método
	static String sustituirEspaciosPorAsteriscos(String cadena) {
		String cadenaNueva = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				cadenaNueva = cadenaNueva + "*";
			} else {
				cadenaNueva = cadenaNueva + cadena.charAt(i);
			}
		}
		
		return cadenaNueva;
	}

}
