

public class imprimir_multiplos_for {

	public static void main(String[] args) {
		
		/* En la declaración de [i] declaramos a partir de que número empieza a evaluar el if.
		En la condición se declara hasta que número se evalúa el if.*/
		
		for (int i = 0; i <= 30; i++) {

			// Con [i % x == 0] comprobamos que si el resto de [i/x] es [0], el número es múltiplo del número [x].  
			if (i % 5 == 0) {
				System.out.println(i); // Se imprime el múltiplo del número [x]
			}
		}
	}

}
