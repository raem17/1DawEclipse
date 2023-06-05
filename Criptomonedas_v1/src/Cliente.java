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
}
