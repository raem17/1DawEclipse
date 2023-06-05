import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		String abecedarioMinus="aábcdeéfghiíjklmnñoópqrstuúvwxyz ";
		int cont = 0;
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < abecedarioMinus.length(); j++) {
				if (frase.charAt(i) == abecedarioMinus.charAt(j) ) {
					cont++;
				}
			}
		}
		
		
		if (cont == frase.length()) {
			System.out.println("Todas las letras están en minúscula.");
		}
		
		sctxt.close();
		
	}

}
