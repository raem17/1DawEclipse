import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		String[] palabras = frase.split(" ");
		
		System.out.println(palabras [palabras.length-1]);
		
		sctxt.close();
	}

}
