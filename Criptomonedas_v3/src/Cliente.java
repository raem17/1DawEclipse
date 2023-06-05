import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private String fecha_nac;
	private String provincia;
	private String nacionalidad;
	private ArrayList<Cuenta_Bancaria> cuentas;
	private Billetera billetera;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellidos, String dni, String direccion, String fecha_nac, String provincia,
			String nacionalidad, ArrayList<Cuenta_Bancaria> cuentas, Billetera billetera) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.fecha_nac = fecha_nac;
		this.provincia = provincia;
		this.nacionalidad = nacionalidad;
		this.cuentas = cuentas;
		this.billetera = billetera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public ArrayList<Cuenta_Bancaria> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta_Bancaria> cuentas) {
		this.cuentas = cuentas;
	}

	public Billetera getBilletera() {
		return billetera;
	}

	public void setBilletera(Billetera billetera) {
		this.billetera = billetera;
	}

	// Métodos

	public boolean tieneCriptomoneda(String nombreCriptomoneda) {
		boolean tieneCripto = false;

		for (int i = 0; i < this.billetera.getLineas_B().size(); i++) {
			if (this.billetera.getLineas_B().get(i).getCriptomoneda().getNombre()
					.equalsIgnoreCase(nombreCriptomoneda)) {
				tieneCripto = true;
			}
		}

		return tieneCripto;
	}

	public int devolverPosLineaBCripto(String nombreCriptomoneda) {
		int posLineaB = 0;

		for (int i = 0; i < this.getBilletera().getLineas_B().size(); i++) {
			if (this.getBilletera().getLineas_B().get(i).getCriptomoneda().getNombre()
					.equalsIgnoreCase(nombreCriptomoneda)) {
				posLineaB = i;
			}
		}

		return posLineaB;
	}

	public String devolverNCuentaSaldoMax() {
		String nCuenta = "";
		double saldoMax = this.cuentas.get(0).getSaldo() - 1;

		for (int i = 0; i < this.getCuentas().size(); i++) {
			if (this.getCuentas().get(i).getSaldo() > saldoMax) {
				saldoMax = this.getCuentas().get(i).getSaldo();
				nCuenta = this.getCuentas().get(i).getN_cuenta();
			}
		}

		return nCuenta;
	}

	public String devolverNCuentaOpeMax() {
		String nCuenta = "";
		int tamañoHistorialMax = this.getCuentas().get(0).getHistorial().size() - 1;

		for (int i = 0; i < this.getCuentas().size(); i++) {
			if (this.getCuentas().get(i).getHistorial().size() > tamañoHistorialMax) {
				tamañoHistorialMax = this.getCuentas().get(0).getHistorial().size();
				nCuenta = this.getCuentas().get(i).getN_cuenta();
			}
		}

		return nCuenta;
	}

	// Método 18
	public String devolverNomCriptoUdsMin() {
		String nombreCripto = "";
		Double unidadesMin = this.getBilletera().getLineas_B().get(0).getUnidades()+1;

		for (int i = 0; i < this.billetera.getLineas_B().size(); i++) {
			if (this.billetera.getLineas_B().get(i).getUnidades() < unidadesMin) {
				unidadesMin = this.billetera.getLineas_B().get(i).getUnidades();
				nombreCripto = this.billetera.getLineas_B().get(i).getCriptomoneda().getNombre();
			}
		}

		return nombreCripto;
	}
}
