import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner(System.in);
		String letrasMinus="aábcdeéfghiíjklmnñoópqrstuúvwxyz";
		String letrasMayus="AÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚVWXYZ";
		String cadenaVieja = "";
		String cadenaNueva = "";
		

		System.out.println("Introduce una ciudad: ");
		cadenaVieja = sctxt.nextLine();
		
		
		for (int i = 0; i < letrasMinus.length(); i++) {
			if (cadenaVieja.charAt(cadenaVieja.length()-1) == letrasMinus.charAt(i) || cadenaVieja.charAt(cadenaVieja.length()-1) == letrasMayus.charAt(i)) {
				cadenaNueva = cadenaNueva + letrasMayus.charAt(i);
			}
		}
	
		
		System.out.println(cadenaNueva);
		sctxt.close();
	}

}
