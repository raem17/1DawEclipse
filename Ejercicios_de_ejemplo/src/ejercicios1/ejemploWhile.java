package ejercicios1;

import java.util.Scanner;

public class ejemploWhile {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String respuesta = "";
	
		
		respuesta = "S";
		
		
		while (respuesta.equalsIgnoreCase("S")) {
			System.out.println("23");
			System.out.println("¿Le gustaría volver a ver el 23? (S/N):");
			respuesta = sctxt.nextLine();
		}
		
		sctxt.close();
	}

}
