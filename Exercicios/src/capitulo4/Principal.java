package capitulo4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int squareSide;
		
		do {
			System.out.print("Digite um valor entre 1 e 20: ");
			squareSide = sc.nextInt();
		} while (squareSide < 1 || squareSide > 20);
		
		Square.printSquare(squareSide);
		
		System.out.println("Digite a População Atual do ano 1: ");
		double currentPopulation = sc.nextDouble();
		
		System.out.println("Taxa de Crescimento (EX: 10% = 10): ");
		double growthRate = sc.nextDouble() / 100.0; 
		
		CrescimentoDemografico.printGrowth(currentPopulation, growthRate);
		
		
		
		sc.close();
	}

}
