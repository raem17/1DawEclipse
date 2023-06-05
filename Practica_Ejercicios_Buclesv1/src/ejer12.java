
public class ejer12 {

	public static void main(String[] args) {
		
		int productoImpares = 1;
		
		
		for (int i = 1; i < 20; i += 2) {
			
			productoImpares = productoImpares * i;
		}
		
		System.out.println("El producto de multiplicar los 10 primeros números impares es: " + productoImpares);
	}

}
