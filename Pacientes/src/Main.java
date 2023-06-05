import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		
		String ruta = "pacientes.txt";
		File archivo = new File(ruta);
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		
		// Se verifica que el archivo existe, sino se crea
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Se crean e insertan los objetos paciente en el ArrayList creado con anterioridad
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			try {
				linea = br.readLine();
				
				while (linea != null) {
					Paciente nuevoPaciente = new Paciente(devolverNumXPosicion(linea, 0), devolverCadenaXPosicion(linea, 1), devolverCadenaXPosicion(linea, 2), devolverCadenaXPosicion(linea, 3), devolverCadenaXPosicion(linea, 4), devolverNumXPosicion(linea, 5), devolverCadenaXPosicion(linea, 6), devolverCadenaXPosicion(linea, 7));
					pacientes.add(nuevoPaciente);
					linea = br.readLine();
				}
				
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Menú para el usuario
		int opc = 0;
		do {
			mostrarMenu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1: mostrarDatosFichero(pacientes);
				break;
			case 2: mostrarDatosFecha(pacientes);
				break;
			case 3: mostrarDatosMadrid(pacientes);
				break;
			case 4: mostrarNumPacientes1960(pacientes);
				break;
			case 5: mostrarCodAnas(pacientes);
				break;
			case 6: mostrarNomsYApesXProvincia(pacientes);
				break;
			case 7: mostrarCodigosYTelefonosXProvincia(pacientes);
				break;
			case 8: mostrarNomYApesAñoMin(pacientes);
				break;
			case 9: mostrarNomYApesCPNelson(pacientes);
				break;
			case 10: System.out.println("Ha salido del programa.");
				break;
			default: System.out.println("Opción incorrecta.");
				break;
			}
		} while (opc != 10);
		
		// Se actualizan los datos del archivo de texto
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			
			for (int i = 0; i < pacientes.size(); i++) {
				String nuevaLinea = pacientes.get(i).getCodigo_paciente() + "|" + pacientes.get(i).getNombre() + "|" + pacientes.get(i).getApellidos()  + "|" + pacientes.get(i).getDireccion() + "|" + pacientes.get(i).getPoblacion() + "|" + pacientes.get(i).getCod_postal() + "|" + pacientes.get(i).getTelefono() + "|" + pacientes.get(i).getF_nacimiento();
				bw.write(nuevaLinea);
				bw.newLine();
			}
			
			bw.close(); // Importante
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		scnum.close();
	}
	
	// Métodos
	
	// Métodos auxiliares
	public static String devolverCadenaXPosicion (String linea, int posicion) {
		String cadena = "";
		
		cadena = linea.split("\\|")[posicion];
		
		return cadena;
	}
	
	public static int devolverNumXPosicion (String linea, int posicion) {
		String cadena = "";
		
		cadena = linea.split("\\|")[posicion];
		
		int num = Integer.valueOf(cadena);
		
		return num;
	}
	
	// Métodos del programa
	public static void mostrarMenu() {
		System.out.println("\nIntroduzca una opción del menú:\n");
		System.out.println("1. Mostrar en pantalla el contenido de todo el fichero.");
		System.out.println("2. Mostrar en pantalla los datos de los pacientes que hayan nacido en la fecha “24/01/1980”.");
		System.out.println("3. Mostrar en pantalla los datos de los pacientes que hayan nacido en la provincia de Madrid.");
		System.out.println("4. Mostrar en pantalla el número de pacientes que han nacido antes del año 1960.");
		System.out.println("5. Mostrar en pantalla el código de los pacientes que se llamen “Ana”.");
		System.out.println("6. Mostrar en pantalla el nombre y apellidos de los pacientes que su provincia sea igual a una pedida al usuario.");
		System.out.println("7. Mostrar en pantalla el código y el teléfono de los pacientes que su provincia sea igual a una pedida por el usuario.");
		System.out.println("8. Mostrar en pantalla el nombre y apellidos del paciente o los pacientes que hayan nacido en el año más antiguo.");
		System.out.println("9. Mostrar en pantalla el nombre y apellidos de los pacientes que tengan de CP el mismo que el del Centro Nelson.");
		System.out.println("10. Salir.");
	}
	
	public static void mostrarDatosFichero(ArrayList<Paciente> datosPacientes) {
		for (int i = 0; i < datosPacientes.size(); i++) {
			datosPacientes.get(i).mostrarDatos();
		}
	}
	
	public static void mostrarDatosFecha(ArrayList<Paciente> datosPacientes) {
		for (int i = 0; i < datosPacientes.size(); i++) {
			if (datosPacientes.get(i).getF_nacimiento().equalsIgnoreCase("24/01/1980")) {
				datosPacientes.get(i).mostrarDatos();
			}
		}
	}
	
	public static void mostrarDatosMadrid(ArrayList<Paciente> datosPacientes) {
		for (int i = 0; i < datosPacientes.size(); i++) {
			if (datosPacientes.get(i).getPoblacion().equalsIgnoreCase("Madrid")) {
				datosPacientes.get(i).mostrarDatos();
			}
		}
	}
	
	public static void mostrarNumPacientes1960(ArrayList<Paciente> datosPacientes) {
		int cont = 0;
		
		for (int i = 0; i < datosPacientes.size(); i++) {
			if (datosPacientes.get(i).devolverAñoDeNacimiento() < 1960 ) {
				cont++;
			}
		}
		
		System.out.println("Número de pacientes que han nacido antes del año 1960: " + cont);
	}
	
	public static void mostrarCodAnas(ArrayList<Paciente> datosPacientes) {
		for (int i = 0; i < datosPacientes.size(); i++) {
			if (datosPacientes.get(i).getNombre().equalsIgnoreCase("Ana" )) {
				System.out.println("Código de paciente: " + datosPacientes.get(i).getCodigo_paciente());
			}
		}
	}
	
	public static void mostrarNomsYApesXProvincia(ArrayList<Paciente> datosPacientes) {
		Scanner sctxt = new Scanner(System.in);
		System.out.println("Introduzca el nombre de una provincia:");
		String provincia = sctxt.nextLine();
		
		for (int i = 0; i < datosPacientes.size(); i++) {
			if (datosPacientes.get(i).getPoblacion().equalsIgnoreCase(provincia)) {
				System.out.println("Nombre: " + datosPacientes.get(i).getNombre() + ". Apellidos: " + datosPacientes.get(i).getApellidos());
			}
		}
	}
	
	public static void mostrarCodigosYTelefonosXProvincia(ArrayList<Paciente> datosPacientes) {
		Scanner sctxt = new Scanner(System.in);
		System.out.println("Introduzca el nombre de una provincia:");
		String provincia = sctxt.nextLine();
		
		for (int i = 0; i < datosPacientes.size(); i++) {
			if (datosPacientes.get(i).getPoblacion().equalsIgnoreCase(provincia)) {
				System.out.println("Código de paciente: " + datosPacientes.get(i).getCodigo_paciente() + ". Teléfono: " + datosPacientes.get(i).getTelefono());
			}
		}
	}
	
	public static void mostrarNomYApesAñoMin(ArrayList<Paciente> datosPacientes) {
		int annioMin = datosPacientes.get(0).devolverAñoDeNacimiento()+1;
		
		for (int i = 0; i < datosPacientes.size(); i++) {
			if (datosPacientes.get(i).devolverAñoDeNacimiento() < annioMin) {
				annioMin = datosPacientes.get(i).devolverAñoDeNacimiento();
			}
		}
		
		for (int i = 0; i < datosPacientes.size(); i++) {
			if (datosPacientes.get(i).devolverAñoDeNacimiento() == annioMin) {
				System.out.println("Nombre: " + datosPacientes.get(i).getNombre() + ". Apellidos: " + datosPacientes.get(i).getApellidos());
			}
		}
	}
	
	public static void mostrarNomYApesCPNelson(ArrayList<Paciente> datosPacientes) {
		for (int i = 0; i < datosPacientes.size(); i++) {
			if (datosPacientes.get(i).getCod_postal() == 28015) {
				System.out.println("Nombre: " + datosPacientes.get(i).getNombre() + ". Apellidos: " + datosPacientes.get(i).getApellidos());
			}
		}
	}
}
