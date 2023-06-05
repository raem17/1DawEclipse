package Coches;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Coche> datosCoches = devolverArrayCoches();
		
		for (int i = 0; i < datosCoches.size(); i++) {
			System.out.println(datosCoches.get(i).toString());
		}
		
	}
	
	public static ArrayList<Coche> devolverArrayCoches() {
		ArrayList<Coche> datosCoches = new ArrayList<Coche>();
		// Cuidado con la ruta, tiene que ser absoluta
		String ruta = "C:\\Users\\renriquez\\eclipse-workspace\\JSP_Coches\\coches.txt";
		File archivo = new File(ruta);
		
		// Crear archivo si no existe
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			try {
				linea = br.readLine();
				
				while (linea != null) {
					String complementos = "";
					try {
						complementos = linea.split(";")[5];
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					Coche nuevoCoche = new Coche(linea.split(";")[0], linea.split(";")[1], linea.split(";")[2], linea.split(";")[3], 
							Integer.parseInt(linea.split(";")[4]), complementos);
					datosCoches.add(nuevoCoche);
					
					linea = br.readLine();
				}
				
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return datosCoches;
	}

}
