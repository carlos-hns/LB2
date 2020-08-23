package eightqueens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.security.SecureRandom;

public class Main {

	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		Chess chess = new Chess(8);
		chess.printChess();
		
		List<Queen> queens = new ArrayList<>();
		Set<ChessItem> queensMovementsPossibilities = new HashSet<>();
		
		Queen queen = new Queen(new Tuple(random.nextInt(8), random.nextInt(8)), ChessItemType.isQueen, 8);
		queens.add(queen);
		chess.insertChessItem(queen);
		
		queensMovementsPossibilities.addAll(queen.movementPossibilities);
		
		for (ChessItem queenMovement : queensMovementsPossibilities) {
			chess.insertChessItem(queenMovement);
		}
		
		chess.printChess();
		
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
			chess.printChess();
		
		}
		
		
		
		
		
	}// Fim do main/Regras de negocio
}// Fim da Classe

