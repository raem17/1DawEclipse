
public class A_EliminarDuplicados_Logica {

	public static void main(String[] args) {

		int[] numeros = {1,2,55,6,7,8,1,4,6,4,33,77, 4, 4, 4, 4, 1, 1, 1, 1, 78 , 100};

		eliminarDuplicados(numeros);
		ordenarArrayMenorAMayor(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
	}

	
	// Métodos 
	
	static void ordenarArrayMenorAMayor (int[]numeros) {
		int aux;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length-1; j++) {
				if (numeros[j+1] < numeros[j]) {
					aux = numeros[j+1];
					numeros[j+1] = numeros[j];
					numeros[j] = aux;
				}
 			}
		}
	}
	
	static void eliminarDuplicados (int[]numeros) {
		int cont = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			cont = 0;
			
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i] == numeros[j]) {
					cont++;
				}
				
			}
			
			if (cont > 1) {
				numeros[i] = 0;
			}
		}
	}

}
