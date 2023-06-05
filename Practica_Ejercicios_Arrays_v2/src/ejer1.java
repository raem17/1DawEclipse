
public class ejer1 {

	public static void main(String[] args) {
		
		int [] numeros = new int [100];
		int acuNumeros = 0;
		int media = 0;
		int cont = 0;
		
		// Rellenamos el array automáticamnete con números, empezando por el 1
		for (int i = 0; i < numeros.length; i++) {
			numeros [i] = i + 1;
			acuNumeros = acuNumeros + numeros [i]; // Acumulador de números
			cont ++; // Contador para hacer la media
		}
		
		
		// Imprimimos las posiciones del array
		System.out.println("Contenido del array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + i + ": " + numeros[i]);
		}
		
		media = acuNumeros/cont;
		
		System.out.println("La suma de todos los números del array es: " + acuNumeros);
		System.out.println("La media de todos los números del array es: " + media); // Se mostrará una media entera, sin decimales
	}

}
