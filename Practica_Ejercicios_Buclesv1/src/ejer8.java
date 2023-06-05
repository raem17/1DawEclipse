import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ejer8 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		int num = 0;
		int numeroRandom = ThreadLocalRandom.current().nextInt(1, 101);
		
		do {
			
		    System.out.println("Introduzca un número entero del 1 al 100.: ");
		    num = scnum.nextInt();
		    
		    if (num == -1) {
		    	 System.exit(0);
		    }
		    
		    if (numeroRandom > num) {
		        System.out.println("El número introducido es menor al número secreto.");
		    } 
		    
		    else if (numeroRandom < num) {
		        System.out.println("El número introducido es mayor al número secreto.");
		    }
		    
		} while (numeroRandom != num);
		
		System.out.println("Has acertado, el número secreto es el: " + numeroRandom);
		
		scnum.close();

	}	

}
