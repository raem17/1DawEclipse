package ejercicios1;
import java.util.Scanner;

public class ejemplo_switch {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
		Scanner sctxt = new Scanner( System.in );
		
        /*int num = 0;
        
        
        System.out.println("Introduzca un número:");
        num = scnum.nextInt();*/
        
        
        /*switch (num) {
        
        case 1:
        	System.out.println("Es lunes.");
        	break;
        
        case 2:
        	System.out.println("Es martes.");
        	break;
        	
        case 3:
        	System.out.println("Es miércoles.");
        	break;
        	
        case 4:
        	System.out.println("Es jueves.");
        	break;
        	
        case 5:
        	System.out.println("Es viernes.");
        	break;
        	
        case 6:
        	System.out.println("Es sábado.");
        	break;
        	
        case 7:
        	System.out.println("Es domingo.");
        	break;
        	
        default:
        	System.out.println("Día erróneo.");
        	break;
        	
        } */
       
        char letra;
        String caracter = "";
        System.out.println("Introduzca un caracter:");
        caracter = sctxt.nextLine();
        
        // Pasamos el String a char
        letra = caracter.charAt(0);
        
        
        switch (letra) {
        
        case 'a':
        	System.out.println("Has pulsado la a.");
        	break;
        
        case'A':
        	System.out.println("Has pulsado la A.");
        	break;
        	
        case '9':
        	System.out.println("Has pulsado el 9.");
        	break;
        	       	
        default:
        	System.out.println("a.");	
        	break;
        	
        }
        
        scnum.close();
        sctxt.close();
	}

}
