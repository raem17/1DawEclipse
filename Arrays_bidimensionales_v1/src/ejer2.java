import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		// 8 filas, 8 colummnas
		int [][] numeros = new int [8][8];
		
		// Rellenamos el array bidimensional
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros [i][j] = 99;
			}
		}
		
		
		// Recorremos el array bidimensional
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros [i][j]  + " ");
			}
			System.out.println("");
		}
		
		scnum.close();
	}

}
