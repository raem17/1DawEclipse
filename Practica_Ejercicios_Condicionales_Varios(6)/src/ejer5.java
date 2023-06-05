import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        double sueldoAnualK = 0;
        double sueldoAnualM = 0;
        double sueldoAnualV = 0;
        double sueldosAnualesTotales = 0;
        double sueldosAnualesTotalesFinal = 0;
        
        double golesK = 0;
        double golesM = 0;
        double golesV = 0;
        
        double porcentajeK = 0;
        double porcentajeM = 0;
        double porcentajeV = 0;

        
        System.out.println("Karim Benzema, introduce tu sueldo anual:");
        sueldoAnualK = scnum.nextDouble();
        
        System.out.println("Mariano, introduce tu sueldo anual:");
        sueldoAnualM = scnum.nextDouble();
        
        System.out.println("Vinicius Jr, introduce tu sueldo anual:");
        sueldoAnualV = scnum.nextDouble();
        
        
        System.out.println("Karim Benzema, introduce tu número goles marcados en la pasada temporada:");
        golesK = scnum.nextDouble();
        
        System.out.println("Mariano, introduce tu número goles marcados en la pasada temporada:");
        golesM = scnum.nextDouble();
        
        System.out.println("Vinicius Jr, introduce tu número goles marcados en la pasada temporada:");
        golesV = scnum.nextDouble();
        
        /* Sueldos anuales totales (sin porcentaje), el valor almacenado en la variable
        no cambiará aunque se cambien los valores de las variables después */
        
        sueldosAnualesTotales = sueldoAnualK + sueldoAnualM + sueldoAnualV;
        
        porcentajeK = golesK / 100; 
        porcentajeM = golesM / 100;
        porcentajeV = golesV / 100;

        //Sueldos anuales nuevos
        
        sueldoAnualK = sueldoAnualK + (sueldoAnualK * porcentajeK); 
        sueldoAnualM = sueldoAnualM + (sueldoAnualM * porcentajeM); 
        sueldoAnualV = sueldoAnualV + (sueldoAnualV * porcentajeV); 
  
        
        sueldosAnualesTotalesFinal = sueldoAnualK + sueldoAnualM + sueldoAnualV; 
        
        
        System.out.println("Florentino, la subida de sueldos te ha costado: " + (sueldosAnualesTotalesFinal - sueldosAnualesTotales) + " €");
 
      
        scnum.close();
	}

}
