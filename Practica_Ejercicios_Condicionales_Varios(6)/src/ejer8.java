import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        int H = 0;
        int M = 0;
        int S = 0;

        
        System.out.println("Introduzca la hora en forma de número:");
        H = scnum.nextInt();
        
        System.out.println("Introduzca los minutos en forma de número:");
        M = scnum.nextInt();
        
        System.out.println("Introduzca los segundos en forma de número:");
        S = scnum.nextInt();
        

        if (H >= 0 && H < 24 && M >= 0 && M <= 59 && S >= 0 && S <= 59) {
        	System.out.println("Es una hora válida.");
        }
        
        
        scnum.close();
	}

}
