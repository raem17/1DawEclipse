package ejercicios1;

import java.util.Scanner;

public class ejemplo_array {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		
		
		// Declaración de array de enteros de 10 posiciones		
		int [] edades = new int [50];
		
		
		// Declaración de array de strings de 15 posiciones		
		String [] nombres = new String [5];
		
		
		// Declaramos arrays inicializados con valores
		//String [] diasLaborables = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
		//int [] diasSemana = {1, 2, 3, 4, 5, 6, 7};
		
		
		edades [3] = 28;
		edades [3] = edades [3] + 18;
		//System.out.println(edades[3]);
		
		
		nombres [0] = "Espinete";
		nombres [1] = "23";
		
		
		//Recorremos un array de edades
		/*for (int i = 0; i < nombres.length; i++) {
			System.out.print(nombres[i] + ", ");
		}*/
			
		
		// Rellenamos un array de nombres
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduzca un nombre:");
			nombres [i] = sctxt.nextLine();
		}
		
		sctxt.close();
	}

}
