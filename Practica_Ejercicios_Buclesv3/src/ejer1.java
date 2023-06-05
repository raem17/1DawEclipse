
public class ejer1 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			
			if (i % 2 == 0 && i < 5) {
				System.out.println (i + " es par y es menor que 5");
			}
			
			else if (i % 2 == 0) {
				System.out.println (i + " es par");
			}
			
			else if (i < 5) {
				System.out.println (i + " es menor que 5");
			}
			
			else {
				System.out.println (i);
			}
		}
	}

}
