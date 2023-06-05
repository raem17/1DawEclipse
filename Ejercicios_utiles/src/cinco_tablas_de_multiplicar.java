

public class cinco_tablas_de_multiplicar {

	public static void main(String[] args) {
		
		for (int factor2 = 0; factor2 < 11; factor2++) {
			
			for (int factor1 = 1; factor1 < 6; factor1++) {
					
				System.out.print(factor1 + " x " + factor2 + " = " + (factor1 *factor2) + ("	"));	
			}
			
			System.out.println();
			
		}
	}

}
