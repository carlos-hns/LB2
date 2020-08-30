package eightqueenpermutacao;

public class Algoritmo {
	
	static int numeroDeSolucoes = 0;
	
	private void trocarPosicaoDeDoisItensNoArray(int vetor[], int i, int j) {
		int temporario;
		temporario = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temporario;
	}
	
	private boolean calcularSeSolucaoEValida(int linhas[]) {
		int x, y;
		int copiaDeX, copiaDeY;
		
		int LIMITE_ESQUERDO = 0;
		int LIMITE_DIREITO = 7;
		int LIMITE_SUPERIOR = 0;
		
		for (int indice = 0; indice < 8; indice++) {
			// X = Posição em Coluna da Matriz
			// Y = Posição em Linha da Matriz
			x = indice;
			y = linhas[indice];
			
			copiaDeX = x;
			copiaDeY = y;
			// Incrementa na direção > ^
			while(true) {
				copiaDeX++;
				copiaDeY--;
				if(copiaDeX > LIMITE_DIREITO || copiaDeY < LIMITE_SUPERIOR) break;
				if(copiaDeY == linhas[copiaDeX]) return false;
			}
			
			copiaDeX = x;
			copiaDeY = y;
			// Incrementa na direção < ^
		    while(true){
		    	copiaDeX--;
		    	copiaDeY--;
		    	if(copiaDeX < LIMITE_ESQUERDO || copiaDeY < LIMITE_SUPERIOR) break;
		    	if(copiaDeY == linhas[copiaDeX]) return false;
		    }
		}
		return true;
	}
	
	private void TestaPermutacoes(int linhas[], int k) { 
		if(k == 8) {
			if(calcularSeSolucaoEValida(linhas))
				ImprimeSolucao(linhas);
		}
		else{
			for(int i = k; i < 8; i++) {
				trocarPosicaoDeDoisItensNoArray(linhas, k, i);
				TestaPermutacoes(linhas, k + 1);
				trocarPosicaoDeDoisItensNoArray(linhas, i, k);
			}
		}
	}
	
	public void calcularSolucoes8Rainhas() {
		int linhas[] = new int[8];
		for(int i = 0; i < 8; i++)
			linhas[i] = i;
		TestaPermutacoes(linhas, 0);
	}
	
	private void ImprimeSolucao(int linhas[]){
		char[][] tabuleiro = new char[8][8];
		
		int i,j;
		int x,y;
		
		Algoritmo.numeroDeSolucoes++;
		
		System.out.printf("-------= SOLUÇÃO: %d =-------\n", Algoritmo.numeroDeSolucoes);
	 
		for(i = 0; i < 8; i++)
			for(j = 0; j < 8; j++)
				tabuleiro[i][j] = '.';
	 
		for(i = 0; i < 8; i++){
			x = i;
			y = linhas[i];
			tabuleiro[y][x] = 'R';
		}
	 
		for(i = 0; i < 8; i++){
			for(j = 0; j < 8; j++){
				System.out.printf(" %c ",tabuleiro[i][j]);
			}    
			System.out.printf("\n");
		}
	}
	
} // FIM DA CLASSE
