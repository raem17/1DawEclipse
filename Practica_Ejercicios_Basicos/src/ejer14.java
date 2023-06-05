import java.util.*;
public class ejer14 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		
		double vel, fuer, def, drib, pase, valorConj;
		String nom = "";
		
		System.out.println("Jugador, ingrese su nombre.");
		nom = scnum.nextLine();
		
		System.out.println("Ingrese su valor en Velocidad.");
		vel = scnum.nextDouble();
		
		System.out.println("Ingrese su valor en Fuerza.");
		fuer = scnum.nextDouble();
		
		System.out.println("Ingrese su valor en Defensa.");
		def = scnum.nextDouble();
		
		System.out.println("Ingrese su valor en Dribling.");
		drib = scnum.nextDouble();
		
		System.out.println("Ingrese su valor en Pase.");
		pase = scnum.nextDouble();
		
		valorConj = (vel + fuer + def + drib + pase) / 5;
		
		System.out.println(nom + ", su valor conjunto es: " + valorConj);
		
		scnum.close();
		sctxt.close();
		
	}

}
