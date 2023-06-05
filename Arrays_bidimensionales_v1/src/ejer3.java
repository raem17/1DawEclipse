import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		// 4 filas, 4 colummnas
		String [][] nombres = new String [4][4];
		
		// Rellenamos el array bidimensional
		for (int i = 0; i < nombres.length; i++) {
			for (int j = 0; j < nombres[i].length; j++) {
				nombres [i][j] = "Alejandro";
			}
		}
		
		
		// Recorremos el array bidimensional
		for (int i = 0; i < nombres.length; i++) {
			for (int j = 0; j < nombres[i].length; j++) {
				System.out.print(nombres [i][j]  + " ");
			}
			System.out.println("");
		}
		
		sctxt.close();
	}

}
