import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		int cont_a = 0;
		int cont_o = 0;
		int cont_i = 0;
		
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Introduzca un nombre:");
			nombre = sctxt.nextLine();
			
			if (nombre.charAt(nombre.length()-1) == 'a') {
				cont_a++;
			} else if (nombre.charAt(nombre.length()-1) == 'o') {
				cont_o++;
			} else if (nombre.charAt(nombre.length()-1) == 'i') {
				cont_i++;
			}
		}
		
		
		System.out.println("Contador de nombres terminados en 'a': " + cont_a);
		System.out.println("Contador de nombres terminados en 'o': " + cont_o);
		System.out.println("Contador de nombres terminados en 'i': " + cont_i);
		
		sctxt.close();
	}

}
