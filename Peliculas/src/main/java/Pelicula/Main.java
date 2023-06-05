package Pelicula;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		ArrayList<Pelicula> p = devolverArrayPeliculas();
		
		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).toString());
		}
		*/
	}
	
	public static ArrayList<Pelicula> devolverArrayPeliculas() {
		ArrayList<Pelicula> datosPeliculas = new ArrayList<Pelicula>();
		String ruta = "C:\\Users\\roger\\OneDrive\\Escritorio\\Workspace DAW\\Peliculas\\peliculas.txt";
		File archivo = new File(ruta);
		
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			try {
				linea = br.readLine();
				
				while (linea != null) {
					Pelicula datosPelicula = new Pelicula(Integer.parseInt(linea.split(";")[0]), linea.split(";")[1], Integer.parseInt(linea.split(";")[2]), 
							Integer.parseInt(linea.split(";")[3]), linea.split(";")[4], linea.split(";")[5], linea.split(";")[6], linea.split(";")[7], 
							linea.split(";")[8]);
					
					datosPeliculas.add(datosPelicula);
					
					linea = br.readLine();
				}
				
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error en devolverArrayPeliculas: " + e);
		}
		
		return datosPeliculas;
	}

}
