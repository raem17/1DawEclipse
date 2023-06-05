import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        double num = 0;

        
        System.out.println("Introduzca un número:");
        num = scnum.nextDouble();

        
        if ( num % 2 == 0 && num > 500 ) {
            System.out.println("El número es par y mayor que 500.");
        }
			
        
		scnum.close();
	}

}
