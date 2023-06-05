import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		int edad = 0;
		
		
		System.out.println("Introduzca su nombre:");
		nombre = sctxt.nextLine();
		
		System.out.println("Introduzca su edad:");
		edad = sctxt.nextInt();
		
		
		if (edad >= 30 && nombre.equalsIgnoreCase("Manuel")) {
			System.out.println("Enhorabuena.");
		}
		
		
		scnum.close();
		sctxt.close();
	}

}
