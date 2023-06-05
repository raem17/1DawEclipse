import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		ArrayList<Coche> datosCoches = new ArrayList<Coche>();
		
		String ruta = "coches.txt";
		File archivo = new File(ruta);
		
		crearArchivoSiNoExiste(archivo);
		
		rellenarArrayDeCoches(ruta, datosCoches);
		
		int opc = 0;
		do {
			mostrarMenu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1: 
				mostrarDatosCoches(datosCoches);
				break;
			case 2: 
				crearArchivosMarcas(datosCoches);
				System.out.println("Se han creado los archivos correctamente.");
				
				break;
			case 3: 
				System.out.println("Ha salido del programa.");
				break;
				
			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc != 3);
		
		scnum.close();
	} // Fin del Main
	
	// Métodos
	
	public static String devolverCadenaXPosicion (String linea, int posicion) {
		String cadena = "";
		
		try {
			cadena = linea.split(";")[posicion];
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return cadena;
	}
	
	public static int devolverNumXPosicion (String linea, int posicion) {
		String cadena = "";
		
		try {
			cadena = linea.split(";")[posicion];
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int num = 0;
		
		if (!cadena.isEmpty()) {
			num = Integer.valueOf(cadena);
		}
		
		return num;
	}
	
	public static void rellenarArrayDeCoches(String ruta, ArrayList<Coche> datosCoches) {
		String linea = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			try {
				linea = br.readLine();
				
				while (linea != null) {
					Coche nuevoCoche = new Coche(devolverCadenaXPosicion(linea, 0), devolverCadenaXPosicion(linea, 1), devolverCadenaXPosicion(linea, 2), devolverCadenaXPosicion(linea, 3), devolverNumXPosicion(linea, 4), devolverCadenaXPosicion(linea, 5));
					datosCoches.add(nuevoCoche);
					linea = br.readLine();
				}
				
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("\nSeleccione una opción del menú:");
		System.out.println("1.	Mostrar datos de todos los coches.");
		System.out.println("2.	Generar archivos de marcas.");
		System.out.println("3.	Salir.");
	}
	
	public static void mostrarDatosCoches(ArrayList<Coche> datosCoches) {
		for (int i = 0; i < datosCoches.size(); i++) {
			System.out.println("Matrícula: " + datosCoches.get(i).getMatricula() + ". Marca: " + datosCoches.get(i).getMarca() + ". Modelo: " + 
					datosCoches.get(i).getModelo() + ". Color: " + datosCoches.get(i).getColor() + ". Km: " + datosCoches.get(i).getKm() + ". Complementos: " + 
					datosCoches.get(i).getComplementos());
		}
	}
	
	public static void crearArchivoSiNoExiste (File archivo) {
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static boolean existeCadena (ArrayList<String> cadenas, String cadena) {
		boolean existeCadena = false;
		
		for (int i = 0; i < cadenas.size(); i++) {
			if (cadenas.get(i).equalsIgnoreCase(cadena)) {
				existeCadena = true;
			}
		}
		
		return existeCadena;
	}
	
	public static void crearArchivosMarcas (ArrayList<Coche> datosCoches) {
		// 1ª parte
		ArrayList<String> nombresMarcas = new ArrayList<String>();
		
		// Se rellena nombresMarcas
		for (int i = 0; i < datosCoches.size(); i++) {
			if (!existeCadena(nombresMarcas, datosCoches.get(i).getMarca()) ) {
				String nuevaMarca = datosCoches.get(i).getMarca();
				nombresMarcas.add(nuevaMarca);
			}
		}
		
		// Se pasa todo a lowerCase
		for (int i = 0; i < nombresMarcas.size(); i++) {
			nombresMarcas.set(i, nombresMarcas.get(i).toLowerCase());
		}
		
		// 2ª parte: crear archivos y rellenarlos
		for (int i = 0; i < datosCoches.size(); i++) {
			String ruta = datosCoches.get(i).getMarca().toLowerCase().concat(".txt");
			File archivo = new File(ruta);
			
			// Si no existe el archivo lo crea
			if (!archivo.exists()) {
				try {
					archivo.createNewFile();
					
					for (int j = 0; j < nombresMarcas.size(); j++) {
						if (nombresMarcas.get(j).equalsIgnoreCase(datosCoches.get(i).getMarca().toLowerCase())) {
							// Anotación: Entrará al if como mínimo y máximo una sola vez porque no hay marcas repetidas
							try {
								BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
								bw.write(datosCoches.get(i).getMatricula() + ";" + datosCoches.get(i).getMarca() + ";" + datosCoches.get(i).getModelo() + ";" + datosCoches.get(i).getColor() + ";" + datosCoches.get(i).getKm() + ";" + datosCoches.get(i).getComplementos());
								
								bw.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				for (int j = 0; j < nombresMarcas.size(); j++) {
					if (nombresMarcas.get(j).equalsIgnoreCase(datosCoches.get(i).getMarca().toLowerCase())) {
						// Anotación: Entrará al if como mínimo y máximo una sola vez porque no hay marcas repetidas
						try {
							BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));
							bw.newLine();
							bw.write(datosCoches.get(i).getMatricula() + ";" + datosCoches.get(i).getMarca() + ";" + datosCoches.get(i).getModelo() + ";" + datosCoches.get(i).getColor() + ";" + datosCoches.get(i).getKm() + ";" + datosCoches.get(i).getComplementos());
							
							bw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}



















