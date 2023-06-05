package liveTemplates;

public class prueba {

	public static void main(String[] args) {
		
		int n = 1;
		
		for (int i = 1; i < 11; i++) {
			try {				
				int aleatorio  = (int)(Math.random() * 10);
				n = 100 / aleatorio;
				
			} catch (Exception e) {
				System.out.println("¡No se puede dividir entre cero!");
				n = 1;
				
			} finally {
				System.out.println(i + ") Valor = " + n);
			}
		}

	}

}
