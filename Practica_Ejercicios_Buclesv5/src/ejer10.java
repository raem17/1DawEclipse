import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		int edad = 0;
		int contEdades = 0;
		int acuEdades = 0;
		int mediaEdades = 0;
		
		double altura = 0;
		double contAlturas = 0;
		double acuAlturas = 0;
		double mediaAlturas = 0;
		
		int contMayor18 = 0;
		int contMayor175 = 0;
		
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Introduzca su edad:");
			edad = scnum.nextInt();
			
			System.out.println("Introduzca su altura en cm:");
			altura = scnum.nextDouble();
			
			if (edad > 18) {
				contMayor18++;
			}
			
			if (altura > 175) {
				contMayor175++;
			}
			
			contEdades++;
			acuEdades = acuEdades + edad;
			
			contAlturas++;
			acuAlturas = acuAlturas + altura;	
		}
		
		mediaEdades = acuEdades / contEdades;
		
		mediaAlturas = (acuAlturas / contAlturas) / 100;
		
		
		System.out.println("Edad media: " + mediaEdades + " años.");

		System.out.println("Estatura media: " + mediaAlturas + " m.");
		
		System.out.println("Alumnos mayores de 18 años: " + contMayor18);
		
		System.out.println("Alumnos que miden más de 1.75 m: " + contMayor175);
		
		
		scnum.close();
	}

}
