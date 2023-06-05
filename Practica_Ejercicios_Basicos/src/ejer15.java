import java.util.*;
public class ejer15 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		double notaMat, notaCienc, notaTec, notaLeng, notaHis, notaRel, mediaCienc, mediaLetr;
		
		System.out.println("Alumno, ingrese su nota final en Matemáticas.");
		notaMat = scnum.nextDouble();
		
		System.out.println("Ingrese su nota final en Ciencias.");
		notaCienc = scnum.nextDouble();
		
		System.out.println("Ingrese su nota final en Tecnología.");
		notaTec = scnum.nextDouble();
		
		System.out.println("Ingrese su nota final en Lengua.");
		notaLeng = scnum.nextDouble();
		
		System.out.println("Ingrese su nota final en Historia.");
		notaHis = scnum.nextDouble();
		
		System.out.println("Ingrese su nota final en Religión.");
		notaRel = scnum.nextDouble();
		
		mediaCienc = (notaMat + notaCienc + notaTec) / 3;
		mediaLetr = (notaLeng + notaHis + notaRel) / 3;
		
		System.out.print("Su media en las asignaturas de ciencias es: ");
		System.out.printf("%1.2f", mediaCienc);
		
		System.out.println("");
		
		System.out.print("Su media en las asignaturas de letras es: ");
		System.out.printf("%1.2f", mediaLetr);
		
		scnum.close();
	}

}
