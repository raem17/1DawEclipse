import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        double num = 0;
        
        System.out.println("Introduzca un número:");
        num = scnum.nextDouble();
        
        
        if (num > 100 && num < 200) {
        	System.out.println("El número está comprendido entre el 100 y el 200.");
        }
        
        scnum.close();
	}

}
