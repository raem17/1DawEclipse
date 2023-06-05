import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase Main que contiene un programa que simula una lucha del Street Fighter 2 y algunos metodos.
 * @author roger
 */
public class Main {

	/**
	 * Metodo principal que ejecuta un programa que muestra dos menus de eleccion de personajes al usuario, al seleccionar a los luchadores se genera un combate virtual y 
	 * se imprime por pantalla los datos mas relevantes del combate.
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		
		ArrayList<Personaje> personajes = new ArrayList<Personaje>();
		inicializarPersonajes(personajes);
		Personaje luchador1 = new Personaje();
		int opc1 = 0;
		Personaje luchador2 = new Personaje();
		int opc2 = 0;
		
		// El usuario escoge al luchador 1
		do {
			System.out.println("Seleccione al luchador 1.");
			mostrarMenu();
			opc1 = scnum.nextInt();
			
			if (opcion1_EsValida(opc1)) {
				luchador1 = personajes.get(opc1-1);
				System.out.println("Ha escogido como luchador 1 a: " + luchador1.getNombre_personaje() + "\n");
			} else {
				System.out.println("Opción no válida. Escoja de nuevo.");
			}
			
		} while (!opcion1_EsValida(opc1));
		
		// El usuario escoge al luchador 2
		do {
			System.out.println("¡AVISO!: No escoja un luchador que ya ha sido escogido.");
			System.out.println("Seleccione al luchador 2.");
			mostrarMenu();
			opc2 = scnum.nextInt();
			
			if (opcion2_EsValida(opc1, opc2)) {
				luchador2 = personajes.get(opc2-1);
				System.out.println("Ha escogido como luchador 2 a: " + luchador2.getNombre_personaje() + "\n");
			} else {
				System.out.println("Opción no válida. Escoja de nuevo.");
			}
			
		} while (!opcion2_EsValida(opc1, opc2));
		
		simulaCombate(luchador1, luchador2);
		
		scnum.close();
	}
	
	// Métodos
	
	/**
	 * Muestra por pantalla el menu de seleccion del luchador 1.
	 */
	public static void mostrarMenu() {
		System.out.println("Introduzca el número:");
		System.out.println("1. Ryu.");
		System.out.println("2. Edmond Honda.");
		System.out.println("3. Blanka.");
		System.out.println("4. Guile.");
		System.out.println("5. Ken Masters.");
		System.out.println("6. Chun-Li.");
		System.out.println("7. Zangief.");
		System.out.println("8. Dhalsim.");
		System.out.print("--> ");
	}
	
	/**
	 * Metodo que devuelve un booleano en funcion de si la opcion 1 pasada por parametro es valida.
	 * @param opc1 Opcion 1.
	 * @return true si la opcion 1 es valida, de lo contrario false.
	 */
	// Nombre de método modificado
	public static boolean opcion1_EsValida(int opc1) {
		boolean esValida = false;
		
		if (opc1 > 0 && opc1 < 9) {
			esValida = true;
		}
		
		return esValida;
	}
	
	/**
	 * Metodo que devuelve un booleano en funcion de si la opcion 2 pasada por parametro es valida, se comprueba con la opcion 1 tambien pasada por parametro.
	 * @param opc1 Opcion 1.
	 * @param opc2 Opcion 2.
	 * @return true si la opcion 2 es valida y es distinta de la opcion 1, de lo contrario false.
	 */
	// Nombre de método modificado
	public static boolean opcion2_EsValida(int opc1, int opc2) {
		boolean esValida = false;
		
		if (opc2 > 0 && opc2 < 9 && opc2 != opc1) {
			esValida = true;
		}
		
		return esValida;
	}
	
