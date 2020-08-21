package aula21082020;

import java.security.SecureRandom;

public class InteirosAleatorios {
	
	public static void main(String[] args) {
		SecureRandom num = new SecureRandom();
		
		int face = 0;
		for (int i = 1; i <= 1000; i++) {
			face = 1 + num.nextInt(6);
			System.out.printf("%d ", face);
			
			if(i % 60 == 0) System.out.println();
		}
	}	
}
