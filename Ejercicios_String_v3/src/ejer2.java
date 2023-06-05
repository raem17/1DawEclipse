import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		String resul = "";
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				resul = resul + frase.charAt(i);
			}
		}
		
		
		System.out.println(resul);
		
		sctxt.close();
	}

}
