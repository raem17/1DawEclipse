package ejercicios1;

import java.util.Scanner;

public class ejercicio_for_1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int num = 0;
		int cont = 0;
		
        for (int i = 0;i < 100;i++) {  
        	
        	System.out.println("Introduzca un número:");
        	num = scnum.nextInt();
        	
        	if (num == 10) {
        		cont++;
            }
        	
        }
        
        System.out.println("Has introducido el 10: " + cont + " veces.");
        
        
        scnum.close();
	}

}
