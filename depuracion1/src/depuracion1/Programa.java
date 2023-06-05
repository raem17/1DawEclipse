package depuracion1;

public class Programa {

	public static void main(String[] args) {

		int x = 50;
		int y = 100;
		String pais = "Francia";

		for (int i = 0; i < 100; i++) {
			x++;
			System.out.println("estoy dentro del for, valor de x: " + x);

			if (x == y) {
				pais = "Italia";
			} else if (x < y) {
				pais = "Grecia";
			} else {
				pais = "Alemania";
			}
			System.out.println(pais);
		}

		
		int j = 0;
		while (j < 50) {
			x--;
			System.out.println("estoy dentro del while, valor de x: " + x);

			if (x == y) {
				pais = "Italia";
			} else if (x < y) {
				pais = "Grecia";
			} else {
				pais = "Alemania";
			}
			System.out.println(pais);
			
			j++;
		}

	}

}