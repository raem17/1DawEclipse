import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		ArrayList<Animal> datosAnimales = new ArrayList<Animal>();
		String ruta = "Zoo.txt";
		File archivo = new File(ruta);
		
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		rellenarArrayAnimales(datosAnimales, ruta);
		
		int opc = 0;
		do {
			mostrarMenu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1: 
				altaAnimal(datosAnimales);
				actualizarArchivo(archivo, datosAnimales);
				break;
			case 2: 
				bajaAnimal(datosAnimales);
				actualizarArchivo(archivo, datosAnimales);
				break;
			case 3: 
				modificarDato(datosAnimales);
				actualizarArchivo(archivo, datosAnimales);
				break;
			case 4: 
				mostrarListadoDomesticosXEdad(datosAnimales);
				break;
			case 5: 
				mostrarListadoAnimalesXPeso(datosAnimales);
				break;
			case 6: System.out.println("Ha salido del programa.");
				break;
			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc != 6);
		
		scnum.close();
	}
	
	public static void rellenarArrayAnimales(ArrayList<Animal> datosAnimales, String ruta) {
		
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			try {
				linea = br.readLine();
				
				while (linea != null) {
					Animal nuevoAnimal = new Animal(devolverCadenaXPosicion(linea, 0), devolverDoubleXPosicion(linea, 1), devolverDoubleXPosicion(linea, 2), 
							devolverEnteroXPosicion(linea, 3), devolverCadenaXPosicion(linea, 4), devolverCadenaXPosicion(linea, 5), devolverCadenaXPosicion(linea, 6), 
							devolverDoubleXPosicion(linea, 7), devolverBooleanXPosicion(linea, 8), devolverCadenaXPosicion(linea, 9), devolverCadenaXPosicion(linea, 10));
					datosAnimales.add(nuevoAnimal);
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
	
	public static String devolverCadenaXPosicion (String linea, int posicion) {
		String cadena = "";
		
		try {
			cadena = linea.split(";")[posicion];

		} catch (Exception e) {
		}
		
		return cadena;
	}
	
	public static int devolverEnteroXPosicion (String linea, int posicion) {
		String cadena = "";
		
		try {
			cadena = linea.split(";")[posicion];
		} catch (Exception e) {
		}
		
		int num = 0;
		if (cadena != null) {
			num = Integer.parseInt(cadena); 
		}
		
		return num;
	}
	
	public static double devolverDoubleXPosicion (String linea, int posicion) {
		String cadena = "";
		
		try {
			cadena = linea.split(";")[posicion];
		} catch (Exception e) {
		}
		
		double num = 0.0;
		if (cadena != null) {
			num = Double.parseDouble(cadena);
		}
		
		return num;
	}
	
	public static boolean devolverBooleanXPosicion (String linea, int posicion) {
		String cadena = "";
		
		try {
			cadena = linea.split(";")[posicion];
		} catch (Exception e) {
		}
		
		Boolean isTrue = false;
		if (cadena != null) {
			isTrue = Boolean.parseBoolean(cadena);
		}
		
		return isTrue;
	}
	
	public static void actualizarArchivo (File archivo, ArrayList<Animal> datosAnimales) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			
			for (int i = 0; i < datosAnimales.size(); i++) {
				bw.write(datosAnimales.get(i).getId() + ";" + datosAnimales.get(i).getAltura() + ";" + datosAnimales.get(i).getPeso() + ";" 
							+ datosAnimales.get(i).getEdad() + ";" + datosAnimales.get(i).getNombre() + ";" + datosAnimales.get(i).getTipo() + ";" 
								+ datosAnimales.get(i).getEspecie() + ";" + datosAnimales.get(i).getNivel_fuerza() + ";" + datosAnimales.get(i).isMimoso() + ";" 
									+ datosAnimales.get(i).getSonido() + ";" + datosAnimales.get(i).getPropietario());
				bw.newLine();
			}
			
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("\nIntroduzca una opción del menú:");
		System.out.println("1. Alta animal.");
		System.out.println("2. Baja animal.");
		System.out.println("3. Modificación de dato animal.");
		System.out.println("4. Mostrar listado de todos los animales domésticos ordenados por edad.");
		System.out.println("5. Mostrar listado de todos los animales salvajes y domésticos ordenados por peso.");
		System.out.println("6. Salir.");
		System.out.print("-->");
	}
	
	public static void altaAnimal (ArrayList<Animal> datosAnimales) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		Animal nuevoAnimal = new Animal();
		
		System.out.println("Introduzca el tipo del animal:");
		System.out.println("1. Doméstico\n2. Salvaje.");
		System.out.print("-->");
		int opc = scnum.nextInt();
		
		if (opc == 1) {
			nuevoAnimal.setTipo("doméstico");
			nuevoAnimal.setNivel_fuerza(0);
			
			System.out.println("Introduzca el ID del animal:");
			nuevoAnimal.setId(sctxt.nextLine());
			
			System.out.println("Introduzca la altura del animal:");
			nuevoAnimal.setAltura(scnum.nextDouble());
			
			System.out.println("Introduzca el peso del animal:");
			nuevoAnimal.setPeso(scnum.nextDouble());
			
			System.out.println("Introduzca la edad del animal:");
			nuevoAnimal.setEdad(scnum.nextInt());
			
			System.out.println("Introduzca el nombre del animal:");
			nuevoAnimal.setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca la especie del animal:");
			nuevoAnimal.setEspecie(sctxt.nextLine());
			//
			System.out.println("¿Es mimoso? (S/N):");
			String resp = sctxt.nextLine();
			if (resp.equalsIgnoreCase("S")) {
				nuevoAnimal.setMimoso(true);
			} else if (resp.equalsIgnoreCase("N")) {
				nuevoAnimal.setMimoso(false);
			} else {
				System.out.println("No ha introducido correctamente la respuesta, por lo que se pondrá por defecto que no es mimoso.");
			}
			//
			System.out.println("Introduzca textualmente el sonido que emite el animal:");
			nuevoAnimal.setSonido(sctxt.nextLine());
			
			System.out.println("Introduzca el nombre del propietario:");
			nuevoAnimal.setPropietario(sctxt.nextLine());
			
			datosAnimales.add(nuevoAnimal);
			
		} else if (opc == 2) {
			nuevoAnimal.setTipo("salvaje");
			nuevoAnimal.setPropietario(null);
			
			System.out.println("Introduzca el ID del animal:");
			nuevoAnimal.setId(sctxt.nextLine());
			
			System.out.println("Introduzca la altura del animal:");
			nuevoAnimal.setAltura(scnum.nextDouble());
			
			System.out.println("Introduzca el peso del animal:");
			nuevoAnimal.setPeso(scnum.nextDouble());
			
			System.out.println("Introduzca la edad del animal:");
			nuevoAnimal.setEdad(scnum.nextInt());
			
			System.out.println("Introduzca el nombre del animal:");
			nuevoAnimal.setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca la especie del animal:");
			nuevoAnimal.setEspecie(sctxt.nextLine());
			
			System.out.println("Introduzca el nivel de fuerza del animal:");
			nuevoAnimal.setNivel_fuerza(scnum.nextDouble());
			//
			System.out.println("¿Es mimoso? (S/N):");
			String resp = sctxt.nextLine();
			if (resp.equalsIgnoreCase("S")) {
				nuevoAnimal.setMimoso(true);
			} else if (resp.equalsIgnoreCase("N")) {
				nuevoAnimal.setMimoso(false);
			} else {
				System.out.println("No ha introducido correctamente la respuesta, por lo que se pondrá por defecto que no es mimoso.");
			}
			//
			System.out.println("Introduzca el sonido que emite el animal:");
			nuevoAnimal.setSonido(sctxt.nextLine());
			
			datosAnimales.add(nuevoAnimal);
		} else {
			System.out.println("No ha introducido correctamente la respuesta. Se cancela la operación.");
		}
	}
	
	public static void bajaAnimal (ArrayList<Animal> datosAnimales) {
		Scanner sctxt = new Scanner(System.in);
		boolean existe = false;
		
		System.out.println("Introduzca el ID del animal:");
		String id = sctxt.nextLine();
		
		for (int i = 0; i < datosAnimales.size(); i++) {
			if (datosAnimales.get(i).getId().equalsIgnoreCase(id)) {
				existe = true;
				break;
			}
		}
		
		if (existe == true) {
			for (int i = 0; i < datosAnimales.size(); i++) {
				if (datosAnimales.get(i).getId().equalsIgnoreCase(id)) {
					datosAnimales.remove(i);
					break;
				}
			}
			
			System.out.println("El animal ha sido dado de baja correctamente.");
		} else {
			System.out.println("El animal no existe.");
		}
	}
	
	public static void modificarDato(ArrayList<Animal> datosAnimales) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		boolean existe = false;
		int pos = 0;
		
		System.out.println("Introduzca el ID del animal:");
		String id = sctxt.nextLine();
		
		for (int i = 0; i < datosAnimales.size(); i++) {
			if (datosAnimales.get(i).getId().equalsIgnoreCase(id)) {
				existe = true;
				pos = i;
				break;
			}
		}
		
		int opc = 0;
		if (existe == true) {
			mostrarMenuModificacion();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1:
				
				System.out.println("Introduzca el ID:");
				datosAnimales.get(pos).setId(sctxt.nextLine());
				
				System.out.println("Se ha realizado el cambio correctamente.");
				
				break;
			case 2:
				
				System.out.println("Introduzca la altura:");
				datosAnimales.get(pos).setAltura(scnum.nextDouble());
				
				System.out.println("Se ha realizado el cambio correctamente.");
				
				break;
			case 3:
				
				System.out.println("Introduzca el peso del animal:");
				datosAnimales.get(pos).setPeso(scnum.nextDouble());
				
				System.out.println("Se ha realizado el cambio correctamente.");
				
				break;
			case 4:
				
				System.out.println("Introduzca la edad del animal:");
				datosAnimales.get(pos).setEdad(scnum.nextInt());
				
				System.out.println("Se ha realizado el cambio correctamente.");
				
				break;
			case 5:
				
				System.out.println("Introduzca el nombre del animal:");
				datosAnimales.get(pos).setNombre(sctxt.nextLine());
				
				System.out.println("Se ha realizado el cambio correctamente.");
				
				break;
			case 6:
				
				System.out.println("Introduzca el tipo del animal:");
				System.out.println("1. Doméstico\n2. Salvaje.");
				int opcAux = scnum.nextInt();
				
				if (opcAux == 1) {
					datosAnimales.get(pos).setTipo("doméstico");
					
					System.out.println("Se ha realizado el cambio correctamente.");
				} else if (opcAux == 2) {
					datosAnimales.get(pos).setTipo("salvaje");
					
					System.out.println("Se ha realizado el cambio correctamente.");
				} else {
					System.out.println("Opción incorrecta");
				}

				break;
			case 7:
				
				System.out.println("Introduzca la especie del animal:");
				datosAnimales.get(pos).setEspecie(sctxt.nextLine());	
				
				System.out.println("Se ha realizado el cambio correctamente.");
				
				break;
			case 8:
				
				System.out.println("Introduzca el nivel de fuerza del animal:");
				datosAnimales.get(pos).setNivel_fuerza(scnum.nextDouble());
				
				System.out.println("Se ha realizado el cambio correctamente.");
				
				break;
			case 9:
				
				System.out.println("¿Es mimoso? (S/N):");
				System.out.print("-->");
				String resp = sctxt.nextLine();
				
				if (resp.equalsIgnoreCase("S")) {
					datosAnimales.get(pos).setMimoso(true);
					System.out.println("Se ha realizado el cambio correctamente.");
					
				} else if (resp.equalsIgnoreCase("N")) {
					datosAnimales.get(pos).setMimoso(false);
					System.out.println("Se ha realizado el cambio correctamente.");
					
				} else {
					System.out.println("No ha introducido correctamente la respuesta, por lo que se pondrá por defecto que no es mimoso.");
				}
				
				break;
			case 10:
				
				System.out.println("Introduzca el sonido que emite el animal:");
				datosAnimales.get(pos).setSonido(sctxt.nextLine());
				
				System.out.println("Se ha realizado el cambio correctamente.");
				
				break;
			case 11:
				
				System.out.println("Introduzca el nombre del propietario:");
				datosAnimales.get(pos).setPropietario(sctxt.nextLine());
				
				System.out.println("Se ha realizado el cambio correctamente.");
				
				break;

			default: System.out.println("Opción incorrecta. Se ha cancelado la operación.");
				break;
			}
			
		} else {
			System.out.println("El animal no existe.");
		}
	}
	
	public static void mostrarMenuModificacion() {
		System.out.println("Introduzca el dato que desea modificar:");
		System.out.println("1. ID.");
		System.out.println("2. Altura.");
		System.out.println("3. Peso.");
		System.out.println("4. Edad.");
		System.out.println("5. Nombre.");
		System.out.println("6. Tipo.");
		System.out.println("7. Especie.");
		System.out.println("8. Nivel de fuerza.");
		System.out.println("9. ¿Es mimoso?.");
		System.out.println("10. Sonido del animal.");
		System.out.println("11. Nombre del propietario.");
		System.out.print("-->");
	}
	
	public static void mostrarListadoDomesticosXEdad(ArrayList<Animal> datosAnimales) {
		Animal aux;
		for (int i = 0; i < datosAnimales.size(); i++) {
			for (int j = 0; j < datosAnimales.size()-1; j++) {
				if (datosAnimales.get(j+1).getEdad() < datosAnimales.get(j).getEdad()) {
					aux = datosAnimales.get(j+1);
					datosAnimales.set(j+1, datosAnimales.get(j));
					datosAnimales.set(j, aux);
				}
			}
		}
		
		for (int i = 0; i < datosAnimales.size(); i++) {
			if (datosAnimales.get(i).getTipo().equalsIgnoreCase("doméstico")) {
				datosAnimales.get(i).mostrarDatosDomesticos();
			}
		}
	}
	
	public static void mostrarListadoAnimalesXPeso(ArrayList<Animal> datosAnimales) {
		Animal aux;
		for (int i = 0; i < datosAnimales.size(); i++) {
			for (int j = 0; j < datosAnimales.size()-1; j++) {
				if (datosAnimales.get(j+1).getPeso() < datosAnimales.get(j).getPeso()) {
					aux = datosAnimales.get(j+1);
					datosAnimales.set(j+1, datosAnimales.get(j));
					datosAnimales.set(j, aux);
				}
			}
		}
		
		for (int i = 0; i < datosAnimales.size(); i++) {
			datosAnimales.get(i).mostrarDatos();
		}
	}

}
