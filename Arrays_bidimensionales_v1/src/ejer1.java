import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		// 5 filas, 4 colummnas
		int [][] numeros = new int [5][4];
		
		// Rellenamos el array bidimensional
		for (int i = 0, z = 1; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros [i][j] = z;
				z++;
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
