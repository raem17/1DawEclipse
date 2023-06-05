import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		
		
// Zapato		
		System.out.println("Introduzca la marca del zapato:");
		String marcaZapato = sctxt.nextLine();
		
		System.out.println("Introduzca el modelo:");
		String modeloZapato = sctxt.nextLine();
		
		System.out.println("Introduzca el precio:");
		double precioZapato = scnum.nextDouble();
		
		System.out.println("¿Tiene cordones?:");
		String resp = sctxt.nextLine();
		boolean conCordones = false;
		
		
		if (resp.equalsIgnoreCase("SI")) {
			conCordones = true;
		}
		
		
		Zapato miZapato = new Zapato(marcaZapato, modeloZapato, precioZapato, conCordones);
		
		
// Arcoiris
		System.out.println("Introduzca el tipo de arcoiris:");
		String tipoArcoris = sctxt.nextLine();
		
		
		System.out.println("¿Es rojo?:");
		resp = sctxt.nextLine();
		boolean rojo = false;
		
		
		if (resp.equalsIgnoreCase("SI")) {
			rojo = true;
		}
		
		
		System.out.println("¿Es naranja?:");
		resp = sctxt.nextLine();
		boolean naranja = false;
		
		
		if (resp.equalsIgnoreCase("SI")) {
			naranja = true;
		}
		
		
		System.out.println("¿Es amarillo?:");
		resp = sctxt.nextLine();
		boolean amarillo = false;
		
		
		if (resp.equalsIgnoreCase("SI")) {
			amarillo = true;
		}
		
		
		System.out.println("¿Es verde?:");
		resp = sctxt.nextLine();
		boolean verde = false;
		
		
		if (resp.equalsIgnoreCase("SI")) {
			verde = true;
		}
		
		
		System.out.println("¿Es azul?:");
		resp = sctxt.nextLine();
		boolean azul = false;
		
		
		Arcoiris miArcoiris = new Arcoiris(tipoArcoris, rojo, naranja, amarillo, verde, azul);
		
		
// Estrella fugaz
		System.out.println("Introduzca la luminosidad de la estrella fugaz:");
		Double luminosidad = scnum.nextDouble();
		
		System.out.println("Introduzca el tamaño de la estrella fugaz:");
		Double tamaño = scnum.nextDouble();
		
		System.out.println("Introduzca la velocidad de la estrella fugaz:");
		Double velocidad = scnum.nextDouble();
		
		System.out.println("Introduzca el color de la estrella fugaz:");
		String color = sctxt.nextLine();

		
		Estrella_fugaz miEstrella = new Estrella_fugaz(luminosidad, tamaño, velocidad, color);
		
		
// Flatulencia
		System.out.println("Introduzca el tipo de flatulencia:");
		String tipoFlatulencia = sctxt.nextLine();
		
		System.out.println("Introduzca el olor de la flatulencia:");
		String olor = sctxt.nextLine();
		
		System.out.println("Introduzca la duración de la flatulencia:");
		double duración = scnum.nextDouble();
		
		System.out.println("Introduzca la presión sonora de la flatulencia:");
		double presion_Sonora = scnum.nextDouble();
		
		
		Flatulencia flatulenciaDePepe = new Flatulencia(tipoFlatulencia, olor, tamaño, velocidad);
		
		scnum.close();
		sctxt.close();
	}

}
