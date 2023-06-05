import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		String resultado = "";
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'A' || frase.charAt(i) == 'B') {
				resultado = resultado + frase.charAt(i);
			} else {
				resultado = resultado + frase.toLowerCase().charAt(i);
			}
		}
		
		
		System.out.println(resultado);
		
		sctxt.close();
	}

}
