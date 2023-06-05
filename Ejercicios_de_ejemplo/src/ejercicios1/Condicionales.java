package ejercicios1;
import java.util.*;
public class Condicionales {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int edad = 0;
		
		System.out.println("Introduzca la edad: ");
		edad = scnum.nextInt();
		
		if (edad>=18) {
			System.out.println("Eres mayor de edad.");
		} 
		
		else if (edad<18) {
			System.out.println("Eres menor de edad.");
		}
		
		if (edad<10) {
			System.out.println("Tienes menos de 10 años.");
		}
		
		scnum.close();
	}

}
