import java.util.*;
public class ejer11 {

	public static void main(String[] args) {
		
        Scanner scnum = new Scanner( System.in );
        double num = 0;

        
        System.out.println( "Introduzca un número:");
        num = scnum.nextInt();

        
        if ( num % 2 == 0 ) {
            System.out.println( "Es par." );
        }
        
        else {
            System.out.println( "Es impar." );
        }
			
        
		scnum.close();
		
	}

}