import java.util.Scanner;
public class ejer11 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int num = 0;
		
		
		System.out.println("Introduzca un número (entre 0 y 10):");
		num = scnum.nextInt();
		
		
		if (num > 0 && num <= 10) {
			for (int i = 0; i < 11; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}
		}
		
		scnum.close();
	}

}
