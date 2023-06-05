
public class Main2 {

	public static void main(String[] args) {
		
	}
	
	
	static void eliminarPasajerosConTelefono (Vuelo[] datosVuelos, String[] telefonos) {
		for (int i = 0; i < datosVuelos.length; i++) {
			for (int j = 0; j < datosVuelos[i].getDatosPasajeros().length; j++) {
				if (existeTelefonoEnPasajero(datosVuelos[i].getDatosPasajeros()[j], telefonos)) {
					datosVuelos[i].getDatosPasajeros()[j].setApellidos(null);
					datosVuelos[i].getDatosPasajeros()[j].setDni(null);
					datosVuelos[i].getDatosPasajeros()[j].setEdad(0);
					datosVuelos[i].getDatosPasajeros()[j].setNombre(null);
					datosVuelos[i].getDatosPasajeros()[j].setTelefono(null);
				}
			}
		}
	}
	
	// Método auxiliar para el método eliminarPasajerosConTelefono
	static boolean existeTelefonoEnPasajero (Pasajero datosPasajero, String[] telefonos) {
		boolean existe = false;
		
		for (int i = 0; i < telefonos.length; i++) {
			if (datosPasajero.getTelefono().equalsIgnoreCase(telefonos[i])) {
				existe = true;
			}
		}
		
		return existe;
	}
	

}
