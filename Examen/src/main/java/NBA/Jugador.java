package NBA;

public class Jugador {
	private int codigo;
	private String nombre;
	private String procedencia;
	private String altura;
	private int peso;
	private String posicion;
	private String nombre_quipo;
	
	public Jugador() {
		super();
	}

	public Jugador(int codigo, String nombre, String procedencia, String altura, int peso, String posicion,
			String nombre_quipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
		this.nombre_quipo = nombre_quipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNombre_quipo() {
		return nombre_quipo;
	}

	public void setNombre_quipo(String nombre_quipo) {
		this.nombre_quipo = nombre_quipo;
	}

	@Override
	public String toString() {
		return "Jugador [codigo=" + codigo + ", nombre=" + nombre + ", procedencia=" + procedencia + ", altura="
				+ altura + ", peso=" + peso + ", posicion=" + posicion + ", nombre_quipo=" + nombre_quipo + "]";
	}
}
