import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		Scanner scnum = new Scanner (System.in);
		
		String respuesta = "";
		int num = 0;
		int contPares = 0;
		int contImpares = 0;
		int contPrimos = 0;
		int cont = 0; // Para primos
		
		
		do {	
			cont = 0;
			
			System.out.println("Introduzca un número:");
			num = scnum.nextInt();
			
			
			if (num % 2 == 0) {
				contPares++;
			}
			
			else if (num % 2 != 0) {
				contImpares++;
			}
			
			// Primos
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					cont++;
				}
			}
			
			if (cont == 0 && num != 1 && num != 0) {
				contPrimos++;
			}
			
			System.out.println("¿Desea seguir introduciendo números (S/N)?");
			respuesta = sctxt.nextLine();
			
		} while (respuesta.equalsIgnoreCase("S"));
		
		
		System.out.println("Números pares introducidos: " + contPares);
		
		System.out.println("Números impares introducidos: " + contImpares);
		
		System.out.println("Números primos introducidos: " + contPrimos);
		
		
		sctxt.close();
		scnum.close();
	}

}
