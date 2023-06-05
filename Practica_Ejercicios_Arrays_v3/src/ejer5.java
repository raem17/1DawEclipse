import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int [] numeros = new int [20];
		
		int contUnos = 0;
		int contDoses = 0;
		int contTreses = 0;
		int contCuatros = 0;
		int contCincos = 0;
		int contSeises = 0;
		int contSietes = 0;
		int contOchos = 0;
		int contNueves = 0;
		int contDieces = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número nº " + (i + 1));
			numeros [i] = scnum.nextInt();
		}
		
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros [i] == 1) {
				contUnos++;
			}	
			
			else if (numeros [i] == 2) {
				contDoses++;
			}
			
			else if (numeros [i] == 3) {
				contTreses++;
			}
			
			else if (numeros [i] == 4) {
				contCuatros++;
			}
			
			else if (numeros [i] == 5) {
				contCincos++;
			}
			
			else if (numeros [i] == 6) {
				contSeises++;
			}
			
			else if (numeros [i] == 7) {
				contSietes++;
			}
			
			else if (numeros [i] == 8) {
				contOchos++;
			}
			
			else if (numeros [i] == 9) {
				contNueves++;
			}
			
			else if (numeros [i] == 10) {
				contDieces++;
			}
		}
		
		
		System.out.print("1:");
		for (int i = 0; i < contUnos; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.print("2:");
		for (int i = 0; i < contDoses; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.print("3:");
		for (int i = 0; i < contTreses; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.print("4:");
		for (int i = 0; i < contCuatros; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.print("5:");
		for (int i = 0; i < contCincos; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.print("6:");
		for (int i = 0; i < contSeises; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.print("7:");
		for (int i = 0; i < contSietes; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.print("8:");
		for (int i = 0; i < contOchos; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.print("9:");
		for (int i = 0; i < contNueves; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.print("10:");;
		for (int i = 0; i < contDieces; i++) {
			System.out.print("*");
		}
		
		scnum.close();
		
	}

}
