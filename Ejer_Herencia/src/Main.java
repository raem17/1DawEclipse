import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Vehiculo> datosVehiculos = new ArrayList<Vehiculo>();
		String ruta = "transportes.txt";
		File archivo = new File(ruta);
		
		crearArchivoSiNoExiste(archivo);
		
		ArrayList<Bus> datosBuses = devolverArrayListBuses(archivo);
		ArrayList<Camion> datosCamiones = devolverArrayListCamiones(archivo);
		ArrayList<Coche> datosCoches = devolverArrayListCoches(archivo);
		ArrayList<Moto> datosMotos = devolverArrayListMotos(archivo);
		datosVehiculos.addAll(datosBuses);
		datosVehiculos.addAll(datosCamiones);
		datosVehiculos.addAll(datosCoches);
		datosVehiculos.addAll(datosMotos);
		
		for (int i = 0; i < datosVehiculos.size(); i++) {
			System.out.println(datosVehiculos.get(i).toString());
		}
	}
	
	// Métodos
	
	public static void crearArchivoSiNoExiste(File archivo) {
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static ArrayList<Bus> devolverArrayListBuses(File archivo) {
		ArrayList<Bus> datosBuses = new ArrayList<Bus>();
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			
			try {
				linea = br.readLine();
				
				while (linea != null) {
					if (linea.split("::")[0].equalsIgnoreCase("bus")) {
						Bus nuevoBus = new Bus(Integer.parseInt(linea.split("::")[1].replace("cv", "")), Integer.parseInt(linea.split("::")[2].replace("cc", "")), 
								Double.parseDouble(linea.split("::")[3].replace("kg", "")), Double.parseDouble(linea.split("::")[4].replace("€", "")), 
								Integer.parseInt(linea.split("::")[5].replace("plazas", "")));
						datosBuses.add(nuevoBus);
					}
					
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
		
		return datosBuses;
	}
	
	public static ArrayList<Camion> devolverArrayListCamiones(File archivo) {
		ArrayList<Camion> datosCamiones = new ArrayList<Camion>();
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			
			try {
				linea = br.readLine();
				
				while (linea != null) {
					if (linea.split("::")[0].equalsIgnoreCase("camion")) {
						Camion nuevoCamion = new Camion(Integer.parseInt(linea.split("::")[1].replace("cv", "")), Integer.parseInt(linea.split("::")[2].replace("cc", "")), 
								Double.parseDouble(linea.split("::")[3].replace("kg", "")), Double.parseDouble(linea.split("::")[4].replace("€", "")), 
								Integer.parseInt(linea.split("::")[5].replace("ejes", "")));
						datosCamiones.add(nuevoCamion);
					}
					
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
		
		return datosCamiones;
	}
	
	public static ArrayList<Coche> devolverArrayListCoches(File archivo) {
		ArrayList<Coche> datosCoches= new ArrayList<Coche>();
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			
			try {
				linea = br.readLine();
				
				while (linea != null) {
					if (linea.split("::")[0].equalsIgnoreCase("coche")) {
						Coche nuevoCoche = new Coche(Integer.parseInt(linea.split("::")[1].replace("cv", "")), Integer.parseInt(linea.split("::")[2].replace("cc", "")), 
								Double.parseDouble(linea.split("::")[3].replace("kg", "")), Double.parseDouble(linea.split("::")[4].replace("€", "")), 
								linea.split("::")[5]);
						datosCoches.add(nuevoCoche);
					}
					
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
	
	public static ArrayList<Moto> devolverArrayListMotos(File archivo) {
		ArrayList<Moto> datosMotos = new ArrayList<Moto>();
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			
			try {
				linea = br.readLine();
				
				while (linea != null) {
					if (linea.split("::")[0].equalsIgnoreCase("moto")) {
						Moto nuevaMoto = new Moto(Integer.parseInt(linea.split("::")[1].replace("cv", "")), Integer.parseInt(linea.split("::")[2].replace("cc", "")), 
								Double.parseDouble(linea.split("::")[3].replace("kg", "")), Double.parseDouble(linea.split("::")[4].replace("€", "")), 
								Integer.parseInt(linea.split("::")[5].replace("cilindro", "")));
						datosMotos.add(nuevaMoto);
					}
					
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
		
		return datosMotos;
	}
}
