import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
		Scanner sctxt = new Scanner( System.in );
		
		String nombre1 = "";
		double notaProgramacion1 = 0;
		double notaSistemas1 = 0;
		double notaBBDD1 = 0;
		
		
		String nombre2 = "";
		double notaProgramacion2 = 0;
		double notaSistemas2 = 0;
		double notaBBDD2 = 0;		
		
		
		String nombre3 = "";
		double notaProgramacion3 = 0;
		double notaSistemas3 = 0;
		double notaBBDD3 = 0;
		
		//String nombre4 = "";
		double notaProgramacion4 = 0;
		double notaSistemas4 = 0;
		double notaBBDD4 = 0;
		
		//String nombre5 = "";
		double notaProgramacion5 = 0;
		double notaSistemas5 = 0;
		double notaBBDD5 = 0;
		
		int opc = 0;
        
		
		System.out.println("Alumno 1, introduzca su nombre:");
		nombre1 = sctxt.nextLine();
		
		System.out.println("Alumno 1, introduzca su nota en Programación:");
		notaProgramacion1 = scnum.nextDouble();
		
		System.out.println("Alumno 1, introduzca su nota en Sistemas:");
		notaSistemas1 = scnum.nextDouble();
		
		System.out.println("Alumno 1, introduzca su nota en Bases de Datos:");
		notaBBDD1 = scnum.nextDouble();
		
		
		
		System.out.println("Alumno 2, introduzca su nombre:");
		nombre2 = sctxt.nextLine();
		
		System.out.println("Alumno 2, introduzca su nota en Programación:");
		notaProgramacion2 = scnum.nextDouble();
		
		System.out.println("Alumno 2, introduzca su nota en Sistemas:");
		notaSistemas2 = scnum.nextDouble();
		
		System.out.println("Alumno 2, introduzca su nota en Bases de Datos:");
		notaBBDD2 = scnum.nextDouble();
		
	
		
		System.out.println("Alumno 3, introduzca su nombre:");
		nombre3 = sctxt.nextLine();
		
		System.out.println("Alumno 3, introduzca su nota en Programación:");
		notaProgramacion3 = scnum.nextDouble();
		
		System.out.println("Alumno 3, introduzca su nota en Sistemas:");
		notaSistemas3 = scnum.nextDouble();
		
		System.out.println("Alumno 3, introduzca su nota en Bases de Datos:");
		notaBBDD3 = scnum.nextDouble();
		
		
				
		/*System.out.println("Alumno 4, introduzca su nombre:");
		nombre4 = sctxt.nextLine();*/
		
		System.out.println("Alumno 4, introduzca su nota en Programación:");
		notaProgramacion4 = scnum.nextDouble();
		
		System.out.println("Alumno 4, introduzca su nota en Sistemas:");
		notaSistemas4 = scnum.nextDouble();
		
		System.out.println("Alumno 4, introduzca su nota en Bases de Datos:");
		notaBBDD4 = scnum.nextDouble();
		
				
		
		/*System.out.println("Alumno 5, introduzca su nombre:");
		nombre5 = sctxt.nextLine();*/
		
		System.out.println("Alumno 5, introduzca su nota en Programación:");
		notaProgramacion5 = scnum.nextDouble();
		
		System.out.println("Alumno 5, introduzca su nota en Sistemas:");
		notaSistemas5 = scnum.nextDouble();
		
		System.out.println("Alumno 5, introduzca su nota en Bases de Datos:");
		notaBBDD5 = scnum.nextDouble();
        
		
		
		System.out.println("Elija una opción del menú:");
        System.out.println("");
        System.out.println("1: Mostrar las notas del alumno 1.");
        System.out.println("2: Mostrar las notas del alumno 2.");
        System.out.println("3: Mostrar las notas del alumno 3.");
        System.out.println("4: Mostrar la nota media de todos los alumnos en todas las asignaturas.");
        System.out.println("5: Mostrar la nota media de todos los alumnos en Programación.");
        System.out.println("6: Mostrar la nota media de todos los alumnos en Sistemas.");
        System.out.println("7: Mostrar la nota media de todos los alumnos en Bases de Datos.");
        System.out.println("8: Salir.");
           
        opc = scnum.nextInt();
        
        
        switch (opc) {
        
        case 1:
        	
    		double notaMedia1 = 0;
    		
        	notaMedia1 = (notaProgramacion1 + notaSistemas1 + notaBBDD1) / 3;
            
        	System.out.println("Nombre: " + nombre1 + ". Programación: " + notaProgramacion1 + ". Sistemas: " + notaSistemas1 + ". Bases de datos: " + notaBBDD1 + ". Nota media: " + notaMedia1 + ".");
            
        	break;      
        	
        case 2:
        	
        	double notaMedia2 = 0;
        	
        	notaMedia2 = (notaProgramacion2 + notaSistemas2 + notaBBDD2) / 3;
            
        	System.out.println("Nombre: " + nombre2 + ". Programación: " + notaProgramacion2 + ". Sistemas: " + notaSistemas2 + ". Bases de datos: " + notaBBDD2 + ". Nota media: " + notaMedia2 + ".");
            
        	break; 
        	
        case 3:
        	
        	double notaMedia3 = 0;
        	
        	notaMedia3 = (notaProgramacion3 + notaSistemas3 + notaBBDD3) / 3;
            
        	System.out.println("Nombre: " + nombre3 + ". Programación: " + notaProgramacion3 + ". Sistemas: " + notaSistemas3 + ". Bases de datos: " + notaBBDD3 + ". Nota media: " + notaMedia3 + ".");
            
        	break; 
        	
        case 4:
        	
        	double notaMediaAlumnosAsig = 0;        	        	
        	
        	notaMediaAlumnosAsig = (notaProgramacion1 + notaProgramacion2 + notaProgramacion3 + notaProgramacion4 + notaProgramacion5 + notaSistemas1 + notaSistemas2 + notaSistemas3 + notaSistemas4 + notaSistemas5 + notaBBDD1 + notaBBDD2 + notaBBDD3 + notaBBDD4 + notaBBDD5) / 15;
        	          	
        	System.out.println("La nota media de todos los alumnos en todas las asignaturas es: " + notaMediaAlumnosAsig);
            
        	break;
        	
        case 5:
        	
        	double notaMediaAlumnosProgramacion = 0;
        	
        	notaMediaAlumnosProgramacion = (notaProgramacion1 + notaProgramacion2 + notaProgramacion3 + notaProgramacion4 + notaProgramacion5) / 5;
        	
        	System.out.println("La nota media de todos los alumnos en Programación es: " + notaMediaAlumnosProgramacion);
            
        	break;
        	
        case 6:
        	
        	double notaMediaAlumnosSistemas = 0;
        	
        	notaMediaAlumnosSistemas = (notaSistemas1 + notaSistemas2 + notaSistemas3 + notaSistemas4 + notaSistemas5) / 5;
        	
        	System.out.println("La nota media de todos los alumnos en Sistemas es: " + notaMediaAlumnosSistemas);
            
        	break;
        	
        case 7:
        	
        	double notaMediaAlumnosBBDD = 0;
        	
        	notaMediaAlumnosBBDD = (notaBBDD1 + notaBBDD2 + notaBBDD3 + notaBBDD4 + notaBBDD5) / 5;
        	
        	System.out.println("La nota media de todos los alumnos en Bases de Datos es: " + notaMediaAlumnosBBDD);
            
        	break;
        	
        case 8:
        	System.out.println("Has salido del programa.");
        	System.out.close();
        	break;
  
        }
        
        scnum.close();
        sctxt.close();
	}

}
