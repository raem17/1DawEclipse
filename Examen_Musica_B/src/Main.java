import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BDController conexion = new BDController();
		Scanner scnum = new Scanner(System.in);
		
		int opc = 0;
		do {
			
			mostrarMenu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1: mostrarNombresDiscosDeCancion(conexion);
				
				break;
			case 2: generarArchivoCompanyas(conexion);
				
				break;
			case 3: mostrarArtistaGruposMaxYGrupos(conexion);
				
				break;
			case 4: mostrar4DiscosCancionesMax(conexion);
				
				break;
			case 5: listadoCompanyas(conexion);
				
				break;
			case 6: System.out.println("Ha salido del programa");
				
				break;

			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc!=6);
		
		scnum.close();
	}
	
	public static void mostrarMenu() {
		System.out.println("\nIntroduzca una opción del menú:\n");
		System.out.println("1. Mostrar el nombre de los discos en los que se encuentra la canción introducida.");
		System.out.println("2. Generar archivo de texto con los datos de las compañías (sin repetir).");
		System.out.println("3. Mostrar el nombre del artista que toca en más grupos y el nombre de los grupos en los que toca.");
		System.out.println("4. Devolver los 4 discos con mayor número de canciones.");
		System.out.println("5. Mostrar listado de compañias junto con sus discos y grupos.");
		System.out.println("6. Salir.");
		System.out.print("--> ");
	}
	
	public static void mostrarNombresDiscosDeCancion (BDController conexion) {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre de la canción:");
		String cancion = sctxt.nextLine().trim();
		
		if (conexion.existeCancion(cancion)) {
			ArrayList<String> nombresDiscos = conexion.devolverNombresDiscosXCancion(cancion);
			
			System.out.println("\nDiscos:");
			for (int i = 0; i < nombresDiscos.size(); i++) {
				System.out.println(nombresDiscos.get(i));
			}
			
		} else {
			System.out.println("La canción no existe.");
		}
	}
	
	public static boolean existeNumero(ArrayList<Integer> numeros, int num) {
		boolean existe = false;
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == num) {
				existe = true;
				break;
			}
		}
		
		return existe;
	}
	
	public static void generarArchivoCompanyas (BDController conexion) {
		ArrayList<Companya> companyas = conexion.devolverCompanyasConDiscos();
		
		String ruta = "companias.txt";
		File archivo = new File(ruta);
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			
			for (int i = 0; i < companyas.size(); i++) {
				bw.write(companyas.get(i).getCod() + ";" + companyas.get(i).getNombre() + ";" + companyas.get(i).getDir() + ";" 
			+ companyas.get(i).getFax() + ";" + companyas.get(i).getTfno());
				
				if (i != companyas.size()-1) {
					bw.newLine();
				}
			}
			System.out.println("Archivo generado.");
			
			bw.close();
			
		} catch (IOException e) {
			System.out.println("Error en generarArchivoCompanyas: " + e);
		}
	}
	
	public static void mostrarArtistaGruposMaxYGrupos(BDController conexion) {
		String artistaMax = conexion.devolverNombreArtistaGruposMax();
		ArrayList<String> nombresGrupos = conexion.devolverNombresGruposXArtista(artistaMax);
		
		System.out.println("\nArtista que toca en más grupos: " + artistaMax + "\n");
		System.out.println("Grupos:");
		
		for (int i = 0; i < nombresGrupos.size(); i++) {
			System.out.println(nombresGrupos.get(i));
		}
	}
	
	public static void mostrar4DiscosCancionesMax(BDController conexion) {
		ArrayList<Disco> datosDiscos = conexion.devolver4DiscosCancionesMax();
		
		for (int i = 0; i < datosDiscos.size(); i++) {
			System.out.println(datosDiscos.get(i).toString());
		}
	}
	
	public static boolean existeCompanyaAlt (ArrayList<CompanyaAlt> datosCompayaAlt, String nombre) {
		boolean existe = false;
		
		for (int i = 0; i < datosCompayaAlt.size(); i++) {
			if (datosCompayaAlt.get(i).getNombre_companya().equalsIgnoreCase(nombre)) {
				existe = true;
				break;
			}
		}
		
		return existe;
	}
	
	public static void listadoCompanyas(BDController conexion) {
		ArrayList<CompanyaAlt> datosCompanyasAlts = conexion.devolverCompanyasAlts();
		
		System.out.println("");
		for (int i = 0; i < datosCompanyasAlts.size(); i++) {
			System.out.println(datosCompanyasAlts.get(i).getNombre_companya() + ":");
			
			for (int j = 0; j < datosCompanyasAlts.get(i).getDiscos().size(); j++) {
				System.out.println(datosCompanyasAlts.get(i).getDiscos().get(j).getNombre() + " - " + 
						conexion.devolverNombreGrupoXCod(datosCompanyasAlts.get(i).getDiscos().get(j).getCod_gru()));
			}
			
			System.out.println("");
		}
	}

}










