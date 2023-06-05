import java.util.Arrays;

public class ejer2 {

	public static void main(String[] args) {
		
		int [] numeros = {10, 4, 456, 5, 12, 34, 22, 9, 0, 56, 2, 122, 3};
		
		
		// Se ordena el array de menor a mayor con el método Arrays.sort
		Arrays.sort(numeros);
		
		
		// Se imprimen las posiciones del array
		System.out.println("Contenido del array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + i + ": " + numeros [i]);
		}
	}

}
