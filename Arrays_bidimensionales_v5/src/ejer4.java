
public class ejer4 {

	public static void main(String[] args) {
		
		int [][] numeros = new int [10][10];
		boolean [][] booleanos = new boolean [10][10];
		
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros [i][j] = (int)(Math.random()*2);
				
				if (numeros[i][j] == 0) {
					booleanos[i][j] = false;
				} else if (numeros[i][j] == 1) {
					booleanos[i][j] = true;
				}
			}
		}
		
		
		//Imprimir array de números
		System.out.println("Array de números:");
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//Imprimir array de boleanos
		System.out.println("Array de boleanos:");
		for (int i = 0; i < booleanos.length; i++) {
			for (int j = 0; j < booleanos[i].length; j++) {
				System.out.print(booleanos[i][j] + " ");
			}
			System.out.println();
		}
	}

}
