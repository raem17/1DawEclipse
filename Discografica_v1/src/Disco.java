

public class Disco {
	private String titulo;
	private int añopublicacion;
	private int coddisco;
	private String productor;
	private Cancion[] canciones;
	
	public Disco() {
		
	}
	public Disco(String titulo, int añopublicacion, int coddisco, String productor, Cancion[] canciones) {
		super();
		this.titulo = titulo;
		this.añopublicacion = añopublicacion;
		this.coddisco = coddisco;
		this.productor = productor;
		this.canciones = canciones;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAñopublicacion() {
		return añopublicacion;
	}
	public void setAñopublicacion(int añopublicacion) {
		this.añopublicacion = añopublicacion;
	}
	public int getCoddisco() {
		return coddisco;
	}
	public void setCoddisco(int coddisco) {
		this.coddisco = coddisco;
	}
	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public Cancion[] getCanciones() {
		return canciones;
	}
	public void setCanciones(Cancion[] canciones) {
		this.canciones = canciones;
	}
	@Override
	public String toString() {
		return "Disco [titulo=" + titulo + ", añopublicacion=" + añopublicacion + ", coddisco=" + coddisco
				+ ", productor=" + productor + ", canciones=" + canciones + "]";
	}
	
}
