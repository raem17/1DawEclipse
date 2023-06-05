import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);

		Avion[] datosAviones = new Avion[2];
		int indiceAviones = 0;
		rellenarValoresNulosAviones(datosAviones);

		Comandante[] datosComandantes = new Comandante[2];
		int indiceComandantes = 0;
		rellenarValoresNulosComandantes(datosComandantes);

		Aeropuerto[] datosAeropuertos = new Aeropuerto[2];
		int indiceAeropuertos = 0;
		rellenarValoresNulosAeropuertos(datosAeropuertos);
	
		Pasajero[] datosPasajeros = new Pasajero[2];
		int indicePasajeros = 0;
		rellenarValoresNulosPasajeros(datosPasajeros);

		Vuelo[] datosVuelos = new Vuelo[1];
		int indiceVuelos = 0;
		rellenarValoresNulosVuelos(datosVuelos);

		
		int opc = 0;
		do {
			mostrarMenu();

			System.out.println("Introduzca una opción:");
			opc = scnum.nextInt();

			switch (opc) {
			case 1:

				if (indiceAviones < datosAviones.length) {
					datosAviones[indiceAviones] = crearAvion(datosAviones);
					indiceAviones++;
				} else {
					System.out.println("");
					System.out.println("Límite de aviones alcanzado.");
					System.out.println("");
				}

				break;
			case 2:

				if (indiceComandantes < datosComandantes.length) {
					datosComandantes[indiceComandantes] = crearComandante(datosComandantes);
					indiceComandantes++;
				} else {
					System.out.println("");
					System.out.println("Límite de comandantes alcanzado.");
					System.out.println("");
				}

				break;
			case 3:
				
				if (indiceAeropuertos < datosAeropuertos.length) {
					datosAeropuertos[indiceAeropuertos] = crearAeropuerto(datosAeropuertos);
					indiceAeropuertos++;
				} else {
					System.out.println("");
					System.out.println("Límite de aeropuertos alcanzado.");
					System.out.println("");
				}
				
				break;
			case 4:
				
				if (indicePasajeros < datosPasajeros.length) {
					datosPasajeros[indicePasajeros] = crearPasajero(datosPasajeros);
					indicePasajeros++;
				} else {
					System.out.println("");
					System.out.println("Límite de pasajeros alcanzado.");
					System.out.println("");
				}

				break;
			case 5:
				
				if (indiceVuelos < datosVuelos.length) {
					datosVuelos[indiceVuelos] = crearVuelo(datosVuelos);
					indiceVuelos++;
				} else {
					System.out.println("");
					System.out.println("Límite de vuelos alcanzado.");
					System.out.println("");
				}

				break;
			case 6:
				
				if (indiceAviones > 0) {
					for (int i = 0; i < indiceAviones; i++) {
						System.out.println("Datos del avión " + i + ":");
						datosAviones[i].mostrarDatosAvion();

						System.out.println("Datos del comandante del avión " + i + ":");
						datosAviones[i].getDatosComandante().mostrarDatosComandante();
					}
				} else {
					System.out.println("No se ha introducido ningún avión.");
				}

				break;
			case 7:
				
				if (indiceComandantes > 0) {
					for (int i = 0; i < indiceComandantes; i++) {
						datosComandantes[i].mostrarDatosComandante();
					}
				} else {
					System.out.println("No se ha introducido ningún comandante.");
				}

				break;
			case 8:
				
				if (indiceAeropuertos > 0) {
					for (int i = 0; i < indiceAeropuertos; i++) {
						System.out.println("Datos del aeropuerto " + i + ":");
						datosAeropuertos[i].mostrarDatosAeropuerto();
					}
					
				} else {
					System.out.println("No se ha introducido ningún aeropuerto.");
				}

				
				break;
			case 9:
				
				if (indicePasajeros > 0) {
					for (int i = 0; i < indicePasajeros; i++) {
						System.out.println("Datos del pasajero: " + i + ":");
						datosPasajeros[i].mostrarDatosPasajero();
					}
				} else {
					System.out.println("No se ha introducido ningún pasajero.");
				}

				break;
			case 10:
				
				if (indiceVuelos > 0) {
					for (int i = 0; i < datosVuelos.length; i++) {
						System.out.println("Datos del vuelo " + i + ":");
						datosVuelos[i].mostrarDatosVuelo();
						
						System.out.println("");
						System.out.println("Datos del avión del vuelo " + i + ":");
						datosVuelos[i].getDatosAvion().mostrarDatosAvion();
						
						System.out.println("");
						System.out.println("Datos del aeropuerto de salida del vuelo " + i + ":");
						datosVuelos[i].getAeropuerto_salida().mostrarDatosAeropuerto();
						
						System.out.println("");
						System.out.println("Datos del aeropuerto de llegada del vuelo " + i + ":");
						datosVuelos[i].getAeropuerto_llegada().mostrarDatosAeropuerto();
						
					}
				} else {
					System.out.println("No se ha introducido ningún vuelo.");
				}

				break;
			case 11:
				System.out.println("Ha salido del programa.");

				break;

			default:
				System.out.println("Opción incorrecta.");
				break;
			}

		} while (opc != 11);

		scnum.close();
		sctxt.close();
	}

	static void mostrarMenu() {
		System.out.println("**************************************************************");
		System.out.println("1. Insertar 1 Avión en el array de aviones.");
		System.out.println("2. Insertar 1 Comandante en el array de comandantes.");
		System.out.println("3. Insertar 1 Aeropuerto en el array de aeropuertos.");
		System.out.println("4. Insertar 1 Pasajero en el array de pasajeros.");
		System.out.println("5. Insertar 1 Vuelo en el array de vuelos.");
		System.out.println("6. Mostrar datos de todos los aviones.");
		System.out.println("7. Mostrar datos de todos los Comandantes.");
		System.out.println("8. Mostrar datos de todos los Aeropuertos.");
		System.out.println("9. Mostrar datos de todos los Pasajeros.");
		System.out.println("10. Mostrar datos de todos los Vuelos.");
		System.out.println("11. Salir");
		System.out.println("**************************************************************");
		System.out.println("");
	}

	
