

import java.util.Scanner;

public class condicionales_dobles_2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int num = 0;
		
		
		System.out.println("Introduzca el número:");
		num = scnum.nextInt();
		
		
		if ( (num > 10 && num < 20) || (num > 50 && num < 60) || (num == 1000) ) {
			System.out.println("Premio!!!");
		}
		
		
		scnum.close();
	}

}