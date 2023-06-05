
public class Personaje {
	private String nombre;
	private String tipo;
	
	public Personaje() {
		super();
	}

	public Personaje(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	// Métodos
	public boolean nombreEmpiezaYTerminaXLetra (char letra) {
		boolean empiezaYTerminaXLetra = false;
		String letraString = String.valueOf(letra);
		letraString = letraString.toLowerCase();
		
		String nombreVideojuegoEnMin = this.nombre.toLowerCase();
		
		
		if (nombreVideojuegoEnMin.startsWith(letraString) && nombreVideojuegoEnMin.endsWith(letraString)) {
			empiezaYTerminaXLetra = true;
		}
		
		return empiezaYTerminaXLetra;
	}
}
