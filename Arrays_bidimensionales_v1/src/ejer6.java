import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);	
		// 5 filas, 3 columnas 
		double [][] notas = new double [5][3];
		
		double mediaBBDD = 0;
		double mediaProg = 0;
		double mediaMov = 0;
		
		double acuBBDD = 0;
		double acuProg = 0;
		double acuMov = 0;
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Alumno " + i + ". Introduzca su nota en BBDD:");
			notas [i][0] = scnum.nextDouble();
			
			System.out.println("Alumno " + i + ". Introduzca su nota en Programación:");
			notas [i][1] = scnum.nextDouble();
			
			System.out.println("Alumno " + i + ". Introduzca su nota en Móviles:");
			notas [i][2] = scnum.nextDouble();
		}
		
		
		for (int i = 0; i < notas.length; i++) {
			acuBBDD = acuBBDD + notas [i][0];
			acuProg = acuProg + notas [i][1];
			acuMov = acuMov + notas [i][2];
		}
		
		mediaBBDD = acuBBDD / notas.length;
		mediaProg = acuProg / notas.length;
		mediaMov = acuMov / notas.length;
		
		
		System.out.println("Media de los alumnos en BBDD: " + mediaBBDD);
		System.out.println("Media de los alumnos en Programación: " + mediaProg);
		System.out.println("Media de los alumnos en Móviles: " + mediaMov);
		
		scnum.close();
	}

}
