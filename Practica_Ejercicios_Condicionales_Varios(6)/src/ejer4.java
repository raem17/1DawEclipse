import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner( System.in );
        int criptonelsons = 0;

        
        System.out.println("Jamito Introduce tu número de criptonelsons:");
        criptonelsons = scnum.nextInt();
        
        
        if (criptonelsons > 0 && criptonelsons >= 15 ) {
			System.out.println("Puedes comprar Hubba Bubba.");
			
			if (criptonelsons > 0 && criptonelsons >= 20 ) {
				System.out.println("Puedes comprar Papadeltas o Chimos.");
				
				if (criptonelsons > 0 && criptonelsons >= 35 ) {
					System.out.println("Puedes comprar Peta Zetas.");
					
					if (criptonelsons > 0 && criptonelsons >= 50 ) {
						System.out.println("Puedes comprar Palotes.");
						
						if (criptonelsons > 0 && criptonelsons >= 70 ) {
							System.out.println("Puedes comprar un Fresquito.");
							
							if (criptonelsons > 0 && criptonelsons >= 100 ) {
								System.out.println("Puedes comprar un MaxiRoll.");
								
								if (criptonelsons > 0 && criptonelsons >= 110 ) {
									System.out.println("Puedes comprar Drakis.");
								}
							}
						}
					}
				}
			}
		}
        
                
        scnum.close();
	}

}