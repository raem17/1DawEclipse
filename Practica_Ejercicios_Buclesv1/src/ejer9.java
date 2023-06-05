import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		int num = 0;
		
		
		System.out.println("Introduzca un número entero positivo:");
		num = scnum.nextInt();
	    
	    System.out.println("Numeros del 1 al " + num + ": "); 
	    
	    
        for (int i = 1; i <= num; i++) {
        	
            System.out.print(i + ", ");
        }
        
        scnum.close();
	}

}
