import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		
		String nomApe = "";
		double sueldoMen = 0;
		double sueldoAn = 0;
		int edad = 0;
		int numHijos = 0;
		int antiguedad = 0;
		int unidadesAntiguedad = 0;
		int plusAntiguedad = 0;
		double sueldoMenSinIRPF = 0;
		double sueldoAnSinIRPF = 0;
		
		
		System.out.println("Introduzca su nombre:");
		nomApe = scnum.nextLine();
		
		System.out.println("Introduzca su sueldo base mensual:");
		sueldoMen = scnum.nextDouble();
		
		System.out.println("Introduzca sus años de antigüedad:");
		antiguedad = scnum.nextInt();
		
		System.out.println("Introduzca su edad:");
		edad = scnum.nextInt();
		
		System.out.println("Introduzca su número de hijos:");
		numHijos = scnum.nextInt();
		
		
		if (numHijos > 2) {
			sueldoMen = sueldoMen + (100 / 3); //mensual
		}
		
		if (numHijos == 0) {
			sueldoMen = sueldoMen - (50 / 12); //mensual
		}
		
		if (edad > 50 && edad < 60) {
			sueldoMen = sueldoMen + (sueldoMen * 0.1);
		}
		
		
		unidadesAntiguedad = antiguedad/5;

		plusAntiguedad = unidadesAntiguedad * 45;
		
		
		sueldoMen = sueldoMen + (plusAntiguedad / 12);
		
		sueldoAn = sueldoMen * 12 + plusAntiguedad;
		
		sueldoMenSinIRPF = sueldoMen - (sueldoMen * 0.19);
		
		sueldoAnSinIRPF = sueldoMenSinIRPF * 12;
		
		
		System.out.println(nomApe + " su sueldo anual (con el 19% de irpf) es: " + sueldoAn + "€. Y su sueldo mensual (con el 19% de irpf) es: " + sueldoMen + "€");
		
		System.out.println(nomApe + " su sueldo anual (sin el 19% de irpf) es: " + sueldoAnSinIRPF + "€. Y su sueldo mensual (sin el 19% de irpf) es: " + sueldoMenSinIRPF + "€");
		
		
		scnum.close();
		sctxt.close();
	}

}
