import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int veces = 0;
		
		
		System.out.println("Introduzca el número de veces que quiere ver la frase:");
		veces = scnum.nextInt();
    	
		veces = veces *4;
		
		
		for (int i=0; i<veces; i++) {
			System.out.println("We Love Centro Nelson");
		}
		
		
		scnum.close();
	}

}
