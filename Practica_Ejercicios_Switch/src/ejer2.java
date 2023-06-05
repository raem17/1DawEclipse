import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
		Scanner sctxt = new Scanner( System.in );
		
		//String nombre = "";
		//String apellidos = "";
		double sueldo = 0;
		int opc = 0;
        
		
		/*System.out.println("Introduzca su nombre:");
		nombre = scnum.nextLine();
		
		System.out.println("Introduzca sus apellidos:");
		apellidos = scnum.nextLine();*/
		
		System.out.println("Introduzca su sueldo:");
		sueldo = scnum.nextDouble();
        
		
		System.out.println("Elija una opción del menú:");
        System.out.println("");
        System.out.println("1: Mostrar su sueldo anual.");
        System.out.println("2: Mostrar su finiquito de despido.");
        System.out.println("3: Salir.");
        
        opc = scnum.nextInt();
		
        
        switch (opc) {
        
        case 1:
        	
        	double sueldoAnual = 0;
        	 	
            sueldoAnual = sueldo * 12;
             
            System.out.println("Su sueldo anual es: " + sueldoAnual + " €");
            
        	break;
        	
        case 2:
        	
        	int meses = 0;
            double finiquito = 0;
            
            
            System.out.println("Introduzca los meses trabajados en la empresa:");
            meses = scnum.nextInt();
                       
            finiquito = meses * (sueldo * 0.5);
                        
            System.out.println("Su finiquito es: " + finiquito + " €");
            
        	break;
        	
        case 3:
        	
        	System.exit(opc);
            
        	break;
  
        }
        
        scnum.close();
        sctxt.close();
	}

}
