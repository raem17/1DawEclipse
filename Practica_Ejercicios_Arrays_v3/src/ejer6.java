
public class ejer6 {

	public static void main(String[] args) {
		
		int [] resultados = new int [5000];
		int contSeises = 0;
		int contUnos = 0;
		
		for (int i = 0; i < resultados.length; i++ ) {
			resultados [i] = (int) (Math.random()*7);
			
			if (resultados [i] == 6) {
				contSeises++;
			}
			
			else if (resultados [i] == 1) {
				contUnos++;
			}
		}
		
		
		System.out.println("Nº de veces que ha salido el 1: " + contUnos);
		System.out.println("Nº de veces que ha salido el 6: " + contSeises);
	}

}
