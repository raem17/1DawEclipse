import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		Videojuego datosVideojuegoHalo = new Videojuego("Halo", null, null);
		Videojuego datosVideojuegoMinecraft = new Videojuego("Minecraft", null, null);
		Videojuego datosVideojuegoCeleste = new Videojuego("Celeste", null, null);
		Videojuego datosVideojuegoPortal = new Videojuego("Portal", null, null);
		
		// Creo Venta 1 y sus datos descendientes
		
		Linea_Venta lineaVentaA = new Linea_Venta(0, datosVideojuegoHalo, 20);
		Linea_Venta lineaVentaA_2 = new Linea_Venta(0, datosVideojuegoHalo, 5);
		Linea_Venta lineaVentaA_3 = new Linea_Venta(0, datosVideojuegoCeleste, 5);
		Linea_Venta lineaVentaA_4 = new Linea_Venta(0, datosVideojuegoCeleste, 10);
		
		ArrayList<Linea_Venta> datosLVentasA = new ArrayList<>();
		datosLVentasA.add(lineaVentaA);
		datosLVentasA.add(lineaVentaA_2);
		datosLVentasA.add(lineaVentaA_3);
		datosLVentasA.add(lineaVentaA_4);
		
		Venta venta1 = new Venta(null, null, 0, null, null, datosLVentasA);
		
		// Creo Venta 2 y sus datos descendientes
		
		Linea_Venta lineaVentaB = new Linea_Venta(0, datosVideojuegoCeleste, 20);
		Linea_Venta lineaVentaB2 = new Linea_Venta(0, datosVideojuegoMinecraft, 15);
		Linea_Venta lineaVentaB3 = new Linea_Venta(0, datosVideojuegoMinecraft, 15);
		Linea_Venta lineaVentaB4 = new Linea_Venta(0, datosVideojuegoPortal, 30);
		
		ArrayList<Linea_Venta> datosLVentasB = new ArrayList<>();
		datosLVentasB.add(lineaVentaB);
		datosLVentasB.add(lineaVentaB2);
		datosLVentasB.add(lineaVentaB3);
		datosLVentasB.add(lineaVentaB4);
		
		Venta venta2 = new Venta(null, null, 0, null, null, datosLVentasB);
		
		// Creo array de ventas
		
		ArrayList<Venta> datosVentas = new ArrayList<Venta>();
		datosVentas.add(venta1);
		datosVentas.add(venta2);
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
	}
}
