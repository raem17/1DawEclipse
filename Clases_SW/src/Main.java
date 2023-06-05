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
				
				for (int i = 0; i < datosJedis.length; i++) {
					datosJedis[i].mostrarDatosJedi();
					System.out.println("");
				}
				
				break;
			case 2:
				
				for (int i = 0; i < datosPadawans.length; i++) {
					datosPadawans[i].mostrarDatosPadawan();
					System.out.println("");
				}
				
				break;
			case 3:
				
				Jedi.mostrarDatosJediConcreto(datosJedis);
				
				break;
			case 4:
				
				Padawan.mostrarDatosPadawanConcreto(datosPadawans);
				
				break;
			case 5:
				
				Padawan.mostrarNombresPadawansPotencialSuperior(datosPadawans);
				
				break;
			case 6:
				
				Jedi.dosJedisMasNivelFuerza(datosJedis);
				
				break;
			case 7:
				
				Padawan.mostrarDatosPadawanMenorPotencial(datosPadawans);
				
				break;
			case 8:
				
				Padawan.mostrarDatosPadawansLetraInicioOFin(datosPadawans);
				
				break;
			case 9:
				
				Jedi.setNombresJedisEnMayus(datosJedis);
								
				break;
			case 10:
				
				Padawan.setNombresPadawansEnMinus(datosPadawans);
				
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

}
