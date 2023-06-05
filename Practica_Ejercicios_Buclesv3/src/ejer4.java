import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		
		String nombre = "";
		double nota = 0;
		int contAprobados = 0;
		int contSuspensos = 0;
		String nombreMejorNota = "";
		double mejorNota = 0;
		String nombrePeorNota = "";
		double peorNota = 11;
		
		double acumNotas = 0;
		double mediaNotas = 0;
		
		int contAntonios = 0;
		
		
		for (int i=0; i < 30; i++) {
			
			System.out.println("Introduzca su nombre:");
			nombre = sctxt.nextLine();
			
			System.out.println("Introduzca su nota en Programación:");
			nota = scnum.nextDouble();
			
			
			if (nombre.equalsIgnoreCase("Antonio")) {
				contAntonios++;
			}
			
			
			if (nota >= 5) {
				contAprobados++;
			}
				else if (nota < 5) {
					contSuspensos++;
				}
			
			
			if (mejorNota < nota) { 
				mejorNota = nota;
				nombreMejorNota = nombre;
			}
			
			
			if (peorNota > nota) {
				peorNota = nota;
				nombrePeorNota = nombre;
			}
			
			
			acumNotas = acumNotas + nota;
			
		}
		
		mediaNotas = acumNotas/30;
	
		System.out.println("Número de aprobados: " + contAprobados);
		
		System.out.println("Número de suspensos: " + contSuspensos);
		
		System.out.println("El alumno con mayor nota es: " + nombreMejorNota);
		
		System.out.println("El alumno con peor nota es: " + nombrePeorNota);
		
		System.out.println("La media de todas las notas es: " + mediaNotas);
		
		System.out.println("Número de Antonios: " + contAntonios);
		
		
		scnum.close();
		sctxt.close();
	}

}
