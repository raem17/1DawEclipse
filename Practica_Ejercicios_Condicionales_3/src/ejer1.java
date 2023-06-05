import java.util.Scanner;

public class ejer1 {
	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int jugadores = 0;
		int presupuesto = 0;
		int comunitarios = 0;
		int extranjeros = 0;
		
		System.out.println("Introduzca el número de jugadores:");
		jugadores = scnum.nextInt();
		
		System.out.println("Introduzca el número de jugadores comunitarios:");
		comunitarios = scnum.nextInt();
		
		System.out.println("Introduzca el número de jugadores extranjeros:");
		extranjeros = scnum.nextInt();
		
		
		presupuesto = jugadores * 2000000;
		
		if (comunitarios > 5) {
			presupuesto = presupuesto + 5000000;
		}
		
		if (extranjeros >= 2) {
			presupuesto = presupuesto + 5000000;
		}
		
		
		System.out.println("Coste de la plantilla: " + presupuesto + "€");
		
		
		scnum.close();
	}
}
