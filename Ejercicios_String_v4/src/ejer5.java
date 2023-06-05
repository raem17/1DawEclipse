import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		String cadenaInvertida = "";
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}
		
		cadena = cadenaInvertida;
		
		System.out.println(cadena);
		
		sctxt.close();
	}

}
