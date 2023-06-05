import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		Scanner scnum = new Scanner (System.in);
		
		String [] nombres = new String [10];
		String [] notasLetra = new String [10];
		double [] notas = new double [10];
		
		
		for (int i = 0; i <  notas.length; i++) {
			System.out.println("Introduzca un nombre nº " + (i + 1));
			nombres [i] = sctxt.nextLine();
			
			System.out.println("Introduzca una nota nº " + (i + 1));
			notas [i] = scnum.nextDouble();
		}
		
		for (int i = 0; i < notas.length; i++) {
			if (notas [i] >= 0 && notas [i] < 5) {
				notasLetra[i] = "Suspenso";
			}
			
			if (notas [i] >= 5 && notas [i] < 7) {
				notasLetra[i] = "Bien";
			}
			
			if (notas [i] >= 7 && notas [i] < 9) {
				notasLetra[i] = "Notable";
			}
			
			if (notas [i] >= 9 && notas [i] <= 10) {
				notasLetra[i] = "Sobresaliente";
			}
		}
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Alumno nº" + (i + 1) + ": " + nombres [i] + " - " + "Nota: " + notas [i] + " - " + notasLetra[i]);
		}
			
		scnum.close();
		sctxt.close();
		
	}

}
