import java.util.*;
public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double salarioM1 = 0;
		double salarioM2 = 0;
		double salarioM3 = 0;
		double salarioM4 = 0;
		double res = 0;
		
		
		System.out.println("Introduzca el primer salario mensual:");
		salarioM1 = scnum.nextDouble();
		
		System.out.println("Introduzca el segundo salario mensual:");
		salarioM2 = scnum.nextDouble();
		
		System.out.println("Introduzca el tercer salario mensual:");
		salarioM3 = scnum.nextDouble();
		
		System.out.println("Introduzca el cuarto salario mensual:");
		salarioM4 = scnum.nextDouble();
		
		
		res = salarioM1 + salarioM2 + salarioM3 + salarioM4;
		
		
		if (res > 416.66) {
			System.out.println("La suma de todos los salarios suman más de 5000€ anuales.");
		}
		
		else if (res < 416.66) {
			System.out.println("La suma de todos los salarios no suman más de 5000€ anuales.");
		}
		
		else {
			System.out.println("La suma de todos los salarios es igual a 5000€ anuales (416,66€ mensuales).");
		}
			
		
		scnum.close();
		
	}

}