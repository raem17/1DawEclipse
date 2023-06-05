
public class ejer3 {

	public static void main(String[] args) {
		
		int [] array1 = {1, 2, 3, 4, 5};
		int [] array2 = new int [5];
		
		
		// Relleno el array 2 con valores del 1
		/* Creo una variable z que vale la longitud del array 1 (5), le resto -1 porque sino me da error. ¿Por qué? Porque z comenzaría en la posición 5,
		hay que recordar que las posiciones empiezan a partir del 0, el array 1 comienza en la posición 0 y acaba en la 4, por lo que comenzaría
	    en una posición que no existe */
		
		for (int i = 0, z = (array1.length-1); i < array2.length; i++, z--) {
			array2 [i] = array1 [z];
		}
		
		
		// Imprimo las posiciones con los valores del array 2
		System.out.println("Contenido del array 2: ");
		for (int j = 0; j < array2.length; j++) {
			System.out.println("Posición " + j + ": " + array2 [j]);
		}
	}

}
