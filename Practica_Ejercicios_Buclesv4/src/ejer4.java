
public class ejer4 {

	public static void main(String[] args) {
		
		int espacios = 0;
		int asteriscos = 0;
		
		
		for (asteriscos = 9; asteriscos > 0; asteriscos -= 2) {
						
	        for (int i = 0; i < espacios; i++) {
	        	System.out.print(" ");
	        }
	        	
	        for (int j = asteriscos; j > 0; j--) {
	        	System.out.print("*");
	        }
	        
	        System.out.println("");
	        espacios++;
		}
	}

}
