import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		int num = 0;
		int cont9 = 0;
		
		
        for (int i = 0;i < 20;i++) {  
        	
        	System.out.println("Introduzca un número entero:");
        	num = scnum.nextInt();
        	
        	if (num == 9) {
        		cont9++;
        	}
        	
        }
        
        System.out.println("Números 9 introducidos: " + cont9);
        
        
        scnum.close();
	}

}