	/**
	 * Rellena el ArrayList de personajes pasado por parametro con personajes creados.
	 * @param personajes ArrayList de objetos de tipo Personaje.
	 */
	public static void inicializarPersonajes (ArrayList<Personaje> personajes) {
		String historia = "Ryu quedó huérfano desde muy temprana edad y sin recuerdos de sus padres, es encontrado por el Maestro del Ansatsuken, Gouken, quien lo tomaría como su pupilo e hijo. Durante varios años, Ryu entrenó en el arte del Ansatsuken, demostrando un talento innato para el combate.";
		//Ryu
		Personaje Ryu = new Personaje("Ryu", "Japón", historia, 175, 68, "Marrón", "Gi blanco, guantillas y una cinta en la frente", "Castillo de Suzaku (Japón)", 100, 8.5, 9);
		// E. Honda
		historia = "E. Honda se molestó porque el resto del mundo no consideraba la lucha de sumo con la reverencia que los japoneses demuestran. Ingresó en el segundo torneo World Warrior con la intención de mostrar a todos que los luchadores de sumo se encuentran entre los mejores peleadores del mundo.";
		Personaje E_Honda = new Personaje("Edmond Honda", "Japón", historia, 188, 137, "Oscuro", "Yukata azul", "Baños calientes Edo (Japón)", 100, 6.5, 10);
		// Blanka
		historia = "Blanka es un mutante con forma de bestia que creció en la jungla de Brasil.";
		Personaje Blanka = new Personaje("Blanka", "Brasil", historia, 192, 98, "Naranja", "Pantalones cortos", "Cuenca del río Amazonas (Brasil)", 100, 8, 7.5);
		// Guile
		historia = "Guile, un antiguo miembro militar estadounidense.";
		Personaje Guile = new Personaje("Guile", "Estados Unidos", historia, 182, 99, "Amarillo", "Atuendo militar", "Base aérea (EEUU)", 100, 7, 7);
		// Ken
		historia = "Ken, rival de Ryu, originario de los Estados Unidos.";
		Personaje Ken = new Personaje("Ken Masters", "Estados Unidos", historia, 175, 83, "Amarillo", "Keikogi rojo", "Battle Harbor (EEUU)", 100, 8, 9);
		// Chun-Li
		historia = "Chun-Li es una artista marcial experta y oficial de la Interpol. Sin descanso, ella busca venganza por la muerte de su padre a manos del líder de la organización criminal Shadaloo, M. Bison.";
		Personaje Chun_Li = new Personaje("Chun-Li", "China", historia, 169, 0, "Castaño", "Qipao", "Distrito comercial, Peace Road (China)", 100, 10, 7);
		// Zangief
		historia = "Zangief es un héroe nacional ruso que siempre se ve luchando por la gloria de su país.";
		Personaje Zangief = new Personaje("Zangief", "Rusia", historia, 214, 115, "Oscuro", "Calzoncillos boxer deportivos de lucha libre profesional", "Grand Factory (URSS)", 100, 7, 7.5);
		// Dhalsim
		historia = "Dhalsim, un maestro de yoga de la India.";
		Personaje Dhalsim = new Personaje("Dhalsim", "India", historia, 176, 48, "Calvo", "Pantalones cortos desgastados, muñequeras, tobilleras y turbante", "Palacio de Maharajah (India)", 100, 8.5, 6);
		
		// 
		
		personajes.add(Ryu);
		personajes.add(E_Honda);
		personajes.add(Blanka);
		personajes.add(Guile);
		personajes.add(Ken);
		personajes.add(Chun_Li);
		personajes.add(Zangief);
		personajes.add(Dhalsim);
	}
	
	/**
	 * Devuelve el nombre de un ataque generado aleatoriamente.
	 * @return El nombre del ataque generado (String).
	 */
	public static String generarAtaque() {
		String ataque = "";
		// Genera un número entre 1 y 9
		int num = (int)(Math.random()*(9-1+1)+1);
		
		switch (num) {
		case 1: ataque = "punnio_rapido";
			break;
		case 2: ataque = "punnio_lento";
			break;
		case 3: ataque = "patada_rapida";
			break;
		case 4: ataque = "patada_lenta";
			break;
		case 5: ataque = "agarre_rapido";
			break;
		case 6: ataque = "agarre_lento";
			break;
		case 7: ataque = "ataque_especial_1";
			break;
		case 8: ataque = "ataque_especial_2";
			break;
		case 9: ataque = "ataque_especial_3";
			break;
		}
		
		return ataque;
	}
	
