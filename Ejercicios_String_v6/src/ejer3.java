import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		
		System.out.println("Introduza una cadena de caracteres: ");
		cadena = sctxt.nextLine();
		
		String [] subCadenas = cadena.split(" ");
		
		
		for (int i = 0; i < subCadenas.length; i++) {
			System.out.println(subCadenas[i]);
		}
		
		sctxt.close();
	}

}