// Métodos para aviones -----------------------------------------------------------------------------------

	static void rellenarValoresNulosAviones(Avion[] datosAviones) {
		Comandante aux = new Comandante("", "", "", "", 0, "");

		for (int i = 0; i < datosAviones.length; i++) {
			datosAviones[i] = new Avion(0, 0, "", 0, 0, aux);
		}

	}

	static Avion crearAvion(Avion[] datosAviones) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		Comandante datosComandante = new Comandante(null, null, null, null, 0, null);
		Avion datosAvion = new Avion(0, 0, null, 0, 0, datosComandante);

		// Datos del avión
		System.out.println("");
		System.out.println("Rellene los datos del avión:");
		System.out.println("");
		
		System.out.println("Introducza el modelo del avión:");
		datosAvion.setModelo(scnum.nextInt());

		System.out.println("Introduzca la capacidad de pasajeros:");
		datosAvion.setCapacidadPasajeros(scnum.nextInt());

		establecerMatricula(datosAviones, datosAvion);

		System.out.println("Introduzca la capacidad del depósito:");
		datosAvion.setCapacidadDeposito(scnum.nextDouble());

		System.out.println("Introduzca el año de fabricación:");
		datosAvion.setAñoFabricacion(scnum.nextInt());

		// Datos del comandante
		System.out.println("");
		System.out.println("Rellene los datos del comandante del avión:");
		System.out.println("");
		
		System.out.println("Introduzca el nombre del comandante:");
		datosComandante.setNombre(sctxt.nextLine());

		System.out.println("Introduzca los apellidos del comandante:");
		datosComandante.setApellidos(sctxt.nextLine());

		System.out.println("Introduzca el nº de teléfono del comandante:");
		datosComandante.setTelefono(sctxt.nextLine());

		System.out.println("Introduzca el DNI del comandante:");
		datosComandante.setDni(sctxt.nextLine());

		System.out.println("Introduzca la edad del comandante:");
		datosComandante.setEdad(scnum.nextInt());

		System.out.println("Introduzca el rango del comandante:");
		datosComandante.setRango(sctxt.nextLine());

		return datosAvion;
	}

	// Método auxiliar para el método "crearAvion"
	static void establecerMatricula(Avion[] datosAviones, Avion datosAvion) {
		Scanner sctxt = new Scanner(System.in);

		System.out.println("Introduzca la matrícula:");
		String matricula = sctxt.nextLine();

		boolean existeMatricula = false;

		for (int i = 0; i < datosAviones.length; i++) {
			if (datosAviones[i].getMatricula().equalsIgnoreCase(matricula)) {
				existeMatricula = true;
			}
		}

		if (existeMatricula == true) {
			do {
				System.out.println("Matrícula no establecida. La matrícula introducida ya existe.");
				System.out.println("Introduzca de nuevo la matrícula:");
				matricula = sctxt.nextLine();

				existeMatricula = false; // importante

				for (int i = 0; i < datosAviones.length; i++) {
					if (datosAviones[i].getMatricula().equalsIgnoreCase(matricula)) {
						existeMatricula = true;
					}
				}

			} while (existeMatricula == true);

			datosAvion.setMatricula(matricula);
			System.out.println("Matrícula establecida.");

		} else {
			datosAvion.setMatricula(matricula);
		}
	}

	
