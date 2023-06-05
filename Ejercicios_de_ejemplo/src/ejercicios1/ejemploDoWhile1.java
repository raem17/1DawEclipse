package ejercicios1;

import java.util.Scanner;

public class ejemploDoWhile1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		
		
		do {

			System.out.println("Introduzca un nombre:");
			nombre = sctxt.nextLine();
			
		} while (!nombre.equalsIgnoreCase("Antonio"));
		
		sctxt.close();
		
	}

}
