import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        double num = 0;
        
        System.out.println("Introduzca un número:");
        num = scnum.nextDouble();
        
        
        if (num > 0 && num > 100) {
        	System.out.println("Es mi número.");
        }
        
        scnum.close();
	}

}
