package eightqueens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.security.SecureRandom;

public class Main {

	public static void main(String[] args) {
		
		Result[] plays = new Result[1000];
		for (int i=0; i < 1000; i++) {
			plays[i] = runOneRound();
		}
		
		int wins = 0;
		System.out.printf("%10s%20s%21s\n", "Iteração", "Solução Encontrada", "Rainhas no Tabuleiro");
		
		for (int i=0; i < 1000; i++) {
			if (plays[i].getResult() == true) {
				wins++;
			}
			System.out.printf("%10d%20s%21s\n", i, plays[i].getResult(), plays[i].getQuantityOfQueens());
		}
		System.out.printf("\n%10s%20s\n", "Total", "Soluções");
		System.out.printf("    ---------------------------------\n");
		System.out.printf("%10d%20d\n", 1000, wins);
		
		
	}// Fim do main/Regras de negocio

	private static Result runOneRound() {
		SecureRandom random = new SecureRandom();
		
		Chess chess = new Chess(8);
		//chess.printChess();
		
		List<Queen> queens = new ArrayList<>();
		Set<ChessItem> queensMovementsPossibilities = new HashSet<>();
		
		Queen queen = new Queen(new Tuple(random.nextInt(8), random.nextInt(8)), ChessItemType.isQueen, 8);
		queens.add(queen);
		chess.insertChessItem(queen);
		
		queensMovementsPossibilities.addAll(queen.movementPossibilities);
		
		for (ChessItem queenMovement : queensMovementsPossibilities) {
			chess.insertChessItem(queenMovement);
		}
		
		//chess.printChess();
		
		// NOVO A PARTIR DAQUI
		
		List<Tuple> freePositions = chess.getFreePosition();
		while (freePositions.size() > 0) {
			Tuple newQueenTuple = freePositions.get(random.nextInt(freePositions.size()));

			Queen newQueen = new Queen(Tuple.exchangeBetweenMatrizAndPositionalStyle(newQueenTuple), ChessItemType.isQueen, 8);
			queens.add(newQueen);
			chess.insertChessItem(newQueen);
			
			queensMovementsPossibilities.addAll(newQueen.movementPossibilities);
			
			for (ChessItem queenMovement : queensMovementsPossibilities) {
				chess.insertChessItem(queenMovement);
			}
			
			freePositions = chess.getFreePosition();
			//chess.printChess();
			
		}
		
		int queensInChess = queens.size();
		if (queensInChess == 8) {
			return new Result(true, queensInChess);
		}
		
		return new Result(false, queensInChess);
	
	}
}// Fim da Classe

