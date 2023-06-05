import java.util.Scanner;
import java.io.*;;

public class Main {

	public static void main(String[] args) {
		crearDirectorioYRenombrarlo();
	}
	
	// Ejer 1
	public static void comprobarArchivo() {
		Scanner sctxt = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del archivo:");
		String ruta = sctxt.nextLine();
		File archivo = new File(ruta);
		
		if (archivo.exists()) {
			System.out.println("El archivo ya existe.");
		} else {
			try {
				archivo.createNewFile();
				System.out.println("Se ha creado un archivo nuevo.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Ejer 2
	public static void cincoArchivos() {
		for (int i = 0; i < 5; i++) {
			comprobarArchivo();
		}
	}
	
	// Ejer 3
	public static void mostrarFicheros() {
		String directorio = "C:\\Users\\roger\\OneDrive\\Escritorio\\Workspace DAW\\Ficheros_v1";
		File fichero = new File(directorio);
		
		for (int i = 0; i < fichero.list().length; i++) {
			System.out.println(fichero.list()[i]);
		}
	}
	
	// Ejer 4
	public static void crearDirectorio() {
		Scanner sctxt = new Scanner(System.in);
		System.out.println("Introduzca el nombre que tendrá el directorio:");
		String directorio = sctxt.nextLine();
		File fichero = new File(directorio);
		
		fichero.mkdir();
	}
	
	// Ejer 5
	public static void crearDirectorioYRenombrarlo() {
		// 1ª parte
		Scanner sctxt = new Scanner(System.in);
		String ruta = "listadoGS.txt";
		File ficheroViejo = new File(ruta);
		
		try {
			ficheroViejo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2ª parte
		System.out.println("Introduzca el nuevo nombre del fichero 'listadoGS.txt':");
		String nuevoNom = sctxt.nextLine();
		
		File ficheroNuevo = new File(nuevoNom);
		
		if (ficheroViejo.renameTo(ficheroNuevo)) {
			System.out.println("Fichero renombrado.");
		} else {
			System.out.println("Error.");
		}
	}

}



















