import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		int contador = 0;
		
		
		System.out.println("Introduce el número de veces que quieres ver 'Eco...':");
    	contador = scnum.nextInt();
    	  
    	
        for (int i = 0; i < contador; i++) {  
        	      	      	       	
        	System.out.println("Eco...");
        	
        	
        }
        
               
        scnum.close();
        
	}

}
