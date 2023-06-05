import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		int numMenor = 0;
		int numMayor = 0;
		
		
		System.out.println("Introduzca el número menor:");
		numMenor = scnum.nextInt();
    	
		System.out.println("Introduzca el número mayor:");
		numMayor = scnum.nextInt();
		
		System.out.print("Los números comprendidos entre " + numMenor + " y " + numMayor + " son: ");
		
		numMenor++;
		
		
		for (int i=numMenor; i<numMayor; i++) {
			System.out.print(i + " ");
		}
		
		
		scnum.close();
		sctxt.close();
	}

}