// Métodos para comandantes --------------------------------------------------------------------------------------

	static void rellenarValoresNulosComandantes(Comandante[] datosComandantes) {
		for (int i = 0; i < datosComandantes.length; i++) {
			datosComandantes[i] = new Comandante("", "", "", "", 0, "");
		}

	}

	static Comandante crearComandante(Comandante[] datosComandantes) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		Comandante datosComandante = new Comandante(null, null, null, null, 0, null);
		
		System.out.println("");
		System.out.println("Rellene los datos del comandante:");
		System.out.println("");
		
		System.out.println("Introduzca el nombre del comandante:");
		datosComandante.setNombre(sctxt.nextLine());

		System.out.println("Introduzca los apellidos del comandante:");
		datosComandante.setApellidos(sctxt.nextLine());

		System.out.println("Introduzca el nº de teléfono del comandante:");
		datosComandante.setTelefono(sctxt.nextLine());

		establecerDNIComandante(datosComandantes, datosComandante);

		System.out.println("Introduzca la edad del comandante:");
		datosComandante.setEdad(scnum.nextInt());

		System.out.println("Introduzca el rango del comandante:");
		datosComandante.setRango(sctxt.nextLine());

		return datosComandante;
	}

	// Método auxiliar para el método "crearComandante"
	static void establecerDNIComandante(Comandante[] datosComandantes, Comandante datosComandante) {
		Scanner sctxt = new Scanner(System.in);

		System.out.println("Introduzca el DNI del comandante:");
		String dni = sctxt.nextLine();

		boolean existeDNI = false;

		for (int i = 0; i < datosComandantes.length; i++) {
			if (datosComandantes[i].getDni().equalsIgnoreCase(dni)) {
				existeDNI = true;
			}
		}

		if (existeDNI == true) {
			do {
				System.out.println("DNI no establecido. El DNI introducido ya existe.");
				System.out.println("Introduzca de nuevo el DNI:");
				dni = sctxt.nextLine();

				existeDNI = false; // importante

				for (int i = 0; i < datosComandantes.length; i++) {
					if (datosComandantes[i].getDni().equalsIgnoreCase(dni)) {
						existeDNI = true;
					}
				}

			} while (existeDNI == true);

			datosComandante.setDni(dni);
			System.out.println("DNI establecido.");

		} else {
			datosComandante.setDni(dni);
		}
	}

	
