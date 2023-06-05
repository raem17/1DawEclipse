
import java.util.*;
public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double ang1, ang2, ang3, ang4, seno1, seno2, seno3, seno4; 
		
		
		System.out.println("Introduzca el primer ángulo.");
		ang1 = scnum.nextDouble();

		System.out.println("Introduzca el segundo ángulo.");
		ang2 = scnum.nextDouble();
		
		System.out.println("Introduzca el tercer ángulo.");
		ang3 = scnum.nextDouble();
		
		System.out.println("Introduzca el cuarto ángulo.");
		ang4 = scnum.nextDouble();
		
		
		seno1 = Math.sin(ang1);
		
		seno2 = Math.sin(ang2);
		
		seno3 = Math.sin(ang3);
		
		seno4 = Math.sin(ang4);
		
		
		System.out.println("El seno de " + ang1 + " es: " + seno1);
		
		System.out.println("El seno de " + ang2 + " es: " + seno2);
		
		System.out.println("El seno de " + ang3 + " es: " + seno3);
		
		System.out.println("El seno de " + ang4 + " es: " + seno4);
		
		
		scnum.close();
	}

}
