import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int menor = 0;
		int mayor = 0;
		int cont = 0;
		int contPrimos = 0;
		
		
		System.out.println("Introduzca el numero 1:");
		num1 = scnum.nextInt();
		
		System.out.println("Introduzca el numero 2:");
		num2 = scnum.nextInt();
		
		
		if (num1 < num2) {
			menor = num1;
			mayor = num2;
		}
		else if (num1>num2) {
			menor = num2;
			mayor = num1;
		}
		
		for (int i = menor; i <= mayor; i++) {
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
		
		System.out.println("Entre "+ num1 + " y "+ num2 + " hay " + contPrimos + " números primos." );
		
		scnum.close();
	}

}
