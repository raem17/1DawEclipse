package Pelicula;

public class Pelicula {
	private int codigo;
	private String titulo;
	private int year;
	private int duracion;
	private String pais;
	private String direccion;
	private String guion;
	private String fotografia;
	private String reparto;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int codigo, String titulo, int year, int duracion, String pais, String direccion, String guion,
			String fotografia, String reparto) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.year = year;
		this.duracion = duracion;
		this.pais = pais;
		this.direccion = direccion;
		this.guion = guion;
		this.fotografia = fotografia;
		this.reparto = reparto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getGuion() {
		return guion;
	}

	public void setGuion(String guion) {
		this.guion = guion;
	}

	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", year=" + year + ", duracion=" + duracion
				+ ", pais=" + pais + ", direccion=" + direccion + ", guion=" + guion + ", fotografia=" + fotografia
				+ ", reparto=" + reparto + "]";
	}
}
