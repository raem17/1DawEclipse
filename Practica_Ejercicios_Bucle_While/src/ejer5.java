import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		int num = 0;
		int cont9 = 0;
		int i = 0;
		
		
        while (i < 20) {       	        	
        	
        	System.out.println("Introduzca un número entero:");
        	num = scnum.nextInt();
        	
        	if (num == 9) {
        		cont9++;
        	}
        	
        	i++;
        	
        }
        
        System.out.println("Números 9 introducidos: " + cont9);
        
        
        scnum.close();
	}

}