// Métodos para aeropuertos -----------------------------------------------------------------------------------

	static void rellenarValoresNulosAeropuertos(Aeropuerto[] datosAeropuertos) {
		for (int i = 0; i < datosAeropuertos.length; i++) {
			datosAeropuertos[i] = new Aeropuerto("", "", 0, null);
		}

	}

	static Aeropuerto crearAeropuerto(Aeropuerto[] datosAeropuertos) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);

		System.out.println("Introduzca el número de aviones que tendrá el aeropuerto:");
		int numAviones = scnum.nextInt();
		
		Avion[] datosAviones = new Avion[numAviones];
		Comandante[] datosComandantes = new Comandante[datosAviones.length];

		Aeropuerto datosAeropuerto = new Aeropuerto(null, null, 0, datosAviones);

		System.out.println("");
		System.out.println("Rellene los datos del aeropuerto:");
		System.out.println("");
		
		System.out.println("Introduzca el nombre del aeropuerto:");
		datosAeropuerto.setNombre(sctxt.nextLine());

		System.out.println("Introduzca la ciudad del aeropuerto:");
		datosAeropuerto.setCiudad(sctxt.nextLine());

		establecerCodigoAeropuerto(datosAeropuertos, datosAeropuerto);

		for (int i = 0; i < datosAviones.length; i++) {
			datosComandantes[i] = new Comandante(null, null, null, null, 0, null);
			datosAviones[i] = new Avion(0, 0, null, 0, 0, datosComandantes[i]);

			System.out.println("");
			System.out.println("Rellene los datos del avión " + i + " del aeropuerto:");
			System.out.println("");
			
			// Datos del avión
			System.out.println("Introducza el modelo del avión:");
			datosAviones[i].setModelo(scnum.nextInt());

			System.out.println("Introduzca la capacidad de pasajeros:");
			datosAviones[i].setCapacidadPasajeros(scnum.nextInt());

			System.out.println("Introduzca la matrícula del avión:");
			datosAviones[i].setMatricula(sctxt.nextLine());

			System.out.println("Introduzca la capacidad del depósito:");
			datosAviones[i].setCapacidadDeposito(scnum.nextDouble());

			System.out.println("Introduzca el año de fabricación:");
			datosAviones[i].setAñoFabricacion(scnum.nextInt());

			// Datos del comandante
			
			System.out.println("");
			System.out.println("Rellene los datos del comandante del avión " + i + " del aeropuerto:");
			System.out.println("");
			
			System.out.println("Introduzca el nombre del comandante:");
			datosComandantes[i].setNombre(sctxt.nextLine());

			System.out.println("Introduzca los apellidos del comandante:");
			datosComandantes[i].setApellidos(sctxt.nextLine());

			System.out.println("Introduzca el nº de teléfono del comandante:");
			datosComandantes[i].setTelefono(sctxt.nextLine());

			System.out.println("Introduzca el DNI del comandante:");
			datosComandantes[i].setDni(sctxt.nextLine());

			System.out.println("Introduzca la edad del comandante:");
			datosComandantes[i].setEdad(scnum.nextInt());

			System.out.println("Introduzca el rango del comandante:");
			datosComandantes[i].setRango(sctxt.nextLine());
		}

		return datosAeropuerto;
	}
	
	// Método auxiliar para el método "crearAeropuerto"
	static void establecerCodigoAeropuerto(Aeropuerto[] datosAeropuertos, Aeropuerto datosAeropuerto) {
		Scanner scnum = new Scanner(System.in);

		System.out.println("Introduzca el código del aeropuerto:");
		int codigo = scnum.nextInt();

		boolean existeCodigo = false;

		for (int i = 0; i < datosAeropuertos.length; i++) {
			if (datosAeropuertos[i].getCodigo_aeropuerto() == codigo) {
				existeCodigo = true;
			}
		}

		if (existeCodigo == true) {
			do {
				System.out.println("Código no establecido. El código introducido ya existe.");
				System.out.println("Introduzca de nuevo el código:");
				codigo = scnum.nextInt();

				existeCodigo = false; // importante

				for (int i = 0; i < datosAeropuertos.length; i++) {
					if (datosAeropuertos[i].getCodigo_aeropuerto() == codigo) {
						existeCodigo = true;
					}
				}

			} while (existeCodigo == true);

			datosAeropuerto.setCodigo_aeropuerto(codigo);;
			System.out.println("Código establecido.");

		} else {
			datosAeropuerto.setCodigo_aeropuerto(codigo);;
		}
	}

	
