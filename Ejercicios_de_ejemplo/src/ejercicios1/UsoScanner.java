package ejercicios1;
import java.util.*;

public class UsoScanner {

	public static void main(String[] args) {
		//declarar siempre dos objetos scanner, uno para numeros y otro para cadenas de texto
		Scanner scn = new Scanner (System.in);
		Scanner sct = new Scanner (System.in);
		String NomApe = "";
		int edad = 0;
		double peso = 0;
		
		//lee el nombre del usuario por teclado y la guardo en la variable NomApe
		System.out.println("Introduzca su nombre");
		NomApe = sct.nextLine();
		
		System.out.println("Introduzca su edad");
		edad = scn.nextInt();
		
		System.out.println("Introduzca su peso");
		peso = scn.nextDouble();
		
		System.out.println("Su nombre es " + NomApe + ", su edad es " + edad + " y su peso es " + peso + "kg.");
		
		//cierres de los scanner
		scn.close();
		sct.close();

	}

}
