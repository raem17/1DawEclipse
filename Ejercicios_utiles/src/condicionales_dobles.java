

import java.util.Scanner;

public class condicionales_dobles {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		int edad = 0;
		String nom = "";
		
		
		System.out.println("Introduzca su edad:");
		edad = scnum.nextInt();
		
		System.out.println("Introduzca su nombre:");
		nom = sctxt.nextLine();
		
		
		if (edad > 17 && nom.equalsIgnoreCase("Antonio") ) {
			System.out.println("Premio!!!");
		}
		
		
		scnum.close();
		sctxt.close();
	}

}
