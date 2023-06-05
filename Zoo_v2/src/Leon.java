
public class Leon extends Animal{
	private int nivel_fuerza;
	private int nivel_rugido;
	private boolean esAgresivo;
	public Leon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leon(String nombre, String procedencia, int altura, double peso) {
		super(nombre, procedencia, altura, peso);
		// TODO Auto-generated constructor stub
	}
	public Leon(int nivel_fuerza, int nivel_rugido, boolean esAgresivo) {
		super();
		this.nivel_fuerza = nivel_fuerza;
		this.nivel_rugido = nivel_rugido;
		this.esAgresivo = esAgresivo;
	}
	public Leon(String nombre, String procedencia, int altura, double peso, int nivel_fuerza, int nivel_rugido,
			boolean esAgresivo) {
		super(nombre, procedencia, altura, peso);
		this.nivel_fuerza = nivel_fuerza;
		this.nivel_rugido = nivel_rugido;
		this.esAgresivo = esAgresivo;
	}
	public int getNivel_fuerza() {
		return nivel_fuerza;
	}
	public void setNivel_fuerza(int nivel_fuerza) {
		this.nivel_fuerza = nivel_fuerza;
	}
	public int getNivel_rugido() {
		return nivel_rugido;
	}
	public void setNivel_rugido(int nivel_rugido) {
		this.nivel_rugido = nivel_rugido;
	}
	public boolean isEsAgresivo() {
		return esAgresivo;
	}
	public void setEsAgresivo(boolean esAgresivo) {
		this.esAgresivo = esAgresivo;
	}
	@Override
	public String toString() {
		String agresivo = "No";
		if (esAgresivo) {
			agresivo = "Sí";
		}
		
		return "Nivel de fuerza: " + nivel_fuerza + " - Nivel de rugido: " + nivel_rugido + " - Es agresivo: " + agresivo + " - " + super.toString();
	}
	
	public String esAgresivo() {
		String agresivo = "No agresivo";
		if (this.esAgresivo) {
			agresivo = "Agresivo";
		}
		
		return agresivo;
	}
}
