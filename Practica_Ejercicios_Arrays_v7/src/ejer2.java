import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [25];
		int cont10 = 0;
		
		// El usuario rellena el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros [i] = scnum.nextInt();
			
			if (numeros [i] == 10) {
				cont10++;
			}
		}
		
		
		if (cont10 > 0) {
			System.out.println("");
			System.out.println("Se ha introducido un 10 entre los " + numeros.length +" números introducidos.");
		} else {
				System.out.println("");
				System.out.println("No se ha introducido ningún 10 entre los " + numeros.length +" números introducidos.");
			}

		
		scnum.close();
	}

}
