import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		
		
		System.out.println("Introduzca un nombre:");
		nombre = sctxt.nextLine();

    	  	
        for (int i = 0;i < 3450;i++) {  
        	        	       	
        	System.out.println(nombre);
        	
        }
        
               
        sctxt.close();
	}

}
