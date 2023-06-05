import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        double precioProductoSinIVA = 0;
        /*double productosVendidos = 0;*/ // Innecesario
        double porcentajeIVA = 0;
        double precioProductoConIVA = 0;
        
        
        System.out.println("Introduzca el precio por unidad del producto (sin IVA):");
        precioProductoSinIVA = scnum.nextDouble();
        
        /*System.out.println("Introduzca el número de productos vendidos:"); // Innecesario
        productosVendidos = scnum.nextDouble();*/
        
        System.out.println("Introduzca el porcentaje (%) de IVA aplicado:");
        porcentajeIVA = scnum.nextDouble();
        
        porcentajeIVA = (porcentajeIVA / 100);
        precioProductoConIVA = precioProductoSinIVA + (precioProductoSinIVA * porcentajeIVA);
        
        
        System.out.println("El precio de venta del producto es: " + precioProductoConIVA + " €");
        
        
        scnum.close();
	}

}
