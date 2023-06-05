import java.util.*;

public class ejer2 {
	
	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double nota1 = 0;
		double nota2 = 0;
		
		
		System.out.println("Introduzca la primera nota: ");
		nota1 = scnum.nextDouble();
		
		System.out.println("Introduzca la segunda nota: ");
		nota2 = scnum.nextDouble();
		
		
		if (nota1 > nota2) {
			System.out.println("La primera nota es mejor que la segunda.");
		}
		
		else if (nota1 < nota2) {
			System.out.println("La segunda nota es mejor que la primera.");
		}
		
		else {
			System.out.println("Las notas son iguales.");
		}
		
		scnum.close();
		
	}
}
