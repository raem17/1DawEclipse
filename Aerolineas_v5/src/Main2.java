
public class Main2 {

	public static void main(String[] args) {
		
	}
	
	
	static boolean existeMatriculaEnArrayAviones (Avion[] datosAviones, String matricula) {
		boolean existeMatricula = false;
		
		
		for (int i = 0; i < datosAviones.length; i++) {
			if (datosAviones[i].getMatricula().equalsIgnoreCase(matricula)) {
				existeMatricula = true;
			}
		}
		
		return existeMatricula;
	}
	
	
	static boolean existeDniEnArrayPasajeros (Pasajero[] datosPasajeros, String dni) {
		boolean existeDni = false;
		
		
		for (int i = 0; i < datosPasajeros.length; i++) {
			if (datosPasajeros[i].getDni().equalsIgnoreCase(dni)) {
				existeDni = true;
			}
		}
		
		return existeDni;
	}

	
	static Aeropuerto meter3ArraysAvionesEnAeropuerto (Aeropuerto datosAeropuerto, Avion[] datosAviones, Avion[] datosAviones2, Avion[] datosAviones3) {
		Avion[] datosAviones4 = new Avion [datosAviones.length + datosAviones2.length + datosAviones3.length];
		int indice = 0;
		
		
		for (int i = 0; i < datosAviones4.length; i++) {
			datosAviones4[i] = new Avion();
		}
		
		
		for (int i = 0; i < datosAviones.length; i++) {
			datosAviones4[indice] = datosAviones[i];
			indice++;
		}
		
		for (int i = 0; i < datosAviones2.length; i++) {
			datosAviones4[indice] = datosAviones2[i];
			indice++;
		}
		
		for (int i = 0; i < datosAviones3.length; i++) {
			datosAviones4[indice] = datosAviones3[i];
			indice++;
		}
		
		
		Aeropuerto datosNuevosAeropuerto = new Aeropuerto(datosAeropuerto.getNombre(), datosAeropuerto.getCiudad(), datosAeropuerto.getCodigo_aeropuerto(), datosAviones4);
		
		return datosNuevosAeropuerto;
	}
	
	
	// En este caso yo decido que un avión se identifica por su matrícula (String) por lo que compararé solo ese dato.
	// No tengo en cuenta los demás datos porque pueden haber aviones con los mismos datos duplicados pero con distinta matrícula.
	static Avion[] eliminarAvionesDuplicados (Avion[] datosAviones) {
		int cont = 0;
		
		
		for (int i = 0; i < datosAviones.length; i++) {
			cont = 0;
			
			for (int j = 0; j < datosAviones.length; j++) {
				if (datosAviones[i].getMatricula().equalsIgnoreCase(datosAviones[j].getMatricula())) {
					cont++;
				}
				
				
				if (cont > 1) {
					datosAviones[i].setAñoFabricacion(0);
					datosAviones[i].setCapacidadDeposito(0);
					datosAviones[i].setCapacidadPasajeros(0);
					datosAviones[i].setMatricula(null);
					datosAviones[i].setModelo(0);
					datosAviones[i].setDatosComandante(null);
				}
			}
		}
		
		return datosAviones;
	}
	
	
	static Pasajero[] eliminarPasajerosXLetraDniOApellidos (Pasajero[] datosPasajeros, char letra, String cadena) {
		String letraString = String.valueOf(letra);
		String ultimaLetraDNI = "";
		
		
		for (int i = 0; i < datosPasajeros.length; i++) {
			ultimaLetraDNI = String.valueOf(datosPasajeros[i].getDni().charAt(datosPasajeros[i].getDni().length()-1));
			
			
			if (ultimaLetraDNI.equalsIgnoreCase(letraString) || datosPasajeros[i].getApellidos().contains(cadena)) {
				datosPasajeros[i].setApellidos(null);
				datosPasajeros[i].setDni(null);
				datosPasajeros[i].setEdad(0);
				datosPasajeros[i].setNombre(null);
				datosPasajeros[i].setTelefono(null);
			}
		}
		
		return datosPasajeros;
	}

}
