import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner(System.in);
		int num = 0;
		
		
		System.out.println("Introduzca un número entero:");
	    num = scnum.nextInt();
	     
	    
	    if (num > 0) { // Número positivo
	    	
	    	System.out.println("Los números comprendidos entre " + num + " y 0 son: ");
	    	
	    	num = num -1;
	    	
	    	
	    	for (int i = num; i > 0; i--) {
	        	
	            System.out.print(i + ", ");
	        }
	    }
	    
	    else if (num < 0) { // Número negativo
	    	
	    	System.out.println("Los números comprendidos entre " + num + " y 0 son: ");
	    	
	    	num = num +1;
	    	
	    	
	    	for (int i = num; i < 0; i++) {
	        	
	            System.out.print(i + ", ");
	        }
	    }
	    
	    else {
	    	System.out.println("Ha introducido el 0.");
	    }
        
        
        scnum.close();
	}	

}
