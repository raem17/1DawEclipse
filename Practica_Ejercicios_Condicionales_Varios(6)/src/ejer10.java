import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        int año = 0;
        
        
        System.out.println("Introduzca el año en forma de número:");
        año = scnum.nextInt();
        
        
        if ( (año % 4 == 0 && año % 100 != 0) || año % 400 == 0 ) {
        	System.out.println("El año es bisiesto.");
        }
        
        else {
        	System.out.println("El año no es bisiesto.");
        }
        
        
        scnum.close();
        	
	}

}
