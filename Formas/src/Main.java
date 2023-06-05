import java.util.Scanner;

/**
 * Main que contiene un programa que calcula el area y perimetro de la forma geometrica eligida por el usuario.
 * @author renriquez
 */
public class Main {

	/**
	 * Ejecuta un programa que muestra un menu al usuario. Este menu tiene cuatro opciones, la ultima es salir del menu y cerrar
	 * el programa, las tres primeras calculan el area y perimetro de la figura geometrica correspondiente a la opcion, el usuario
	 * debera introducir los datos necesarios de cada figura por consola.
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		
		
		int opc = 0;
		do {
			System.out.println("Elija la forma geometrica de la que quiere calcular su area y perimetro:\n");
			System.out.println("1. Circulo.");
			System.out.println("2. Cuadrado.");
			System.out.println("3. Triangulo equilatero.");
			System.out.println("4. Salir.");
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1:
				System.out.println("Introduzca el radio del circulo en cm:");
				double radio = scnum.nextDouble();
	
				System.out.println("\nCirculo:");
				System.out.print("Area: " + HallarArea("circulo", radio, 0, 0, 0) + " cm2. " + "Perimetro: " + HallarPerimetro("circulo", radio, 0, 0) + " cm.\n");
				
				break;
			case 2:
				System.out.println("Introduzca el lado del cuadrado en cm:");
				double lado = scnum.nextDouble();
				
				System.out.println("\nCuadrado:");
				System.out.print("Area: " + HallarArea("cuadrado", 0, lado, 0, 0) + " cm2. " + "Perimetro: " + HallarPerimetro("cuadrado", 0, lado, 0) + " cm.\n");
				
				break;
			case 3:
				System.out.println("Introduzca la base del triangulo en cm:");
				double base = scnum.nextDouble();
				
				System.out.println("Introduzca la altura del triangulo en cm:");
				double altura = scnum.nextDouble();
				
				System.out.println("\nTriangulo: ");
				System.out.print("Area: " + HallarArea("triangulo", 0, 0, base, altura) + " cm2. " + "Perimetro: " + HallarPerimetro("triangulo", 0, 0, base) + " cm.\n");
				
				break;
			case 4:  
				System.out.println("Ha salido del programa.");
				
				break;

			default: System.out.println("Opcion incorrecta.");
				break;
			}
		} while (opc != 4);
		
		scnum.close();
	} // Cierre del Main
	
	/**
	 * Calcula y devuelve el area de la figura geometrica recibida por parametro.
	 * @param figura Nombre de la figura geometrica de la cual se va a calcular y devolver su area.
	 * @param radio en cm.
	 * @param lado en cm.
	 * @param base en cm.
	 * @param altura en cm.
	 * @return El area de la figura en cm.
	 */
	public static double HallarArea (String figura, double radio, double lado, double base, double altura) {
		final double pi = 3.14159;
		double area = 0.0;
		
		if (figura.equalsIgnoreCase("circulo")) {
			area = Math.pow(radio, 2) * pi;
		} else if (figura.equalsIgnoreCase("cuadrado")) {
			area = Math.pow(lado, 2);
		} else if (figura.equalsIgnoreCase("triangulo")) {
			area = (base * altura) / 2;
		}
		
		return area;
	}
	
	/**
	 * Calcula y devuelve el perimetro de la figura geometrica recibida por parametro.
	 * @param figura Nombre de la figura geometrica de la cual se va a calcular y devolver su perimetro.
	 * @param radio en cm.
	 * @param lado en cm.
	 * @param base en cm.
	 * @return El perimetro de la figura en cm.
	 */
	public static double HallarPerimetro (String figura, double radio, double lado, double base) {
		final double pi = 3.14159;
		double perimetro = 0.0;
		
		if (figura.equalsIgnoreCase("circulo")) {
			perimetro = 2 * pi * radio;
		} else if (figura.equalsIgnoreCase("cuadrado")) {
			perimetro = 4 * lado;
		} else if (figura.equalsIgnoreCase("triangulo")) {
			perimetro = 3 * base;
		}
		
		return perimetro;
	}
	
} // Cierre de la clase
