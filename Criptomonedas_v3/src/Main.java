import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

	}
	
	
	// Métodos
	
	static boolean existeCliente (Cliente datosCliente, ArrayList<Cliente> datosClientes) {
		boolean existe = false;
		
		for (int i = 0; i < datosClientes.size(); i++) {
			if (datosClientes.get(i).getDni().equalsIgnoreCase(datosCliente.getDni())) {
				existe = true;
				break;
			}
		}
		
		return existe;
	}
	
	static boolean existeCriptomoneda (String nombreCriptomoneda, ArrayList<Criptomoneda> datosCriptomonedas) {
		boolean existeCriptomoneda = false;
		
		for (int i = 0; i < datosCriptomonedas.size(); i++) {
			if (datosCriptomonedas.get(i).getNombre().equalsIgnoreCase(nombreCriptomoneda) ) {
				existeCriptomoneda = true;
			}
		}
		
		return existeCriptomoneda;
	}
	
	static ArrayList<Operacion_cuenta> devolverOperacionesMayorA500 (Cliente datosCliente) {
		ArrayList<Operacion_cuenta> operacionesMayorA500 = new ArrayList<Operacion_cuenta>();
		
		
		for (int i = 0; i < datosCliente.getCuentas().size(); i++) {
			for (int j = 0; j < datosCliente.getCuentas().get(i).getHistorial().size(); j++) {
				if (datosCliente.getCuentas().get(i).getHistorial().get(j).esIngresoMayorA500()) {
					operacionesMayorA500.add(datosCliente.getCuentas().get(i).getHistorial().get(j));
				}
			}
		}
		
		return operacionesMayorA500;
	}
	
	static ArrayList<String> devolverDniClientes35000Euros (ArrayList<Cliente> datosClientes) {
		ArrayList<String> dnisClientes35000Euros = new ArrayList<String>();
		
		for (int i = 0; i < datosClientes.size(); i++) {
			if (datosClientes.get(i).getBilletera().devolverValorBilleteraEurosEnBitcoins() > 35000) {
				dnisClientes35000Euros.add(datosClientes.get(i).getDni());
			}
		}
		
		return dnisClientes35000Euros;
	}
	
	// Método 8
	static ArrayList<Double> devolverUdsCripto (Cliente datosCliente) {
		ArrayList<Double> udsCripo = new ArrayList<Double>();
		
		
		for (int i = 0; i < datosCliente.getBilletera().getLineas_B().size(); i++) {
			udsCripo.add(datosCliente.getBilletera().getLineas_B().get(i).getUnidades());
		}
		
		
		return udsCripo;
	}
	
	// Método 9
	static Billetera devolverBilleteraMasUdsMonedaValorMax (ArrayList<Criptomoneda> datosCriptomonedas, ArrayList<Billetera> datosBilleteras) {
		double valorMax = datosCriptomonedas.get(0).getValor_E()-1;
		String nombreMonedaValorMax = "";
		
		
		// 1ª parte
		
		for (int i = 0; i < datosCriptomonedas.size(); i++) {
			if (datosCriptomonedas.get(i).getValor_E() > valorMax) {
				valorMax = datosCriptomonedas.get(i).getValor_E();
				nombreMonedaValorMax = datosCriptomonedas.get(i).getNombre();
			}
		}
		
		
		// 2ª parte 
		
		Billetera billeteraUdsMax = new Billetera();
		double udsMax = datosBilleteras.get(0).devolverUdsMonedaIntroducida(nombreMonedaValorMax)-1;
		
		
		for (int i = 0; i < datosBilleteras.size(); i++) {
			if (datosBilleteras.get(i).devolverUdsMonedaIntroducida(nombreMonedaValorMax) > udsMax) {
				udsMax = datosBilleteras.get(i).devolverUdsMonedaIntroducida(nombreMonedaValorMax);
				billeteraUdsMax = datosBilleteras.get(i);
			}
		}
		
		return billeteraUdsMax;
	}
	
	// Método 10
	static ArrayList<String> devolverNombresClienteYMonedaMax (ArrayList<Cliente> datosClientes) {
		double valorMax = datosClientes.get(0).getBilletera().getLineas_B().get(0).devolverValorEnEuros_L_Billetera()-1;
		String nombreClienteMax = "";
		String nombreMonedaMax = "";
		
		for (int i = 0; i < datosClientes.size(); i++) {
			for (int j = 0; j < datosClientes.get(i).getBilletera().getLineas_B().size(); j++) {
				if (datosClientes.get(i).getBilletera().getLineas_B().get(j).devolverValorEnEuros_L_Billetera() > valorMax) {
					valorMax = datosClientes.get(i).getBilletera().getLineas_B().get(j).devolverValorEnEuros_L_Billetera();
					nombreClienteMax = datosClientes.get(i).getNombre();
					nombreMonedaMax = datosClientes.get(i).getBilletera().getLineas_B().get(j).getCriptomoneda().getNombre();
				}
			}
		}
		
		ArrayList<String> nombresClienteYMonedaMax = new ArrayList<String>();
		
		nombresClienteYMonedaMax.add(nombreClienteMax);
		nombresClienteYMonedaMax.add(nombreMonedaMax);
		
		return nombresClienteYMonedaMax;
	}
	
	// Método 11
	static ArrayList<Cliente> devolverClientesLineasB_Max (ArrayList<Cliente> datosClientes) {
		// 1ª parte: busca el número de líneas B (tamaño del arrayList de líneas B) más grande de todos los clientes.
		
		int nLineasB_Max = datosClientes.get(0).getBilletera().getLineas_B().size()-1;
		
		for (int i = 0; i < datosClientes.size(); i++) {
			if (datosClientes.get(i).getBilletera().getLineas_B().size() > nLineasB_Max) {
				nLineasB_Max = datosClientes.get(i).getBilletera().getLineas_B().size();
			}
		}
		
		
		// 2ª parte
		
		ArrayList<Cliente> datosClientesNLineasBMax = new ArrayList<Cliente>();
		
		for (int i = 0; i < datosClientes.size(); i++) {
			if (datosClientes.get(i).getBilletera().getLineas_B().size() == nLineasB_Max) {
				datosClientesNLineasBMax.add(datosClientes.get(i));
			}
		}
		
		return datosClientesNLineasBMax;
	}
	
	// Método 13
	static void compraCriptomoneda (Cliente datosCliente, String nombreCriptomoneda, double nUnidadesAComprar, ArrayList<Cliente> datosClientes, ArrayList<Criptomoneda> datosCriptomonedas) {
		boolean existeCliente = existeCliente(datosCliente, datosClientes);
		
		
		boolean existeCriptomoneda = existeCriptomoneda(nombreCriptomoneda, datosCriptomonedas);
		double valorUdCriptomoneda = 0.0;
		int posicion = 0;
		for (int i = 0; i < datosCriptomonedas.size(); i++) {
			if (datosCriptomonedas.get(i).getNombre().equalsIgnoreCase(nombreCriptomoneda)) {
				valorUdCriptomoneda = datosCriptomonedas.get(i).getValor_E();
				posicion = i;
				break;
			}
		}
		
		
		boolean tieneSaldoSuficiente = false;
		double costeCompra = nUnidadesAComprar * valorUdCriptomoneda;
		if (datosCliente.getBilletera().getSaldo() >= costeCompra) {
			tieneSaldoSuficiente = true;
		}
		
		
		if (existeCliente == true && existeCriptomoneda == true && tieneSaldoSuficiente == true) {
			if (datosCliente.tieneCriptomoneda(nombreCriptomoneda)) { // En caso de que ya tenga una linea B de la criptomoneda
				datosCliente.getBilletera().getLineas_B().get(datosCliente.devolverPosLineaBCripto(nombreCriptomoneda)).añadirUnidades(nUnidadesAComprar);
				
			} else { // Caso contrario
				L_Billetera nuevaLinea = new L_Billetera(datosCriptomonedas.get(posicion), nUnidadesAComprar);
				datosCliente.getBilletera().getLineas_B().add(nuevaLinea);
			}
		} else {
			System.out.println("No cumple con alguna condición para efectuar la compra.");
		}
	}
	
	// Método 16, 17 o 19
	static String devolverNumCuentaOpeMax (ArrayList<Cliente> datosClientes) {
		String nCuenta = "";
		double tamañoHistorialMax = datosClientes.get(0).getCuentas().get(0).getHistorial().size()-1;
		
		
		for (int i = 0; i < datosClientes.size(); i++) {
			for (int j = 0; j < datosClientes.get(i).getCuentas().size(); j++) {
				if (datosClientes.get(i).getCuentas().get(j).getHistorial().size() > tamañoHistorialMax) {
					tamañoHistorialMax = datosClientes.get(i).getCuentas().get(j).getHistorial().size();
					nCuenta = datosClientes.get(i).getCuentas().get(j).getN_cuenta();
				}
			}
		}
		
		return nCuenta;
	}
	
	// Método 20
	static void mostrarNombresCriptos (ArrayList<Cliente> datosClientes) {
		ArrayList<String> nombreCriptos = new ArrayList<String>();
		
		for (int i = 0; i < datosClientes.size(); i++) {
			for (int j = 0; j < datosClientes.get(i).getBilletera().getLineas_B().size(); j++) {
				nombreCriptos.add(datosClientes.get(i).getBilletera().getLineas_B().get(j).getCriptomoneda().getNombre());
			}
		}
		
		eliminarStringsDuplicados(nombreCriptos);
		
		for (int i = 0; i < nombreCriptos.size(); i++) {
			System.out.print(nombreCriptos.get(i) + ", ");
		}
	}
	
	// Método aux para M20
	static void eliminarStringsDuplicados (ArrayList<String> cadenas) {
		int cont = 0;
		
		for (int i = 0; i < cadenas.size(); i++) {
			cont = 0;
			
			for (int j = 0; j < cadenas.size(); j++) {
				if (cadenas.get(i).equalsIgnoreCase(cadenas.get(j))) {
					cont++;
				}
			}
			
			if (cont > 1) {
				cadenas.remove(i);
			}
		}
	}
	
	// Método 21
	static void mostrarNombreCriptoCapiMax (ArrayList<Cliente> datosClientes) {
		String nombreCriptoCapiMax = "";
		double capiMax = datosClientes.get(0).getBilletera().getLineas_B().get(0).getCriptomoneda().getCapitalizacion()-1;
		
		
		for (int i = 0; i < datosClientes.size(); i++) {
			for (int j = 0; j < datosClientes.get(i).getBilletera().getLineas_B().size(); j++) {
				if (datosClientes.get(i).getBilletera().getLineas_B().get(j).getCriptomoneda().getCapitalizacion() > capiMax) {
					capiMax = datosClientes.get(i).getBilletera().getLineas_B().get(j).getCriptomoneda().getCapitalizacion();
					nombreCriptoCapiMax = datosClientes.get(i).getBilletera().getLineas_B().get(j).getCriptomoneda().getNombre();
				}
			}
		}
		
		System.out.println(nombreCriptoCapiMax);
	}
}
