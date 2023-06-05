import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		int contador = 0;
		
		
		System.out.println("Introduzca una cadena de caracteres formadas por números y letras, en ese orden: ");
		System.out.println("Ejemplo: 1a2e3i");
		cadena = sctxt.nextLine();
		
		
		for (int i = 0, z = 1; i < cadena.length(); i += 2, z += 2) {
			// Convierto el char que me devuelve el método charAt a int mediante el método Character.getNumericValue 
			contador = Character.getNumericValue(cadena.charAt(i));
			
			for (int j = 0; j < contador; j++) {
				System.out.print(cadena.charAt(z));
			}
		}
		
		sctxt.close();
	}

}
