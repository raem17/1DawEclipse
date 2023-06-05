import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String pais = "";
		int cont_e = 0;
		
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Introduzca el nombre de un país:");
			pais = sctxt.nextLine();
			
			for (int j = 0; j < pais.length(); j++) {
				if (pais.charAt(j) == 'e') 
					cont_e++;
			}
		}
		
		
		System.out.println("Contador de letras 'e': " + cont_e);
		
		sctxt.close();
	}

}
