
public class Fruto_seco {
	
	String nombre;
	String color;
	double calorias;
	double porcentajeGrasa;
	double precioPorKilo;
	boolean esDulce;
	
	
	Fruto_seco() {}
	
	
	Fruto_seco(String nombre, String color, double calorias, double porcentajeGrasa, double precioPorKilo,
			boolean esDulce) {
		
		super();
		this.nombre = nombre;
		this.color = color;
		this.calorias = calorias;
		this.porcentajeGrasa = porcentajeGrasa;
		this.precioPorKilo = precioPorKilo;
		this.esDulce = esDulce;
	}
}
