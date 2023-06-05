import java.util.*;

public class ejer5 {

	public static void main(String[] args) {
		
		// Declaracion de objetos y variables
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		
		String NomApe = "";
		String dom = "";
		String tel = "";
		String email = "";
		String fechaNacimiento = "";
		String dni = "";
		String tarjeta = "";
		
		int edad = 0;
		
		double salario = 0;
		double peso = 0;
		
	// Se pide distintos tipos de datos al usuario
		
		// string
		
		System.out.println("Introduzca su nombre.");
		NomApe = sctxt.nextLine();

		System.out.println("Introduzca su domicilio.");
		dom = sctxt.nextLine();
		
		System.out.println("Introduzca su número de teléfono.");
		tel = sctxt.nextLine();
		
		System.out.println("Introduzca su email.");
		email = sctxt.nextLine();
		
		System.out.println("Introduzca su fecha de nacimiento.");
		fechaNacimiento = sctxt.nextLine();
		
		System.out.println("Introduzca su dni.");
		dni = sctxt.nextLine();
		
		System.out.println("Introduzca su número de tarjeta.");
		tarjeta = sctxt.nextLine();
		
		//int
		
		System.out.println("Introduzca su edad.");
		edad = scnum.nextInt();
		
		//double
		
		System.out.println("Introduzca su salario.");
		salario = scnum.nextDouble();
		
		System.out.println("Introduzca su peso.");
		peso = scnum.nextDouble();
		
		// Se imprimen los datos en pantalla
		
		System.out.println("Nombre: " + NomApe);
		
		System.out.println("Domicilio: " + dom);
		
		System.out.println("Teléfono: " + tel);
		
		System.out.println("Email: " + email);
		
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		
		System.out.println("DNI: " + dni);
		
		System.out.println("Número de tarjeta de crédito: " + tarjeta);
		
		System.out.println("Edad: " + edad);
		
		System.out.println("Salario: " + salario);
		
		System.out.println("Peso: " + peso);
		
		//cierre de los scanner
		scnum.close();
		sctxt.close();
	}

}