// Métodos para pasajeros -----------------------------------------------------------------------------------

	static void rellenarValoresNulosPasajeros(Pasajero[] datosPasajeros) {
		for (int i = 0; i < datosPasajeros.length; i++) {
			datosPasajeros[i] = new Pasajero("", "", "", "", i);
		}

	}
	
	static Pasajero crearPasajero (Pasajero[] datosPasajeros) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		
		Pasajero datosPasajero = new Pasajero(null, null, null, null, 0);
		
		System.out.println("");
		System.out.println("Rellene los datos del pasajero:");
		System.out.println("");
		
		System.out.println("Introduzca el nombre del pasajero:");
		datosPasajero.setNombre(sctxt.nextLine());
		
		System.out.println("Introduzca los apellidos del pasajero:");
		datosPasajero.setApellidos(sctxt.nextLine());
		
		System.out.println("Introduzca el teléfono del pasajero:");
		datosPasajero.setTelefono(sctxt.nextLine());
		
		establecerDNIPasajero(datosPasajeros, datosPasajero);
		
		System.out.println("Introduzca la edad del pasajero:");
		datosPasajero.setEdad(scnum.nextInt());
		
		return datosPasajero;
	}
	
	// Método auxiliar para el método "crearPasajero"
	static void establecerDNIPasajero(Pasajero[] datosPasajeros, Pasajero datosPasajero) {
		Scanner sctxt = new Scanner(System.in);

		System.out.println("Introduzca el DNI del pasajero:");
		String dni = sctxt.nextLine();

		boolean existeDNI = false;

		for (int i = 0; i < datosPasajeros.length; i++) {
			if (datosPasajeros[i].getDni().equalsIgnoreCase(dni)) {
				existeDNI = true;
			}
		}

		if (existeDNI == true) {
			do {
				System.out.println("DNI no establecido. El DNI introducido ya existe.");
				System.out.println("Introduzca de nuevo el DNI:");
				dni = sctxt.nextLine();

				existeDNI = false; // importante

				for (int i = 0; i < datosPasajeros.length; i++) {
					if (datosPasajeros[i].getDni().equalsIgnoreCase(dni)) {
						existeDNI = true;
					}
				}

			} while (existeDNI == true);

			datosPasajero.setDni(dni);
			System.out.println("DNI establecido.");

		} else {
			datosPasajero.setDni(dni);
		}
	}

	
