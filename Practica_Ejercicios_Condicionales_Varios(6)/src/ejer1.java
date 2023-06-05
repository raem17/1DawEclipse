import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {

		Scanner scnum = new Scanner( System.in );
		Scanner sctxt = new Scanner( System.in );
		
        double edad = 0;
        String nombre =  "";
        /*int mes = 0;*/ // Innecesario
        double sueldo = 0;
        
        
        System.out.println("Introduzca su nombre:");
        nombre = sctxt.nextLine();
        
        System.out.println("Introduzca su edad:");
        edad = scnum.nextInt();
        
        /*System.out.println("Introduzca su mes de nacimiento en forma de número:");
        mes = scnum.nextInt();*/
        
        System.out.println("Introduzca su sueldo:");
        sueldo = scnum.nextDouble();
        
        if (nombre.equalsIgnoreCase("Enrique") && edad >= 18 ) {
        	sueldo = sueldo * 0.15;
        	System.out.println("El 15% de su sueldo es: " + sueldo + "€");
        }
        
        else if (!nombre.equalsIgnoreCase("Enrique")) {
        	sueldo = sueldo * 0.9;
        	System.out.println("El 90% de su sueldo es: " + sueldo + "€");
        }
        
        
        System.out.println("Tiene: " + edad + " años.");
        
        
        scnum.close();
        sctxt.close();

	}

}
