import java.util.Scanner;

public class ejer11 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
        int num = 0;

        System.out.println("Introduzca un número entero: ");
        num = scnum.nextInt();

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Es múltiplo de 2 o de 3.");
        } 
        
        else {
            System.out.println("No es múltiplo de 2 o de 3.");                                                     
        }
        
        
        scnum.close();
        
	}

}
