import java.util.*;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String NomApe = "";
		
		System.out.println("Introduzca su nombre y apellidos.");
		NomApe = sctxt.nextLine();
		
		System.out.println("Su nombre es " + NomApe);
		sctxt.close();

	}

}
