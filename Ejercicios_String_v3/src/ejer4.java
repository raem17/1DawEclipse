import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String [] ciudades = new String [2];
		String [] resultados = new String [2];
		
		String abecedarioMinus = "aábcdeéfghiíjklmnñoópqrstuúvwxyz";
		String abecedarioMayus = "AÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚVWXYZ";
		
		
		// El usuario rellena el array de ciudades
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println("Introduzca el nombre de su ciudad natal:");
			ciudades [i] = sctxt.nextLine();
		}

		
		// Relleno el array de resultados con "" para evitar null 
		for (int i = 0; i < resultados.length; i++) {
			resultados [i] = "";
		}
		
		
		/* Se recorre el array de ciudades
		
		Si el primér carácter de cada posición del array ciudades empieza por una letra minúscula, se rellena cada posición del array resultados 
		con la letra en mayúscula, esto se hace recorriendo el array de abecedarioMinus con un for.
		
		Después, con otro bucle for, se rellena cada posición del array de resultados, empezando por 1, con el resto de cada cadena de cada 
		posición del array de ciudades, esto se hace con un for y un charAt, y recorriendo todas los carácteres de cada ciudad*/
		for (int i = 0; i < ciudades.length; i++) {
			
			for (int j = 0; j < abecedarioMinus.length(); j++) {
				if (ciudades [i].charAt(0) == abecedarioMinus.charAt(j) || ciudades [i].charAt(0) == abecedarioMayus.charAt(j)) {
					resultados [i] = resultados [i] + abecedarioMayus.charAt(j);
				}
			}
			
			
			for (int j = 1; j < ciudades [i].length(); j++) {
				resultados [i] = resultados [i] + ciudades [i].charAt(j);
			}
		}
		
		
		// Se imprime el array de resultados
		System.out.println("Resultados:");
		for (int i = 0; i < resultados.length; i++) {
			System.out.println(resultados [i]);
		}
		
		sctxt.close();
	}

}
