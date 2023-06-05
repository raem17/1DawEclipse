package Ejercicios_String_v1;
import java.util.Scanner;


public class ejer8 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String [] ciudades = new String [7];
		
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println("Introduzca una ciudad:");
			ciudades [i] = sctxt.nextLine();
			/* Con toUpperCase convierto todos los carácteres del string en mayúsculas, después charAt me devuelve el carácter de la posición
			especificada, en este punto si el string fuera "madrid" y charAt (0), tendríamos "M".
			Seguidamente lo concateno (sino error) con ciudades.substring, que me devuelve una subcadena desde el índice especificado hasta el final
			de la cadena. Resultado: "M" + "adrid" = "Madrid" */
			ciudades [i] = ciudades [i].toUpperCase().charAt(0) + ciudades [i].substring(1);
		}
		
		
		System.out.println("Contenido del array:");
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println("Posición: " + i + ": " + ciudades[i]);
		}
		
		
		sctxt.close();
	}

}
