import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduce el código sucio:");
		String codigoSucio = sctxt.nextLine();
		
		String codigoLimpio = devolverCodigoLimpio(codigoSucio);
		System.out.print("Código limpio:\n" + codigoLimpio);
		
		sctxt.close();
	}
	
	// Métodos
	
	public static String devolverCodigoLimpio (String codigoSucio) {
		String codigoLimpiov1 = "";
		
		// 1ª parte
		codigoLimpiov1 = codigoSucio.replace(".", "");
		
		// 2ª parte
		String codigoLimpiov2 = "";
		for (int i = 0; i < codigoLimpiov1.length(); i++) {
			// Si es minúscula convierte la letra a mayúscula
			if (esMinuscula(String.valueOf(codigoLimpiov1.charAt(i)))) {
				codigoLimpiov2 += String.valueOf(codigoLimpiov1.charAt(i)).toUpperCase();
				
				// Si es mayúscula convierte la letra a minúscula
			} else if (esMayuscula(String.valueOf(codigoLimpiov1.charAt(i)))) {
				codigoLimpiov2 += String.valueOf(codigoLimpiov1.charAt(i)).toLowerCase();
			}
		}
		
		return codigoLimpiov2;
	}
	
	public static boolean esMinuscula (String cadena) {
		return cadena.equals(cadena.toLowerCase());
	}
	
	public static boolean esMayuscula (String cadena) {
		return cadena.equals(cadena.toUpperCase());
	}

}
