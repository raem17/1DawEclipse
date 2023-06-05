import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in);
		Scanner sctxt = new Scanner( System.in);
		
		String [] nombres = new String [5];
		int [] notasProgramacion = new int [5];
		int [] notasBBDD = new int [5];
		int [] notasMoviles = new int [5];
		
		int opc = 0;
		
		
		// El usuario rellena el array de nombres
		for (int i = 0; i < 5; i++) {
			System.out.println("Alumno nº " + (i + 1) + " introduzca su nombre y apellido:");
			nombres [i] = sctxt.nextLine();
		}
		
		// Se rellenan los arrays de notas con numeros aleatorios
		for (int i = 0; i < 5; i++) {
			notasProgramacion [i] = (int) (Math.random()*11);
			notasBBDD [i] = (int) (Math.random()*11);
			notasMoviles [i] = (int) (Math.random()*11);
		}
		
		
		// Menú
        do {
        	System.out.println("");
        	System.out.println("Menú:");
            System.out.println("");
            System.out.println("1. Mostrar notas de alumnos.");
            System.out.println("2. Modificar notas de alumnos.");
            System.out.println("3. Mostrar nombre del mejor alumno.");
            System.out.println("4. Mostrar nota media de un alumno.");
            System.out.println("5. Mostrar nota media de todos los alumnos.");
            System.out.println("6. Mostrar la nota media por asignaturas.");
            System.out.println("7. Mostrar peor alumno.");
            System.out.println("8. Salir.");       
            opc = scnum.nextInt();
               
            // Switch
            switch (opc) {
            
            case 1:
    			System.out.println("Ha seleccionado el menú 1:");
    			System.out.println("");
    			
        		for (int i = 0; i < 5; i++) {
        			System.out.println(nombres [i] + ": Programación: " + notasProgramacion [i] + " - BBDD: " + notasBBDD [i] + " - Móviles: " + notasMoviles [i]);
        		}
            	               
            	break;
            	
            case 2:
    			System.out.println("Ha seleccionado el menú 2:");
    			System.out.println("");
    			
    			String nombreCase2 = "";
    			String moduloAlumno = "";
    			
    			
    			System.out.println("Introduzca su nombre:");
    			nombreCase2 = sctxt.nextLine();
    			
    			System.out.println("Introduzca su módulo:");
    			moduloAlumno = sctxt.nextLine();
    			
    			/* Con un for se recorre el array de nombres y con if se evalua si alguno es igual 
    			 al nombre introducido*/
    			for(int i = 0; i < 5; i++) {
    				if(nombres [i].equalsIgnoreCase(nombreCase2)) {
    					
    					// Con tres if se evalúa qué módulo ha introducido el usuario
    					if(moduloAlumno.equalsIgnoreCase("Programación")) {
    						System.out.println("Introduzca su nueva nota:");
    						notasProgramacion [i] = scnum.nextInt();
    					}
    					
    					else if(moduloAlumno.equalsIgnoreCase("Móviles")) {
    						System.out.println("Introduzca su nueva nota:");
    						notasMoviles [i] = scnum.nextInt();
    					}
    					
    					else if(moduloAlumno.equalsIgnoreCase("BBDD")) {
    						System.out.println("Introduzca su nueva nota:");
    						notasBBDD [i] = scnum.nextInt();
    					}
    				}
    				
    			}
               
            	break;
            	
            case 3:
    			System.out.println("Ha seleccionado el menú 3:");
    			System.out.println("");
    			
            	int mejorMedia = 0;
            	String nombreMejorMedia = "";
            	int [] mediasCase3 = new int [5];
            	
            	
        		for (int i = 0; i < 5; i++) {
        			mediasCase3 [i] = (notasProgramacion [i] + notasMoviles [i] + notasBBDD [i]) / 3;
        			
        			if (mediasCase3 [i] > mejorMedia) {
        				mejorMedia = mediasCase3 [i];
        				nombreMejorMedia = nombres [i];
        			}
        		}
        		
        		System.out.println("El alumno con la nota media más alta es: " + nombreMejorMedia);
            	               
            	break;
            
            case 4:
    			System.out.println("Ha seleccionado el menú 4:");
    			System.out.println("");
    			
    			String nombreCase4 = "";
    			
    			
    			System.out.println("Introduzca un nombre:");
    			nombreCase4 = sctxt.nextLine();
    			
    			/* Con un for se recorre el array de nombres y con if se evalua si alguno es igual 
    			 al nombre introducido*/
    			for(int i = 0; i < 5; i++) {
    				if(nombres [i].equalsIgnoreCase(nombreCase4)) {
    					int mediaNotas = (notasProgramacion [i] + notasMoviles [i] + notasBBDD [i]) / 3;   					
    					System.out.println("La nota media de los examenes de " + nombres [i] + " es: " + mediaNotas);
    				}
    				
    			}   			
        		    			           	               
            	break;
            	
            case 5:
    			System.out.println("Ha seleccionado el menú 5:");
    			System.out.println("");
    			
    			int [] mediasCase5 = new int [5];
    			
    			for(int i = 0; i < 5; i++) {
    				mediasCase5 [i] = (notasProgramacion [i] + notasMoviles [i] + notasBBDD [i]) / 3;
    				System.out.println(nombres [i] + ": " + mediasCase5 [i]);
    			}
            	               
            	break;
            	
            case 6:
    			System.out.println("Ha seleccionado el menú 6:");
    			System.out.println("");
    			
    			int acuProgramacion = 0;
    			int acuMoviles = 0;
    			int acuBBDD = 0;
    			
    			
    			for (int i = 0; i < 5; i++) {
    				acuProgramacion = acuProgramacion + notasProgramacion [i];
    			}           	
    			System.out.println("Nota media de la clase en Programación: " + (acuProgramacion / 5));
    			
    			for (int i = 0; i < 5; i++) {
    				acuBBDD = acuBBDD + notasBBDD [i];
    			}           	
    			System.out.println("Nota media de la clase en Bases de Datos: " + (acuBBDD / 5));
    			
    			for (int i = 0; i < 5; i++) {
    				acuMoviles = acuMoviles + notasMoviles [i];
    			}           	
    			System.out.println("Nota media de la clase en Móviles: " + (acuMoviles / 5));
    			 			
            	break;
            	
            case 7:
    			System.out.println("Ha seleccionado el menú 7:");
    			System.out.println("");
    			
            	int peorMedia = 1000;
            	int [] mediasCase7 = new int [5];
            	
        		for (int i = 0; i < 5; i++) {
        			mediasCase7 [i] = (notasProgramacion [i] + notasMoviles [i] + notasBBDD [i]) / 3;
        			
        			if (mediasCase7 [i] < peorMedia) {
        				peorMedia = mediasCase7 [i];
        			}
        		}
        		
        		System.out.println("La nota media en todas las asignaturas del peor alumno es: " + peorMedia);
            	               
            	break;
            }
            
        }while (opc != 8);
        
        System.out.println("Has salido del programa.");
        
        scnum.close();
        sctxt.close();
		
	}

}
