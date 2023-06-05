import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
	
		Scanner scnum = new Scanner (System.in);
		int edad = 0;
		
		
		System.out.println("Introduzca su edad:");
		edad = scnum.nextInt();
    	
			
		for (int i=0; i<edad; i++) {
			System.out.println("Paisano");
		}
		
		
		scnum.close();
	}

}
