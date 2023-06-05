import java.util.*;
public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double num = 0;
		
		
		System.out.println("Introduzca un número:");
		num = scnum.nextDouble();
		
		
		if (num == 0) {
			System.out.println("Es el 0.");
		}
		
		else {
			System.out.println("No es el 0.");
		}
			
		
		scnum.close();
		
	}

}