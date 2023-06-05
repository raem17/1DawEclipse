import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		// 10 filas 6 columnas
		String datos [][] = new String [10][6];
		int opc = 0;
		
		
		// Los usuarios rellenan el array
		for (int i = 0; i < datos.length; i++) {
			System.out.println("Introduzca su nombre:");
			datos [i][0] = sctxt.nextLine();
			
			System.out.println(datos [i][0] + ". Introduzca su nota en Redes:");
			datos [i][1] = sctxt.nextLine();
			
			System.out.println(datos [i][0] + ". Introduzca su nota en Sistemas:");
			datos [i][2] = sctxt.nextLine();
			
			System.out.println(datos [i][0] + ". Introduzca su nota en Móviles:");
			datos [i][3] = sctxt.nextLine();
		
			System.out.println(datos [i][0] + ". Introduzca su nota en Programación:");
			datos [i][4] = sctxt.nextLine();
			
			System.out.println(datos [i][0] + ". Introduzca su nota en FOL:");
			datos [i][5] = sctxt.nextLine();
		}
		
		
		// Menú con switch
		do {
			Utilidades.menu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1:
				Utilidades.mostrarNotaAlumno(datos);
				break;
				
			case 2:
				Utilidades.mostrarNotasAlumnos(datos);
				break;
				
			case 3:
				Utilidades.modificarDatos(datos);
				break;
				
			case 4:
				Utilidades.suspensoGeneral(datos);		
				break;
				
			case 5:
				Utilidades.aprobadoGeneral(datos);		
				break;
				
			case 6:
				System.out.println("Ha salido del programa.");
				break;

			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc != 6);
		
		scnum.close();
		sctxt.close();
	}


}
