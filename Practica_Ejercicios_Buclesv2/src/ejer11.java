import java.util.Scanner;

public class ejer11 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
		
		int opc = 0;
		
		
		do {
		
	        System.out.println("1: Crear usuario.");
	        System.out.println("2: Eliminar usuario.");
	        System.out.println("3: Modificar usuario.");
	        System.out.println("4: Visualizar datos usuario.");
	        System.out.println("5: Salir.");
	        opc = scnum.nextInt();
	        
	        
	        if (opc == 1) {
	        	
	        	System.out.println("1. Abre un menú en el que crea un nuevo usuario.");
	        	System.out.println("");
	        }
	        
	        else if (opc == 2) {
	        	
	        	System.out.println("2. Abre un menú en el que elimina un usuario.");
	        	System.out.println("");
	        }
	        
	        else if (opc == 3) {
	        	
	        	System.out.println("3. Abre un menú en el que modifica un usuario.");
	        	System.out.println("");
	        }
	        
	        else if (opc == 4) {
	        	
	        	System.out.println("4. Abre un menú en el que visualiza los datos de un usuario.");
	        	System.out.println("");
	        }
	        
		} while (opc != 5);
		
		
		scnum.close();
		
	}

}
