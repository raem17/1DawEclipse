import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner(System.in);
		Jugador jugon = new Jugador(null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		
		
		System.out.println("Introduzca su nombre de jugador:");
		jugon.setNombre(sctxt.nextLine());
		
		
		jugon.setPpp(0);
		
		
		System.out.println("Nombre: " + jugon.getNombre());
		System.out.println("Apellidos: " + jugon.getApellidos());
		System.out.println("Puntos por partido (ppp): " + jugon.getPpp());	
		
		sctxt.close();
	}

}
