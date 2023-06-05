import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		String [] nombres = new String [2];
		double [] notasProgramacion = new double [50];
		double [] notasMoviles = new double [50];
		double [] notasMarcas = new double [50];
		double [] notasBBDD = new double [50];
		
		double acuNotasProgramacion = 0;
		double acuNotasBBDD = 0;
		
		double mejorNotaMarcas = 0;
		double mejorNotaMoviles = 0;
		double mejorMedia = 0;
		
		String nombreMejorNotaMoviles = "";
		String nombreMejorNotaMarcas = "";
		String nombreMejorMedia = "";
		
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Alumno nº" + (i + 1) + " introduzca su nombre:");
			nombres [i] = sctxt.nextLine();
			
			System.out.println("Alumno nº" + (i + 1) + " introduzca su nota en Programación:");
			notasProgramacion [i] = scnum.nextDouble();
			
			System.out.println("Alumno nº" + (i + 1) + " introduzca su nota en Móviles:");
			notasMoviles [i] = scnum.nextDouble();
			
			System.out.println("Alumno nº" + (i + 1) + " introduzca su nota en Marcas:");
			notasMarcas [i] = scnum.nextDouble();
			
			System.out.println("Alumno nº" + (i + 1) + " introduzca su nota en BD:");
			notasBBDD [i] = scnum.nextDouble();
		}
		
		
		for (int i = 0; i < 50; i++) {
			acuNotasProgramacion = acuNotasProgramacion + notasProgramacion [i];
		}
		

		for (int i = 0; i < 50; i++) {;
			if (mejorNotaMoviles < notasMoviles [i]) {
				nombreMejorNotaMoviles = nombres [i];
			}
		}
		

		for (int i = 0; i < 50; i++) {
			if (mejorNotaMarcas < notasMarcas [i]) { 
				nombreMejorNotaMarcas = nombres [i];
			}
		}
		
		
		for (int i = 0; i < 50; i++) {
			acuNotasBBDD = acuNotasBBDD + notasBBDD [i];
		}
		
		
		for (int i = 0; i < 50; i++) {
			if ((notasProgramacion [i] + notasMoviles [i] + notasBBDD [i] + notasMarcas [i]) / 4 > mejorMedia) {
				nombreMejorMedia = nombres [i];
			}
		}
		
		
		System.out.println("La media de todas las notas de Programación es: " + (acuNotasProgramacion / 50));
		System.out.println("La media de todas las notas de BD es: " + (acuNotasBBDD / 50));
		System.out.println("El nombre del alumno con mejor nota en Marcas es: " + nombreMejorNotaMarcas);
		System.out.println("El nombre del alumno con mejor nota en Móviles es: " + nombreMejorNotaMoviles);
		System.out.println("El nombre del alumno con mejor nota media es: " + nombreMejorMedia);
		
		scnum.close();
		sctxt.close();
	}

}
