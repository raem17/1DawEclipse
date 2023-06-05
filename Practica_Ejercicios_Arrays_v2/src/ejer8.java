import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [10];
		
		int cont = 0;
		int acuNumPosicionesPares = 0;
		int mediaNumPosicionesPares = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros [i] = scnum.nextInt();
			
			if (i % 2 == 0) {
				cont++;
				acuNumPosicionesPares = acuNumPosicionesPares + numeros [i];
			}
		}
		
		mediaNumPosicionesPares = acuNumPosicionesPares / cont;
		
		
		System.out.println("La media de los números que están en las posiciones pares del array es: " + mediaNumPosicionesPares);
		scnum.close();
		
	}

}
