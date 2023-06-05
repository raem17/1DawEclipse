package ejercicios1;

import java.util.Scanner;

public class ejercicio_for_2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int edad = 0;
		int acuEdades = 0;
		//int cont = 0;
		
        for (int i = 0;i < 5;i++) {  
        	
        	System.out.println("Introduzca una edad:");
        	edad = scnum.nextInt();
        	
        	if (edad > 17) {
        		//cont++;
        		acuEdades = acuEdades + edad;
            }
        	
        }
        
        System.out.println("La suma de los años de todos los mayores de edad es: " + acuEdades);
        
        
        scnum.close();
		
	}

}
