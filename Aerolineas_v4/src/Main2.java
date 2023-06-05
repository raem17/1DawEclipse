import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);

		Avion[] datosAviones = new Avion[3];
		int indiceAviones = 0;
		rellenarValoresNulosAviones(datosAviones);
		
		
		Pasajero[] datosPasajeros = new Pasajero[5];
		int indicePasajeros = 0;
		rellenarValoresNulosPasajeros(datosPasajeros);
		
		
		
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
				
				if (indicePasajeros < datosPasajeros.length) {
					datosPasajeros[indicePasajeros] = crearPasajero(datosPasajeros);
					indicePasajeros++;
				} else {
					System.out.println("");
					System.out.println("Límite de pasajeros alcanzado.");
					System.out.println("");
				}
				
				break;
			case 3:
				
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
			case 4:
				
				if (indicePasajeros > 0) {
					for (int i = 0; i < indicePasajeros; i++) {
						System.out.println("Datos del pasajero: " + i + ":");
						datosPasajeros[i].mostrarDatosPasajero();
					}
				} else {
					System.out.println("No se ha introducido ningún pasajero.");
				}
				
				break;
			case 5:
				
				ordenarXCapacidadPasajeros(datosAviones);
				
				System.out.println("Se ha realizado la operación correctamente.");
				
			
				break;
			case 6:
				
				ordenarPasajerosxEdad(datosPasajeros);
				
				System.out.println("Operación realizada correctamente.");
				
				break;
			case 7: 
				
				System.out.println("Ha salido del programa.");

				break;
			default: 
				
				System.out.println("Opción incorrecta.");
				
				break;
			}

		} while (opc != 7);

		
		scnum.close();
		sctxt.close();
	}

	static void mostrarMenu() {
		System.out.println("**************************************************************");
		System.out.println("1. Crear un avión en el array de aviones.");
		System.out.println("2. Crear un pasajero en el array de pasajeros.");
		System.out.println("3. Mostrar los datos de todos los aviones del array de aviones.");
		System.out.println("4. Mostrar los datos de todos los pasajeros del array de pasajeros.");
		System.out.println("5. Ordenar el array de aviones de menor a mayor según la capacidad de pasajeros.");
		System.out.println("6. Ordenar el array de pasajeros de mayor a menor según la edad.");
		System.out.println("7. Salir.");
		System.out.println("**************************************************************");
		System.out.println("");
	}
	
	
	// Métodos para aviones --------------------------------------------------------------------------------------------------------------------------------

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
	
	static Avion[] ordenarXCapacidadPasajeros (Avion[] datosAviones) {
		Avion aux;
		
		for (int i = 0; i < datosAviones.length; i++) {
			for (int j = 0; j < datosAviones.length-1; j++) {
				if (datosAviones[j+1].getCapacidadPasajeros() < datosAviones[j].getCapacidadPasajeros()) {
					aux = datosAviones[j+1];
					datosAviones[j+1] = datosAviones[j];
					datosAviones[j] = aux;
				}
			}
		}
		
		return datosAviones;
	}
	
	
// Métodos para pasajeros
	
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
	
	static void ordenarPasajerosxEdad (Pasajero[] datosPasajeros) {
		Pasajero aux;
		
		
		for (int i = 0; i < datosPasajeros.length; i++) {
			for (int j = 0; j < datosPasajeros.length-1; j++) {
				if (datosPasajeros[j+1].getEdad() > datosPasajeros[j].getEdad()) {
					aux = datosPasajeros[j+1];
					datosPasajeros[j+1] = datosPasajeros[j];
					datosPasajeros[j] = aux;
				}
			}
		}
	}
	

}
