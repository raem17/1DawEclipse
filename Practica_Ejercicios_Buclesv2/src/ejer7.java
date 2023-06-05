import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		int numEmpleados = 0;
		double sueldo = 0;
		double acuSueldos = 0;
		double contador = 0;
		
		
		System.out.println("Introduzca el número de empleados:");
    	numEmpleados = scnum.nextInt();
    	  	
    	
        for (int i = 0; i < numEmpleados; i++) {  
        	      	      	       	
        	System.out.println("Introduzca su sueldo:");
        	sueldo = scnum.nextDouble();
        	
        	acuSueldos = (acuSueldos + sueldo);
        	
        	contador++;
        }
        
        
        acuSueldos = acuSueldos / contador;
        
        System.out.println("La media del sueldo de todos los empleados es: " + acuSueldos + " €");
               
        scnum.close();
        
	}

}
