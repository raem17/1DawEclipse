import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nombres [] = new String [2];
		String resultados [] = new String [2];
		
		
		// Relleno el array de resultados con "" para evitar null
		for (int i = 0; i < resultados.length; i++) { 
			resultados [i] = "";
		}
		
		
		// El usuario rellena el array
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduzca una frase:");
			nombres [i] = sctxt.nextLine();
		}
		
		
		// Cambio o por 0, y a por X
		for (int i = 0; i < nombres.length; i++) {
			for (int j = 0; j < nombres[i].length(); j++) {
				if (nombres [i].charAt(j) == 'o') {
					resultados [i] = resultados [i] + '0';
				} else if (nombres [i].charAt(j) == 'a') {
					resultados [i] = resultados [i] + 'x';
				} else {
					resultados [i] = resultados [i] + nombres [i].charAt(j);
				}
			}
		}
		
		
		// Se imprime el array
		System.out.println("Contenido del array de resultados:");
		for (int i = 0; i < resultados.length; i++) {
			System.out.println(resultados [i]);
		}
		
		sctxt.close();
	}

}