// Métodos para vuelos -----------------------------------------------------------------------------------

	static void rellenarValoresNulosVuelos(Vuelo[] datosVuelos) {
		for (int i = 0; i < datosVuelos.length; i++) {
			datosVuelos[i] = new Vuelo(0, null, null, null, null);
		}

	}
	
	static Vuelo crearVuelo (Vuelo[] datosVuelos) {
		Scanner scnum = new Scanner(System.in);
		
		System.out.println("Introduzca el número de pasajeros que tendrá el vuelo:");
		int numPasajeros = scnum.nextInt();
		
		Pasajero[] datosPasajeros = new Pasajero [numPasajeros];
		
		Vuelo datosVuelo = new Vuelo(0, null, null, null, null);
		
		System.out.println("");
		System.out.println("Rellene los datos del vuelo:");
		System.out.println("");
		
		establecerCodigoVuelo(datosVuelos, datosVuelo);
		
		System.out.println("");
		System.out.println("Rellene los datos del avión del vuelo:");
		System.out.println("");
		
		datosVuelo.setDatosAvion(crearAvionAdaptadoAVuelo());
		
		System.out.println("");
		System.out.println("Rellene los datos de los pasajeros del vuelo:");
		System.out.println("");
		
		for (int i = 0; i < datosPasajeros.length; i++) {
			datosPasajeros[i] = crearPasajeroAdaptadoAVuelo();
		
		}
		datosVuelo.setDatosPasajeros(datosPasajeros);
		
		System.out.println("");
		System.out.println("Rellene los datos del aeropuerto de salida:");
		System.out.println("");
		datosVuelo.setAeropuerto_salida(crearAeropuertoAdapatadoAVuelo());
		
		System.out.println("");
		System.out.println("Rellene los datos del aeropuerto de llegada:");
		System.out.println("");
		datosVuelo.setAeropuerto_llegada(crearAeropuertoAdapatadoAVuelo());
		
		return datosVuelo;
	}
	
	// Método auxiliar para el método "crearVuelo"
	static void establecerCodigoVuelo(Vuelo[] datosVuelos, Vuelo datosVuelo) {
		Scanner scnum = new Scanner(System.in);

		System.out.println("Introduzca el código del vuelo:");
		int codigo = scnum.nextInt();

		boolean existeCodigo = false;

		for (int i = 0; i < datosVuelos.length; i++) {
			if (datosVuelos[i].getCod_vuelo() == codigo) {
				existeCodigo = true;
			}
		}

		if (existeCodigo == true) {
			do {
				System.out.println("Código no establecido. El código introducido ya existe.");
				System.out.println("Introduzca de nuevo el código:");
				codigo = scnum.nextInt();

				existeCodigo = false; // importante

				for (int i = 0; i < datosVuelos.length; i++) {
					if (datosVuelos[i].getCod_vuelo() == codigo) {
						existeCodigo = true;
					}
				}

			} while (existeCodigo == true);

			datosVuelo.setCod_vuelo(codigo);
			System.out.println("Código establecido.");

		} else {
			datosVuelo.setCod_vuelo(codigo);;
		}
	}
	
	// Método auxiliar para el método "crearVuelo" 
	static Avion crearAvionAdaptadoAVuelo () {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		Comandante datosComandante = new Comandante(null, null, null, null, 0, null);
		Avion datosAvion = new Avion(0, 0, null, 0, 0, datosComandante);

		// Datos del avión
		System.out.println("Introducza el modelo del avión:");
		datosAvion.setModelo(scnum.nextInt());

		System.out.println("Introduzca la capacidad de pasajeros:");
		datosAvion.setCapacidadPasajeros(scnum.nextInt());

		System.out.println("Introduzca la matrícula:");
		datosAvion.setMatricula(sctxt.nextLine());

		System.out.println("Introduzca la capacidad del depósito:");
		datosAvion.setCapacidadDeposito(scnum.nextDouble());

		System.out.println("Introduzca el año de fabricación:");
		datosAvion.setAñoFabricacion(scnum.nextInt());

		// Datos del comandante
		System.out.println("Introduzca el nombre del comandante:");
		datosComandante.setNombre(sctxt.nextLine());

		System.out.println("Introduzca los apellidos del comandante:");
		datosComandante.setApellidos(sctxt.nextLine());

		System.out.println("Introduzca el nº de teléfono del comandante:");
		datosComandante.setTelefono(sctxt.nextLine());

		System.out.println("Introduzca el DNI del comandante:");
		datosComandante.setDni(sctxt.nextLine());

		System.out.println("Introduzca la edad del comandante:");
		datosComandante.setEdad(scnum.nextInt());

		System.out.println("Introduzca el rango del comandante:");
		datosComandante.setRango(sctxt.nextLine());

		return datosAvion;
	}
	
	// Método auxiliar para el método "crearVuelo" 
	static Pasajero crearPasajeroAdaptadoAVuelo () {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		
		Pasajero datosPasajero = new Pasajero(null, null, null, null, 0);
		
		
		System.out.println("Introduzca el nombre del pasajero:");
		datosPasajero.setNombre(sctxt.nextLine());
		
		System.out.println("Introduzca los apellidos del pasajero:");
		datosPasajero.setApellidos(sctxt.nextLine());
		
		System.out.println("Introduzca el teléfono del pasajero:");
		datosPasajero.setTelefono(sctxt.nextLine());
		
		System.out.println("Introduzca el DNI del pasajero:");
		datosPasajero.setDni(sctxt.nextLine());
		
		System.out.println("Introduzca la edad del pasajero:");
		datosPasajero.setEdad(scnum.nextInt());
		
		return datosPasajero;
	}
	
	// Método auxiliar para el método "crearVuelo" 
	static Aeropuerto crearAeropuertoAdapatadoAVuelo() {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);

		System.out.println("Introduzca el número de aviones que tendrá el aeropuerto:");
		int numAviones = scnum.nextInt();
		
		Avion[] datosAviones = new Avion[numAviones];
		Comandante[] datosComandantes = new Comandante[datosAviones.length];

		Aeropuerto datosAeropuerto = new Aeropuerto(null, null, 0, datosAviones);

		System.out.println("Introduzca el nombre del aeropuerto:");
		datosAeropuerto.setNombre(sctxt.nextLine());

		System.out.println("Introduzca la ciudad del aeropuerto:");
		datosAeropuerto.setCiudad(sctxt.nextLine());

		System.out.println("Introduzca el código del aeropuerto:");
		datosAeropuerto.setCodigo_aeropuerto(scnum.nextInt());
		
		for (int i = 0; i < datosAviones.length; i++) {
			datosComandantes[i] = new Comandante(null, null, null, null, 0, null);
			datosAviones[i] = new Avion(0, 0, null, 0, 0, datosComandantes[i]);

			// Datos del avión
			
			System.out.println("");
			System.out.println("Rellene los datos del avión " + i + " del aeropuerto:");
			System.out.println("");
			
			System.out.println("Introducza el modelo del avión:");
			datosAviones[i].setModelo(scnum.nextInt());

			System.out.println("Introduzca la capacidad de pasajeros:");
			datosAviones[i].setCapacidadPasajeros(scnum.nextInt());

			System.out.println("Introduzca la matrícula del avión:");
			datosAviones[i].setMatricula(sctxt.nextLine());

			System.out.println("Introduzca la capacidad del depósito:");
			datosAviones[i].setCapacidadDeposito(scnum.nextDouble());

			System.out.println("Introduzca el año de fabricación:");
			datosAviones[i].setAñoFabricacion(scnum.nextInt());

			// Datos del comandante
			
			System.out.println("");
			System.out.println("Rellene los datos del comandante del avión " + i + " del aeropuerto:");
			System.out.println("");
			
			System.out.println("Introduzca el nombre del comandante:");
			datosComandantes[i].setNombre(sctxt.nextLine());

			System.out.println("Introduzca los apellidos del comandante:");
			datosComandantes[i].setApellidos(sctxt.nextLine());

			System.out.println("Introduzca el nº de teléfono del comandante:");
			datosComandantes[i].setTelefono(sctxt.nextLine());

			System.out.println("Introduzca el DNI del comandante:");
			datosComandantes[i].setDni(sctxt.nextLine());

			System.out.println("Introduzca la edad del comandante:");
			datosComandantes[i].setEdad(scnum.nextInt());

			System.out.println("Introduzca el rango del comandante:");
			datosComandantes[i].setRango(sctxt.nextLine());
		}

		return datosAeropuerto;
	}
}
