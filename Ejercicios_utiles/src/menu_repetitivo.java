import java.util.Scanner;

public class menu_repetitivo {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
		int opc = 0; 
        int num1 = 0;
        int num2 = 0;
        
    	System.out.println("Introduzca el num1 :");
		num1 = scnum.nextInt();
		
		System.out.println("Introduzca el num1 :");
		num2 = scnum.nextInt();
		
		
        do {

        	System.out.println("Elija una opción del menú:");
            System.out.println("");
            System.out.println("1: Suma numeros.");
            System.out.println("2: Resta numeros.");;
            System.out.println("8: Salir.");
            
           
            opc = scnum.nextInt();
            
            
            switch (opc) {
            
            case 1:
            	
            	int suma = num1 + num2;
            	System.out.println(suma);
            	System.out.println("");
            	               
            	break;
            	
            case 2:
            	
            	int resta = num1 - num2;
            	System.out.println(resta);
            	System.out.println("");
                
            	break;
            }
        }while (opc != 8);
        
      
        scnum.close();
	}

}
