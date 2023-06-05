import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		
		String[] subCadenas = cadena.split(" ");
		
		
		System.out.println("Hay "  + subCadenas.length + " palabras en la cadena.");
		
		sctxt.close();
	}

}
