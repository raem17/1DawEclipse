
public class ejer9 {

	public static void main(String[] args) {
		
		int [] pares = new int [20];
		
		
		// Rellenamos el array con números pares. Se crea una variable auxiliar z
		for (int i = 0, z = 0; i < pares.length; i++, z+=2) {
			pares [i] = z;
		}
		
		// Imprimimos las posiciones del array
		System.out.println("Contenido del array: ");
		for (int i = 0; i < pares.length; i++) {
			System.out.println("Posición " + i + ": " + pares[i]);
		}
	}

}