	/**
	 * Crea e imprime por pantalla un combate virtual entre los personajes pasados por parametro.
	 * @param personaje1 Objeto Personaje.
	 * @param personaje2 Objeto Personaje.
	 */
	public static void simulaCombate (Personaje personaje1, Personaje personaje2) {
		System.out.println("Luchador 1: " + personaje1.getNombre_personaje() + ". Luchador 2: " + personaje2.getNombre_personaje());
		System.out.println("Escenario: " + personaje1.getEscenario());
		System.out.println("Comienza el combate.");
		int num_asalto = 0;
		
		// Si el primer turno es del PJ 1.
		// Se establce que si la velocidad de los dos personajes es igual, el primer turno será del PJ1
		if (esMasRapidoP1(personaje1, personaje2)) {
			while (personaje1.getPuntos_vida() > 0 || personaje2.getPuntos_vida() > 0) {
				System.out.println("\nAsalto " + (num_asalto + 1));
				num_asalto++;
				
				simulaTurnoLuchador(personaje1, personaje2);
				
				if (!luchadorEstaKO(personaje2)) {
					simulaTurnoLuchador(personaje2, personaje1);
					
					if (luchadorEstaKO(personaje1)) {
						break;
					}
					
				} else {
					break;
				}

			} // Fin de bucle while
			
			simulaFinDeCombate(personaje1, personaje2);
			
		} else {
			while (personaje1.getPuntos_vida() > 0 || personaje2.getPuntos_vida() > 0) {
				System.out.println("\nAsalto " + (num_asalto + 1));
				num_asalto++;
				
				simulaTurnoLuchador(personaje2, personaje1);
				
				if (!luchadorEstaKO(personaje1)) {
					simulaTurnoLuchador(personaje1, personaje2);
					
					if (luchadorEstaKO(personaje1)) {
						break;
					}
					
				} else {
					break;
				}
				
			} // Fin de bucle while
			
			simulaFinDeCombate(personaje1, personaje2);
		}
		
		System.out.println("Combate acabado.");
	}

	/**
	 * @param personaje1
	 * @return
	 */
	private static boolean luchadorEstaKO (Personaje personaje1) {
		return personaje1.getPuntos_vida() <= 0;
	}

	/**
	 * @param personaje1
	 * @param personaje2
	 * @return
	 */
	private static boolean esMasRapidoP1(Personaje personaje1, Personaje personaje2) {
		return personaje1.getVelocidad() >= personaje2.getVelocidad();
	}
	
	/**
	 * 
	 * @param personaje1
	 * @param personaje2
	 */
	public static void simulaTurnoLuchador (Personaje personaje1, Personaje personaje2) {
		System.out.print(personaje1.getNombre_personaje() + " ataca a " + personaje2.getNombre_personaje() + ". ");
		if (haEsquivado()) {
			System.out.print(personaje2.getNombre_personaje() + " ha esquivado el ataque de " + personaje1.getNombre_personaje() + ".");
		} else {
			System.out.print(personaje2.getNombre_personaje() + " ha recibido el ataque de " + personaje1.getNombre_personaje() + ".");
			personaje2.restarVida(personaje1.ataque(generarAtaque()));
		}
		
		// Código integrado del método 'imprimirSaludLuchadores'
		System.out.print(" Salud de " + personaje1.getNombre_personaje() + ": " + personaje1.getPuntos_vida());
		System.out.println(". Salud de " + personaje2.getNombre_personaje() + ": " + personaje2.getPuntos_vida() + ".");
	}
	
	/**
	 * Devuelve un booleano aleatorio que puede ser true o false.
	 * @return true o false.
	 */
	public static boolean haEsquivado() {
		Random esquivado = new Random();
		
		return esquivado.nextBoolean();
	}

	// Técnica aplicada: extracción de método
	// cambiarlo
	public static void simulaFinDeCombate(Personaje personaje1, Personaje personaje2) {
		if (personaje1.getPuntos_vida() > 0) {
			System.out.println("\n" + personaje1.getNombre_personaje() + " ha ganado el combate.\n");
			
			if (haHechoPerfect(personaje1)) {
				System.out.print(". " + personaje1.getNombre_personaje() + " ha hecho PERFECT, no ha recibido ningún daño.");
			}
		} else if (personaje2.getPuntos_vida() > 0) {
			System.out.println("\n" + personaje2.getNombre_personaje() + " ha ganado el combate.\n");
			
			if (haHechoPerfect(personaje2)) {
				System.out.print(". " + personaje2.getNombre_personaje() + " ha hecho PERFECT, no ha recibido ningún daño.");
			}
		}
	}
	
	/**
	 * Devuelve un booleano en funcion de si la salud del personaje recibido por parametro es igual a 100.
	 * @param personajeGanador Objeto Personaje.
	 * @return true si la salud del personaje es igual a 100, de lo contrario false.
	 */
	// Nombre de método cambiado de 'esPerfect' a 'haHechoPerfect'
	public static boolean haHechoPerfect(Personaje personajeGanador) {
		boolean esPerfect = false;
		
		if (personajeGanador.getPuntos_vida() == 100) {
			esPerfect = true;
		}
		
		return esPerfect;
	}
	
}
