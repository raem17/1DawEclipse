import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		/*for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				cadena = ordenInvertidoCadena(cadena);
				break;
			}
		}*/
		
		System.out.println(ordenInvertidoCadena(cadena));
		
		sctxt.close();
	}
	
	static String ordenInvertidoCadena (String cadena) {
		String cadenaNueva = "";
		
		String [] subCadenas = cadena.split(" ");
		
		for (int i = subCadenas.length-1; i >= 0; i--) {
			cadenaNueva = cadenaNueva + subCadenas [i] + " ";
		}
		
		return cadenaNueva;
	}

}
