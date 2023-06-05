import java.util.Scanner;

public class ejer12 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
		Scanner sctxt = new Scanner( System.in );
		
		String nombre = "";
		String dni = "";
		String domicilio = "";
		int edad = 0;
		
		int opc = 0;
		
		
		do {
			
			System.out.println("");
			System.out.println("Elija una opción del menú:");
	        System.out.println("");		
	        System.out.println("1: Crear usuario.");
	        System.out.println("2: Eliminar usuario.");
	        System.out.println("3: Modificar usuario.");
	        System.out.println("4: Visualizar datos usuario.");
	        System.out.println("5: Salir.");
	        opc = scnum.nextInt();
	        
	        
	        if (opc == 1) {
	        	
	        	System.out.println("Introduzca su nombre:");
	        	nombre = sctxt.nextLine();
	        	
	        	System.out.println("Introduzca su dni:");
	        	dni = sctxt.nextLine();
	        	
	        	System.out.println("Introduzca su domicilio:");
	        	domicilio = sctxt.nextLine();
	        	
	        	System.out.println("Introduzca su edad:");
	        	edad = scnum.nextInt();
	        }
	        
	        else if (opc == 2) {
	        	
	        	nombre = "";
	    		dni = "";
	    		domicilio = "";
	    		edad = 0;
	        }
	        
	        else if (opc == 3) {
	        	
	        	System.out.println("Introduzca su nombre:");
	        	nombre = sctxt.nextLine();
	        	
	        	System.out.println("Introduzca su dni:");
	        	dni = sctxt.nextLine();
	        	
	        	System.out.println("Introduzca su domicilio:");
	        	domicilio = sctxt.nextLine();
	        	
	        	System.out.println("Introduzca su edad:");
	        	edad = scnum.nextInt();
	        }
	        
	        else if (opc == 4) {
	        	
	        	System.out.println("Nombre: " + nombre);
	        	
	        	System.out.println("DNI: " + dni);
	        	
	        	System.out.println("Domicilio: " + domicilio);
	        	
	        	System.out.println("Edad: " + edad);

	        }
	        
		} while (opc != 5);
		
		
		scnum.close();
		sctxt.close();
		
	}

}
