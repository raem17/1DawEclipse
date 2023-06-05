import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		
		Padawan [] datosPadawans = new Padawan [5];
		Jedi [] datosJedis = new Jedi [5];
		
		
		// Los padawans rellenan sus datos
		for (int i = 0; i < datosPadawans.length; i++) {
			datosPadawans[i] = new Padawan(null, i, i, i, null);
			
			System.out.println("Padawan "+ (i+1) + ". Introduzca su nombre:");
			datosPadawans[i].setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca su edad:");
			datosPadawans[i].setEdad(scnum.nextInt());
			
			System.out.println("Introduzca su fuerza:");
			datosPadawans[i].setFuerza(scnum.nextInt());
			
			System.out.println("Introduzca su potencial:");
			datosPadawans[i].setPotencial(scnum.nextInt());
			
			System.out.println("Introduzca su planeta de procedencia:");
			datosPadawans[i].setPlaneta_procedencia(sctxt.nextLine());
		}
		
		
		// Los jedi rellenan sus datos
		for (int i = 0; i < datosJedis.length; i++) {
			datosJedis[i] = new Jedi(null, i, i, i, null, null);
			
			System.out.println("Jedi "+ (i+1) + ". Introduzca su nombre:");
			datosJedis[i].setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca su edad:");
			datosJedis[i].setEdad(scnum.nextInt());
			
			System.out.println("Introduzca su fuerza:");
			datosJedis[i].setFuerza(scnum.nextInt());
			
			System.out.println("Introduzca su potencial:");
			datosJedis[i].setPotencial(scnum.nextInt());
			
			System.out.println("Introduzca su planeta de procedencia:");
			datosJedis[i].setPlaneta_procedencia(sctxt.nextLine());
			
			System.out.println("Introduzca su color de espada láser:");
			datosJedis[i].setColor_laser(sctxt.nextLine());
		}
		
		
		// Menú
		int opc = 0;
		do {
			System.out.println("");
			System.out.println("Elija una opción del menú:");
			mostrarMenu();
			opc = scnum.nextInt();
			
			
			switch (opc) {
			case 1:
				
				mostrarDatosTodosLosJedis(datosJedis);
				
				break;
			case 2:
				
				mostrarDatosPadas(datosPadawans);
				
				break;
			case 3:
				
				mostrarDatosJedi(dameJedixnombre(datosJedis));
				
				break;
			case 4:
				
				mostrarDatosPadawan(damePadaxnombre(datosPadawans));
				
				break;
			case 5:
				
				int potencial = 0;
				
				
				System.out.println("Introduzca el valor (potencial):");
				potencial = scnum.nextInt();
				
				
				for (int i = 0; i < damePadassuppot(datosPadawans, potencial).length; i++) {
					System.out.println(damePadassuppot(datosPadawans, potencial)[i]);
				}
				
				break;
			case 6:
				
				mostrarJedis2maxfuerza(datosJedis);
				
				break;
			case 7:
								
				mostrarDatosPadawan(damePadaminfuerza(datosPadawans));
				
				break;
			case 8:
				
				char letra = ' ';
				
				System.out.println("Introduzca la letra:");
				
				letra = sctxt.nextLine().charAt(0);
				
				mostrarDatosPadas(damePadasxletra(datosPadawans, letra));
				
				break;
			case 9:
				
				mostrarDatosTodosLosJedis(ponerJedismayusculas(datosJedis));
								
				break;
			case 10:
				
				mostrarDatosPadas(ponerPadasminus(datosPadawans));
				
				break;
			case 11:
				
				System.out.println("Ha salido del programa.");
				
				break;
			default: System.out.println("Opción incorrecta.");
				break;
			}
		} while (opc != 11);
		
		
		scnum.close();
		sctxt.close();
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	// Métodos
	
	static void mostrarMenu() {
		System.out.println("");
		System.out.println("1.	Mostrar datos de todos los Jedis.");
		System.out.println("2.	Mostrar datos de todos los Padawans.");
		System.out.println("3.	Mostrar datos de 1 Jedi.");
		System.out.println("4.	Mostrar datos de 1 Padawan.");
		System.out.println("5.	Mostrar un listado con los nombres de los padawans que tengan un potencial superior a un valor introducido.");
		System.out.println("6.	Mostrar los datos de los 2 Jedis que tengan más nivel de fuerza.");
		System.out.println("7.	Mostrar los datos del Padawan con menor potencial.");
		System.out.println("8.	Mostrar los datos de todos los Padawans que su nombre empiece o termine por una letra introducida.");
		System.out.println("9.	Modifica todos los nombres de los Jedis y ponlos en mayúsculas.");
		System.out.println("10.	Modifica los nombres de los padawans y ponlos todos en minúsculas.");
		System.out.println("11.	Salir.");
	}
	
	// Jedi
	
	static void mostrarDatosJedi(Jedi jedi) {
		System.out.println("Nombre: " + jedi.getNombre());
		System.out.println("Edad: " + jedi.getEdad());
		System.out.println("Fuerza: " + jedi.getFuerza());
		System.out.println("Potencial: " + jedi.getPotencial());
		System.out.println("Planeta de procedencia: " + jedi.getPlaneta_procedencia());
		System.out.println("Color de la espada láser: " + jedi.getColor_laser());
	}
	
	static void mostrarDatosTodosLosJedis(Jedi [] datosJedi) {
		for (int i = 0; i < datosJedi.length; i++) {
			mostrarDatosJedi(datosJedi[i]);
			System.out.println("");
		}
	}
	
	
	static Jedi dameJedixnombre(Jedi [] datosJedis) {
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		boolean existe = false;
		Jedi jediPedido = new Jedi();
		
		System.out.println("Introduzca el nombre del jedi:");
		nombre = sctxt.nextLine();
		
		
		for (int i = 0; i < datosJedis.length; i++) {
			if (datosJedis[i].getNombre().equals(nombre)) {
				existe = true;
				
				jediPedido = datosJedis[i];
			}
		}
		
		
		if (existe == false) {
			System.out.println("El jedi no existe.");
		}
		
		return jediPedido;
	}
	
	
	static Jedi[] ponerJedismayusculas(Jedi [] datosJedis) {
		for (int i = 0; i < datosJedis.length; i++) {
			datosJedis[i].setNombre(datosJedis[i].getNombre().toUpperCase());
		}
		
		return datosJedis;
	}
	
	static void mostrarJedis2maxfuerza(Jedi [] datosJedis) {
		Jedi aux;
		
		
		// Lo ordena de menor a mayor según la fuerza
		for (int i = 0; i < datosJedis.length; i++) {
			for (int j = 0; j < datosJedis.length-1; j++) {
				if (datosJedis[j+1].getFuerza() < datosJedis[j].getFuerza()) {
					aux = datosJedis[j+1];
					datosJedis[j+1] = datosJedis[j];
					datosJedis[j] = aux;
				}
			}
		}
		
		
		// Imprime los datos de los dos últimos
		for (int i = datosJedis.length-2; i < datosJedis.length; i++) {
			mostrarDatosJedi(datosJedis[i]);
			System.out.println("");
		}
	}
	
	// Padawan
	
	static void mostrarDatosPadawan(Padawan padawan) {
		System.out.println("Nombre: " + padawan.getNombre());
		System.out.println("Edad: " + padawan.getEdad());
		System.out.println("Fuerza: " + padawan.getFuerza());
		System.out.println("Potencial: " + padawan.getPotencial());
		System.out.println("Planeta de procedencia: " + padawan.getPlaneta_procedencia());
	}
	
	static void mostrarDatosPadas(Padawan [] datosPadawan) {
		for (int i = 0; i < datosPadawan.length; i++) {
			mostrarDatosPadawan(datosPadawan[i]);
			System.out.println("");
		}
	}
	
	static Padawan damePadaxnombre(Padawan [] datosPadawans) {
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		boolean existe = false;
		Padawan padawanPedido = new Padawan();
		
		
		System.out.println("Introduzca el nombre del padawan:");
		nombre = sctxt.nextLine();
		
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getNombre().equals(nombre)) {
				existe = true;
				
				padawanPedido = datosPadawans[i];
			}
		}
		
		
		if (existe == false) {
			System.out.println("El padawan no existe.");
		}
		
		return padawanPedido;
	}
	
	
	static String [] damePadassuppot(Padawan [] datosPadawans, int potencial) {
		int cont = 0;
		
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getPotencial() > potencial) {
				cont++;
			}
		}
		
		String [] nombresPadawans = new String [cont];
		
		for (int i = 0, j = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getPotencial() > potencial) {
				nombresPadawans [j] = datosPadawans[i].getNombre();
				j++;
			}
		}
		
		return nombresPadawans;
	}
	
	
	static Padawan damePadaminfuerza(Padawan [] datosPadawans) {
		System.out.println("");
		
		Padawan padawanMinFuerza = new Padawan();
		int potencialMin = 0;
		
		
		// Declaro potencialMin como el potencial del último padawan
		for (int i = 0; i < datosPadawans.length; i++) {
			potencialMin = datosPadawans[i].getPotencial();
		}
		
		
		// Busco el padawan con menor potencial
		for (int i = 0; i < datosPadawans.length; i++) {
			if (potencialMin > datosPadawans[i].getPotencial()) {
				potencialMin = datosPadawans[i].getPotencial();
				padawanMinFuerza = datosPadawans[i];
			}
		}
		
		return padawanMinFuerza;
	}
	
	static Padawan [] damePadasxletra(Padawan [] datosPadawans, char letra) {
		Scanner sctxt = new Scanner(System.in);
		int cont = 0; 
		
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getNombre().startsWith(String.valueOf(letra)) || datosPadawans[i].getNombre().endsWith(String.valueOf(letra)) ) {
				cont++;
			}
		}
		
		
		Padawan [] padawansxLetra = new Padawan [cont];
		
		
		for (int i = 0, j = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getNombre().startsWith(String.valueOf(letra)) || datosPadawans[i].getNombre().endsWith(String.valueOf(letra)) ) {
				padawansxLetra[j] = datosPadawans[i];
				j++;
			}
		}
		
		return padawansxLetra;
	}
	
	
	static Padawan[] ponerPadasminus(Padawan [] datosPadawans) {
		for (int i = 0; i < datosPadawans.length; i++) {
			datosPadawans[i].setNombre(datosPadawans[i].getNombre().toLowerCase());
		}
		
		return datosPadawans;
	}

}
