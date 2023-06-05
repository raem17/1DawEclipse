import java.util.Scanner;

public class mainCoche {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		Scanner sctxt = new Scanner (System.in);
		
		//Coche miCoche = new Coche(); // No tiene nada
		//Coche miCoche2 = new Coche(5, 10, 20, 30, "Toyota", false);
		
		Coche miCoche3 = new Coche(0, 0, 0, 0, 0, 0, null, null, null, null, false);
		
		
		System.out.println("Introduzca el nº de ruedas:");
		miCoche3.setnRuedas(scnum.nextInt());
		
		System.out.println("Introduzca los CV:");
		miCoche3.setCv(scnum.nextInt());
		
		System.out.println("Introduzca los CC:");
		miCoche3.setCc(scnum.nextInt());
		
		System.out.println("Introduzca el nº de plazas:");
		miCoche3.setnPlazas(scnum.nextInt());
		
		System.out.println("Introduzca el peso:");
		miCoche3.setPeso(scnum.nextDouble());
		
		System.out.println("Introduzca el precio:");
		miCoche3.setPrecio(scnum.nextDouble());
		
		System.out.println("Introduzca el color:");
		miCoche3.setColor(sctxt.nextLine());
		
		System.out.println("Introduzca la marca:");
		miCoche3.setMarca(sctxt.nextLine());
		
		System.out.println("Introduzca el modelo:");
		miCoche3.setModelo(sctxt.nextLine());
		
		System.out.println("Introduzca la matricula:");
		miCoche3.setMatricula(sctxt.nextLine());
		
		System.out.println("¿El coche está encendido?:");
		String resp = sctxt.nextLine();
		miCoche3.setEncendido(false);
		
		if (resp.equalsIgnoreCase("SI")) {
			miCoche3.setEncendido(true);
		}
		
		//System.out.println("Nº de ruedas: " + miCoche3.getnRuedas());
		
		miCoche3.mostrarAtributos();
		
		miCoche3.mostrarPrecioSeguro();
		
		System.out.println("Precio con oferta: " + miCoche3.calcularPrecioOferta(50) + " €");
		
		scnum.close();
		sctxt.close();
	}

}
