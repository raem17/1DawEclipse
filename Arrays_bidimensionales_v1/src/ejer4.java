import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		// 10 filas, 2 colummnas
		String [][] datos = new String [10][2];
		
		// Rellenamos la columna 0 con nombres y la columna 1 con dni
		for (int i = 0; i < datos.length; i++) {
			System.out.println("Introduzca su nombre:");
			datos [i][0] = sctxt.nextLine();
			
			System.out.println("Introduzca su DNI:");
			datos [i][1] = sctxt.nextLine();
		}
		
		
		// Recorremos el array bidimensional
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.print(datos [i][j]  + " ");
			}
			System.out.println("");
		}
		
		sctxt.close();
	}

}
