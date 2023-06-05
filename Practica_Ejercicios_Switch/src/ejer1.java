import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
		int opc = 0;
        
          
        System.out.println("Elija una opción del menú:");
        System.out.println("");
        System.out.println("1: Calcular el 21% del IVA.");
        System.out.println("2: Calcular el IRPF de su sueldo.");
        System.out.println("3: Calcular la paga extra.");
        System.out.println("4: Salir.");
        
        
        opc = scnum.nextInt();
        
        
        switch (opc) {
        
        case 1:
        	
        	double precioProductoSinIVA = 0;
            double ivaProducto = 0;
            
            
            System.out.println("Introduzca el precio por unidad del producto (sin IVA):");
            precioProductoSinIVA = scnum.nextDouble();
            
            
            ivaProducto = precioProductoSinIVA * 0.21;
            
            
            System.out.println("El 21% del IVA del producto es: " + ivaProducto + " €");
            
        	break;
        	
        case 2:
        	
        	double sueldo = 0;
            double irpf = 0;
            
            
            System.out.println("Introduzca el sueldo:");
            sueldo = scnum.nextDouble();
            
            System.out.println("Introduzca el irpf:");
            irpf = scnum.nextDouble();
            
            
            irpf = (irpf / 100) * sueldo;
            
            
            System.out.println("Su IRPF es: " + irpf + " €");
            
        	break;
        	
        case 3:
        	
        	double sueldoEmp = 0;
            double pagaExt = 0;
            
            
            System.out.println("Introduzca el sueldo:");
            sueldoEmp = scnum.nextDouble();
            
            
            pagaExt = 1.25 * sueldoEmp;
            
            
            System.out.println("Su paga extra es: " + pagaExt + " €");
            
        	break;
        	
        case 4:
        	
        	System.exit(opc);
            
        	break;
        }
        
        
        scnum.close();
        
	}

}
