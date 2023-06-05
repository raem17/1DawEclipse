import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		String subcadena = "";
		int cont = 0;
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		System.out.println("Introduzca una subcadena de su cadena:");
		subcadena = sctxt.nextLine();
		
		
		String[] subCadenas = cadena.split(" ");
		
		
		for (int i = 0; i < subCadenas.length; i++) {
			if (subCadenas [i].equals(subcadena)) {
				cont++;
			}
		}
		
		
		System.out.println("La subcadena '" + subcadena  + "'" + " se encuentra " + cont  + " veces en la cadena '" + cadena + "'");
		
		sctxt.close();
	}

}
