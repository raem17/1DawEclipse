import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {

		Scanner sctxt = new Scanner( System.in );
		
        String nombre1 =  "";
        String nombre2 =  "";
        String nombre3 =  "";
        String nombre4 =  "";    
        
        
        System.out.println("Introduzca el nombre 1:");
        nombre1 = sctxt.nextLine();
        
        System.out.println("Introduzca el nombre 2:");
        nombre2 = sctxt.nextLine();
        
        System.out.println("Introduzca el nombre 3:");
        nombre3 = sctxt.nextLine();
        
        System.out.println("Introduzca el nombre 4:");
        nombre4 = sctxt.nextLine();
        
        
        if (nombre1.equalsIgnoreCase("Carlitos") || nombre2.equalsIgnoreCase("Carlitos") || nombre3.equalsIgnoreCase("Carlitos") || nombre4.equalsIgnoreCase("Carlitos")) {
        	System.out.println("Tenemos algún Carlitos");
        	if (nombre1.equalsIgnoreCase("Fede") || nombre2.equalsIgnoreCase("Fede") || nombre3.equalsIgnoreCase("Fede") || nombre4.equalsIgnoreCase("Fede")) {
        		System.out.println("Fede y Carlitos bros");
        	}
        }
        
        else if (nombre1.equalsIgnoreCase("Fede") && nombre2.equalsIgnoreCase("Fede") && nombre3.equalsIgnoreCase("Fede") && nombre4.equalsIgnoreCase("Fede")) {
        	System.out.println("Team Fede");
        }
        
                
        sctxt.close();

	}

}