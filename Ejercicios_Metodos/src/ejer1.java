import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		char letra = ' ';
		int cont = 0;
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		System.out.println("Introduzca una letra:");
		letra = sctxt.nextLine().charAt(0);
		
		
		cont = contCharEnCadena(cadena, letra);
		
		
		System.out.println("Veces que ha aparecido su letra: " + cont);
		
		sctxt.close();
	}
	
	// Método que cuenta el char introducido en una cadena, y devuelve un int.
	static int contCharEnCadena (String cadena, char letra) {
		
		int cont = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra) {
				cont++;
			}
		}
		
		return cont;
	}

}
