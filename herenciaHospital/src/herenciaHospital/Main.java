package herenciaHospital;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnum = new Scanner(System.in);
		String ruta = "empleadosHospital.txt";
		File archivo = new File(ruta);
		ArrayList<Empleado> datosEmpleados = devolverArrayListEmpleados(archivo);

		int opc = 0;
		do {
			mostrarMenu();
			opc = scnum.nextInt();
			
			switch (opc) {
			case 1: altaMedico(datosEmpleados);
				
				break;
			case 2: altaCelador(datosEmpleados);
				
				break;
			case 3: altaEnfermera(datosEmpleados);
				
				break;
			case 4: altaAdmin(datosEmpleados);
				
				break;
			case 5: mostrarListadoMedicos(datosEmpleados);
				
				break;
			case 6: mostrarListadoCeladores(datosEmpleados);
				
				break;
			case 7: mostrarListadoAdmins(datosEmpleados);
				
				break;
			case 8: System.out.println("Ha salido del programa.");
				
				break;

			default: System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opc != 8);
		
		volcarArrayListSobreTXT(datosEmpleados, archivo);
		
		scnum.close();
		
	} // Fin del Main
	
	public static ArrayList<Empleado> devolverArrayListEmpleados(File archivo) {
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		ArrayList<Empleado> datosEmpleados = new ArrayList<Empleado>();
		
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			
			try {
				linea = br.readLine();
				
				while (linea != null) {
					String tipo = linea.split(";")[0];
					
					if (tipo.equalsIgnoreCase("administrativo")) {
						Administrativo nuevoAdmin = new Administrativo(linea.split(";")[0], linea.split(";")[1], 
								linea.split(";")[2], linea.split(";")[5], linea.split(";")[3], linea.split(";")[9]);
						
						datosEmpleados.add(nuevoAdmin);
						
					} else if (tipo.equalsIgnoreCase("celador")) {
						Celador nuevoCelador = new Celador(linea.split(";")[0], linea.split(";")[1], linea.split(";")[2], linea.split(";")[5], linea.split(";")[3], 
								Integer.parseInt(linea.split(";")[8]));
						
						datosEmpleados.add(nuevoCelador);
						
					} else if (tipo.equalsIgnoreCase("enfermera")) {
						Enfermera nuevaEnefermera = new Enfermera(linea.split(";")[0], linea.split(";")[1], linea.split(";")[2], linea.split(";")[5], linea.split(";")[3]);
						datosEmpleados.add(nuevaEnefermera);
						
					} else if (tipo.equalsIgnoreCase("medico")) {
						Medico nuevoMedico = new Medico(linea.split(";")[0], linea.split(";")[1], linea.split(";")[2], linea.split(";")[5], linea.split(";")[4], 
								Integer.parseInt(linea.split(";")[6]), Integer.parseInt(linea.split(";")[7]));
						
						datosEmpleados.add(nuevoMedico);
					}
					
					linea = br.readLine();
				}
				
				br.close();
				
			} catch (IOException e) {
				System.out.println("Error en devolverArrayListEmpleados: " + e);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error en BR de devolverArrayListEmpleados: " + e);
		}
		
		return datosEmpleados;
	}
	
	public static void mostrarMenu() {
		System.out.println("\nSeleccione una opción del menú:\n");
		System.out.println("1.	Alta Médico.");
		System.out.println("2.	Alta Celador.");
		System.out.println("3.	Alta Enfermera.");
		System.out.println("4.	Alta Administrativo.");
		System.out.println("5.	Listado de Médicos.");
		System.out.println("6.	Listado de Celadores.");
		System.out.println("7.	Listado de Administrativos.");
		System.out.println("8.	Salir.\n");
	}
	
	public static void mostrarListadoMedicos (ArrayList<Empleado> datosEmpleados) {
		for (int i = 0; i < datosEmpleados.size(); i++) {
			if (datosEmpleados.get(i).getPuesto().equalsIgnoreCase("medico" )) {
				System.out.println(datosEmpleados.get(i).toString());
			}
		}
	}
	
	public static void mostrarListadoCeladores (ArrayList<Empleado> datosEmpleados) {
		for (int i = 0; i < datosEmpleados.size(); i++) {
			if (datosEmpleados.get(i).getPuesto().equalsIgnoreCase("celador")) {
				System.out.println(datosEmpleados.get(i).toString());
			}
		}
	}
	
	public static void mostrarListadoAdmins (ArrayList<Empleado> datosEmpleados) {
		for (int i = 0; i < datosEmpleados.size(); i++) {
			if (datosEmpleados.get(i).getPuesto().equalsIgnoreCase("administrativo")) {
				System.out.println(datosEmpleados.get(i).toString());
			}
		}
	}
	
	public static void altaMedico(ArrayList<Empleado> datosEmpleados) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		Medico nuevoMedico = new Medico("medico", null, null, null, null, 0, 0);
		
		System.out.println("Introduzca el nombre:");
		nuevoMedico.setNombre(sctxt.nextLine());
		
		System.out.println("Introduzca los apellidos:");
		nuevoMedico.setApellidos(sctxt.nextLine());
		
		System.out.println("Introduzca la fecha de nacimiento con el siguiente formato (01/01/1971):");
		nuevoMedico.setFecha_nac(sctxt.nextLine());
		
		System.out.println("Introduzca la especialidad:");
		nuevoMedico.setEspecialidad(sctxt.nextLine());
		
		System.out.println("Introduzca el nº de intervenciones:");
		nuevoMedico.setN_intervenciones(scnum.nextInt());
		
		System.out.println("Introduzca el nº de consulta:");
		nuevoMedico.setN_consulta(scnum.nextInt());
		
		datosEmpleados.add(nuevoMedico);
		System.out.println("Alta exitosa.");
	}
	
	public static void altaCelador(ArrayList<Empleado> datosEmpleados) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		Celador nuevoCelador = new Celador("celador", null, null, null, null, 0);
		
		System.out.println("Introduzca el nombre:");
		nuevoCelador.setNombre(sctxt.nextLine());
		
		System.out.println("Introduzca los apellidos:");
		nuevoCelador.setApellidos(sctxt.nextLine());
		
		System.out.println("Introduzca la planta:");
		nuevoCelador.setPlanta(sctxt.nextLine());
		
		System.out.println("Introduzca la fecha de nacimiento con el siguiente formato (01/01/1971):");
		nuevoCelador.setFecha_nac(sctxt.nextLine());
		
		System.out.println("Introduzca el peso como un número entero:");
		nuevoCelador.setPeso(scnum.nextInt());
		
		datosEmpleados.add(nuevoCelador);
		System.out.println("Alta exitosa.");
	}
	
	public static void altaEnfermera(ArrayList<Empleado> datosEmpleados) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		Enfermera nuevaEnfermera = new Enfermera("enfermera", null, null, null, null);
		
		System.out.println("Introduzca el nombre:");
		nuevaEnfermera.setNombre(sctxt.nextLine());
		
		System.out.println("Introduzca los apellidos:");
		nuevaEnfermera.setApellidos(sctxt.nextLine());
		
		System.out.println("Introduzca la planta:");
		nuevaEnfermera.setPlanta(sctxt.nextLine());
		
		System.out.println("Introduzca la fecha de nacimiento con el siguiente formato (01/01/1971):");
		nuevaEnfermera.setFecha_nac(sctxt.nextLine());
		
		datosEmpleados.add(nuevaEnfermera);
		System.out.println("Alta exitosa.");
	}
	
	public static void altaAdmin(ArrayList<Empleado> datosEmpleados) {
		Scanner scnum = new Scanner(System.in);
		Scanner sctxt = new Scanner(System.in);
		Administrativo nuevoAdmin = new Administrativo("administrativo", null, null, null, null, null);
		
		System.out.println("Introduzca el nombre:");
		nuevoAdmin.setNombre(sctxt.nextLine());
		
		System.out.println("Introduzca los apellidos:");
		nuevoAdmin.setApellidos(sctxt.nextLine());
		
		System.out.println("Introduzca la planta:");
		nuevoAdmin.setPlanta(sctxt.nextLine());
		
		System.out.println("Introduzca la fecha de nacimiento con el siguiente formato (01/01/1971):");
		nuevoAdmin.setFecha_nac(sctxt.nextLine());
		
		System.out.println("Introduzca el nivel de habilidad en Excel:");
		nuevoAdmin.setNivel_excel(sctxt.nextLine());
		
		datosEmpleados.add(nuevoAdmin);
		System.out.println("Alta exitosa.");
	}
	
	public static void volcarArrayListSobreTXT(ArrayList<Empleado> datosEmpleados, File archivo) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			
			for (int i = 0; i < datosEmpleados.size(); i++) {
				if (datosEmpleados.get(i).getPuesto().equalsIgnoreCase("medico")) {
					Medico medico = (Medico)datosEmpleados.get(i);
					
					bw.write(medico.getPuesto() + ";" + medico.getNombre() + ";" + medico.getApellidos() + ";;" + medico.getEspecialidad() + ";" + 
					medico.getFecha_nac() + ";" + medico.getN_intervenciones() + ";" + medico.getN_consulta() + ";;");
				} else if (datosEmpleados.get(i).getPuesto().equalsIgnoreCase("celador")) {
					Celador celador = (Celador)datosEmpleados.get(i);
					
					bw.write(celador.getPuesto() + ";" + celador.getNombre() + ";" + celador.getApellidos() + ";" + celador.getPlanta() + ";;" + 
							celador.getFecha_nac() + ";;;" + celador.getPeso() + ";");
				} else if (datosEmpleados.get(i).getPuesto().equalsIgnoreCase("enfermera")) {
					Enfermera enfermera = (Enfermera)datosEmpleados.get(i);
					
					bw.write(enfermera.getPuesto() + ";" + enfermera.getNombre() + ";" + enfermera.getApellidos() + ";" + enfermera.getPlanta() + ";;" + 
							enfermera.getFecha_nac() + ";;;;");
				} else if (datosEmpleados.get(i).getPuesto().equalsIgnoreCase("administrativo")) {
					Administrativo admin = (Administrativo)datosEmpleados.get(i);
					
					bw.write(admin.getPuesto() + ";" + admin.getNombre() + ";" + admin.getApellidos() + ";" + admin.getPlanta() + ";;" + 
							admin.getFecha_nac() + ";;;;" + admin.getNivel_excel());
				}
				
				// salta de linea si no es la última
				if (i != datosEmpleados.size()-1) {
					bw.newLine();
				}
			}
			
			bw.close();
		} catch (IOException e) {
			System.out.println("Error en volcarArrayListSobreTXT: " + e);
		}
	}

}
