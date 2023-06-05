import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {


	}
	
	
	// Métodos
	
	static boolean existeCliente (Cliente datosCliente, ArrayList<Cliente> datosClientes) {
		boolean existe = false;
		
		if (datosClientes.contains(datosCliente)) {
			existe = true;
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
}
