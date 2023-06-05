import java.util.ArrayList;

public class Utilidades {

	public static void main(String[] args) {

	}
	/**
	 * Elimina las cadenas repetidas del ArrayList de strings pasado por parámetro.
	 * @param nombres ArrayList de strings a modificar.
	 */
	static void eliminarDuplicados (ArrayList<String> nombres) {
		int cont = 0;
		
		for (int i = 0; i < nombres.size(); i++) {
			cont = 0;
			
			for (int j = 0; j < nombres.size(); j++) {
				if (nombres.get(i) == nombres.get(j)) {
					cont++;
				}
			}
			
			if (cont > 1) {
				nombres.remove(i);
			}
		}
	}
	
	
	// Método aux
	static boolean existeNomVideojuegoEnRegistros(String nombreVideojuego, ArrayList<Registro_Videojuego> datosRegistros) {
		boolean existe = false;
		
		for (int i = 0; i < datosRegistros.size(); i++) {
			if (datosRegistros.get(i).getNombre().equalsIgnoreCase(nombreVideojuego)) {
				existe = true;
				break;
			}
		}
		
		return existe;
	}
	
	// Método aux
	static void ordenarRegistrosXVentasDescendente(ArrayList<Registro_Videojuego> datosRegistros) {
		Registro_Videojuego aux;
		
		for (int i = 0; i < datosRegistros.size(); i++) {
			for (int j = 0; j < datosRegistros.size()-1; j++) {
				if (datosRegistros.get(j+1).getUnidadesVendidas() > datosRegistros.get(j).getUnidadesVendidas()) {
					aux = datosRegistros.get(j+1);
					datosRegistros.set(j+1, datosRegistros.get(j));
					datosRegistros.set(j, aux);
				}
			}
		}
	}
	
	// Método de Jorge, estudiar
	static ArrayList<Registro_Videojuego> devolverRegistrosOptimizado(ArrayList<Venta> datosVentas) {
		ArrayList<Registro_Videojuego> datosRegistros = new ArrayList<Registro_Videojuego>();
		
		for (int i = 0; i < datosVentas.size(); i++) {
			for (int j = 0; j < datosVentas.get(i).getLineas_venta().size(); j++) {
				if (!existeNomVideojuegoEnRegistros(datosVentas.get(i).getLineas_venta().get(j).getVideojuego().getNombre(), datosRegistros)) {
					Registro_Videojuego datosRegistro = new Registro_Videojuego(datosVentas.get(i).getLineas_venta().get(j).getVideojuego().getNombre(), datosVentas.get(i).getLineas_venta().get(j).getUnidades());
					datosRegistros.add(datosRegistro);
				} else {
					for (int z = 0; z < datosRegistros.size(); z++) {
						if (datosRegistros.get(z).getNombre().equalsIgnoreCase(datosVentas.get(i).getLineas_venta().get(j).getVideojuego().getNombre())) {
							datosRegistros.get(z).añadirUnidades(datosVentas.get(i).getLineas_venta().get(j).getUnidades());
						}
					}
				}
			}
		}
		
		return datosRegistros;
	}
}
