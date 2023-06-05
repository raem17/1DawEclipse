public class ejer2 {

	public static void main(String[] args) {
		
		boolean [][] booleanos = new boolean [10][10];
		int numRandom = 0;
		int contadorTrue = 0;
		//int contadorFalse = 0;
		
		
		for (int i = 0; i < booleanos.length; i++) {
			for (int j = 0; j < booleanos[i].length; j++) {
				numRandom = (int)(Math.random()*2);
				
				if (numRandom == 0) {
					booleanos [i][j] = false;
					//contadorFalse++;
				} else if (numRandom == 1) {
					booleanos [i][j] = true;
					contadorTrue++;
				}
			}
		}
		
		
		// Imprimir array de booleanos
		/*for (int i = 0; i < booleanos.length; i++) {
			for (int j = 0; j < booleanos[i].length; j++) {
				System.out.print(booleanos[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();*/
		
		
		System.out.println("Contador de 'true' en el array de booleanos: " + contadorTrue);
		//System.out.println("Contador de 'false' en el array de booleanos: " + contadorFalse);
	}

}
