package ejercicios1;

public class ejer1 {

	public static void main(String[] args) {

		System.out.println("Hola este es mi primer programa en Java.");
		System.out.println("Este es mi segundo mensaje.");
		// Declaro las variables
		int edad = 0;
		double sueldo = 0;
		char letra = 'g';
		String direccion = "";
		short numeroHijos = 0;
		
		System.out.println(edad);
		System.out.println(sueldo);
		System.out.println(letra);
		System.out.println(direccion);
		System.out.println(numeroHijos);
		
		//2ª PARTE
		
		edad = 25;
		sueldo = 25000;
		letra = 'a';
		direccion = "Donoso Cortes, 61";
		numeroHijos = 6;
		
		edad = edad + 5; //30
		edad = edad - 5; //25
		edad = edad + 2; //27
		edad = edad - 1; //26
		edad = edad + 3; //29
		edad = 10/2; //5
		edad = edad * 2; //10
		edad = 2 * 2; //4
		
		int edad2 = 20;
		int edad3 = 25;
		
		edad = (edad2 * edad3) / 2; //20*25 = 500/2= 250
		
		
		direccion = "otra direccion, no.";
		
		System.out.println("Resultado = " + edad + " euros.");
		
	}

}
