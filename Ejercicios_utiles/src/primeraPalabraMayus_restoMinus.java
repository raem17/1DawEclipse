import java.util.Scanner;

public class primeraPalabraMayus_restoMinus {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		
		
		System.out.println("Introduzca un nombre:");
		nombre = sctxt.nextLine();
		
		/* Con toUpperCase convierto todos los carácteres del string en mayúsculas, después charAt me devuelve el carácter de la posición especificada
		en este punto si el string fuera "hoLa" y charAt (0), tendríamos "H".
		Seguidamente lo concateno (sino error) con nombre.substring, que me devuelve la cadena desde el índice especificado hasta nombre.length
		(la longitud de la cadena), se podría usar solo un índice, el resultado es el mismo en este caso. Y por último convierto todos los carácteres 
		de ese substring en minúsculas. Resultado: "Hola"
		
		Substring: Devuelve parte de una cadena de texto, tiene dos variantes: 
		String substring(int beginIndex, int endIndex): Devuelve la subcadena dada por los índices iniciales y finales. endIndex-1
		String substring(int beginIndex): Devuelve la subcadena desde el índice especificado hasta el final de la cadena.
		*/
		nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
		System.out.println(nombre);
		
		sctxt.close();
	}

}
