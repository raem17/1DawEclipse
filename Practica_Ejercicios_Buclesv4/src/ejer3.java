
public class ejer3 {

	public static void main(String[] args) {
		
		for (int filas = 1; filas <= 5; filas++) {
			
            for (int espacios = 1; espacios <= (5-filas); espacios++) {
                System.out.print(" ");
            }
 
            for (int asteriscos = 1; asteriscos <= (filas * 2) - 1; asteriscos++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
	}

}
