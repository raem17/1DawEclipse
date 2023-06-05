import java.util.Scanner;
import java.util.Arrays;

public class ejer10 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] array_numeros1 = new int [10];
		int [] array_numeros2 = new int [10];
		
		
		for (int i = 0; i < array_numeros1.length; i++) {	
			System.out.println("Posición nº "+ i + ". Introduzca un número para el array 1:");
			array_numeros1 [i] = scnum.nextInt();
			
			System.out.println("Posición nº "+ i + ". Introduzca un número para el array 2:");
			array_numeros2 [i] = scnum.nextInt();
		}
		
		
		// Se muestra el contenido del array 1
		System.out.println("Contenido del array 1:");
		for (int i = 0; i < array_numeros1.length; i++) {
			System.out.println("Posición " + i + ": " + array_numeros1[i]);
		}	
		
		// Se muestra el contenido del array 2
		System.out.println("");
		System.out.println("Contenido del array 2:");
		for (int i = 0; i < array_numeros2.length; i++) {
			System.out.println("Posición " + i + ": " + array_numeros2[i]);
		}
		
		
		// Se evalúa si los dos son iguales
		if (Arrays.equals(array_numeros1, array_numeros2)) {
		    System.out.println("Los dos arrays son iguales."); 
		}
		
		else {
			System.out.println("Los dos arrays NO son iguales.");
		}
		
		scnum.close();
		    
	}

}
 