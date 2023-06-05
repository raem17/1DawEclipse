package NBA;

public class Utilidades {

	public static String devolverEstiloXAltura(String alturaStr) {
		String estilos = "";
		
		alturaStr = alturaStr.replace("-", ".");
		double altura = Double.parseDouble(alturaStr);
		
		if (altura >= 7) {
			estilos = "background-color: green; color: white;";
		}
			
		return estilos;
	}
}
