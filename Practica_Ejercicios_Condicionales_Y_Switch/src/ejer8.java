import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);	
		Scanner sctxt = new Scanner (System.in);
		
		double peso = 0;
		double altura = 0;
		double edad = 0;
		double TMB = 0;
		String sexo = "";
		
		
		System.out.println("Introduzca su sexo (H/M):");
		sexo = scnum.nextLine();
		
		
		if (sexo.equalsIgnoreCase("H")) {
			
			System.out.println("Introduzca su peso en kg:");
			peso = scnum.nextDouble();
			
			System.out.println("Introduzca su altura en cm:");
			altura = scnum.nextDouble();
			
			System.out.println("Introduzca su edad en años:");
			edad = scnum.nextDouble();
			
			
			TMB = (10 * peso) + (6.25 * altura) -  (5 * edad) + 5;
				
			
			System.out.println("Su tasa metabólica basal (TMB) es: " + TMB);
		}
		
		else if (sexo.equalsIgnoreCase("M")) {
			
			System.out.println("Introduzca su peso en kg:");
			peso = scnum.nextDouble();
			
			System.out.println("Introduzca su altura en cm:");
			altura = scnum.nextDouble();
			
			System.out.println("Introduzca su edad en años:");
			edad = scnum.nextDouble();
			
			
			TMB = (10 * peso) + (6.25 * altura) -  (5 * edad) - 161;
				
			
			System.out.println("Su tasa metabólica basal (TMB) es: " + TMB);
		}
		
		
		scnum.close(); 
		sctxt.close();
	}

}
