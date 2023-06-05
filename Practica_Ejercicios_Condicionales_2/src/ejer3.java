import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {

		Scanner scnum = new Scanner (System.in);
		int dia = 0;
		int mes = 0;
		
		
		System.out.println("Introduzca el día en forma de número:");
		dia = scnum.nextInt();
		
		System.out.println("Introduzca el mes en forma de número:");
		mes = scnum.nextInt();
		

		if ( (mes == 6 && dia >= 22) || (mes >= 7 && mes <= 8 && dia > 0) || (mes == 9 && dia <= 22) ) {
			System.out.println("Está en Verano.");
		}
		
		else if ( (mes == 9 && dia >= 23) || (mes >= 10 && mes <= 11 && dia > 0) || (mes == 12 && dia <= 20) ) {
			System.out.println("Está en Otoño.");
		}
		
		else if ( (mes == 12 && dia >= 21) || (mes >= 1 && mes <= 2 && dia > 0) || (mes == 3 && dia <= 20) ) {
			System.out.println("Está en Invierno.");
		}
		
		else if ( (mes == 3 && dia >= 21) || (mes >= 4 && mes <= 5 && dia > 0) || (mes == 6 && dia <= 21) ) {
			System.out.println("Está en Primavera.");
		}
		
		
		scnum.close();
	}

}
