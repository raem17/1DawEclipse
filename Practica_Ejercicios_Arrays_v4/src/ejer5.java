
public class ejer5 {

	public static void main(String[] args) {
		
		int [] numerosPrincipal = new int [50];
		
		
		// Se rellena el array principal con numeros aleatorios entre 0-100
		for (int i = 0; i < numerosPrincipal.length; i++) {
			numerosPrincipal [i] = (int) (Math.random()*101);
		}
		
		
		// Se imprimen las posiciones del array principal
		System.out.println("Contenido del array principal");
		for (int i = 0; i < numerosPrincipal.length; i++) {
			System.out.println("Posición " + i + ": " + numerosPrincipal[i]);
		}
	}

}
