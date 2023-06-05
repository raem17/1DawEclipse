import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String fecha = "";
		String [] meses = {" de Enero de ", " de Febrero de ", " de Marzo de ", " de Abril de ", " de Mayo de ", " de Junio de ", " de Julio de ", " de Agosto de ", " de Septiembre de ", " de Octubre de ", " de Noviembre de ", " de Diciembre de "};
		String fechaResul = "";
		
		System.out.println("Introduza una fecha en este formato (dd/mm/aa):");
		fecha = sctxt.nextLine();
		
		String [] subCadenas = fecha.split("/");
		
		
		if (subCadenas [1].equals("01")) {
			fechaResul = subCadenas [0] + meses [0] + subCadenas [2];
		} else if (subCadenas [1].equals("02")) {
			fechaResul = subCadenas [0] + meses [1] + subCadenas [2];
		} else if (subCadenas [1].equals("03")) {
			fechaResul = subCadenas [0] + meses [2] + subCadenas [2];
		} else if (subCadenas [1].equals("04")) {
			fechaResul = subCadenas [0] + meses [3] + subCadenas [2];
		} else if (subCadenas [1].equals("05")) {
			fechaResul = subCadenas [0] + meses [4] + subCadenas [2];
		} else if (subCadenas [1].equals("06")) {
			fechaResul = subCadenas [0] + meses [5] + subCadenas [2];
		} else if (subCadenas [1].equals("07")) {
			fechaResul = subCadenas [0] + meses [6] + subCadenas [2];
		} else if (subCadenas [1].equals("08")) {
			fechaResul = subCadenas [0] + meses [7] + subCadenas [2];
		} else if (subCadenas [1].equals("09")) {
			fechaResul = subCadenas [0] + meses [8] + subCadenas [2];
		} else if (subCadenas [1].equals("10")) {
			fechaResul = subCadenas [0] + meses [9] + subCadenas [2];
		} else if (subCadenas [1].equals("11")) {
			fechaResul = subCadenas [0] + meses [10] + subCadenas [2];
		} else if (subCadenas [1].equals("12")) {
			fechaResul = subCadenas [0] + meses [11] + subCadenas [2];
		} else {
			System.out.println("Ha introducido la fecha incorrectamente.");
		}
		
		System.out.println(fechaResul);
		
		sctxt.close();
	}

}
