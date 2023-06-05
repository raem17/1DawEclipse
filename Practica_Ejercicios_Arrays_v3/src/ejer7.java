import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [20];
		int num = 0;
		int ultimaPosicion = 0;
		int cont = 0;
		
		
		// El usuario rellena el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número nº " + (i + 1));
			numeros [i] = scnum.nextInt();
		}
		
		
		System.out.println("Introduzca un número para saber si se encuentra en el array:");
		num = scnum.nextInt();
		
		
		// Se recorre el array, y con dos if se establece un contador y la ultima posicion del num
		for (int i = 0; i < numeros.length; i++) {
			if (numeros [i] == num) {
				cont++;
			}
			
			if (numeros [i] == num) {
				ultimaPosicion = i + 1;
			}
		}
		
		System.out.println("Última posición del " + num + ": " + ultimaPosicion);
		System.out.println("Número de veces que el " + num + " se encuentra en el array: " + cont);
		
		scnum.close();
	}

}
