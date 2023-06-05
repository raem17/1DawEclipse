import java.util.Arrays;
import java.util.Scanner;
public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros1 = new int [5];
		int [] numeros2 = new int [5];
		int [] numeros3 = new int [5];
		
		
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Array 1 - Introduzca un número nº " + (i + 1));
			numeros1 [i] = scnum.nextInt();
			
			System.out.println("Array 2 - Introduzca un número nº " + (i + 1));
			numeros2 [i] = scnum.nextInt();
			
			System.out.println("Array 3 - Introduzca un número nº " + (i + 1));
			numeros3 [i] = scnum.nextInt();
		}
		
		// Se evalúa si los dos son iguales
		if (Arrays.equals(numeros1, numeros2) && Arrays.equals(numeros1, numeros3) && Arrays.equals(numeros2, numeros3)) {
		    System.out.println("Los tres arrays son iguales."); 
		}
		
		else {
			System.out.println("Los tres arrays NO son iguales.");
		}
		
		scnum.close();
		
		
		
	}

}
