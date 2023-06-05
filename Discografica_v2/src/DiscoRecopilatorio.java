
public class DiscoRecopilatorio {
	private String titulo;
	private int codigo;
	private Disco [] datosDiscos;
	
	
	public DiscoRecopilatorio() {
		super();
	}


	public DiscoRecopilatorio(String titulo, int codigo, Disco[] datosDiscos) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.datosDiscos = datosDiscos;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Disco[] getDatosDiscos() {
		return datosDiscos;
	}


	public void setDatosDiscos(Disco[] datosDiscos) {
		this.datosDiscos = datosDiscos;
	}
	
	
	public void mostrarDatos () {
		System.out.println("Título: " + this.titulo);
		System.out.println("Código: " + this.codigo);
		System.out.println("Discos: " + this.datosDiscos);
	}
}
