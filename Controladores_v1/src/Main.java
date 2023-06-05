import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		
		Controlador [] datosControladores = new Controlador [10];
		Aerolinea [] datosAerolineas = new Aerolinea [10];
		Avion [] datosAviones = new Avion [10];
		Vuelo [] datosVuelos = new Vuelo [10];
		
		
		// Se rellenan los datos
		for (int i = 0; i < datosControladores.length; i++) {
			// Controladores	
			
			datosControladores[i] = new Controlador(null, null, null, i, i, i);
			
			System.out.println("Introduzca su nombre:");
			datosControladores[i].setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca sus apellidos:");
			datosControladores[i].setApellidos(sctxt.nextLine());
			
			System.out.println("Introduzca su DNI:");
			datosControladores[i].setDNI(sctxt.nextLine());
			
			System.out.println("Introduzca su año de nacimiento:");
			datosControladores[i].setAño_nacimiento(scnum.nextInt());
			
			System.out.println("Introduzca sus años de experiencia:");
			datosControladores[i].setAños_experiencia(scnum.nextInt());
			
			System.out.println("Introduzca su nivel de destreza (0-100):");
			datosControladores[i].setNivel_destreza(scnum.nextInt());
			
			// Aerolineas
			
			datosAerolineas[i] = new Aerolinea(null, null);
			
			System.out.println("Introduzca el nombre de la aerolínea:");
			datosAerolineas[i].setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca el país de origen de la aerolínea:");
			datosAerolineas[i].setPais_origen(sctxt.nextLine());
			
			// Aviones
			
			datosAviones[i] = new Avion(null, null, null, i, i);
			
			System.out.println("Introduzca la marca del avión:");
			datosAviones[i].setMarca(sctxt.nextLine());
			
			System.out.println("Introduzca el modelo del avión:");
			datosAviones[i].setModelo(sctxt.nextLine());
			
			System.out.println("Introduzca la matrícula del avión:");
			datosAviones[i].setMatricula(sctxt.nextLine());
			
			System.out.println("Introduzca la capacidad del depósito del avión:");
			datosAviones[i].setCapacidad_deposito(scnum.nextDouble());
			
			System.out.println("Introduzca la capacidad de pasajeros del avión:");
			datosAviones[i].setCapacidad_pasajeros(scnum.nextInt());
			
			// Vuelos
			
			datosVuelos[i] = new Vuelo(null, i, i);
			
			System.out.println("Introduzca la ciudad de destino del vuelo:");
			datosVuelos[i].setCiudad_destino(sctxt.nextLine());
			
			System.out.println("Introduzca el número del vuelo:");
			datosVuelos[i].setNum_vuelo(scnum.nextInt());
			
			System.out.println("Introduzca el precio del vuelo:");
			datosVuelos[i].setPrecio(scnum.nextDouble());
		}
		
		
		// Menú
		
		int opc = 0;
		
		do {
			mostrarMenu();
			opc = scnum.nextInt();
			
			
			switch (opc) {
			
			// Caso 1
			case 1:
				mostrarSubMenu1();
				int opcSubMenu1 = scnum.nextInt();
				
				// Switch de submenú 1
				switch (opcSubMenu1) {
				case 1:
					
					System.out.println("Introduzca el nombre de la aerolínea:");
					String nombre = sctxt.nextLine();
					
					mostrarDatosAerolineaXNombre(nombre, datosAerolineas);
					
					break;
				case 2:
					
					System.out.println("Introduzca la matrícula del avión:");
					String matricula = sctxt.nextLine();
					
					mostrarDatosAvionXMatricula(matricula, datosAviones);
					
					break;
				case 3:
					
					System.out.println("Introduzca el número del vuelo:");
					int numVuelo = scnum.nextInt();
					
					mostrarDatosVueloXNumVuelo(numVuelo, datosVuelos);
					
					break;
				case 4:
					
					System.out.println("Introduzca el DNI del controlador:");
					String DNI = sctxt.nextLine();
					
					mostrarDatosControladorXDNI(DNI, datosControladores);
					
					break;

				default: System.out.println("Opción incorrecta. Está de vuelta en el menú principal");
					break;
				}
				
				break;
				
			// Caso 2	
			case 2:
				mostrarSubMenu2();
				int opcSubMenu2 = scnum.nextInt();
				
				// Switch de submenú 2
				switch (opcSubMenu2) {
				case 1:
					
					for (int i = 0; i < datosAerolineas.length; i++) {
						datosAerolineas[i].mostrarDatosAerolinea();
						System.out.println("");
					}
					
					break;
				case 2:
					
					for (int i = 0; i < datosAviones.length; i++) {
						datosAviones[i].mostrarDatosAvion();
						System.out.println("");
					}
					
					break;
				case 3:
					
					for (int i = 0; i < datosVuelos.length; i++) {
						datosVuelos[i].mostrarDatosVuelo();
						System.out.println("");
					}
					
					break;
				case 4:
					
					for (int i = 0; i < datosControladores.length; i++) {
						datosControladores[i].mostrarDatosControlador();
						System.out.println("");
					}
					
					break;

				default: System.out.println("Opción incorrecta. Está de vuelta en el menú principal.");
					break;
				}
				
				break;
			// Caso 3
			case 3:
				
				aumentarCapacidadDepositoAvion(datosAviones);
				
				break;
				
			case 4:
				
				sumarExperienciaControlador(datosControladores);
				
				break;
			case 5:
				
				aumentarCapacidadPasajerosAvion(datosAviones);
				
				break;
			case 6:
				
				System.out.println("Ha salido del menú.");
				
				break;
			case 7:
				
				avionMayorDeposito(datosAviones).mostrarDatosAvion();
				
				break;
			case 8:
				
				avionMenorCapacidadPasajeros(datosAviones).mostrarDatosAvion();
				
				break;
			case 9:
				
				controladorDestrezaMax(datosControladores).mostrarDatosControlador();
				
				break;
			case 10:
				
				for (int i = 0; i < tresControladoresExperienciaMax(datosControladores).length; i++) {
					tresControladoresExperienciaMax(datosControladores)[i].mostrarDatosControlador();
					System.out.println("");
				}
				
				break;
			case 11:
				
				for (int i = 0; i < dosVuelosPrecioMin(datosVuelos).length; i++) {
					dosVuelosPrecioMin(datosVuelos)[i].mostrarDatosVuelo();
					System.out.println("");
				}
				
				break;
			case 12:
				
				avionMenorDeposito(datosAviones).mostrarDatosAvion();
				
				break;
				
			default: System.out.println("Opción incorrecta.");
				break;
			}
		} while (opc != 6);
		
		sctxt.close();
		scnum.close();
	}
	
	
	// Métodos
	
	static void mostrarMenu() {
		System.out.println("");
		System.out.println("1.	Buscar (Aerolíneas, Aviones, Vuelos, Controladores).");
		System.out.println("2.	Mostrar datos (Aerolíneas, Aviones, Vuelos, Controladores).");
		System.out.println("3.	Aumentar capacidad de depósito a Avión.");
		System.out.println("4.	Sumar puntos de experiencia a controlador.");
		System.out.println("5.	Aumentar capacidad de pasajeros de un Avión.");
		System.out.println("6.	Salir.");
		System.out.println("7.	Mostrar datos del Avión con mayor depósito.");
		System.out.println("8.	Mostrar Datos del Avión con menor capacidad de pasajeros.");
		System.out.println("9.	Mostrar los datos del controlador con mayor destreza.");
		System.out.println("10.	Mostrar los datos de los 3 controladores con mayor experiencia.");
		System.out.println("11.	Mostrar los datos de los 2 vuelos menos caros.");
		System.out.println("12.	Mostrar datos del Avión con menor depósito.");
	}
	
	
	static void mostrarSubMenu1() {
		System.out.println("");
		System.out.println("1.	Aerolíneas. (Por nombre)");
		System.out.println("2.	Aviones. (Por matrícula)");
		System.out.println("3.	Vuelos. (Por nº de vuelo)");
		System.out.println("4.	Controladores. (Por dni)");
	}
	
	
	static void mostrarDatosAerolineaXNombre (String nombre, Aerolinea [] datosAerolineas) {
		boolean existe = false;
		
		for (int i = 0; i < datosAerolineas.length; i++) {
			if (datosAerolineas[i].getNombre().equals(nombre)) {
				datosAerolineas[i].mostrarDatosAerolinea();
				existe = true;
			}
		}
		
		if (existe == false) {
			System.out.println("La aerolínea no existe.");
		}
	}
	
	
	static void mostrarDatosAvionXMatricula (String matricula, Avion [] datosAviones) {
		boolean existe = false;
		
		for (int i = 0; i < datosAviones.length; i++) {
			if (datosAviones[i].getMatricula().equals(matricula)) {
				datosAviones[i].mostrarDatosAvion();
				existe = true;
			}
		}
		
		if (existe == false) {
			System.out.println("El avión no existe.");
		}
	}
	
	
	static void mostrarDatosVueloXNumVuelo (int numVuelo, Vuelo [] datosVuelos) {
		boolean existe = false;
		
		for (int i = 0; i < datosVuelos.length; i++) {
			if (datosVuelos[i].getNum_vuelo() == numVuelo) {
				datosVuelos[i].mostrarDatosVuelo();
				existe = true;
			}
		}
		
		if (existe == false) {
			System.out.println("El vuelo no existe.");
		}
	}
	
	
	static void mostrarDatosControladorXDNI (String DNI, Controlador [] datosControladores) {
		boolean existe = false;
		
		for (int i = 0; i < datosControladores.length; i++) {
			if (datosControladores[i].getDNI().equals(DNI)) {
				datosControladores[i].mostrarDatosControlador();
				existe = true;
			}
		}
		
		if (existe == false) {
			System.out.println("El controlador no existe.");
		}
	}
	
	
	static void mostrarSubMenu2() {
		System.out.println("");
		System.out.println("1.	Aerolíneas.");
		System.out.println("2.	Aviones.");
		System.out.println("3.	Vuelos");
		System.out.println("4.	Controladores.");
	}
	
	
	static void aumentarCapacidadDepositoAvion (Avion [] datosAviones) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		
		
		boolean existeMatricula = false;
		int posicionAvion = 0;
		
		
		System.out.println("Introduzca la matrícula de un avión:");
		String matricula = sctxt.nextLine();

		
		for (int i = 0; i < datosAviones.length; i++) {
			if (datosAviones[i].getMatricula().equals(matricula)) {
				existeMatricula = true;
				posicionAvion = i;
			}
		}
		
		
		if (existeMatricula == true) {
			System.out.println("Introduzca un valor, el depósito del avión aumentará según el valor introducido:");
			double valor = scnum.nextDouble();
			
			System.out.println("");
			System.out.println("Datos antiguos:");
			datosAviones[posicionAvion].mostrarDatosAvion();
			
			
			datosAviones[posicionAvion].incrementoDeposito(valor);
			
			System.out.println("");
			System.out.println("Datos actualizados:");
			datosAviones[posicionAvion].mostrarDatosAvion();			
			
		} else {
			System.out.println("La matrícula del avión no existe.");
		}
	}
	
	
	static void sumarExperienciaControlador (Controlador [] datosControladores) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		
		
		boolean existeDNI = false;
		int posicionControlador = 0;
		
		
		System.out.println("Introduzca el DNI del controlador:");
		String DNI = sctxt.nextLine();

		
		for (int i = 0; i < datosControladores.length; i++) {
			if (datosControladores[i].getDNI().equals(DNI)) {
				existeDNI = true;
				posicionControlador = i;
			}
		}
		
		
		if (existeDNI == true) {
			System.out.println("Introduzca un valor, los años de experiencia del controlador aumentarán según el valor introducido:");
			int valor = scnum.nextInt();
			
			System.out.println("");
			System.out.println("Datos antiguos:");
			datosControladores[posicionControlador].mostrarDatosControlador();
			
			
			datosControladores[posicionControlador].incrementoAñosExperiencia(valor);
			
			System.out.println("");
			System.out.println("Datos actualizados:");
			datosControladores[posicionControlador].mostrarDatosControlador();			
			
		} else {
			System.out.println("El DNI del controlador no existe.");
		}
	}
	
	
	static void aumentarCapacidadPasajerosAvion (Avion [] datosAviones) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		
		
		boolean existeMatricula = false;
		int posicionAvion = 0;
		
		
		System.out.println("Introduzca la matrícula de un avión:");
		String matricula = sctxt.nextLine();

		
		for (int i = 0; i < datosAviones.length; i++) {
			if (datosAviones[i].getMatricula().equals(matricula)) {
				existeMatricula = true;
				posicionAvion = i;
			}
		}
		
		
		if (existeMatricula == true) {
			System.out.println("Introduzca un valor, la capacidad de pasajeros del avión aumentará según el valor introducido:");
			int valor = scnum.nextInt();
			
			System.out.println("");
			System.out.println("Datos antiguos:");
			datosAviones[posicionAvion].mostrarDatosAvion();
			
			
			datosAviones[posicionAvion].incrementoCapacidadPasajeros(valor);
			
			System.out.println("");
			System.out.println("Datos actualizados:");
			datosAviones[posicionAvion].mostrarDatosAvion();			
			
		} else {
			System.out.println("La matrícula del avión no existe.");
		}
	}
	
	
	static Avion avionMayorDeposito (Avion [] datosAviones) {
		double depositoMax = datosAviones[0].getCapacidad_deposito() - 1;
		Avion avionDepositoMax = new Avion();
		
		
		for (int i = 0; i < datosAviones.length; i++) {
			if (datosAviones[i].getCapacidad_deposito() > depositoMax) {
				depositoMax = datosAviones[i].getCapacidad_deposito();
				avionDepositoMax = datosAviones[i];
			}
		}
		
		return avionDepositoMax;
	}
	
	
	static Avion avionMenorDeposito (Avion [] datosAviones) {
		double depositoMin = datosAviones[0].getCapacidad_deposito() + 1;
		Avion avionDepositoMin = new Avion();
		
		
		for (int i = 0; i < datosAviones.length; i++) {
			if (datosAviones[i].getCapacidad_deposito() < depositoMin) {
				depositoMin = datosAviones[i].getCapacidad_deposito();
				avionDepositoMin = datosAviones[i];
			}
		}
		
		return avionDepositoMin;
	}
	
	
	static Avion avionMenorCapacidadPasajeros (Avion [] datosAviones) {
		int pasajerosMin = datosAviones[0].getCapacidad_pasajeros() + 1;
		Avion avionPasajerosMin = new Avion();
		
		
		for (int i = 0; i < datosAviones.length; i++) {
			if (datosAviones[i].getCapacidad_pasajeros() < pasajerosMin) {
				pasajerosMin = datosAviones[i].getCapacidad_pasajeros();
				avionPasajerosMin = datosAviones[i];
			}
		}
		
		return avionPasajerosMin;
	}
	
	
	static Controlador controladorDestrezaMax (Controlador [] datosControladores) {
		int destrezaMax = datosControladores[0].getNivel_destreza() - 1;
		Controlador controladorDestrezaMax = new Controlador();
		
		
		for (int i = 0; i < datosControladores.length; i++) {
			if (datosControladores[i].getNivel_destreza() > destrezaMax) {
				destrezaMax = datosControladores[i].getNivel_destreza();
				controladorDestrezaMax = datosControladores[i];
			}
		}
		
		return controladorDestrezaMax;
	}
	
	
	static Controlador [] tresControladoresExperienciaMax (Controlador [] datosControladores) {
		Controlador [] datosControladoresExperienciaMax = new Controlador [3];
		Controlador aux = new Controlador();
		
		
		// Ordena el array de mayor a menor según los años de experiencia
		for (int i = 0; i < datosControladores.length; i++) {
			for (int j = 0; j < datosControladores.length-1; j++) {
				if (datosControladores[j+1].getAños_experiencia() > datosControladores[j].getAños_experiencia()) {
					aux = datosControladores[j+1];
					datosControladores[j+1] = datosControladores[j];
					datosControladores[j] = aux;
				}
			}
		}
		
		
		for (int i = 0; i < datosControladoresExperienciaMax.length; i++) {
			datosControladoresExperienciaMax[i] = datosControladores[i];
		}
		
		
		return datosControladoresExperienciaMax;
	}
	
	
	static Vuelo [] dosVuelosPrecioMin (Vuelo [] datosVuelos) {
		Vuelo [] datosVuelosPrecioMin = new Vuelo [2];
		Vuelo aux = new Vuelo();
		
		
		// Ordena el array de menor a mayor según el precio de los vuelos
		for (int i = 0; i < datosVuelos.length; i++) {
			for (int j = 0; j < datosVuelos.length-1; j++) {
				if (datosVuelos[j+1].getPrecio() < datosVuelos[j].getPrecio()) {
					aux = datosVuelos[j+1];
					datosVuelos[j+1] = datosVuelos[j];
					datosVuelos[j] = aux;
				}
			}
		}
		
		
		for (int i = 0; i < datosVuelosPrecioMin.length; i++) {
			datosVuelosPrecioMin[i] = datosVuelos[i];
		}
		
		
		return datosVuelosPrecioMin;
	}

}
