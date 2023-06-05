import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		int contPrimos = 0;
		
		
		System.out.println("Introduzca num: ");
		num = scnum.nextInt();
		
		
		for (int i = 1; i <= num; i++) {
			cont = 0;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && i != 1 && i != 0) {
				contPrimos++;
			}
			
		}
		
		System.out.println("Entre 1 y " + num + " hay: " + contPrimos + " números primos.");
		
		
		scnum.close();
	}

}
