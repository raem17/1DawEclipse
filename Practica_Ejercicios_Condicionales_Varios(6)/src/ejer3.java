import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        double num = 0;
        
        
        System.out.println("Introduzca un número:");
        num = scnum.nextDouble();
        
        
        if (num < 1000) {       
        	System.out.println("Te faltan " + (1000 - num) + " unidades para llegar a 1000.");
        }
        
        else if (num > 1000 && num < 15000) {       
        	System.out.println("Te faltan " + (15000 - num) + " unidades para llegar a 15000.");
        }
        
        else if (num == 1000) {       
        	System.out.println("El 3% de 1000 es: " + (num * 0.03));
        }
        
        
        scnum.close();
	}

}
