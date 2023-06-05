import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		int cont = 0;
		
		
		do {

			System.out.println("Introduzca un nombre:");
			nombre = sctxt.nextLine();
			
			cont++;
			
		} while (!nombre.equalsIgnoreCase("Pablito Escobar"));
		
		System.out.println("Nombres introducidos: " +cont);
		System.out.println("Plata o plomo.");
		
		sctxt.close();
	}

}
