import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		Scanner scnum = new Scanner (System.in);
		
		String [] nombres = new String [20];
		double [] sueldos = new double [20];
		
		double mejorSueldo = 0;
		String nombreMejorSueldo = "";
		
		// Pedida de datos y condicionales
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Empleado nº " + (i + 1) + " introduzca su nombre:");
			nombres [i] = sctxt.nextLine();
			
			System.out.println("Empleado nº " + (i + 1) + " introduzca su sueldo:");
			sueldos [i] = scnum.nextDouble();
			
			
			if (mejorSueldo < sueldos [i]) { 
				mejorSueldo = sueldos [i];
				nombreMejorSueldo = nombres [i];
			}
		}
		
		System.out.println("El empleado con el sueldo más alto es: " + nombreMejorSueldo + " con " + mejorSueldo + " €");
		
		scnum.close();
		sctxt.close();
		
		
	}

}
