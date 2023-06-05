import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		double sueldoSem = 0;
		int horas = 0;
		
		
		System.out.println("Introduzca el número de horas que trabaja a la semana: ");
		horas = scnum.nextInt();
		
		
		if (horas <= 20) {
			
			sueldoSem = 25 * horas;
			System.out.println("Su salario semanal es: " + sueldoSem + "€");
		}
		
		else {
			/* Al entrar en el else se da por hecho que trabaja más de 20h, por lo que se calcula 20*25 y al resultado 
			se le suman las horas trabajadas menos 20 (el resultado son las horas extra) y se multiplica por 30. */
			sueldoSem = (20 * 25) + ((horas - 20) * 30);
			
			System.out.println("Su salario semanal es: " + sueldoSem + "€");
		}
		
		scnum.close();
		
	}

}