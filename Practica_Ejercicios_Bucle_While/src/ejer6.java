import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		int num = 0;
		int cont10 = 0;
		int cont0 = 0;
		int i = 0;
		
        while (i < 20) {  
        	       	       	
        	System.out.println("Introduzca un número entero:");
        	num = scnum.nextInt();
        	
        	if (num == 10) {
        		cont10++;
        	}
        	
        	if (num == 0) {
        		cont0++;
        			
            } 
        	
        	i++;
        	
        }
        
        System.out.println("Números 10 introducidos: " + cont10);
        
        System.out.println("Números 0 introducidos: " + cont0);
        
        
        scnum.close();
		
	}

}
