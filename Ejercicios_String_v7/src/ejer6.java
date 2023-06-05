import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		cadena = eliminarEspacios(cadena);
		
		System.out.println(cadena);
		
		sctxt.close();
	}	
	
	// Método
	static String eliminarEspacios(String cadena) {
		String cadenaNueva = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' ') {
				cadenaNueva = cadenaNueva + cadena.charAt(i);
			}
		}
		
		return cadenaNueva;
	}

}
