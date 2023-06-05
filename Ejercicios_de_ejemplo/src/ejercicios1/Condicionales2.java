package ejercicios1;

public class Condicionales2 {

	public static void main(String[] args) {
		
		String nombre = "Santiaguin";
		String nombre2 = "santiaguin";
		
		
		if (nombre.equals(nombre2)) {
			System.out.println("Entra en el primero");
		}
		
		if (nombre.equalsIgnoreCase(nombre2)) {
			System.out.println("Entra en el segundo.");
		}
	}

}
