import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		int cont = 0; // Para primos
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		String[] palabras = frase.split(" ");

				
		for (int i = 0; i < palabras.length; i++) {		
			cont = 0; // Para primos
			
			for (int j = 2; j < palabras[i].length(); j++) {
				if (palabras[i].length() % j == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && palabras[i].length() != 1) {
				System.out.print(palabras[i] + " ");
			}
			
		}
		
		sctxt.close();
	}

}
