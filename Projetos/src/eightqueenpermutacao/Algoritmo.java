package eightqueenpermutacao;

public class Algoritmo {
	
	static int numeroDeSolucoes = 0;

	private void trocarPosicaoDeDoisItensNoArray(int vetor[], int posicaoUm, int posicaoDois) {
		int temporario;
		temporario = vetor[posicaoUm];
		vetor[posicaoUm] = vetor[posicaoDois];
		vetor[posicaoDois] = temporario;
	}
	
	/** 
	 * Calcula se a solução é válida, como a base do algoritmo diz que
	 * cada rainha só pode ocupar uma linha dentro de uma coluna, calculamos
	 * apenas as diagonais. (Calculamos apenas as diagonais superiores,
	 * tendo em vista que se uma rainha estiver na diagonal inferior ela
	 * será pega pela diagonal superior de outra rainha).
	*/
	
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
	
	/** 
	 * Como funciona o algoritmo:
	 * 
	 * Os elementos com índices menores que k estão fixos. 
	 * A função gera as permutações dos elementos com índices maiores ou iguais a k.
	 * Se k=8, então todos elementos estão fixos e o vetor vai ser verificado e impresso
	 * Caso contrário, fixamos um novo elemento na posição k e testamos as permutações a partir do índice k+1.
	 * Repetimos esse processo fixando todos os possíveis elementos na posição k.
	*/
	 
	/**
	 * Exemplo de funcionamento:
	 * 
	 * Iniciando com k = 0, o primeiro elemento deve ser permutado com todo o array. 
	 * Por se tratar de uma função recursiva a função será chamada novamente dentro dela (Fixando elemento após elemento 
	 * até chegar em k = 8), onde será verificado se é uma solução válida.
	 * Após isso a função será retornada e o valor que tinha sido trocado na permuta voltará ao seu lugar anterior, permitindo que o
	 * restante das possibilidades sejam testadas.
	 */
	
	private void testarPermutacoes(int linhas[], int k) { 
		if(k == 8) {
			if(calcularSeSolucaoEValida(linhas)) imprimirSolucao(linhas);
		}
		else{
			for(int i = k; i < 8; i++) {
				trocarPosicaoDeDoisItensNoArray(linhas, k, i);
				testarPermutacoes(linhas, k + 1);
				trocarPosicaoDeDoisItensNoArray(linhas, i, k);
			}
		}
	}
	
	/** 
	 * Preenche o array com as rainhas na diagonal principal
	 * e inicia as permutações.
	*/
	
	public void calcularSolucoes8Rainhas() {
		int linhas[] = new int[8];
		for(int i = 0; i < 8; i++)
			linhas[i] = i;
		testarPermutacoes(linhas, 0);
	}
	
	private void imprimirSolucao(int linhas[]){
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
