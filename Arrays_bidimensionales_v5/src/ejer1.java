import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String [][] cadenas = new String [5][5];
		String resultado = "";
		
		
		for (int i = 0; i < cadenas.length; i++) {
			for (int j = 0; j < cadenas[i].length; j++) {
				System.out.println("Introduzca una cadena de caracteres:");
				cadenas [i][j] = sctxt.nextLine();
				
				resultado = resultado + cadenaLimpia(cadenas [i][j]) + " ";
			}
		}
		
		
		System.out.println(resultado);
		sctxt.close();
	}
	
	
	// Método que recibe una cadena y elimina los espacios en blanco sobrantes
	static String cadenaLimpia (String cadena) {
		
		String cadenaLimpia = "";
		
		cadena = cadena.trim();
		
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' ') {
				cadenaLimpia = cadenaLimpia + cadena.charAt(i);			
			} else if (cadena.charAt(i+1) != ' ') {
				cadenaLimpia = cadenaLimpia + cadena.charAt(i);
			}
		}
		
		return cadenaLimpia;
	}

}
