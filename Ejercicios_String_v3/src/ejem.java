import java.util.Scanner;

public class ejem {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nombres [] = new String [2];
		String resultados [] = new String [2];
		resultados [0] = "";
		
		// Relleno el array de resultados con ""
		for (int i = 0; i < resultados.length; i++) { 
			resultados [i] = "";
		}
		
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduzca una frase:");
			nombres [i] = sctxt.nextLine();
			
			
			for (int j = 0; j < nombres[i].length(); j++) { 
				if (nombres [i].charAt(j) != ' ') {
					resultados [i] = resultados [i] + nombres [i].charAt(j);
				}
			}
		}
		
		
		System.out.println("Contenido del array de resultados:");
		for (int i = 0; i < resultados.length; i++) {
			System.out.println(resultados [i]);
		}
		
		sctxt.close();
	}

}
