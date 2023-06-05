import java.util.ArrayList;

public class Videojuego {
	private String nombre;
	private String categoria;
	private ArrayList<Personaje> personajes;
	
	public Videojuego() {
		super();
	}

	public Videojuego(String nombre, String categoria, ArrayList<Personaje> personajes) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.personajes = personajes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(ArrayList<Personaje> personajes) {
		this.personajes = personajes;
	}
}
