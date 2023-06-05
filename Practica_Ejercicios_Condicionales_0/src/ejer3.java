import java.util.*;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double imp = 0;
		double tot = 0;
		
		
		System.out.println("Introduzca el importe de su compra: ");
		imp = scnum.nextDouble();
		
		
		if (imp>150) {
			
			tot = imp - (imp * 0.23); // Se le aplica un descuento del 23% al producto
			System.out.println("El importe de tu compra se queda en " + tot + "€ con el 23% de descuento.");
		}
		
		else {
			
			System.out.println("El importe de tu compra no es superior a 150€, por lo que no se te aplicara ningún descuento.");
		}
		
		scnum.close();
		
	}

}
