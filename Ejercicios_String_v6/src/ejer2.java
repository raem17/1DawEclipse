import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		String fraseResul = "";
		String letraMayus = "";
		
		
		System.out.println("Introduza una frase:");
		frase = sctxt.nextLine();
		
		String [] subFrases = frase.split(" ");
		
		
		for (int i = 0; i < subFrases.length; i++) {
			letraMayus = subFrases[i].charAt(0) + "";
			letraMayus = letraMayus.toUpperCase();
			
			fraseResul = fraseResul + letraMayus + subFrases [i].substring(1) + " ";
		}
		
		
		System.out.println(fraseResul);
		
		sctxt.close();
	}

}