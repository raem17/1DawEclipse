package FIFA;

public class Utilidades {
	public static String devolverEstilosXNum (int num) {
		String estilos = "";
		
		if (num >= 0 && num <= 49) {
			estilos = "background-color:#F44336;color:white;";
		} else if (num >= 50 && num <= 59) {
			estilos = "background-color:#FB8C00;color:white;";
		} else if (num >= 60 && num <= 69) {
			estilos = "background-color:#E9BC0B;color:black;";
		} else if (num >= 70 && num <= 89) {
			estilos = "background-color:#4CAF50;color:white;";
		} else if (num >= 90 && num <= 99) {
			estilos = "background-color:#386230;color:white;";
		}
		
		return estilos;
	}
	
	public static String devolverColorXNum (int num) {
		String estilos = "";
		
		if (num >= 0 && num <= 49) {
			estilos = "color:#F44336;";
		} else if (num >= 50 && num <= 59) {
			estilos = "color:#FB8C00;";
		} else if (num >= 60 && num <= 69) {
			estilos = "color:#E9BC0B;";
		} else if (num >= 70 && num <= 89) {
			estilos = "color:#4CAF50;";
		} else if (num >= 90 && num <= 99) {
			estilos = "color:#386230;";
		}
		
		return estilos;
	}
	
	public static String returnTextColorOfCardXNomCarta (String nombreCarta) {
		String estilos = "";
		
		if (nombreCarta.equalsIgnoreCase("simple")) {
			estilos = "color: #474747;";
		} else if (nombreCarta.equalsIgnoreCase("if")) {
			estilos = "color: white;";
		} else if (nombreCarta.equalsIgnoreCase("motm")) {
			estilos = "color: white;";
		} else if (nombreCarta.equalsIgnoreCase("toty")) {
			estilos = "color: white;";
		}
		
		return estilos;
	}
	
	public static String returnBGCXNomCarta (String nombreCarta) {
		String estilos = "";
		
		if (nombreCarta.equalsIgnoreCase("simple")) {
			estilos = "background-color:#e9bc0b;";
		} else if (nombreCarta.equalsIgnoreCase("if")) {
			estilos = "background-color:#A02020;";
		} else if (nombreCarta.equalsIgnoreCase("motm")) {
			estilos = "background-color:#06124C;";
		} else if (nombreCarta.equalsIgnoreCase("toty")) {
			estilos = "background-color:#030D26;";
		}
		
		return estilos;
	}
}
