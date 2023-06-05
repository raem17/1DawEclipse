
public class Main {

	public static void main(String[] args) {

	}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	// Métodos
	
	static int nJedisPot (int potencia, Jedi [] datosJedis, Jedi [] datosJedis2, Jedi [] datosJedis3, Jedi [] datosJedis4) {
		int cont = 0;
		
		
		for (int i = 0; i < datosJedis.length; i++) {
			if (datosJedis[i].getPotencial() > potencia) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis2.length; i++) {
			if (datosJedis2[i].getPotencial() > potencia) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis3.length; i++) {
			if (datosJedis3[i].getPotencial() > potencia) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis4.length; i++) {
			if (datosJedis4[i].getPotencial() > potencia) {
				cont++;
			}
		}
		
		
		return cont;
	}
	
	
	static Padawan padawanPotente(Padawan [] datosPadawans, Padawan [] datosPadawans2, Padawan [] datosPadawans3) {
		Padawan [] datosPadawans4 = new Padawan [datosPadawans.length + datosPadawans2.length +  datosPadawans3.length];
		int indiceAux = 0;
		
		
		// 1er paso
		
		for (int i = 0; i < datosPadawans.length; i++) {
			datosPadawans4[indiceAux] = datosPadawans[i];
			indiceAux++;
		}
		
		for (int i = 0; i < datosPadawans2.length; i++) {
			datosPadawans4[indiceAux] = datosPadawans2[i];
			indiceAux++;
		}
		
		for (int i = 0; i < datosPadawans3.length; i++) {
			datosPadawans4[indiceAux] = datosPadawans3[i];
			indiceAux++;
		}
		
		
		// 2º paso
		
		Padawan padawanAux;
		
		// Ordena según potencial de menor a mayor
		for (int i = 0; i < datosPadawans4.length; i++) {
			for (int j = 0; j < datosPadawans4.length-1; j++) {
				if (datosPadawans4[j+1].getPotencial() < datosPadawans4[j].getPotencial()) {
					padawanAux = datosPadawans4[j+1];
					datosPadawans4[j+1] = datosPadawans4[j];
					datosPadawans4[j] = padawanAux;
				}
			}
		}
		
		return datosPadawans4[datosPadawans4.length-1];
	}
	

