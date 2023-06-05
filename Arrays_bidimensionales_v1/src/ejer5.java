import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		Scanner scnum = new Scanner (System.in);
		int num = 0;
		
		
		System.out.println("Introduzca el número de personas:");
		num = scnum.nextInt();
		
		
		// num filas 2 colummnas
		String [][] datos = new String [num+1][2];
		
		
		datos [0][0] = "Religioso";
		datos [0][1] = "Vegetariano";
		
		
		// Rellenamos la columna 0 con nombres y la columna 1 con dni
		for (int i = 1; i < datos.length; i++) {
			System.out.println("¿Es religioso? (S/N)");
			datos [i][0] = sctxt.nextLine();
			
			if (datos [i][0].equalsIgnoreCase("S")) {
				datos [i][0] = "true";
			} else {
				datos [i][0] = "false";
			}
			
			System.out.println("¿Es vegetariano? (S/N)");
			datos [i][1] = sctxt.nextLine();
			
			if (datos [i][1].equalsIgnoreCase("S")) {
				datos [i][1] = "true";
			} else {
				datos [i][1] = "false";
			}
		}
		
		
		//Recorremos el array bidimensional
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.print(datos [i][j]  + " ");
			}
			System.out.println("");
		}
		
		
		sctxt.close();
		scnum.close();
	}

}
