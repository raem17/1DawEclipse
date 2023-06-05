import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int sumaNum = 0;
		
		
		System.out.println("Introduzca el número 1:");
		num1 = scnum.nextInt();
		
		System.out.println("Introduzca el número 2:");
		num2 = scnum.nextInt();
		
		System.out.println("Introduzca el número 3:");
		num3 = scnum.nextInt();
		
		System.out.println("Introduzca el número 4:");
		num4 = scnum.nextInt();
		
		System.out.println("Introduzca el número 5:");
		num5 = scnum.nextInt();
		
		
		sumaNum = num1 + num2 + num3 + num4 + num5;
		
		
		for (int i = 0; i < sumaNum; i++) {
			
			System.out.println("Hello my friend");
		}
		
		
		scnum.close();
	}

}
