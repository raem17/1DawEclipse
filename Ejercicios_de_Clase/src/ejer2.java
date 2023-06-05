import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		String[] partes = frase.split(" ");
		
		
		System.out.println("Hay "  + partes.length + " palabras en la frase.");
		
		sctxt.close();
	}

}
