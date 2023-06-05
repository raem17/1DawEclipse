import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);	
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		
		System.out.println("Introduzca el número entero 1:");
		num1 = scnum.nextInt();
		
		System.out.println("Introduzca el número entero 2:");
		num2 = scnum.nextInt();
		
		System.out.println("Introduzca el número entero 3:");
		num3 = scnum.nextInt();
		
		
		if (num1 >= num2 && num2 >= num3) {
			
			System.out.println("Al número de en medio le faltan " + (num1 - num2) + " unidades para llegar al más grande, y le sobran " + (num2 - num3) + " unidades en relación al más pequeño.");
		}
		
		else if (num1 >= num3 && num3 >= num2) {
			
			System.out.println("Al número de en medio le faltan " + (num1 - num3) + " unidades para llegar al más grande, y le sobran " + (num3 - num2) + " unidades en relación al más pequeño.");
		}
		
		else if (num2 >= num1 && num1 >= num3) {
			
			System.out.println("Al número de en medio le faltan " + (num2 - num1) + " unidades para llegar al más grande, y le sobran " + (num1 - num3) + " unidades en relación al más pequeño.");
		}
		
		else if (num2 >= num3 && num3 >= num1) {
			
			System.out.println("Al número de en medio le faltan " + (num2 - num3) + " unidades para llegar al más grande, y le sobran " + (num3 - num1) + " unidades en relación al más pequeño.");
		}
		
		else if (num3 >= num1 && num1 >= num2) {
			
			System.out.println("Al número de en medio le faltan " + (num3 - num1) + " unidades para llegar al más grande, y le sobran " + (num1 - num2) + " unidades en relación al más pequeño.");
		}
		
		else {
			
			System.out.println("Al número de en medio le faltan " + (num3 - num2) + " unidades para llegar al más grande, y le sobran " + (num2 - num1) + " unidades en relación al más pequeño.");
		}
		
		
		scnum.close();
		
	}

}
