import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double num4 = 0;

        
        System.out.println("Introduzca el primer número:");
        num1 = scnum.nextDouble();
        
        System.out.println("Introduzca el segundo número:");
        num2 = scnum.nextDouble();
        
        System.out.println("Introduzca el tercer número:");
        num3 = scnum.nextDouble();
        
        System.out.println("Introduzca el cuarto número:");
        num4 = scnum.nextDouble();

        
        if ( num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0 && num4 % 2 == 0) {
            System.out.println("Todos los números son pares.");
        }
        
        else if ( num1 % 2 != 0 && num2 % 2 != 0 && num3 % 2 != 0 && num4 % 2 != 0) {
            System.out.println("Todos los números son impares.");
        }
        
			
		scnum.close();
	}

}
