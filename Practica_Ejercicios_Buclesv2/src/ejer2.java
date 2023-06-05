import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		int num = 0;
		
		
		System.out.println("Introduzca un número entero comprendido entre 1 y 10:");
		num = scnum.nextInt();
    	
		
		if (num > 0 && num < 11) {
					
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "x" + i);
			}
			
		}
		
		
		scnum.close();
		
	}

}
