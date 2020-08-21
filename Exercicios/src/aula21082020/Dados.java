package aula21082020;

import java.security.SecureRandom;

public class Dados {

	public static void main(String[] args) {
		SecureRandom num = new SecureRandom();
		
		int face1 = 0, face2 = 0, face3 = 0, face4 = 0, face5 = 0, face6 = 0;
		
		int face = 0;
		for (int i = 0; i < 10000000; i++) {
			face = 1 + num.nextInt(6);
			
			
			switch(face) {
			case 1:
				face1++;
				break;
			case 2:
				face2++;
				break;
			case 3:
				face3++;
				break;
			case 4:
				face4++;
				break;
			case 5:
				face5++;
				break;
			case 6:
				face6++;
				break;
			}
			
		}// Fim do for
	
		System.out.printf("%8s %6s\n", "face", "frequencia");
		System.out.printf("1%14d\n2%14d\n3%14d\n4%14d\n5%14d\n6%14d\n", face1, face2, face3, face4, face5, face6);
	} // Fim do main
} // Fim da classe
