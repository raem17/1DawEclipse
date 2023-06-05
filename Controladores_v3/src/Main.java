
public class Main {

	public static void main(String[] args) {}
	
	
	// Métodos
	
	static int nPasajerosNombre(String nombre, Vuelo [] datosVuelos) {
		int cont = 0;
		
		for (int i = 0; i < datosVuelos.length; i++) {
			for (int j = 0; j < datosVuelos[i].getPasajeros().length; j++) {
				if (datosVuelos[i].getPasajeros()[j].getNombre().equals(nombre)) {
					cont++;
				}
			}
		}
		
		return cont;
	}

	
	static Vuelo [] vuelosDestino (String destino, Vuelo [] datosVuelos) {
		int cont = 0;
		
		for (int i = 0; i < datosVuelos.length; i++) {
			if (!datosVuelos[i].getCiudad_destino().equals(destino)) {
				cont++;
			}
		}
		
		
		Vuelo [] datosVuelosDestinoDiferente = new Vuelo [cont];
		int indice = 0;
		
		
		for (int i = 0; i < datosVuelos.length; i++) {
			if (!datosVuelos[i].getCiudad_destino().equals(destino)) {
				datosVuelosDestinoDiferente[indice] = datosVuelos[i];
				indice++;
			}
		}
		
		return datosVuelosDestinoDiferente;
	}
	
	
	static Pasajero [] pasajerosDniLetra (Vuelo [] datosVuelos, char letra) {
		int cont = 0;
		String letraString = String.valueOf(letra).toUpperCase();
		
		
		for (int i = 0; i < datosVuelos.length; i++) {
			for (int j = 0; j < datosVuelos[i].getPasajeros().length; j++) {
				if (datosVuelos[i].getPasajeros()[j].getDNI().contains(letraString)) {
					cont++;
				}
			}
		}
		
		Pasajero [] datosPasajeros = new Pasajero [cont];
		int indice = 0;
		
		for (int i = 0; i < datosVuelos.length; i++) {
			for (int j = 0; j < datosVuelos[i].getPasajeros().length; j++) {
				if (datosVuelos[i].getPasajeros()[j].getDNI().contains(letraString)) {
					datosPasajeros[indice] = datosVuelos[i].getPasajeros()[j];
					indice++;
				}
			}
		}
		
		return datosPasajeros;
	}
	
	
	static Vuelo [] vuelosDniLetra (Vuelo [] datosVuelos, char letra) {
		String letraString = String.valueOf(letra).toUpperCase();
		int [] contadores = new int [datosVuelos.length];
		int cont = 0;
		
		
		// 1ª parte
		for (int i = 0; i < datosVuelos.length; i++) {
			for (int j = 0; j < datosVuelos[i].getPasajeros().length; j++) {
				if (datosVuelos[i].getPasajeros()[j].getDNI().contains(letraString)) {
					contadores[i]++;
				}
			}
		}
		
		
		// 2ª parte
		for (int i = 0; i < contadores.length; i++) {
			if (contadores[i] >= 3) {
				cont++;
			}
		}
		
		
		// 3ª parte
		Vuelo [] datosVuelosDniLetra = new Vuelo [cont];
		int indice = 0;
		
		
		for (int i = 0; i < contadores.length; i++) {
			if (contadores[i] >= 3) {
				datosVuelosDniLetra[indice] = datosVuelos[i];
				indice++;
			}
		}
		
		return datosVuelosDniLetra;
	}
}
