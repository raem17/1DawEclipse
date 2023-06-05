import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		
		int edad = 0;
		int contMayores = 0;
		int contMenores = 0;
		int contJubilados = 0;
		
		
        for (int i = 0;i < 20;i++) {  
        	
        	System.out.println("Introduzca su edad:");
        	edad = scnum.nextInt();
        	
        	if (edad > 17 && edad < 66) {
        		contMayores++;
        	}
        	
        	if (edad < 18) {
        		contMenores++;
        			
            } 
        	
        	if (edad >= 66) {
        		contJubilados++;
            }
        }
        
        System.out.println("Usuarios mayores de edad: " + contMayores);
        
        System.out.println("Usuarios menores de edad: " + contMenores);
        
        System.out.println("Usuarios jubilados: " + contJubilados);
        
        
        scnum.close();
        sctxt.close();
	}

}