	static String [] trespadasPot (Padawan [] datosPadawans, Padawan [] datosPadawans2, Padawan [] datosPadawans3, Padawan [] datosPadawans4) {
		Padawan [] datosPadawans5 = new Padawan [datosPadawans.length + datosPadawans2.length +  datosPadawans3.length + datosPadawans4.length];
		int indiceAux = 0;
		String [] nombresPadawans = new String [3];
		
		// 1er paso
		
		for (int i = 0; i < datosPadawans.length; i++) {
			datosPadawans5[indiceAux] = datosPadawans[i];
			indiceAux++;
		}
		
		for (int i = 0; i < datosPadawans2.length; i++) {
			datosPadawans5[indiceAux] = datosPadawans2[i];
			indiceAux++;
		}
		
		for (int i = 0; i < datosPadawans3.length; i++) {
			datosPadawans5[indiceAux] = datosPadawans3[i];
			indiceAux++;
		}
		
		for (int i = 0; i < datosPadawans4.length; i++) {
			datosPadawans5[indiceAux] = datosPadawans4[i];
			indiceAux++;
		}
		
		
		// 2º paso
		
		Padawan padawanAux;
		
		// Ordena según fuerza de mayor a menor
		for (int i = 0; i < datosPadawans5.length; i++) {
			for (int j = 0; j < datosPadawans5.length-1; j++) {
				if (datosPadawans5[j+1].getFuerza() > datosPadawans5[j].getFuerza()) {
					padawanAux = datosPadawans5[j+1];
					datosPadawans5[j+1] = datosPadawans5[j];
					datosPadawans5[j] = padawanAux;
				}
			}
		}
		
		for (int i = 0; i < nombresPadawans.length; i++) {
			nombresPadawans[i] = datosPadawans5[i].getNombre();
		}
		
		return nombresPadawans;
	}
	
	
	static Jedi [] los7Jedis (Jedi [] datosJedis, Jedi [] datosJedis2, Jedi [] datosJedis3, Jedi [] datosJedis4) {
		int cont = 0;
		
		
		// 1er paso
		
		for (int i = 0; i < datosJedis.length; i++) {
			if (datosJedis[i].getNombre().length() > 7) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis2.length; i++) {
			if (datosJedis2[i].getNombre().length() > 7) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis3.length; i++) {
			if (datosJedis3[i].getNombre().length() > 7) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis4.length; i++) {
			if (datosJedis4[i].getNombre().length() > 7) {
				cont++;
			}
		}
		
		// 2º paso
		
		Jedi [] datosJedis5 = new Jedi [cont];
		int indiceAux = 0;
		
		
		for (int i = 0; i < datosJedis.length; i++) {
			if (datosJedis[i].getNombre().length() > 7) {
				datosJedis5 [indiceAux] = datosJedis[i];
				indiceAux++;
			}
		}
		
		for (int i = 0; i < datosJedis2.length; i++) {
			if (datosJedis2[i].getNombre().length() > 7) {
				datosJedis5 [indiceAux] = datosJedis2[i];
				indiceAux++;
			}
		}
		
		for (int i = 0; i < datosJedis3.length; i++) {
			if (datosJedis3[i].getNombre().length() > 7) {
				datosJedis5 [indiceAux] = datosJedis3[i];
				indiceAux++;
			}
		}
		
		for (int i = 0; i < datosJedis4.length; i++) {
			if (datosJedis4[i].getNombre().length() > 7) {
				datosJedis5 [indiceAux] = datosJedis4[i];
				indiceAux++;
			}
		}
		
		return datosJedis5;
	}
	
	
	static boolean existePadaArray (String nombrePadawan1, String nombrePadawan2, String nombrePadawan3, String nombrePadawan4, Padawan [] datosPadawan) {
		boolean existen = false;
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		
		
		for (int i = 0; i < datosPadawan.length; i++) {
			if (datosPadawan[i].getNombre().equals(nombrePadawan1)) {
				cont1++;
			} else if (datosPadawan[i].getNombre().equals(nombrePadawan2)) {
				cont2++;
			} else if (datosPadawan[i].getNombre().equals(nombrePadawan3)) {
				cont3++;
			} else if (datosPadawan[i].getNombre().equals(nombrePadawan4)) {
				cont4++;
			}
		}
		
		if (cont1 > 0 && cont2 > 0 && cont3 > 0 && cont4 > 0) {
			existen = true;
		}
		
		return existen;
	}
	
	
	static boolean fuerzaIgualPada (int fuerza1, int fuerza2, int fuerza3, Padawan [] datosPadawans) {
		boolean existe = false;
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getFuerza() == fuerza1 || datosPadawans[i].getFuerza() == fuerza2 || datosPadawans[i].getFuerza() == fuerza3) {
				existe = true;
			}
		}
		
		return existe;
	}
	
	
	static boolean esPrimo (int num) {
		int cont = 0;
		boolean esPrimo = false;
		
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				cont++;
			}
		}
		
		if (cont == 0 && num != 1 && num != 0) {
			esPrimo = true;
		}
		
		return esPrimo;
	}
	
	
	static Jedi [] jedisPrimosPos (Jedi [] datosJedis, Jedi [] datosJedis2, Jedi [] datosJedis3) {
		int cont = 0;
		
		
		// 1er paso: contar
		
		for (int i = 0; i < datosJedis.length; i++) {
			if (esPrimo(i) == true) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis2.length; i++) {
			if (esPrimo(i) == true) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis3.length; i++) {
			if (esPrimo(i) == true) {
				cont++;
			}
		}
		
		
		// 2º paso
		
		Jedi [] datosJedis4 = new Jedi [cont];
		int indiceAux = 0;
		
		
		for (int i = 0; i < datosJedis.length; i++) {
			if (esPrimo(i) == true) {
				datosJedis4 [indiceAux] = datosJedis[i];
				indiceAux++;
			}
		}
		
		for (int i = 0; i < datosJedis2.length; i++) {
			if (esPrimo(i) == true) {
				datosJedis4 [indiceAux] = datosJedis2[i];
				indiceAux++;
			}
		}
		
		for (int i = 0; i < datosJedis3.length; i++) {
			if (esPrimo(i) == true) {
				datosJedis4 [indiceAux] = datosJedis3[i];
				indiceAux++;
			}
		}
		
		return datosJedis4;
	}
	
	
	static int jedisFuerzaPrima (Jedi [] datosJedis, Jedi [] datosJedis2, Jedi [] datosJedis3, Jedi [] datosJedis4) {
		int cont = 0;
		
		
		for (int i = 0; i < datosJedis.length; i++) {
			if (esPrimo(datosJedis[i].getFuerza()) == true) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis2.length; i++) {
			if (esPrimo(datosJedis2[i].getFuerza()) == true) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis3.length; i++) {
			if (esPrimo(datosJedis3[i].getFuerza()) == true) {
				cont++;
			}
		}
		
		for (int i = 0; i < datosJedis4.length; i++) {
			if (esPrimo(datosJedis4[i].getFuerza()) == true) {
				cont++;
			}
		}
		
		return cont;
	}
}
