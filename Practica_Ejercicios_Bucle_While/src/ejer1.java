import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		int i = 0;
		
		System.out.println("Introduzca un nombre:");
		nombre = scnum.nextLine();

    	  	
        while (i < 3450) {  
        	      	      	       	
        	System.out.println(nombre);
        	
        	i++;
        	
        }
        
               
        scnum.close();
        sctxt.close();
	}

}
