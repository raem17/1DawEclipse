import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);	
		Scanner sctxt = new Scanner (System.in);
		double ruedasCompradas = 0;
		double precioCompra = 0;
		String nombre = "";
		
		
		System.out.println("Introduzca su nombre:");
		nombre = scnum.nextLine();
		
		System.out.println("Introduzca la cantidad de ruedas que va a comprar:");
		ruedasCompradas = scnum.nextInt();
		
		
		if (ruedasCompradas <= 12) {
			
			precioCompra = (250 - (250 * 0.2)) * ruedasCompradas;
			System.out.println(nombre + " el coste de su compra es: " + precioCompra + "€");
		}
		
		else if (ruedasCompradas > 12) {
			
			precioCompra = (220 - (220 * 0.25)) * ruedasCompradas;
			System.out.println(nombre + " el coste de su compra es: " + precioCompra + "€");
		}
		
		
		scnum.close();
		sctxt.close();
	
	}

}
