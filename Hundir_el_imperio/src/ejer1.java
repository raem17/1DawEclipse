import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		// Declaración e iniciación de arrays, variables y scanner
		Scanner scnum = new Scanner (System.in);
		
		String [] columna0Alianza = new String [10];
		String [] columna1Alianza = new String [10];
		String [] columna2Alianza = new String [10];
		String [] columna3Alianza = new String [10];
		String [] columna4Alianza = new String [10];
		String [] columna5Alianza = new String [10];
		String [] columna6Alianza = new String [10];
		String [] columna7Alianza = new String [10];
		String [] columna8Alianza = new String [10];
		String [] columna9Alianza = new String [10];
		
		String [] columna0Imperio = new String [10];
		String [] columna1Imperio = new String [10];
		String [] columna2Imperio = new String [10];
		String [] columna3Imperio = new String [10];
		String [] columna4Imperio = new String [10];
		String [] columna5Imperio = new String [10];
		String [] columna6Imperio = new String [10];
		String [] columna7Imperio = new String [10];
		String [] columna8Imperio = new String [10];
		String [] columna9Imperio = new String [10];
		
		String [] columnaAJ = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		
		int opc = 0;
		
		
		// Se rellenan los arrays (columnas de las dos tablas) con ceros
		for (int i = 0; i <= 9; i++) {
			columna0Alianza [i] = "0";
			columna1Alianza [i] = "0";
			columna2Alianza [i] = "0";
			columna3Alianza [i] = "0";
			columna4Alianza [i] = "0";
			columna5Alianza [i] = "0";
			columna6Alianza [i] = "0";
			columna7Alianza [i] = "0";
			columna8Alianza [i] = "0";
			columna9Alianza [i] = "0";
			
			columna0Imperio [i] = "0";
			columna1Imperio [i] = "0";
			columna2Imperio [i] = "0";
			columna3Imperio [i] = "0";
			columna4Imperio [i] = "0";
			columna5Imperio [i] = "0";
			columna6Imperio [i] = "0";
			columna7Imperio [i] = "0";
			columna8Imperio [i] = "0";
			columna9Imperio [i] = "0";
		}
		
		
		// Bucle while menú
		while (opc != 5) {
			System.out.println("");
			System.out.println("Menú:");
			System.out.println("");
			System.out.println("1. Hacer lanzamiento Alianza.");
			System.out.println("2. Hacer lanzamiento Imperio.");
			System.out.println("3. Mostrar Tablero Alianza.");
			System.out.println("4. Mostrar Tablero Imperio.");
			System.out.println("5. Salir.");
			opc = scnum.nextInt();
			
			
			switch (opc) {
	        case 1:
	        	
	        	//a
	            
	        	break;
	        	
	        case 2:
	        	
	        	//a
	            
	        	break;
	        	
	        case 3:
	        	
	    		System.out.println("	ALIANZA");
	    		System.out.println("");
	    		System.out.print("   " +"0 " + "1 "+ "2 "+ "3 "+ "4 "+ "5 "+ "6 "+ "7 "+ "8 "+ "9");
	    		System.out.println("");
	    		for (int i = 0; i < columna0Alianza.length; i++) {
	    			System.out.println(columnaAJ [i] + " |" + columna0Alianza [i] + "|" + columna1Alianza [i] + "|" + columna2Alianza [i] + "|" + columna3Alianza [i] + "|" + columna4Alianza [i] + "|" + columna5Alianza [i] + "|" + columna6Alianza [i] + "|" + columna7Alianza [i] + "|" + columna8Alianza [i] + "|" + columna9Alianza [i] + "|");
	    		}
	            
	        	break;
	        	
	        case 4:
	        	
	    		System.out.println("	IMPERIO");
	    		System.out.println("");
	    		System.out.print("   " +"0 " + "1 "+ "2 "+ "3 "+ "4 "+ "5 "+ "6 "+ "7 "+ "8 "+ "9");
	    		System.out.println("");
	    		for (int i = 0; i < columna0Imperio.length; i++) {
	    			System.out.println(columnaAJ [i] + " |" + columna0Imperio [i] + "|" + columna1Imperio [i] + "|" + columna2Imperio [i] + "|" + columna3Imperio [i] + "|" + columna4Imperio [i] + "|" + columna5Imperio [i] + "|" + columna6Imperio [i] + "|" + columna7Imperio [i] + "|" + columna8Imperio [i] + "|" + columna9Imperio [i] + "|");
	    		}
	            
	        	break;	  
			}
		}
		
	}

}
