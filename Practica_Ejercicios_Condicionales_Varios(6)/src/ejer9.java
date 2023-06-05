import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
	
		Scanner scnum = new Scanner( System.in );
        double num1 = 0;
        double num2 = 0;
        double res = 0;
        
        System.out.println("Introduzca el primer número:");
        num1 = scnum.nextDouble();
        
        System.out.println("Introduzca el segundo número:");
        num2 = scnum.nextDouble();
        
        if (num1 > num2) {
        	res = num1 / num2;
        	System.out.println(num1 + " / " + num2 + " = " + res);
        }
        else if (num2 > num1) {
        	res = num2 / num1;
        	System.out.println(num2 + " / " + num1 + " = " + res);
        }
        
        
        scnum.close();
	}

}
