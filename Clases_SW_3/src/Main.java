public class Main {

	public static void main(String[] args) {
		
	}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	// Métodos
	
	static int [] fuerzasJedis(Jedi [] datosJedis) {
		int [] fuerzasJedis = new int [datosJedis.length];
		
		for (int i = 0; i < datosJedis.length; i++) {
			fuerzasJedis [i] = datosJedis[i].getFuerza();
		}
		
		return fuerzasJedis;
	}
	

	static void nombresEdadFu (int edad1, int edad2, int fuerza, Padawan [] datosPadawans) {	
		int menor = 0;
		int mayor = 0;
		
		
		if (edad1 > edad2) {
			mayor = edad1;
			menor = edad2;
		} else if (edad2 > edad1) {
			mayor = edad2;
			menor = edad1;
		}
		
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if(datosPadawans[i].getEdad() >= menor && datosPadawans[i].getEdad() <= mayor && datosPadawans[i].getFuerza() > fuerza) {
				System.out.println(datosPadawans[i].getNombre());
			}
		}
	}
	
	
	static String [] esmirriados (Padawan [] datosPadawans) {
		Padawan aux;
		String [] nombresEsmirriados = new String [6];
		
		// Lo ordena de menor a mayor según fuerza
		for (int i = 0; i < datosPadawans.length; i++) {
			for (int j = 0; j < datosPadawans.length-1; j++) {
				if (datosPadawans[j+1].getFuerza() < datosPadawans[j].getFuerza()) {
					aux = datosPadawans[j+1];
					datosPadawans[j+1] = datosPadawans[j];
					datosPadawans[j] = aux;
				}
			}
		}
		
		for (int i = 0; i < 6; i++) {
			nombresEsmirriados[i] = datosPadawans[i].getNombre();
		}
		
		return nombresEsmirriados;
	}
	
	
	static String variosNombres (int fuerza, Padawan [] datosPadawans, Padawan [] datosPadawans2, Jedi [] datosJedi) {
		String nombresJedisYPadawans = "";
		
		// Hago 3 bucles for porque los arrays pueden tener diferente tamaño
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getFuerza() > fuerza) {
				nombresJedisYPadawans = datosPadawans[i].getNombre() + ", ";
			}
		}
		
		for (int i = 0; i < datosPadawans2.length; i++) {
			if (datosPadawans2[i].getFuerza() > fuerza) {
				nombresJedisYPadawans = datosPadawans2[i].getNombre() + ", ";
			}
		}
		
		for (int i = 0; i < datosJedi.length; i++) {
			if (datosJedi[i].getFuerza() > fuerza) {
				nombresJedisYPadawans = datosJedi[i].getNombre() + ", ";
			}
		}
		
		return nombresJedisYPadawans;
	}
	
	
	static Padawan [] padawanesFuertacos (int fuerza, Padawan [] datosPadawans, Padawan [] datosPadawans2, Padawan [] datosPadawans3, Padawan [] datosPadawans4) {
		int cont = 0;
		
		// Hago diferentes for porque cada array puede ser de un tamaño diferente
		
		// Con estos for cuento los padawan, que existen en los 4 arrays de padawan, que tienen una fuerza superior a la pasada por parámetro
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getFuerza() > fuerza) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosPadawans2.length; i++) {
			if (datosPadawans2[i].getFuerza() > fuerza) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosPadawans3.length; i++) {
			if (datosPadawans3[i].getFuerza() > fuerza) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosPadawans4.length; i++) {
			if (datosPadawans4[i].getFuerza() > fuerza) {
				cont++;
			}
		}
		
		// Creo el array de padawanes fuertes
		Padawan [] padawanesFuertes = new Padawan [cont];
		
		
		// Relleno el array de padawanesFuertes con ayuda de una variable auxiliar
		int aux = 0;
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getFuerza() > fuerza) {
				padawanesFuertes[aux] = datosPadawans[i];
				aux++;
			}
		}
		
		for (int i = 0; i < datosPadawans2.length; i++) {
			if (datosPadawans2[i].getFuerza() > fuerza) {
				padawanesFuertes[aux] = datosPadawans2[i];
				aux++;
			}
		}
		
		for (int i = 0; i < datosPadawans3.length; i++) {
			if (datosPadawans3[i].getFuerza() > fuerza) {
				padawanesFuertes[aux] = datosPadawans3[i];
				aux++;
			}
		}
		
		for (int i = 0; i < datosPadawans4.length; i++) {
			if (datosPadawans4[i].getFuerza() > fuerza) {
				padawanesFuertes[aux] = datosPadawans4[i];
				aux++;
			}
		}
		
		return padawanesFuertes;
	}

}
