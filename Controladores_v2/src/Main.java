
public class Main {

	public static void main(String[] args) {}
	
	
	// Métodos
	
	static void mostrarDatosPasaje (Vuelo datosVuelo) {
		for (int i = 0; i < datosVuelo.getPasajeros().length; i++) {
			datosVuelo.getPasajeros()[i].mostrarDatos();
		}
	}
	
	
	static void mostrarDatosPasajes (Vuelo [] datosVuelos) {
		for (int i = 0; i < datosVuelos.length; i++) {
			for (int j = 0; j < datosVuelos[i].getPasajeros().length; j++) {
				datosVuelos[i].getPasajeros()[j].mostrarDatos();
			}
		}
	}
	
	
	static Pasajero[] cuatroAncianosVuelo (Vuelo datosVuelo) {
		Pasajero [] pasajerosMayores = new Pasajero [4];
		Pasajero aux;
		
		// Mayor a menor
		for (int i = 0; i < datosVuelo.getPasajeros().length; i++) {
			for (int j = 0; j < datosVuelo.getPasajeros().length-1; j++) {
				if (datosVuelo.getPasajeros()[j+1].getEdad() > datosVuelo.getPasajeros()[j].getEdad()) {
					aux = datosVuelo.getPasajeros()[j+1];
					datosVuelo.getPasajeros()[j+1] = datosVuelo.getPasajeros()[j];
					datosVuelo.getPasajeros()[j] = aux;
				}
			}
		}
		
		
		for (int i = 0; i < pasajerosMayores.length; i++) {
			pasajerosMayores[i] = datosVuelo.getPasajeros()[i];
		}
		
		return pasajerosMayores;
	}
	
	
	static Pasajero jovencito (Vuelo datosVuelo) {
		Pasajero pasajeroMasJoven = new Pasajero(null, null, null, 0, null);
		Pasajero aux;
		
		// Menor a mayor
		for (int i = 0; i < datosVuelo.getPasajeros().length; i++) {
			for (int j = 0; j < datosVuelo.getPasajeros().length-1; j++) {
				if (datosVuelo.getPasajeros()[j+1].getEdad() < datosVuelo.getPasajeros()[j].getEdad()) {
					aux = datosVuelo.getPasajeros()[j+1];
					datosVuelo.getPasajeros()[j+1] = datosVuelo.getPasajeros()[j];
					datosVuelo.getPasajeros()[j] = aux;
				}
			}
		}
		
		
		pasajeroMasJoven = datosVuelo.getPasajeros()[0];
		
		return pasajeroMasJoven;
	}
	
	
	static Vuelo vueloAnciano (Vuelo [] datosVuelos) {
		Vuelo vueloEdadMediaMax = new Vuelo(null, 0, 0, null); 
		double [] medias = new double [datosVuelos.length]; // Acu
		
		// 1ª parte
		for (int i = 0; i < datosVuelos.length; i++) {
			for (int j = 0; j < datosVuelos[i].getPasajeros().length; j++) {
				medias [i] = medias [i] + datosVuelos[i].getPasajeros()[j].getEdad();
			}
		}
		
		
		// 2ª parte
		for (int i = 0; i < medias.length; i++) {
			medias [i] = medias [i] / datosVuelos[i].getPasajeros().length;
		}
		
		
		// 3ª parte
		double mediaMax = medias[0]-1;
		int posicionVueloEdadMediaMax = 0;
		
		for (int i = 0; i < medias.length; i++) {
			if (medias[i] > mediaMax) {
				mediaMax = medias[i];
				posicionVueloEdadMediaMax = i;
			}
		}
		
		
		vueloEdadMediaMax = datosVuelos[posicionVueloEdadMediaMax];
		
		return vueloEdadMediaMax;
	}
	
	
	static String matriculaCiudad (String provincia, Vuelo [] datosVuelos) {
		int [] contadores = new int [datosVuelos.length];
		boolean existe = false;
		String numeroVuelo = "";
		
		
		for (int i = 0; i < datosVuelos.length; i++) {
			for (int j = 0; j < datosVuelos[i].getPasajeros().length; j++) {
				if (datosVuelos[i].getPasajeros()[j].getProvincia().equalsIgnoreCase(provincia)) {
					contadores[i]++;
					existe = true;
				}
			}
		}
		
		
		
		int contMin = contadores[0]+1;
		int posicion = 0;
		
		if (existe == true) {
			for (int i = 0; i < contadores.length; i++) {
				if (contadores[i] < contMin) {
					contMin = contadores[i];
					posicion = i;
				}
			}
			
		} else {
			System.out.println("No existe ningún pasajero que pertenezca a la provincia introducida.");
		}
		
		
		numeroVuelo = String.valueOf(datosVuelos[posicion].getNum_vuelo());
		
		return numeroVuelo;
	}

}
