import java.util.*;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String tarjeta1 = "";
		String tarjeta2 = "";
		String tarjeta3 = "";
		String tarjeta4 = "";
		String tarjeta5 = "";
		
		System.out.println("Introduzca el número de su tarjeta de crédito 1.");
		tarjeta1 = sctxt.nextLine();
		
		System.out.println("Introduzca el número de su tarjeta de crédito 2.");
		tarjeta2 = sctxt.nextLine();
		
		System.out.println("Introduzca el número de su tarjeta de crédito 3.");
		tarjeta3 = sctxt.nextLine();
		
		System.out.println("Introduzca el número de su tarjeta de crédito 4.");
		tarjeta4 = sctxt.nextLine();
		
		System.out.println("Introduzca el número de su tarjeta de crédito 5.");
		tarjeta5 = sctxt.nextLine();
		
		
		System.out.println("El número de su tarjeta de crédito 5 es " + tarjeta5);
		
		System.out.println("El número de su tarjeta de crédito 4 es " + tarjeta4);
		
		System.out.println("El número de su tarjeta de crédito 3 es " + tarjeta3);
		
		System.out.println("El número de su tarjeta de crédito 2 es " + tarjeta2);
		
		System.out.println("El número de su tarjeta de crédito 1 es " + tarjeta1);
		
		sctxt.close();
		
	}

}
