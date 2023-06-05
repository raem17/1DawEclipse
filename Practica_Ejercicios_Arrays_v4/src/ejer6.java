
public class ejer6 {

	public static void main(String[] args) {
		
		int [] numerosPrincipal = new int [1000];
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int cont5 = 0;
		int cont6 = 0;
		
		// Se rellena el array principal con numeros aleatorios entre 1-6
		for (int i = 0; i < numerosPrincipal.length; i++) {
			numerosPrincipal [i] = (int) (Math.random()*6) + 1;
			
			if (numerosPrincipal [i] == 1) {
				cont1++;
			}
			
			else if (numerosPrincipal [i] == 2) {
				cont2++;
			}
			
			else if (numerosPrincipal [i] == 3) {
				cont3++;
			}
			
			else if (numerosPrincipal [i] == 4) {
				cont4++;
			}
			
			else if (numerosPrincipal [i] == 5) {
				cont5++;
			}
			
			else if (numerosPrincipal [i] == 6) {
				cont6++;
			}
		}
		

		System.out.println("Nº de veces que ha salido el 1: " + cont1);
		System.out.println("Nº de veces que ha salido el 2: " + cont2);
		System.out.println("Nº de veces que ha salido el 3: " + cont3);
		System.out.println("Nº de veces que ha salido el 4: " + cont4);
		System.out.println("Nº de veces que ha salido el 5: " + cont5);
		System.out.println("Nº de veces que ha salido el 6: " + cont6);
	}

}
