package ejercicios1;

import java.util.Scanner;

public class ejercicio_for_3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		
		double acuSueldos = 0;
		String nombre = "";
		double sueldo = 0;
		double antonios = 0;
		
		
        for (int i = 0;i < 3;i++) {  
        	
        	System.out.println("Introduzca nombre:");
        	nombre = sctxt.nextLine();
        	
        	System.out.println("Introduzca sueldo:");
        	sueldo = scnum.nextDouble();
        	
        	if (nombre.equalsIgnoreCase("Antonio")) {
        		antonios++;
        		acuSueldos = (acuSueldos + sueldo) / antonios;
            }
        	
        }
        
        System.out.println("La media de sueldo de todos los Antonios es: " + acuSueldos + "€");
        
        
        scnum.close();
        sctxt.close();
		
	}

}
