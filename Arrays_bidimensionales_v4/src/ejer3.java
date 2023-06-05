
public class ejer3 {

	public static void main(String[] args) {
		
		// 3 filas 3 columnas
		int [][] numeros1 = new int [3][3];
		int [][] numeros2 = new int [3][3];
		
		// Relleno array 1 y 2
		for (int i = 0; i < numeros1.length; i++) {
			numeros1[i][0] = (int)(Math.random()*10);
			numeros1[i][1] = (int)(Math.random()*10);
			numeros1[i][2] = (int)(Math.random()*10);
			
			numeros2[i][0] = numeros1[i][2];
			numeros2[i][1] = numeros1[i][1];
			numeros2[i][2] = numeros1[i][0];
		}
		
		
		System.out.println("Array 1:");
		System.out.println("");
		for (int i = 0; i < numeros1.length; i++) {
			for (int j = 0; j < numeros1[i].length; j++) {
				System.out.print(numeros1[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("Array 2:");
		System.out.println("");
		for (int i = 0; i < numeros2.length; i++) {
			for (int j = 0; j < numeros2[i].length; j++) {
				System.out.print(numeros2[i][j] + " ");
			}
			System.out.println("");
		}

	}

}