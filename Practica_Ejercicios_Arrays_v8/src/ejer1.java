
public class ejer1 {

	public static void main(String[] args) {
		
		int [] numeros = {10, 4, 456, 5, 12, 34, 22, 9, 0, 56, 2, 122, 3};
		int aux = 0;
		
		
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if (numeros[j + 1] < numeros[j]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        
        // Se imprimen las posiciones
        for (int i = 0; i < numeros.length; i++) {
        	System.out.println("Posición: " + i + ": "+ numeros[i] );
        }
		
	}

}
