import java.util.*;
public class ejer17 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double nota = 0;
		
		
		System.out.println("Introduzca una nota entre 0 y 10:");
		nota = scnum.nextDouble();
		
		
		if ((nota >= 0) && (nota <= 4)) {
			System.out.println("Insuficiente.");
		}
		
		else if (nota == 5) {
			System.out.println("Suficiente.");
		}
		
		else if (nota == 6) {
			System.out.println("Bien.");
		}
		
		else if ((nota >= 7) && (nota <=8)) {
			System.out.println("Notable.");
		}
		    
		else if ((nota >= 9) && (nota <= 10)) {
			System.out.println("Sobresaliente.");
		}
			
		
		scnum.close();
		
	}

}