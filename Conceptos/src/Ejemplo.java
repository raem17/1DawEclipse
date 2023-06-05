
import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo {

	public static void main(String[] args) {

		// Declaramos el ArrayList
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<Integer> numerosInt = new ArrayList<Integer>();
		ArrayList<Double> numerosDouble = new ArrayList<Double>();
		ArrayList<Boolean> booleanos = new ArrayList<Boolean>();
		
		String amigo = "Pepe";
		
		// Añadir elemento al ArrayList
		nombres.add("Antonio");
		nombres.add(amigo);
		
		// Añadir elemento en la posición n
		nombres.add(0, "Jesus");
		
		// Saber el número de posiciones que tiene el ArrayList 
		nombres.size();
		//System.out.println(nombres.size());
		
		// Acceder al primer elemento del ArrayList
		//System.out.println(nombres.get(0));
		
		// Recorrer el ArrayList
		/*for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}*/
		
		// Eliminar un elemento del ArrayList
		nombres.remove(0);
		
		// Borrar todos los elementos del Array
		//nombres.clear();
		
		// Comprobar si existe un elemento dentro del ArrayList
		System.out.println(nombres.contains("Pepe"));
		
		// Devuelve la posición del elemento especificado
		System.out.println(nombres.indexOf("Pepe"));
		
		// Maneras de recorrer un arrayList
		
		// Manera 1
		
		/*for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}*/
		
		// Manera 2
		
		System.out.println("Método 2: \n");
		for (String e : nombres) {
			System.out.println(e);
		}
		
		// Manera 3
		
		System.out.println("\nMétodo 3: \n");
		Iterator<String> it_nombres = nombres.iterator();
		while (it_nombres.hasNext()) {
			System.out.println(it_nombres.next());
		}
	}

}