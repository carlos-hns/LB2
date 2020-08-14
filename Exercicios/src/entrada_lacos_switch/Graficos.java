package entrada_lacos_switch;

import java.util.Scanner;

public class Graficos {
	
	static public void gerarGraficos() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o número 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o número 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Digite o número 3: ");
		int num3 = sc.nextInt();
		
		System.out.println("Digite o número 4: ");
		int num4 = sc.nextInt();
		
		System.out.println("Digite o número 5: ");
		int num5 = sc.nextInt();
		
		int valor = 0;
		
		for (int i=0; i < 5; i++) {
			switch (i) {
				case 0:
					valor = num1;
					break;
				case 1:
					valor = num2;
					break;
				case 2:
					valor = num3;
					break;
				case 3:
					valor = num4;
					break;
				case 4:
					valor = num5;
					break;
			}
			
			for (int j=0; j < valor; j++) {
				System.out.printf("* ");
			}
			
			System.out.println();
		
		}
		
		sc.close();
	}
}
