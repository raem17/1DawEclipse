import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		Scanner scnum = new Scanner (System.in);
		int num = 0;
		int cont9 = 0;
		int contDistinto9 = 0;
		
        for (int i = 0; i < 10; i++) {  
        	
        	System.out.println("Introduzca un número entero:");
        	num = scnum.nextInt();
        	
        	if (num == 9) {
        		cont9++;
        	} else {
        		contDistinto9++;
        	}
        	
        }
        
        System.out.println("Números 9 introducidos: " + cont9);
        System.out.println("Números distintos de 9 introducidos: " + contDistinto9);
        
        scnum.close();
        
	}

}
