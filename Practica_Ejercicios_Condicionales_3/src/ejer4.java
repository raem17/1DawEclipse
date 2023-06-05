import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		
		
		System.out.println("Introduzca nombre:");
		nombre = sctxt.nextLine();
		
		
		if ( nombre.equalsIgnoreCase("Antonio") || nombre.equalsIgnoreCase("Pepe") || nombre.equalsIgnoreCase("Juan") || nombre.equalsIgnoreCase("Carlos") ) {
			System.out.println("Estás expulsado del centro.");
		}
		
		else {
			System.out.println("Bienvenido.");
		}
		
		
		sctxt.close();
	}

}
