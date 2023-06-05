import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
		int opc = 0;
        
          	
        System.out.println("Elija una opción del menú:");
        System.out.println("");
        System.out.println("1: Calcular el área de un cuadrado.");
        System.out.println("2: Calcular el área de un triángulo.");
        System.out.println("3: Calcular el área de un círculo.");
        System.out.println("4: Salir."); 
       
        opc = scnum.nextInt();
        
        
        switch (opc) {
        
        case 1:
        	
        	double ladoCuadrado = 0;
            double areaCuadrado = 0;
            
            
            System.out.println("Introduzca el lado del cuadrado en cm:");
            ladoCuadrado = scnum.nextDouble();
            
            
            areaCuadrado = ladoCuadrado * ladoCuadrado;
            
            
            System.out.println("El área de un cuadrado es: " + areaCuadrado + " cm2");
            
        	break;
        	
        case 2:
        	
    		double baseTriangulo = 0;
    		double alturaTriangulo = 0;
    		double areaTriangulo = 0;
    		
    		
    		System.out.println("Introduzca la base del triángulo en cm.");
    		baseTriangulo = scnum.nextDouble();
    		
    		System.out.println("Introduzca la altura del triángulo en cm.");
    		alturaTriangulo = scnum.nextDouble();
    		
    		areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
    		
    		System.out.println("El área del triángulo es igual a: " + areaTriangulo + " cm2");
            
        	break;
        	
        case 3:
        	
        	double radio;
    		
    		System.out.println("Introduzca el radio del círculo en cm.");
    		radio = scnum.nextDouble();
    		
    		System.out.print("El área del círculo es ");
    		System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
    		System.out.print(" cm2");
            
        	break;
        	
        case 4:
        	
        	System.out.println("Has salido del programa.");
        	System.exit(opc);
            
        	break;
        }
        
        
        scnum.close();
	}

}
