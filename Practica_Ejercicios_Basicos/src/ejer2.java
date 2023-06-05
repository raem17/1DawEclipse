import java.util.*;
public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		String NomApe = "";
		int edad = 0;
		String tel = "";
		
		System.out.println("Introduzca su nombre.");
		NomApe = sctxt.nextLine();
		
		System.out.println("Introduzca su edad.");
		edad = scnum.nextInt();
		
		System.out.println("Introduzca su teléfono.");
		tel = sctxt.nextLine();
		
		System.out.println("Su nombre es " + NomApe + ", tiene " + edad + " años " + "y su teléfono es " + tel);
		scnum.close();
		sctxt.close();
	}

}
