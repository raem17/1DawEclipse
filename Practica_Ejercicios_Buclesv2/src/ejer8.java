import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		Scanner scnum = new Scanner (System.in);
		
		String respuesta = "";
		int edad = 0;
		int sumaEdades = 0;
		
		
		do {
			
			System.out.println("Introduzca una edad:");
			edad = scnum.nextInt();
			
			sumaEdades = (sumaEdades + edad);
			
			System.out.println("¿Desea seguir introduciendo edades (S/N)?");
			respuesta = sctxt.nextLine();
			
		} while (respuesta.equalsIgnoreCase("S"));
		
		
		System.out.println("La suma de todas las edades es: " + sumaEdades);
		
		sctxt.close();
		scnum.close();
		
	}

}
