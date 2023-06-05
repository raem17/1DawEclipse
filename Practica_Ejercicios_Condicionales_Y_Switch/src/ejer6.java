import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);	
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		
		System.out.println("Introduzca el número 1:");
		num1 = scnum.nextInt();
		
		System.out.println("Introduzca el número 2:");
		num2 = scnum.nextInt();
		
		System.out.println("Introduzca el número 3:");
		num3 = scnum.nextInt();
		
		System.out.println("Introduzca el número 4:");
		num4 = scnum.nextInt();
		
		
		if (num1 >= num2 && num2 >= num3 && num3 >= num4) {

			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num2 + " y el " + num3);
		}
		
		else if (num4 >= num2 && num2 >= num3 && num3 >= num1) {

			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num2 + " y el " + num3);
		}
		
		else if (num1 >= num3 && num3 >= num2 && num2 >= num4) {
	
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num3 + " y el " + num2);
		}
		
		else if (num4 >= num3 && num3 >= num2 && num2 >= num1) {
	
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num3 + " y el " + num2);
		}
		
		else if (num3 >= num2 && num2 >= num1 && num1 >= num4) {
	
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num2 + " y el " + num1);
		}
		
		else if (num4 >= num2 && num2 >= num1 && num1 >= num3) {
			
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num2 + " y el " + num1);
		}
		
		else if (num1 >= num2 && num2 >= num4 && num4 >= num3) {
		
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num2 + " y el " + num4);
		}
		
		else if (num3 >= num2 && num2 >= num4 && num4 >= num1) {
			
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num2 + " y el " + num4);
		}
		
		else if (num1 >= num3 && num3 >= num1 && num1 >= num4) {
		
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num3 + " y el " + num1);
		}
		
		else if (num4 >= num3 && num3 >= num1 && num1 >= num1) {
	
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num3 + " y el " + num1);
		}
		
		else if (num1 >= num3 && num3 >= num4 && num4 >= num2) {
			
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num3 + " y el " + num4);
		}
		
		else if (num2 >= num3 && num3 >= num4 && num4 >= num1) {

			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num3 + " y el " + num4);
		}
		
		else if (num3 >= num1 && num1 >= num2 && num2 >= num4) {
		
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num1 + " y el " + num2);
		}
		
		else if (num4 >= num1 && num1 >= num2 && num2 >= num3) {
			
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num1 + " y el " + num2);
		}
		
		else if (num2 >= num1 && num1 >= num3 && num3 >= num4) {

			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num1 + " y el " + num3);
		}
		
		else if (num4 >= num1 && num1 >= num3 && num3 >= num2) {
			
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num1 + " y el " + num3);
		}
		
		else if (num2 >= num1 && num1 >= num4 && num4 >= num3) {
	
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num1 + " y el " + num4);
		}
		
		else if (num3 >= num1 && num1 >= num4 && num4 >= num2) {
		
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num1 + " y el " + num4);
		}
		
		else if (num2 >= num4 && num4 >= num1 && num1 >= num3) {
			
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num4 + " y el " + num1);
		}
		
		else if (num3 >= num4 && num4 >= num1 && num1 >= num2) {
			
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num4 + " y el " + num1);
		}
		
		else if (num1 >= num4 && num4 >= num2 && num2 >= num3) {
			
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num4 + " y el " + num2);
		}
		
		else if (num3 >= num4 && num4 >= num2 && num2 >= num1) {
		
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num4 + " y el " + num2);
		}
		
		else if (num1 >= num4 && num4 >= num3 && num3 >= num2) {
			
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num4 + " y el " + num3);
		}
		
		else if (num2 >= num4 && num4 >= num3 && num3 >= num1) {
		
			System.out.println("Los dos números, entre el mayor y el menor, son: el " + num4 + " y el " + num3);
		}
		
		
		scnum.close();
	}

}
