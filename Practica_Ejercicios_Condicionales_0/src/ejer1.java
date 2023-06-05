import java.util.*;
public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double nota = 0;
		
		
		System.out.println("Introduzca su nota: ");
		nota = scnum.nextDouble();
		
		if (nota >= 5) {
			System.out.println("Estás aprobado.");
		}
		
		else if (nota<5) {
			System.out.println("Estás suspenso.");
		}
		
		scnum.close();
		
	}

}
