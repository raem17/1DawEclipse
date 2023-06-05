
public class Asignatura {
	
	String denominación;
	String nombreProfesor;
	int dificultad;
	String ciclo;
	String [] dniAlumnosMatriculados = new String [10];
	
	
	Asignatura() {}


	Asignatura(String denominación, String nombreProfesor, int dificultad, String ciclo,
			String[] dniAlumnosMatriculados) {
		
		super();
		this.denominación = denominación;
		this.nombreProfesor = nombreProfesor;
		this.dificultad = dificultad;
		this.ciclo = ciclo;
		this.dniAlumnosMatriculados = dniAlumnosMatriculados;
	}
}
