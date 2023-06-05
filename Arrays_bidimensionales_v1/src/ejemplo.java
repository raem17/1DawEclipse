import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		
		// 4 filas, 3 colummnas
		int [][] notas = new int [4][3];
		// 5 filas, 5 columnas
		String [][] nombres = new String [5][5];
		
		
		notas [3][2] =  10;
		notas [0][0] =  5;
		nombres [0][0] =  "";
		
		//System.out.println(notas [0][0]);
		//System.out.println(nombres [0][0]);
		
		// Rellenamos el array bidimensional
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Introduzca una nota:");
				notas [i][j] = scnum.nextInt();
			}
		}
		
		
		// Recorremos el array bidimensional
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas [i][j]  + " ");
			}
			System.out.println("");
		}
		
		
		// Cambiar fila 1 del array 
		for (int i = 0; i < notas [i].length; i++) {
			
		}
		
		scnum.close();
	}

}
