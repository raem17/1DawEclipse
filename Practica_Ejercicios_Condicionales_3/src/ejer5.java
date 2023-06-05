import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double sueldoMen = 0;
		double irpf = 0;
		
		
		System.out.println("Introduzca su sueldo mensual:");
		sueldoMen = scnum.nextDouble();
		
		
		if (sueldoMen < 700) {
			irpf = sueldoMen * 0.02;
		}
		
		if (sueldoMen >= 700 && sueldoMen <= 1000) {
			irpf = sueldoMen * 0.04;
		}
		
		if (sueldoMen > 1000 && sueldoMen < 2000) {
			irpf = sueldoMen * 0.1;
		}
		
		if (sueldoMen >= 2000) {
			irpf = sueldoMen * 0.45;
		}
		
		
		System.out.println("El IRPF que paga es: " + irpf);
		
		
		scnum.close();
	}

}
