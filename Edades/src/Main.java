import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1ª parte
		String ruta = "edades.txt";
		File fichero = new File(ruta);
		int cont = 0;
		int cont10 = 0;
		
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			try {
				// Aqui
				linea = br.readLine();
				while (linea != null) {
					if (Integer.parseInt(linea) < 50) {
						cont++;
					}
					
					if (Integer.parseInt(linea) == 10) {
						cont10++;
					}
					linea = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hay " + cont + " personas menores de 50 años.");
		System.out.println("Hay " + cont10 + " personas con 10 años.");
		
		// 2ª parte
		Scanner sctxt = new Scanner(System.in);
		ArrayList<String> edades = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca una edad:");
			edades.add(sctxt.nextLine());
		}
		
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true));
			for (int i = 0; i < edades.size(); i++) {
				bw.newLine();
				bw.write(edades.get(i));
			}
			
			bw.close(); // Importante
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		sctxt.close();
	}

}
