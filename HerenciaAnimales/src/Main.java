import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		ArrayList<Animal> datosAnimales = new ArrayList<Animal>();
		
		//rellenarArrayAnimales(datosAnimales);
		
		int opc = 0;
		do {
			mostrarMenu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1: altaAnimal(datosAnimales);
				
				break;
			case 2: bajaAnimal(datosAnimales);
				
				break;
			case 3: mostrarDatosAnimal(datosAnimales);
				
				break;
			case 4: mostrarListadoAnimalesXEspecie(datosAnimales);
				
				break;
			case 5: modificarAtributosExclusivosAnimal(datosAnimales);
				
				break;
			case 6: System.out.println("Ha salido del programa.");
				
				break;

			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc != 6);

		scnum.close();
	}
	
	public static void mostrarMenu() {
		System.out.println("\nSeleccione una opción del menú:\n");
		System.out.println("1.	Alta animal.");
		System.out.println("2.	Baja animal");
		System.out.println("3.	Listar datos de un animal.");
		System.out.println("4.	Listar datos de todos los animales de una especie.");
		System.out.println("5.	Modificar atributos exclusivos de un animal.");
		System.out.println("6.	Salir.\n");
	}
	
	public static void mostrarDatosAnimal(ArrayList<Animal> datosAnimales) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del animal:");
		String nombre = sctxt.nextLine().trim();
		
		if (existeAnimal(nombre, datosAnimales)) {
			for (int i = 0; i < datosAnimales.size(); i++) {
				if (datosAnimales.get(i).getNombre().equalsIgnoreCase(nombre)) {
					System.out.println(datosAnimales.get(i).toString());
				}
			}
			
		} else {
			System.out.println("El animal no existe.");
		}
	}
	
	public static boolean existeAnimal(String nombre, ArrayList<Animal> datosAnimales) {
		boolean existe = false;
		
		for (int i = 0; i < datosAnimales.size(); i++) {
			if (datosAnimales.get(i).getNombre().equalsIgnoreCase(nombre)) {
				existe = true;
			}
		}
		
		return existe;
	}
	
	public static void altaAnimal(ArrayList<Animal> datosAnimales) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		
		System.out.println("Introduzca la especie del animal correctamente:");
		String especie = sctxt.nextLine().trim();
		
		if (especie.equalsIgnoreCase("búfalo")) {
			Bufalo nuevoBufalo = new Bufalo();
			
			System.out.println("Introduzca el nombre del animal:");
			nuevoBufalo.setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca la procedencia del animal:");
			nuevoBufalo.setProcedencia(sctxt.nextLine());
			
			System.out.println("Introduzca la altura del animal en cm:");
			nuevoBufalo.setAltura(scnum.nextInt());
			
			System.out.println("Introduzca el peso del animal en kg:");
			nuevoBufalo.setPeso(scnum.nextDouble());
			
			System.out.println("Introduzca la altura de los cuernos del búfalo en cm:");
			nuevoBufalo.setAltura_cuernos(scnum.nextInt());
			
			System.out.println("Introduzca si el búfalo es peludo: (S/N)");
			String resp = sctxt.nextLine().trim();
			if (resp.equalsIgnoreCase("S")) {
				nuevoBufalo.setEsPeludo(true);
			} else {
				System.out.println("Se ha establecido que el búfalo NO es peludo.");
			}
			
			datosAnimales.add(nuevoBufalo);
			System.out.println("Alta exitosa.");
			
		} else if (especie.equalsIgnoreCase("hiena")) {
			Hiena nuevaHiena = new Hiena();
			
			System.out.println("Introduzca el nombre del animal:");
			nuevaHiena.setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca la procedencia del animal:");
			nuevaHiena.setProcedencia(sctxt.nextLine());
			
			System.out.println("Introduzca la altura del animal en cm:");
			nuevaHiena.setAltura(scnum.nextInt());
			
			System.out.println("Introduzca el peso del animal en kg:");
			nuevaHiena.setPeso(scnum.nextDouble());
			
			System.out.println("Introduzca la velocidad de la hiena:");
			nuevaHiena.setVelocidad(scnum.nextInt());
			
			System.out.println("Introduzca el nivel de risa de la hiena:");
			nuevaHiena.setNivel_risa(scnum.nextInt());
			
			datosAnimales.add(nuevaHiena);
			System.out.println("Alta exitosa.");
			
		} else if (especie.equalsIgnoreCase("hipopótamo")) {
			Hipopotamo hipo = new Hipopotamo();
			
			System.out.println("Introduzca el nombre del animal:");
			hipo.setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca la procedencia del animal:");
			hipo.setProcedencia(sctxt.nextLine());
			
			System.out.println("Introduzca la altura del animal en cm:");
			hipo.setAltura(scnum.nextInt());
			
			System.out.println("Introduzca el peso del animal en kg:");
			hipo.setPeso(scnum.nextDouble());
			
			System.out.println("Introduzca el número de dientes del hipopótamo:");
			hipo.setNum_dientes(scnum.nextInt());
			
			System.out.println("Introduzca la altura de las orejas del hipopótamo en cm:");
			hipo.setAltura_orejas(scnum.nextInt());
			
			System.out.println("Introduzca el nivel de agresividad del hipopótamo:");
			hipo.setNivel_agresividad(scnum.nextInt());
			
			datosAnimales.add(hipo);
			System.out.println("Alta exitosa.");
			
		} else if (especie.equalsIgnoreCase("jirafa")) {
			Jirafa nuevaJirafa = new Jirafa();
			
			System.out.println("Introduzca el nombre del animal:");
			nuevaJirafa.setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca la procedencia del animal:");
			nuevaJirafa.setProcedencia(sctxt.nextLine());
			
			System.out.println("Introduzca la altura del animal en cm:");
			nuevaJirafa.setAltura(scnum.nextInt());
			
			System.out.println("Introduzca el peso del animal en kg:");
			nuevaJirafa.setPeso(scnum.nextDouble());
			
			System.out.println("Introduzca la longitud de las pestañas de la jirafa en cm:");
			nuevaJirafa.setLongitud_pestañas(scnum.nextInt());
			
			System.out.println("Introduzca el número de manchas de la jirafa:");
			nuevaJirafa.setNum_manchas(scnum.nextInt());
			
			datosAnimales.add(nuevaJirafa);
			System.out.println("Alta exitosa.");
		} else if (especie.equalsIgnoreCase("león")) {
			Leon nuevoLeon = new Leon();
			
			System.out.println("Introduzca el nombre del animal:");
			nuevoLeon.setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca la procedencia del animal:");
			nuevoLeon.setProcedencia(sctxt.nextLine());
			
			System.out.println("Introduzca la altura del animal en cm:");
			nuevoLeon.setAltura(scnum.nextInt());
			
			System.out.println("Introduzca el peso del animal en kg:");
			nuevoLeon.setPeso(scnum.nextDouble());
			
			System.out.println("Introduzca el nivel de fuerza del león:");
			nuevoLeon.setNivel_fuerza(scnum.nextInt());
			
			System.out.println("Introduzca el nivel de rugido del león:");
			nuevoLeon.setNivel_rugido(scnum.nextInt());
			
			System.out.println("Introduzca si el león es agresivo: (S/N)");
			String resp = sctxt.nextLine().trim();
			if (resp.equalsIgnoreCase("S")) {
				nuevoLeon.setEsAgresivo(true);
			} else {
				System.out.println("Se ha establecido que el león NO es agresivo.");
			}
			
			datosAnimales.add(nuevoLeon);
			System.out.println("Alta exitosa.");
		} else if (especie.equalsIgnoreCase("tigre")) {
			Tigre nuevoTigre = new Tigre();
			
			System.out.println("Introduzca el nombre del animal:");
			nuevoTigre.setNombre(sctxt.nextLine());
			
			System.out.println("Introduzca la procedencia del animal:");
			nuevoTigre.setProcedencia(sctxt.nextLine());
			
			System.out.println("Introduzca la altura del animal en cm:");
			nuevoTigre.setAltura(scnum.nextInt());
			
			System.out.println("Introduzca el peso del animal en kg:");
			nuevoTigre.setPeso(scnum.nextDouble());
			
			System.out.println("Introduzca el color del tigre:");
			nuevoTigre.setColor(sctxt.nextLine());
			
			System.out.println("Introduzca el número de rallas del tigre:");
			nuevoTigre.setNum_rallas(scnum.nextInt());
			
			datosAnimales.add(nuevoTigre);
			System.out.println("Alta exitosa.");
		} else {
			System.out.println("La especie introducida no existe.");
		}
	}
	
	public static void bajaAnimal(ArrayList<Animal> datosAnimales) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del animal:");
		String nombre = sctxt.nextLine().trim();
		
		if (existeAnimal(nombre, datosAnimales)) {
			for (int i = 0; i < datosAnimales.size(); i++) {
				if (datosAnimales.get(i).getNombre().equalsIgnoreCase(nombre)) {
					datosAnimales.remove(i);
					System.out.println("Baja exitosa.");
				}
			}
			
		} else {
			System.out.println("El animal no existe.");
		}
	}
	
	public static void mostrarListadoAnimalesXEspecie(ArrayList<Animal> datosAnimales) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca la especie:");
		String especie = sctxt.nextLine();
		
		if (especie.equalsIgnoreCase("búfalo")) {
			for (int i = 0; i < datosAnimales.size(); i++) {
				if (datosAnimales.get(i).getClass().toString().contains("Bufalo")) {
					System.out.println(datosAnimales.get(i).toString());
				}
			}
		} else if (especie.equalsIgnoreCase("hiena")) {
			for (int i = 0; i < datosAnimales.size(); i++) {
				if (datosAnimales.get(i).getClass().toString().contains("Hiena")) {
					System.out.println(datosAnimales.get(i).toString());
				}
			}
		} else if (especie.equalsIgnoreCase("hipopótamo")) {
			for (int i = 0; i < datosAnimales.size(); i++) {
				if (datosAnimales.get(i).getClass().toString().contains("Hipopotamo")) {
					System.out.println(datosAnimales.get(i).toString());
				}
			}
		} else if (especie.equalsIgnoreCase("jirafa")) {
			for (int i = 0; i < datosAnimales.size(); i++) {
				if (datosAnimales.get(i).getClass().toString().contains("Jirafa")) {
					System.out.println(datosAnimales.get(i).toString());
				}
			}
		} else if (especie.equalsIgnoreCase("león")) {
			for (int i = 0; i < datosAnimales.size(); i++) {
				if (datosAnimales.get(i).getClass().toString().contains("Leon")) {
					System.out.println(datosAnimales.get(i).toString());
				}
			}
		} else if (especie.equalsIgnoreCase("tigre")) {
			for (int i = 0; i < datosAnimales.size(); i++) {
				if (datosAnimales.get(i).getClass().toString().contains("Tigre")) {
					System.out.println(datosAnimales.get(i).toString());
				}
			}
		} else {
			System.out.println("La especie no existe.");
		}
	}
	
	public static void modificarAtributosExclusivosAnimal(ArrayList<Animal> datosAnimales) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del animal:");
		String nombre = sctxt.nextLine().trim();
		
		// sigo
		if (existeAnimal(nombre, datosAnimales)) {
			String especie = devolverEspecieAnimal(nombre, datosAnimales);
			int posicion = devolverPosicionAnimal(nombre, datosAnimales);
			
			if (especie.equalsIgnoreCase("Bufalo")) {
				Bufalo nuevoBufalo = (Bufalo)datosAnimales.get(posicion);
				
				System.out.println("Introduzca la altura de los cuernos del búfalo en cm:");
				nuevoBufalo.setAltura_cuernos(scnum.nextInt());
				
				System.out.println("Introduzca si el búfalo es peludo: (S/N)");
				String resp = sctxt.nextLine().trim();
				if (resp.equalsIgnoreCase("S")) {
					nuevoBufalo.setEsPeludo(true);
				} else {
					System.out.println("Se ha establecido que el búfalo NO es peludo.");
				}
				
				datosAnimales.set(posicion, nuevoBufalo);
				System.out.println("Modificación exitosa.");
				
			} else if (especie.equalsIgnoreCase("Hiena")) {
				Hiena nuevaHiena = (Hiena)datosAnimales.get(posicion);
				
				System.out.println("Introduzca la velocidad de la hiena:");
				nuevaHiena.setVelocidad(scnum.nextInt());
				
				System.out.println("Introduzca el nivel de risa de la hiena:");
				nuevaHiena.setNivel_risa(scnum.nextInt());
				
				datosAnimales.set(posicion, nuevaHiena);
				System.out.println("Modificación exitosa.");
				
			} else if (especie.equalsIgnoreCase("Hipopotamo")) {
				Hipopotamo hipo = (Hipopotamo)datosAnimales.get(posicion);
				
				System.out.println("Introduzca el número de dientes del hipopótamo:");
				hipo.setNum_dientes(scnum.nextInt());
				
				System.out.println("Introduzca la altura de las orejas del hipopótamo en cm:");
				hipo.setAltura_orejas(scnum.nextInt());
				
				System.out.println("Introduzca el nivel de agresividad del hipopótamo:");
				hipo.setNivel_agresividad(scnum.nextInt());
				
				datosAnimales.set(posicion, hipo);
				System.out.println("Modificación exitosa.");
				
			} else if (especie.equalsIgnoreCase("Jirafa")) {
				Jirafa nuevaJirafa = (Jirafa)datosAnimales.get(posicion);
				
				System.out.println("Introduzca la longitud de las pestañas de la jirafa en cm:");
				nuevaJirafa.setLongitud_pestañas(scnum.nextInt());
				
				System.out.println("Introduzca el número de manchas de la jirafa:");
				nuevaJirafa.setNum_manchas(scnum.nextInt());
				
				datosAnimales.set(posicion, nuevaJirafa);
				System.out.println("Modificación exitosa.");
				
			} else if (especie.equalsIgnoreCase("Leon")) {
				Leon nuevoLeon = (Leon)datosAnimales.get(posicion);
				
				System.out.println("Introduzca el nivel de fuerza del león:");
				nuevoLeon.setNivel_fuerza(scnum.nextInt());
				
				System.out.println("Introduzca el nivel de rugido del león:");
				nuevoLeon.setNivel_rugido(scnum.nextInt());
				
				System.out.println("Introduzca si el león es agresivo: (S/N)");
				String resp = sctxt.nextLine().trim();
				if (resp.equalsIgnoreCase("S")) {
					nuevoLeon.setEsAgresivo(true);
				} else {
					System.out.println("Se ha establecido que el león NO es agresivo.");
				}
				
				datosAnimales.set(posicion, nuevoLeon);
				System.out.println("Modificación exitosa.");
				
			} else if (especie.equalsIgnoreCase("Tigre")) {
				Tigre nuevoTigre = (Tigre)datosAnimales.get(posicion);
				
				System.out.println("Introduzca el color del tigre:");
				nuevoTigre.setColor(sctxt.nextLine());
				
				System.out.println("Introduzca el número de rallas del tigre:");
				nuevoTigre.setNum_rallas(scnum.nextInt());
				
				datosAnimales.set(posicion, nuevoTigre);
				System.out.println("Modificación exitosa.");
			} // No hace falta else
			
		} else {
			System.out.println("El animal no existe.");
		}
	}
	
	public static String devolverEspecieAnimal (String nombre, ArrayList<Animal> datosAnimales) {
		String especie = "";
		
		for (int i = 0; i < datosAnimales.size(); i++) {
			if (datosAnimales.get(i).getNombre().equalsIgnoreCase(nombre)) {
				especie = datosAnimales.get(i).getClass().toString().replace(" ", "");
				especie = especie.replace("class", "");
			}
		}
		
		return especie;
	}
	
	public static int devolverPosicionAnimal(String nombre, ArrayList<Animal> datosAnimales) {
		int pos = 0;
		
		for (int i = 0; i < datosAnimales.size(); i++) {
			if (datosAnimales.get(i).getNombre().equalsIgnoreCase(nombre)) {
				pos = i;
			}
		}
		
		return pos;
	}
	
	/**
	 * Rellena el arrayList de animales pasado por parámetro con objetos Animales genéricos.
	 * @param datosAnimales
	 */
	public static void rellenarArrayAnimales(ArrayList<Animal> datosAnimales) {
		Bufalo bufa1 = new Bufalo("Búfalo 1", "España", 0, 0, 0, false);
		Bufalo bufa2 = new Bufalo("Búfalo 2", "África", 0, 0, 0, false);
		
		Hiena hiena1 = new Hiena("Hiena 1", "Francia", 0, 0, 0, 0);
		Hiena hiena2 = new Hiena("Hiena 2", "Brasil", 0, 0, 0, 0);
		
		Hipopotamo hipo1 = new Hipopotamo("Hipo 1", null, 0, 0, 0, 0, 0);
		Hipopotamo hipo2 = new Hipopotamo("Hipo 2", null, 0, 0, 0, 0, 0);
		
		Jirafa jira1 = new Jirafa("Jirafa 1", null, 0, 0, 0, 0);
		Jirafa jira2 = new Jirafa("Jirafa 2", null, 0, 0, 0, 0);
		
		Leon leon1 = new Leon("León 1", null, 0, 0, 0, 0, false);
		Leon leon2 = new Leon("León 2", null, 0, 0, 0, 0, false);
		
		Tigre tigre1 = new Tigre("Tigre 1", null, 0, 0, null, 0);
		Tigre tigre2 = new Tigre("Tigre 2", null, 0, 0, null, 0);
		
		datosAnimales.add(bufa1);
		datosAnimales.add(bufa2);
		
		datosAnimales.add(hiena1);
		datosAnimales.add(hiena2);
		
		datosAnimales.add(hipo1);
		datosAnimales.add(hipo2);
		
		datosAnimales.add(jira1);
		datosAnimales.add(jira2);
		
		datosAnimales.add(leon1);
		datosAnimales.add(leon2);
		
		datosAnimales.add(tigre1);
		datosAnimales.add(tigre2);
	}

}
