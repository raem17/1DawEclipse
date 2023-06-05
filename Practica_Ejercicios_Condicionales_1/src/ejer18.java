import java.util.*;
public class ejer18 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int dia = 0;
		int mes = 0;
		int año = 0;
		
		
		System.out.println("Introduzca el día en forma de número:");
		dia = scnum.nextInt();
		
		System.out.println("Introduzca el mes en forma de número:");
		mes = scnum.nextInt();
		
		System.out.println("Introduzca el año en forma de número:");
		año = scnum.nextInt();
		
		
		if ((dia >= 1) && (dia <= 31)) {
			
			if ((mes >= 1) && (mes <= 12)) {
				
				if ((año >= 2000) && (año <= 2100)) {
					System.out.println("La fecha es correcta.");
				}
				
				else {
					System.out.println("El año es incorrecto.");
				}
			}
			
			else {
				System.out.println("El mes es incorrecto.");
			}
		}
		
		else {
			System.out.println("El día es incorrecto.");
		}
		
		
		scnum.close();
		
	}

}