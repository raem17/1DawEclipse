import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		
		String [] partidos = {"PP", "PSOE", "CIUDADANOS", "PODEMOS", "VOX", "ERC", "JXCAT", "PNV",
				"EH", "CUP", "MASPAIS", "BNG", "PRC", "PACMA", "TERUELEXISTE"};
		String [] mad = {"VOX", "PP", "PSOE", "PP", "VOX"};
		String [] cyl = {"PSOE", "VOX", "PSOE", "PP", "VOX"};
		String [] gal = {"VOX", "PP", "PSOE", "PP", "VOX"};
		String [] cat = {"PP", "VOX", "PSOE", "PSOE", "VOX"};
		
		int [] votos = new int [15];
		
		int [] votosMAD = new int [15];
		int [] votosCYL = new int [15];
		int [] votosGAL = new int [15];
		int [] votosCAT = new int [15];
		
		int maxVotosNacional= 0;
		String ganadorNacional = "";
		
		int maxVotosMAD= 0;
		String ganadorMAD = "";
		
		int maxVotosCYL= 0;
		String ganadorCYL = "";
		
		int maxVotosGAL= 0;
		String ganadorGAL = "";
		
		int maxVotosCAT= 0;
		String ganadorCAT = "";
		
		
		for (int i = 0; i < 5; i++) { 
			for(int j = 0; j < partidos.length; j++) { 
				if (mad [i] == (partidos [j])) {
					votos [j]++;
					votosMAD [j]++;
					
					if (votos [j] > maxVotosMAD) {
						maxVotosMAD = votos [j];
						ganadorMAD = partidos [j];
					}
				}
				
				if (cyl [i] == (partidos [j])) {
					votos [j]++;
					votosCYL [j]++;
					
					if (votos [j] > maxVotosCYL) {
						maxVotosCYL = votos [j];
						ganadorCYL = partidos [j];
					}
				}
				
				if (gal [i] == (partidos [j])) {
					votos [j]++;
					votosGAL [j]++;
					
					if (votos [j] > maxVotosGAL) {
						maxVotosGAL = votos [j];
						ganadorGAL = partidos [j];
					}
				}
				
				if (cat [i] == (partidos [j])) {
					votos [j]++;
					votosCAT [j]++;
					
					if (votos [j] > maxVotosCAT) {
						maxVotosCAT = votos [j];
						ganadorCAT = partidos [j];
					}
				}
			}		
		}
		
		// Con un for se recorre el array de votos y con un if se guarda la posición (partido) con más votos
		for (int i = 0; i < votos.length; i++) {
			if (votos [i] > maxVotosNacional) {
				maxVotosNacional = votos [i];
				ganadorNacional = partidos [i];
			}
		}
	
		
		// Se imprimen los resultados en Madrid
		System.out.println("Resultados de los votos en Madrid:");
		for (int i = 0; i < votosMAD.length; i++) {
			System.out.println(partidos [i] + ": "+ votosMAD [i]);
		}
		System.out.println("");
		
		
		// Se imprimen los resultados en Castilla y León
		System.out.println("Resultados de los votos en Castilla y León:");
		for (int i = 0; i < votosCYL.length; i++) {
			System.out.println(partidos [i] + ": "+ votosCYL [i]);
		}
		System.out.println("");
		
		
		// Se imprimen los resultados en Galicia
		System.out.println("Resultados de los votos en Galicia:");
		for (int i = 0; i < votosGAL.length; i++) {
			System.out.println(partidos [i] + ": "+ votosGAL [i]);
		}
		System.out.println("");
		
		
		// Se imprimen los resultados en Cataluña
		System.out.println("Resultados de los votos en Cataluña:");
		for (int i = 0; i < votosCAT.length; i++) {
			System.out.println(partidos [i] + ": "+ votosCAT [i]);
		}
		System.out.println("");
		
		
		// Se imprimen los resultados a nivel nacional
		System.out.println("Resultados de los votos a nivel nacional:");
		for (int i = 0; i < votos.length; i++) {
			System.out.println(partidos [i] + ": "+ votos[i]);
		}
		
		
		System.out.println("");
		System.out.println("Partido ganador en Madrid: " + ganadorMAD);
		
		System.out.println("");
		System.out.println("Partido ganador en Castilla y León: " + ganadorCYL);
		
		System.out.println("");
		System.out.println("Partido ganador en Galicia: " + ganadorGAL);
		
		System.out.println("");
		System.out.println("Partido ganador en Cataluña: " + ganadorCAT);
		
		System.out.println("");
		System.out.println("Partido ganador nacional: " + ganadorNacional);
	
		sctxt.close();
	
	}

}
