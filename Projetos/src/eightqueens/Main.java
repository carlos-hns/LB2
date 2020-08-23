package eightqueens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		/*
		Chess chess = new Chess(8);
		chess.printChess();
		
		Queen queen = new Queen(new Tuple(5,2), ChessItemType.isQueen, 8);
		chess.insertChessItem(queen);
		
		queen = new Queen(new Tuple(7,0), ChessItemType.isQueen, 8);
		chess.insertChessItem(queen);
		
		
		chess.printChess();
		*/
		
		Chess chess = new Chess(8);
		
		List<Queen> queens = new ArrayList<>();
		Set<ChessItem> queensMovementsPossibilities = new HashSet<>();
		
		Queen queen = new Queen(new Tuple(7,7), ChessItemType.isQueen, 8);
		queens.add(queen);
		chess.insertChessItem(queen);
		
		//System.out.printf("Posição depois de adcionar: %s", queens.get(0).getPosition());
		
		queensMovementsPossibilities.addAll(queen.movementPossibilities);
		
		for (ChessItem queenMovement : queensMovementsPossibilities) {
			chess.insertChessItem(queenMovement);
		}
		
		chess.printChess();
	}
	
}// Fim da Classe

