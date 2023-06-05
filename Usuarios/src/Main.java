import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// AVISO: En la opción 6, método "modificarUsuario", el usuario puede meter datos "sucios" o no formateados que se guardarán en el archivo de texto.
	// Se ha hecho de esta manera porque en los requisitos no se ha especificado esa característica del método.

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList<>();
		String ruta = "empleados.txt"; // Cambiar en el futuro
		File archivo = new File(ruta);
		
		// 1er paso
		rellenarArrayUsuarios(archivo, usuarios);
		
		// 2º paso : Menu
		// Menú para el usuario
		int opc = 0;
		do {
			mostrarMenu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1: System.out.println("Número de usuarios totales: " + usuarios.size());
				break;
			case 2: mostrarNumHombresYMujeres(usuarios);
				break;
			case 3: mostrarDatosCasados(usuarios);
				break;
			case 4: mostrarNomYApesSaludExcelente(usuarios);
				break;
			case 5: eliminarUsuarioXTelefono(usuarios);
				break;
			case 6: modificarUsuario(usuarios);
				break;
			case 7: System.out.println("Ha salido del programa.");
				break;
			default: System.out.println("Opción incorrecta.");
				break;
			}
		} while (opc != 7);
		
		// 3er paso: actualizar datos
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			
			for (int i = 0; i < usuarios.size(); i++) {
				String nuevaLinea = "\"" + usuarios.get(i).getAlias() + "\";" + "\"" + usuarios.get(i).getApellidos() + "\";" + "\"" + usuarios.get(i).getNombre() + "\";" + 
						"\"" + usuarios.get(i).getDireccion() + "\";" + "\"" + usuarios.get(i).getPoblacion() + "\";" + "\"" + usuarios.get(i).getTelefono() + "\";" + 
						"\"" + usuarios.get(i).getMovil() + "\";" + "\"" + usuarios.get(i).getEmail() + "\";" + "\"" + usuarios.get(i).getObservaciones() + "\";" + 
						"\"" + usuarios.get(i).getSexo() + "\";" + "\"" + usuarios.get(i).getFechaNac() + "\";" + "\"" + usuarios.get(i).getEstado_civil() + "\";" + 
						"\"" + usuarios.get(i).getHijos() + "\";" + "\"" + usuarios.get(i).getDesempleado() + "\";" + "\"" + usuarios.get(i).getProfesion() + "\";" + 
						"\"" + usuarios.get(i).getNivel_academico() + "\";" + "\"" + usuarios.get(i).getLengua_usual() + "\";" + "\"" + usuarios.get(i).getIngresos_mensuales() + "\";" + 
						"\"" + usuarios.get(i).getAhorros() + "\";" + "\"" + usuarios.get(i).getPeso() + "\";" + "\"" + usuarios.get(i).getAltura() + "\";" + 
						"\"" + usuarios.get(i).getCabello() + "\";" + "\"" + usuarios.get(i).getOjos() + "\";" + "\"" + usuarios.get(i).getFumador() + "\";" + 
						"\"" + usuarios.get(i).getSalud() + "\";" + "\"" + usuarios.get(i).getAficion1() + "\";" + "\"" + usuarios.get(i).getAficion2() + "\";" + 
						"\"" + usuarios.get(i).getCaracteristica1() + "\";" + "\"" + usuarios.get(i).getCaracteristica2() + "\";" + "\"" + usuarios.get(i).getValora1() + "\";" + 
						"\"" + usuarios.get(i).getValora2() + "\";" + "\"" + usuarios.get(i).getFobias() + "\";" + "\"" + usuarios.get(i).getSexualidad() + "\";" + 
						"\"" + usuarios.get(i).getDisponible() + "\"";
				bw.write(nuevaLinea);
				bw.newLine();
			}
			
			bw.close(); // Importante
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		scnum.close();
	}
	
	// Métodos
	
	public static String devolverCadenaXPosicion (String linea, int posicion) {
		String cadena = linea.split(";")[posicion];
		
		cadena = cadena.replace("\"", "");
		
		return cadena;
	}
	
	public static void rellenarArrayUsuarios (File archivo, ArrayList<Usuario> usuarios) {
		String linea = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			try {
				linea = br.readLine();
				
				while (linea != null) {
					Usuario nuevoUsuario = new Usuario(devolverCadenaXPosicion(linea, 0), devolverCadenaXPosicion(linea, 1), devolverCadenaXPosicion(linea, 2), 
							devolverCadenaXPosicion(linea, 3), devolverCadenaXPosicion(linea, 4), devolverCadenaXPosicion(linea, 5), devolverCadenaXPosicion(linea, 6), 
							devolverCadenaXPosicion(linea, 7), devolverCadenaXPosicion(linea, 8), devolverCadenaXPosicion(linea, 9), devolverCadenaXPosicion(linea, 10), 
							devolverCadenaXPosicion(linea, 11), devolverCadenaXPosicion(linea, 12), devolverCadenaXPosicion(linea, 13), devolverCadenaXPosicion(linea, 14), 
							devolverCadenaXPosicion(linea, 15), devolverCadenaXPosicion(linea, 16), devolverCadenaXPosicion(linea, 17), devolverCadenaXPosicion(linea, 18), 
							devolverCadenaXPosicion(linea, 19), devolverCadenaXPosicion(linea, 20), devolverCadenaXPosicion(linea, 21), devolverCadenaXPosicion(linea, 22), 
							devolverCadenaXPosicion(linea, 23), devolverCadenaXPosicion(linea, 24), devolverCadenaXPosicion(linea, 25), devolverCadenaXPosicion(linea, 26), 
							devolverCadenaXPosicion(linea, 27), devolverCadenaXPosicion(linea, 28), devolverCadenaXPosicion(linea, 29), devolverCadenaXPosicion(linea, 30), 
							devolverCadenaXPosicion(linea, 31), devolverCadenaXPosicion(linea, 32), devolverCadenaXPosicion(linea, 33));
					usuarios.add(nuevoUsuario);
					linea = br.readLine();
				}
				
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("\nIntroduzca una opción del menú:\n");
		System.out.println("1.	Mostrar por pantalla el Nº de usuarios totales.");
		System.out.println("2.	Mostrar por pantalla el Nº de usuarios hombre y el nº de usuarios mujer.");
		System.out.println("3.	Mostrar por pantalla los datos de los usuarios que estén casados. ");
		System.out.println("4.	Mostrar por pantalla el nombre y apellidos de los usuarios con salud “excelente”.");
		System.out.println("5.	Eliminar un usuario por teléfono. Pide el telefono al usuario y si ese usuario existe en el archivo elimínalo.");
		System.out.println("6.	Modificar un dato de un usuario. Solicita al usuario el teléfono y si ese teléfono existe pide al usuario que introduzca el dato que desea cambiar y cambialo.");
		System.out.println("7.	Salir.");
	}
	
	public static void mostrarNumHombresYMujeres(ArrayList<Usuario> usuarios) {
		int contHombres = 0;
		int contMujeres = 0;
		
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getSexo().equalsIgnoreCase("hombre")) {
				contHombres++;
			} else if (usuarios.get(i).getSexo().equalsIgnoreCase("mujer")) {
				contMujeres++;
			}
		}
		
		System.out.println("Usuarios hombres: " + contHombres);
		System.out.println("Usuarios mujeres: " + contMujeres);
	}
	
	public static void mostrarDatosCasados(ArrayList<Usuario> usuarios) {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getEstado_civil().equalsIgnoreCase("Casado/a")) {
				usuarios.get(i).mostrarDatos();
			} 
		}
	}
	
	public static void mostrarNomYApesSaludExcelente(ArrayList<Usuario> usuarios) {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getSalud().equalsIgnoreCase("excelente")) {
				System.out.println(usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellidos());
			} 
		}
	}
	
	public static void eliminarUsuarioXTelefono(ArrayList<Usuario> usuarios) {
		Scanner sctxt = new Scanner(System.in);
		boolean existe = false;
		
		System.out.println("Introduzca el teléfono del usuario que quiere eliminar:");
		String tel = sctxt.nextLine();
		
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getTelefono().equalsIgnoreCase(tel)) {
				usuarios.remove(i);
				existe = true;
				break;
			} 
		}
		
		if (existe == true) {
			System.out.println("Se ha borrado al usuario exitosamente.");
		} else {
			System.out.println("El usuario no existe.");
		}
	}
	
	public static void modificarUsuario(ArrayList<Usuario> usuarios) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		boolean existe = false;
		int posUsuario = 0;
		
		System.out.println("Introduzca el teléfono del usuario que quiere modificar:");
		String tel = sctxt.nextLine();
		
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getTelefono().equalsIgnoreCase(tel)) {
				existe = true;
				posUsuario = i;
				break;
			} 
		}
		
		
		if (existe == true) {
			mostrarMenuDeCambioDeDato();
			int opc = scnum.nextInt();
			
			switch (opc) {
			case 1: 
				System.out.println("Introduzca el nuevo alias:");
				usuarios.get(posUsuario).setAlias(sctxt.nextLine());
				break;
			case 2: 
				System.out.println("Introduzca los nuevos apellidos:");
				usuarios.get(posUsuario).setApellidos(sctxt.nextLine());
				break;
			case 3: 
				System.out.println("Introduzca el nuevo nombre:");
				usuarios.get(posUsuario).setNombre(sctxt.nextLine());
				break;
			case 4: 
				System.out.println("Introduzca la nueva dirección:");
				usuarios.get(posUsuario).setDireccion(sctxt.nextLine());
				break;
			case 5: 
				System.out.println("Introduzca la nueva población:");
				usuarios.get(posUsuario).setPoblacion(sctxt.nextLine());
				break;
			case 6: 
				System.out.println("Introduzca el nuevo teléfono:");
				usuarios.get(posUsuario).setTelefono(sctxt.nextLine());
				break;
			case 7: 
				System.out.println("Introduzca el nuevo móvil:");
				usuarios.get(posUsuario).setMovil(sctxt.nextLine());
				break;
			case 8: 
				System.out.println("Introduzca el email:");
				usuarios.get(posUsuario).setEmail(sctxt.nextLine());
				break;
			case 9: 
				System.out.println("Introduzca las nuevas observaciones:");
				usuarios.get(posUsuario).setObservaciones(sctxt.nextLine());
				break;
			case 10: 
				System.out.println("Introduzca el nuevo sexo:");
				usuarios.get(posUsuario).setSexo(sctxt.nextLine());
				break;
			case 11: 
				System.out.println("Introduzca la nueva fecha de nacimiento");
				usuarios.get(posUsuario).setFechaNac(sctxt.nextLine());
				break;
			case 12: 
				System.out.println("Introduzca el nuevo estado civil:");
				usuarios.get(posUsuario).setEstado_civil(sctxt.nextLine());
				break;
			case 13: 
				System.out.println("Introduzca el nuevo nº de hijos:");
				usuarios.get(posUsuario).setHijos(sctxt.nextLine());
				break;
			case 14: 
				System.out.println("Introduzca el nuevo estado de desempleado (0/1):");
				usuarios.get(posUsuario).setDesempleado(sctxt.nextLine());
				break;
			case 15: 
				System.out.println("Introduzca la nueva profesión:");
				usuarios.get(posUsuario).setProfesion(sctxt.nextLine());
				break;
			case 16: 
				System.out.println("Introduzca el nuevo nivel académico:");
				usuarios.get(posUsuario).setNivel_academico(sctxt.nextLine());
				break;
			case 17: 
				System.out.println("Introduzca la nueva lengua usual:");
				usuarios.get(posUsuario).setLengua_usual(sctxt.nextLine());
				break;
			case 18: 
				System.out.println("Introduzca los nuevos ingresos mensuales:");
				usuarios.get(posUsuario).setIngresos_mensuales(sctxt.nextLine());
				break;
			case 19: 
				System.out.println("Introduzca los nuevos ahorros:");
				usuarios.get(posUsuario).setAhorros(sctxt.nextLine());
				break;
			case 20: 
				System.out.println("Introduzca el nuevo peso en kg:");
				usuarios.get(posUsuario).setPeso(sctxt.nextLine());
				break;
			case 21: 
				System.out.println("Introduzca la nueva altura en metros:");
				usuarios.get(posUsuario).setAltura(sctxt.nextLine());
				break;
			case 22: 
				System.out.println("Introduzca el nuevo color de cabello:");
				usuarios.get(posUsuario).setCabello(sctxt.nextLine());
				break;
			case 23: 
				System.out.println("Introduzca el nuevo color de ojos:");
				usuarios.get(posUsuario).setOjos(sctxt.nextLine());
				break;
			case 24: 
				System.out.println("Introduzca si es fumador (0/1):");
				usuarios.get(posUsuario).setFumador(sctxt.nextLine());
				break;
			case 25: 
				System.out.println("Introduzca el nuevo estado de salud:");
				usuarios.get(posUsuario).setSalud(sctxt.nextLine());
				break;
			case 26: 
				System.out.println("Introduzca la nueva afición 1:");
				usuarios.get(posUsuario).setAficion1(sctxt.nextLine());
				break;
			case 27: 
				System.out.println("Introduzca la nueva afición 2:");
				usuarios.get(posUsuario).setAficion2(sctxt.nextLine());
				break;
			case 28: 
				System.out.println("Introduzca la nueva característica 1:");
				usuarios.get(posUsuario).setCaracteristica1(sctxt.nextLine());
				break;
			case 29: 
				System.out.println("Introduzca la nueva característica 2:");
				usuarios.get(posUsuario).setCaracteristica2(sctxt.nextLine());
				break;
			case 30: 
				System.out.println("Introduzca la nueva valoración 1:");
				usuarios.get(posUsuario).setValora1(sctxt.nextLine());
				break;
			case 31: 
				System.out.println("Introduzca la nueva valoración 2:");
				usuarios.get(posUsuario).setValora2(sctxt.nextLine());
				break;
			case 32: 
				System.out.println("Introduzca las nuevas fobias:");
				usuarios.get(posUsuario).setFobias(sctxt.nextLine());
				break;
			case 33: 
				System.out.println("Introduzca la nueva sexualidad:");
				usuarios.get(posUsuario).setSexualidad(sctxt.nextLine());
				break;
			case 34: 
				System.out.println("Introduzca si está disponible (0/1):");
				usuarios.get(posUsuario).setDisponible(sctxt.nextLine());
				break;
			default: System.out.println("Opción incorrecta.");
				break;
			}
			
			System.out.println("Se ha realizado el cambio correctamente.");
			
		} else {
			System.out.println("El usuario no existe.");
		}
	}
	
	public static void mostrarMenuDeCambioDeDato() {
		System.out.println("Introduca el dato que desa cambiar numericamente:\n");
		System.out.println("1. Alias");
		System.out.println("2. Apellidos");
		System.out.println("3. Nombre");
		System.out.println("4. Dirección");
		System.out.println("5. Población");
		System.out.println("6. Teléfono");
		System.out.println("7. Móvil");
		System.out.println("8. Email");
		System.out.println("9. Observaciones");
		System.out.println("10. Sexo");
		System.out.println("11. Fecha de nacimiento");
		System.out.println("12. Estado Civil");
		System.out.println("13. Hijos");
		System.out.println("14. Desempleado");
		System.out.println("15. Profesión");
		System.out.println("16. Nivel académico");
		System.out.println("17. Lengua usual");
		System.out.println("18. Ingresos mensuales");
		System.out.println("19. Ahorros");
		System.out.println("20. Peso");
		System.out.println("21. Altura");
		System.out.println("22. Cabello");
		System.out.println("23. Ojos");
		System.out.println("24. Fumador");
		System.out.println("25. Salud");
		System.out.println("26. Afición 1");
		System.out.println("27. Afición 2");
		System.out.println("28. Característica 1");
		System.out.println("29. Característica 2");
		System.out.println("30. Valoración 1");
		System.out.println("31. Valoración 2");
		System.out.println("32. Fobias");
		System.out.println("33. Sexualidad");
		System.out.println("34. Disponible");
		System.out.print("--> ");
	}

}
