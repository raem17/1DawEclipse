package depuracion2;

/**
 * Clase Videoclub.
 * @author roger
 */
public class Videoclub {

	/**
	 * Método main.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 0;
		String [] prestados = new String [10];
		String [] disponibles = {"El vicio de poder", "Juego de tronos", "El secreto de sus ojos", "Breaking Bad", "El señor de los anillos", 
				"Amelie", "Gladiator", "300", "La lengua de las mariposas", "Matrix"};
		
		
		for (int i = 0, z = 0; i < 10; i++) {
			x = (int)(Math.random()*10);
			
			if (disponibles[x] == "") {
				System.out.println("Falta el dvd del estante " + x);
			} else {
				System.out.println("Se ha prestado el dvd de " + disponibles [x]);
				prestados [z] = disponibles [x];
				z++;
				disponibles [x] = "";
			}
		}
	} // Cierre del main.

} // Cierre de la clase.