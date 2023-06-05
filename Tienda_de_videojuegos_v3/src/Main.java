import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	}

	
	// Métodos

	static boolean existeVideojuego(ArrayList<Videojuego> datosVideojuegos, Videojuego datosVideojuego) {
		boolean existeVidedeojuego = false;

		for (int i = 0; i < datosVideojuegos.size(); i++) {
			if (datosVideojuegos.get(i).getNombre().equalsIgnoreCase(datosVideojuego.getNombre())) {
				existeVidedeojuego = true;
				break;
			}
		}

		return existeVidedeojuego;
	}

	static boolean existeCliente (ArrayList<Cliente> datosClientes, Cliente datosCliente) {
		boolean existeCliente = false;

		for (int i = 0; i < datosClientes.size(); i++) {
			if (datosClientes.get(i).getNum_cliente().equalsIgnoreCase(datosCliente.getNum_cliente())) {
				existeCliente = true;
				break;
			}
		}

		return existeCliente;
	}
	
	static boolean existeDNICliente (ArrayList<Cliente> datosClientes, String dni) {
		boolean existeDNICliente = false;
		
		for (int i = 0; i < datosClientes.size(); i++) {
			if (datosClientes.get(i).getDni().equalsIgnoreCase(dni)) {
				existeDNICliente = true;
				break;
			}
		}
		
		return existeDNICliente;
	}

	static boolean existeEmpleado(ArrayList<Empleado> datosEmpleados, Empleado datosEmpleado) {
		boolean existeEmpleado = false;

		for (int i = 0; i < datosEmpleados.size(); i++) {
			if (datosEmpleados.get(i).getNum_empleado().equalsIgnoreCase(datosEmpleado.getNum_empleado())) {
				existeEmpleado = true;
				break;
			}
		}

		return existeEmpleado;
	}
	
	static boolean existeDNIEmpleado (ArrayList<Empleado> datosEmpleados, String dni) {
		boolean existeDNIEmpleado = false;
		
		for (int i = 0; i < datosEmpleados.size(); i++) {
			if (datosEmpleados.get(i).getDni().equalsIgnoreCase(dni)) {
				existeDNIEmpleado = true;
				break;
			}
		}
		
		return existeDNIEmpleado;
	}
	
	static boolean existeNumTienda (ArrayList<Tienda> datosTiendas, String numTienda) {
		boolean existeNumTienda = false;
		
		for (int i = 0; i < datosTiendas.size(); i++) {
			if (datosTiendas.get(i).getNum_tienda().equalsIgnoreCase(numTienda)) {
				existeNumTienda = true;
				break;
			}
		}
		
		return existeNumTienda;
	}

	static double devolverImpTotVentasCli(ArrayList<Venta> datosVentas, Cliente datosCliente) {
		double impTotVentas = 0.0;

		for (int i = 0; i < datosVentas.size(); i++) {
			if (datosVentas.get(i).getCliente().getNum_cliente().equalsIgnoreCase(datosCliente.getNum_cliente())) {
				impTotVentas = impTotVentas + datosVentas.get(i).devolverImpTot();
			}
		}

		return impTotVentas;
	}

	static ArrayList<String> devolverNombresVJ70(ArrayList<Venta> datosVentas, Tienda datosTienda) {
		ArrayList<String> nombres = new ArrayList<String>();

		for (int i = 0; i < datosVentas.size(); i++) {
			if (datosVentas.get(i).getTienda().getNum_tienda().equalsIgnoreCase(datosTienda.getNum_tienda())) {
				for (int j = 0; j < datosVentas.get(i).getLineas_venta().size(); j++) {
					if (datosVentas.get(i).getLineas_venta().get(j).getImporte() > 70) {
						nombres.add(datosVentas.get(i).getLineas_venta().get(j).getVideojuego().getNombre());
					}
				}
			}
		}

		return nombres;
	}

	static Cliente dameCliente(ArrayList<Cliente> datosClientes, String dni) {
		Cliente datosCliente = new Cliente();

		for (int i = 0; i < datosClientes.size(); i++) {
			if (datosClientes.get(i).getDni().equalsIgnoreCase(dni)) {
				datosCliente = datosClientes.get(i);
				break;
			}
		}

		return datosCliente;
	}

	static Empleado dameEmpleado(ArrayList<Empleado> datosEmpleados, String dniEmpleado) {
		Empleado datosEmpleado = new Empleado();

		for (int i = 0; i < datosEmpleados.size(); i++) {
			if (datosEmpleados.get(i).getDni().equalsIgnoreCase(dniEmpleado)) {
				datosEmpleado = datosEmpleados.get(i);
				break;
			}
		}

		return datosEmpleado;
	}

	static Tienda dameTienda(ArrayList<Tienda> datosTiendas, String numTienda) {
		Tienda datosTienda = new Tienda();

		for (int i = 0; i < datosTiendas.size(); i++) {
			if (datosTiendas.get(i).getNum_tienda().equalsIgnoreCase(numTienda)) {
				datosTienda = datosTiendas.get(i);
				break;
			}
		}

		return datosTienda;
	}
	
	static ArrayList<String> devolverNombresVideojuegosMesesPares (ArrayList<Venta> datosVentas) {
		ArrayList<String> nombresVideojuegosMesesPares = new ArrayList<String>();
		
		for (int i = 0; i < datosVentas.size(); i++) {
			if (datosVentas.get(i).elMesDeVentaEsPar()) {
				for (int j = 0; j < datosVentas.get(i).getLineas_venta().size(); j++) {
					nombresVideojuegosMesesPares.add(datosVentas.get(i).getLineas_venta().get(j).getVideojuego().getNombre());
				}
			}
		}
		
		return nombresVideojuegosMesesPares;
	}
	
	// Método auxiliar para "altaVenta"
	static double devolverImporteTotal_LineasV (ArrayList<Linea_Venta> datos_L_Ventas) {
		double importeTotal_LineaV = 0.0;
		
		for (int i = 0; i < datos_L_Ventas.size(); i++) {
			importeTotal_LineaV = importeTotal_LineaV + datos_L_Ventas.get(i).devolverImpTot_L_Venta();
		}
		
		return importeTotal_LineaV;
	}
	
	static void altaVenta (ArrayList<Venta> datosVentas, String dniCliente, String dniEmpleado, String fechaVenta, ArrayList<Linea_Venta> datosLineasV, String numTienda, ArrayList<Cliente> datosClientes, ArrayList<Empleado> datosEmpleados, ArrayList<Tienda> datosTiendas) {
		if (existeDNICliente(datosClientes, dniCliente) && existeDNIEmpleado(datosEmpleados, dniEmpleado) && existeNumTienda(datosTiendas, numTienda)) {
			Venta nuevaVenta = new Venta(dameEmpleado(datosEmpleados, dniEmpleado), fechaVenta, devolverImporteTotal_LineasV(datosLineasV), dameTienda(datosTiendas, numTienda), dameCliente(datosClientes, dniCliente), datosLineasV);
			datosVentas.add(nuevaVenta);
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * Devuelve el nombre del cliente que más importe ha gastado de un ArrayList de ventas pasado por parámetro.
	 * @param datosVentas
	 * @return 
	 */
	static String devolverNomClienteMaxCompra (ArrayList<Venta> datosVentas) {
		String nomCli = "";
		Double impMax = datosVentas.get(0).devolverImpTot()-1;
		
		for (int i = 0; i < datosVentas.size(); i++) {
			if (datosVentas.get(i).devolverImpTot() > impMax) {
				impMax = datosVentas.get(i).devolverImpTot();
				nomCli = datosVentas.get(i).getCliente().getNombre();
			}
		}
		
		return nomCli;
	}
	
	/**
	 * Devuelve el videojuego con más unidades vendidas del array de ventas pasado por parámetro.
	 * @param datosVentas ArrayList de ventas.
	 * @return Videojuego más vendido.
	 */
	static Videojuego devolverVideojuegoMasVendido (ArrayList<Venta> datosVentas) {
		Videojuego videojuegoMasVendido = new Videojuego();
		
		// 1ª parte : Crear array de registros de videojuegos y rellenarlo
		ArrayList<Registro_Videojuego> datosRegistros = Utilidades.devolverRegistrosOptimizado(datosVentas);
		
		// 2ª parte : Encontrar nombre de videojuego más vendido en datosRegistros
		int udsMax = datosRegistros.get(0).getUnidadesVendidas()-1;
		String nombreVideoMax = "";
		
		for (int i = 0; i < datosRegistros.size(); i++) {
			if (datosRegistros.get(i).getUnidadesVendidas() > udsMax) {
				udsMax = datosRegistros.get(i).getUnidadesVendidas();
				nombreVideoMax = datosRegistros.get(i).getNombre();
			}
		}
		
		// 3ª parte : Encontrar videojuego en array de ventas con nombre igual a nombreVideoMax, y guardarlo
		for (int i = 0; i < datosVentas.size(); i++) {
			for (int j = 0; j < datosVentas.get(i).getLineas_venta().size(); j++) {
				if (datosVentas.get(i).getLineas_venta().get(j).getVideojuego().getNombre().equalsIgnoreCase(nombreVideoMax)) {
					videojuegoMasVendido = datosVentas.get(i).getLineas_venta().get(j).getVideojuego();
					break;
				}
			}
		}
		
		// Final
		return videojuegoMasVendido;
	}
	/**
	 * Devuelve un listado con los nombres de los videojuegos más vendidos en orden descendiente según el array de ventas pasado por parámetro.
	 * @param datosVentas ArrayList de ventas
	 * @return ArrayList de strings
	 */
	static ArrayList<String> devolverNomVideosMasVendidos (ArrayList<Venta> datosVentas) {
		ArrayList<String> nombres = new ArrayList<String>();
		
		// 1ª parte : Crear array de registros de videojuegos y rellenarlo
		ArrayList<Registro_Videojuego> datosRegistros = Utilidades.devolverRegistrosOptimizado(datosVentas);
		
		// 2ª parte : Ordenarlo de forma descendiente según las unidades vendidas (método de la burbuja).
		Utilidades.ordenarRegistrosXVentasDescendente(datosRegistros);
		
		// 3ª parte : Rellenar array de nombres
		for (int i = 0; i < datosRegistros.size(); i++) {
			nombres.add(datosRegistros.get(i).getNombre() + " - " + datosRegistros.get(i).getUnidadesVendidas());
		}
		
		// Fin
		return nombres;
	}
}
