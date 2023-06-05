package Ejercicios_String_v1;

public class ejerEjemplo {

	public static void main(String[] args) {
		
		String cadena = "Pepe";
		
		// Método que devuelve la longitud del string
		System.out.println(cadena.length());
		
		// Método que imprime la posición especificada del string
		System.out.println(cadena.charAt(3));
		
		// Método que devuelve un booleano si el string está vacío
		System.out.println(cadena.isEmpty());
		
		// Método que concatena strings
		System.out.println(cadena.concat(" Otro String"));
		System.out.println(cadena + " Otro String 2");
		
		// Método que devuelve un booleano en función de si el string contiene el carácter especificado
		System.out.println(cadena.contains("P"));
		
		// Método que devuelve un booleano en función de si el string es igual al string especificado
		System.out.println(cadena.equalsIgnoreCase("Pepe"));
		
		// Método
		System.out.println(cadena.indexOf("pe"));
	}

}
