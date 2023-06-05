
public class ejer5 {

	public static void main(String[] args) {
		
		int [] numeros1 = new int [10];
		int [] numeros2 = new int [10];
		int [] numeros3 = new int [10];
		int [] numeros4 = new int [10];
		int [] numeros5 = new int [10];
		
		int [][] numerosResultados = new int [5][10];
		
		
		for (int i = 0; i < numeros1.length; i++) {
			// Los arrays unidimensionales se rellenan con números aleatorios de 1 al 100
			numeros1[i] = (int)(Math.random()*100+1);	
			numeros2[i] = (int)(Math.random()*100+1);
			numeros3[i] = (int)(Math.random()*100+1);
			numeros4[i] = (int)(Math.random()*100+1);	
			numeros5[i] = (int)(Math.random()*100+1);
			
			
			// El array bididimensional se rellena con los números de los arrays unidimensionales
			numerosResultados [0][i] = numeros1[i];
			numerosResultados [1][i] = numeros2[i];
			numerosResultados [2][i] = numeros3[i];
			numerosResultados [3][i] = numeros4[i];
			numerosResultados [4][i] = numeros5[i];
		}
		
		
		// Se imprime array resultados
		System.out.println("Array de resultados:");
		for (int i = 0; i < numerosResultados.length; i++) {
			for (int j = 0; j < numerosResultados[i].length; j++) {
				System.out.print(numerosResultados[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
