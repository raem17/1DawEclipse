import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);		
		double salario = 0;
		double horasTrabajadas = 0;
		double tarifaHora = 0;
		
		
		System.out.println("Introduzca el número de horas trabajadas: ");
		horasTrabajadas = scnum.nextDouble();
		
		System.out.println("Introduzca la tarifa por hora: ");
		tarifaHora = scnum.nextDouble();
		
		if (horasTrabajadas <= 40) {
			
			salario = tarifaHora * horasTrabajadas;
			System.out.println("Su salario es: " + salario + "€");
		}
		
		else if (horasTrabajadas > 40) {
			
			tarifaHora = tarifaHora + (tarifaHora * 0.5);
			salario = tarifaHora * horasTrabajadas;
			System.out.println("Su salario es: " + salario + "€");
		}
				
		
		scnum.close();
	}

}
