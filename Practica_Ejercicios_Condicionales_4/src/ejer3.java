import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double sumaNum = 0;
        
        
        System.out.println("Introduzca el primer número:");
        num1 = scnum.nextDouble();
        
        System.out.println("Introduzca el segundo número:");
        num2 = scnum.nextDouble();
        
        System.out.println("Introduzca el tercer número:");
        num3 = scnum.nextDouble();
        
        
        sumaNum = num1 + num2 +num3;
        
        
        if (sumaNum > 0) {
        	System.out.println("La suma positiva es: " + sumaNum);
        }
        
        else if (sumaNum < 0) {	
        	if (num1 < 0) {
        		System.out.println("Número: " + num1);
        	}
        	
        	if (num2 < 0) {
        		System.out.println("Número: " + num2);
        	}
        	
        	if (num3 < 0) {
        		System.out.println("Número: " + num3);
        	}
        }
        
        
        scnum.close();
	}

}
