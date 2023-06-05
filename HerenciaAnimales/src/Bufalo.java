
public class Bufalo extends Animal{
	private int altura_cuernos;
	private boolean esPeludo;
	
	public Bufalo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bufalo(String nombre, String procedencia, int altura, double peso) {
		super(nombre, procedencia, altura, peso);
		// TODO Auto-generated constructor stub
	}

	public Bufalo(int altura_cuernos, boolean esPeludo) {
		super();
		this.altura_cuernos = altura_cuernos;
		this.esPeludo = esPeludo;
	}

	public Bufalo(String nombre, String procedencia, int altura, double peso, int altura_cuernos, boolean esPeludo) {
		super(nombre, procedencia, altura, peso);
		this.altura_cuernos = altura_cuernos;
		this.esPeludo = esPeludo;
	}

	public int getAltura_cuernos() {
		return altura_cuernos;
	}

	public void setAltura_cuernos(int altura_cuernos) {
		this.altura_cuernos = altura_cuernos;
	}

	public boolean isEsPeludo() {
		return esPeludo;
	}

	public void setEsPeludo(boolean esPeludo) {
		this.esPeludo = esPeludo;
	}

	@Override
	public String toString() {
		String peludo = "No";
		
		if (esPeludo) {
			peludo = "Sí";
		}
		
		return "Altura de los cuernos: " + altura_cuernos + " cm - Es peludo: " + peludo + " - " + super.toString();
	}
}
