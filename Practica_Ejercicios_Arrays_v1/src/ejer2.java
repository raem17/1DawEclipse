import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String [] regalos = new String [8];
		
		for (int i = 0; i < regalos.length; i++) {
			System.out.println("Introduzca su regalo nº " + (i + 1));
			regalos [i] = sctxt.nextLine();
		}
		
		
		System.out.println("Su lista de regalos es: ");
		for (int i = 0; i < regalos.length; i++) {
			System.out.println("Regalo nº" + (i + 1) + ": " + regalos[i]);
		}
		
		sctxt.close();
	}

}
