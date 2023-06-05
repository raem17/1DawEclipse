
public class rellenar_array_empezando_por_1 {

	public static void main(String[] args) {
		
		int [] numeros = new int [100];
		
		
		// Rellenamos el array con números
		for (int i = 0; i < numeros.length; i++) {
			numeros [i] = i + 1;
		}
		
		
		// Imprimimos las posiciones del array
		System.out.println("Contenidos del array: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + i + ": " + numeros[i]);
		}
	}

}
