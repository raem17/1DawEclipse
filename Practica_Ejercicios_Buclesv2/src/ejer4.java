import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		
		double nota = 0;
		int contAprobados = 0;
		int contSuspensos = 0;
		int contCasiAprobados = 0;
		
		
		for (int i=0; i < 66; i++) {
			
			System.out.println("Introduzca una nota:");
			nota = scnum.nextDouble();
			
			if (nota >= 5) {
				contAprobados++;
			}
			
			if (nota < 4) {
				contSuspensos++;
			}
			
			if (nota >= 4 && nota < 5) {
				contCasiAprobados++;
			}
		}
		
		
		System.out.println("Aprobados: " + contAprobados);
		
		System.out.println("Suspensos: " + contSuspensos);
		
		System.out.println("Casi aprobados: " + contCasiAprobados);
		
		
		scnum.close();
		
	}

}
