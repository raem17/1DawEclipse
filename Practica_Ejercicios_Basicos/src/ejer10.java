import java.util.*;
public class ejer10 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		
		String nomProd = "";
		double precioProd = 0;
		double resultado;
		
		System.out.println("Introduzca el nombre del producto.");
		nomProd = sctxt.nextLine();
		
		System.out.println("Introduzca el precio del producto.");
		precioProd = scnum.nextDouble();
		
		resultado = precioProd + (precioProd * 0.21); // Se le aplica una suma del 21% al producto 
		
		System.out.println("El producto " + nomProd + " cuesta " + resultado + "€ con el 21% del IVA.");
		
		scnum.close();
		sctxt.close();
	}

}