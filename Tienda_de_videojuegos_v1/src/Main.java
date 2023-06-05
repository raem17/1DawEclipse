import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	// Métodos
	
	static boolean existeVideojuego (ArrayList<Videojuego> videojuegos, Videojuego videojuego) {
		boolean existeVidedeojuego = false;
		
		for (int i = 0; i < videojuegos.size(); i++) {
			if (videojuegos.get(i).getNombre().equalsIgnoreCase(videojuego.getNombre())) {
				existeVidedeojuego = true;
				break;
			}
		}
		
		return existeVidedeojuego;
	}
	
	static boolean existeCliente (ArrayList<Cliente> clientes, Cliente cliente) {
		boolean existeCliente = false;
		
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getNum_cliente().equalsIgnoreCase(cliente.getNum_cliente())) {
				existeCliente = true;
				break;
			}
		}
		
		return existeCliente;
	}
	
	static boolean existeEmpleado (ArrayList<Empleado> empleados, Empleado empleado) {
		boolean existeEmpleado = false;
		
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getNum_empleado().equalsIgnoreCase(empleado.getNum_empleado())) {
				existeEmpleado = true;
				break;
			}
		}
		
		return existeEmpleado;
	}
	
	static double devolverImpTotVentasCli (ArrayList<Venta> ventas, Cliente cliente) {
		double impTotVentas = 0.0;
		
		for (int i = 0; i < ventas.size(); i++) {
			if (ventas.get(i).getCliente().getNum_cliente().equalsIgnoreCase(cliente.getNum_cliente())) {
				impTotVentas = impTotVentas + ventas.get(i).devolverImpTot();
			}
		}
		
		return impTotVentas;
	}
	
	static ArrayList<String> devolverNombresVJ70 (ArrayList<Venta> ventas, Tienda tienda) {
		ArrayList<String> nombres = new ArrayList<String>();
		
		for (int i = 0; i < ventas.size(); i++) {
			if (ventas.get(i).getTienda().getNum_tienda().equalsIgnoreCase(tienda.getNum_tienda())) {
				for (int j = 0; j < ventas.get(i).getLineas_venta().size(); j++) {
					if (ventas.get(i).getLineas_venta().get(j).getImporte() > 70) {
						nombres.add(ventas.get(i).getLineas_venta().get(j).getVideojuego().getNombre());
					}
				}
			}
		}
		
		return nombres;
	}
}
