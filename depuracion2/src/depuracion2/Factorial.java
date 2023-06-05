package depuracion2;
/**
 * Clase Factorial.
 * @author roger
 */
public class Factorial {
/**
 * Método main.
 * @param args
 */
	public static void main(String[] args) {
		int num = 6;
		System.out.println("El factorial de " + num + " es: " + calcularFactorial(num));
	} // Cierre del main.
	
	// Métodos de la clase.
	/**
	 * Devuelve el factorial del entero (int) pasado por parámetro.
	 * @param num El int que se va a factorizar.
	 * @return Factorial del int pasado por parámetro.
	 */
	static int calcularFactorial (int num) {
		int factorial = 1;
		
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		
		return factorial;
	} // Cierre del método
} // Cierre de la clase