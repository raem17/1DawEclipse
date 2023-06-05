import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner( System.in );
		String nombre = "";
		
		
		System.out.println("Introduzca su nombre:");               
		nombre = sctxt.nextLine();
		
		       
        if (nombre.equalsIgnoreCase("Antonio")) {
        	        
            System.out.println("Normalito.");
            
        }
        	
        else if (nombre.equalsIgnoreCase("Enrique")) {
	        
            System.out.println("Resultón.");
            
        }
        	
        else if (nombre.equalsIgnoreCase("Raúl")) {
	        
            System.out.println("Del montón.");
            
        }
        	
        else if (nombre.equalsIgnoreCase("Rafael")) {
	        
            System.out.println("pufff…");
            
        }
        	
        else if (nombre.equalsIgnoreCase("José")) {
	        
            System.out.println("Guapete.");
            
        }
        	
        else if (nombre.equalsIgnoreCase("Jorge")) {
	        
            System.out.println("Tremendamente atractivo.");
            
        }
        
        
        sctxt.close();
	}

}
