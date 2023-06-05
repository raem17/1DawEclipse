package ejercicios1;

import java.util.Scanner;

public class ejemploDoWhile0 {

	public static void main(String[] args) {

		Scanner sctxt = new Scanner (System.in);
		String resp = "";
		
		
		do {
			
			System.out.println("nº 23");
			
			System.out.println("¿Desea volver a ver el 23?");
			resp = sctxt.nextLine();
			
		} while (resp.equalsIgnoreCase("si"));
		
		sctxt.close();
		
	}

}
