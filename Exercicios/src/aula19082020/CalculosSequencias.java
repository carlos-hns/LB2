package aula19082020;

import java.util.Scanner;

public class CalculosSequencias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();
		
		System.out.printf("Fatorial %d de iterativo: %.4f.\n", valor, Fatorial.fatorialIterativo(valor));
		System.out.printf("Fatorial %d de iterativo: %.4f.\n", valor, Fatorial.fatorialRecursivo(valor));
		
		
		// Segunda Parte
		System.out.println("Digite um valor limite do fatorial: ");
		valor = sc.nextInt();
		
		double soma = 1D;
		
		for (int i = 1; i <= valor; i++) {
			soma += (1 / Fatorial.fatorialIterativo(i));
			System.out.printf("Valor de e: %.4f.\n", soma);
		}
		
		// Terceira Parte
		System.out.println("Digite um valor limite do fatorial: ");
		valor = sc.nextInt();
		
		System.out.println("Digite um valor para x: ");
		double x = sc.nextDouble();
		
		
		soma = 1D;
		
		for (int i = 1; i <= valor; i++) {
			soma += (Math.pow(x, i) / Fatorial.fatorialIterativo(i));
			System.out.printf("Valor de e: %.4f.\n", soma);
		}
		
		System.out.printf("Valor do java: e = %.4f.\n", Math.E);
		
		sc.close();
	}
	
}
