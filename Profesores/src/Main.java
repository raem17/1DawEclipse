import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		
		String ruta = "Profesores.txt";
		File archivo = new File(ruta);
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		
		// Se verifica que el archivo existe, sino se crea
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Se crean e insertan los objetos profesor en el ArrayList creado con anterioridad
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			try {
				linea = br.readLine();
				
				while (linea != null) {
					Profesor nuevoProfesor = new Profesor(devolverNumXPosicion(linea, 0), devolverCadenaXPosicion(linea, 1), devolverCadenaXPosicion(linea, 2), devolverCadenaXPosicion(linea, 3), devolverCadenaXPosicion(linea, 4), devolverCadenaXPosicion(linea, 5), devolverCadenaXPosicion(linea, 6));
					profesores.add(nuevoProfesor);
					linea = br.readLine();
				}
				
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Aqui
		for (int i = 0; i < profesores.size(); i++) {
			System.out.println("Docente "  + (i+1) + ":");
			System.out.println("Id: " + profesores.get(i).getId());
			System.out.println("Nombre: " + profesores.get(i).getNombre());
			System.out.println("Rama: " + profesores.get(i).getCurso());
			System.out.println("Horario de mañanas: " + profesores.get(i).getHorario_manniana());
			System.out.println("Cargo: " + profesores.get(i).getCargo() + "\n");
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
	
}