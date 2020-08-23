package eightqueens;

import java.util.ArrayList;
import java.util.List;

public class Queen extends ChessItem {

	List<ChessItem> movementPossibilities = new ArrayList<>();
	
	public Queen(Tuple position, ChessItemType type, int chessSize) {
		super(position, type);
		findPossibilities(chessSize);
	}
	
	private void findPossibilities(int chessSize) {

		Tuple matrizQueenTuple = super.getPosition();

		int leftEdge = 0;
		int rightEdge = chessSize - 1;
		int topEdge = 0;
		int bottomEdge = chessSize - 1;
			
		int currentXInMatriz = matrizQueenTuple.getX();
		int currentYInMatriz = matrizQueenTuple.getY();
		
		// LEFT SIDE
		while (currentXInMatriz > leftEdge) {
			currentXInMatriz--;
			Tuple tuplePositionInMatriz = new Tuple(currentXInMatriz, currentYInMatriz);
			movementPossibilities.add(new ChessItem(tuplePositionInMatriz, ChessItemType.isQueenMoviment));
		}
		
		currentXInMatriz = matrizQueenTuple.getX();
		currentYInMatriz = matrizQueenTuple.getY();
		
		// RIGHT SIDE
		while (currentXInMatriz < rightEdge) {
			currentXInMatriz++;
			Tuple tuplePositionInMatriz = new Tuple(currentXInMatriz, currentYInMatriz);
			movementPossibilities.add(new ChessItem(tuplePositionInMatriz, ChessItemType.isQueenMoviment));
		}
		
		currentXInMatriz = matrizQueenTuple.getX();
		currentYInMatriz = matrizQueenTuple.getY();
		
		// TOP SIDE
		while (currentYInMatriz > topEdge) {
			currentYInMatriz--;
			Tuple tuplePositionInMatriz = new Tuple(currentXInMatriz, currentYInMatriz);
			movementPossibilities.add(new ChessItem(tuplePositionInMatriz, ChessItemType.isQueenMoviment));
		}
		
		currentXInMatriz = matrizQueenTuple.getX();
		currentYInMatriz = matrizQueenTuple.getY();
		
		// BOTTOM SIDE
		while (currentYInMatriz < bottomEdge) {
			currentYInMatriz++;
			Tuple tuplePositionInMatriz = new Tuple(currentXInMatriz, currentYInMatriz);
			movementPossibilities.add(new ChessItem(tuplePositionInMatriz, ChessItemType.isQueenMoviment));
		}
		
		currentXInMatriz = matrizQueenTuple.getX();
		currentYInMatriz = matrizQueenTuple.getY();
		
		// TOP RIGHT DIAGONAL
		while (currentXInMatriz < rightEdge && currentYInMatriz > topEdge) {
			currentXInMatriz++;
			currentYInMatriz--;
			
			Tuple tuplePositionInMatriz = new Tuple(currentXInMatriz, currentYInMatriz);
			movementPossibilities.add(new ChessItem(tuplePositionInMatriz, ChessItemType.isQueenMoviment));
		}
		
		currentXInMatriz = matrizQueenTuple.getX();
		currentYInMatriz = matrizQueenTuple.getY();
		
		// BOTTOM RIGHT DIAGONAL
		while (currentXInMatriz < rightEdge && currentYInMatriz < bottomEdge) {
			currentXInMatriz++;
			currentYInMatriz++;
			
			Tuple tuplePositionInMatriz = new Tuple(currentXInMatriz, currentYInMatriz);
			movementPossibilities.add(new ChessItem(tuplePositionInMatriz, ChessItemType.isQueenMoviment));
		}
		
		currentXInMatriz = matrizQueenTuple.getX();
		currentYInMatriz = matrizQueenTuple.getY();
		
		
		// BOTTOM LEFT DIAGONAL
		while (currentXInMatriz > leftEdge && currentYInMatriz < bottomEdge) {
			currentXInMatriz--;
			currentYInMatriz++;
			
			Tuple tuplePositionInMatriz = new Tuple(currentXInMatriz, currentYInMatriz);
			movementPossibilities.add(new ChessItem(tuplePositionInMatriz, ChessItemType.isQueenMoviment));
		}		

		currentXInMatriz = matrizQueenTuple.getX();
		currentYInMatriz = matrizQueenTuple.getY();
		
		
		// TOP LEFT DIAGONAL
		while (currentXInMatriz > leftEdge && currentYInMatriz > topEdge) {
			currentXInMatriz--;
			currentYInMatriz--;
			
			Tuple tuplePositionInMatriz = new Tuple(currentXInMatriz, currentYInMatriz);
			movementPossibilities.add(new ChessItem(tuplePositionInMatriz, ChessItemType.isQueenMoviment));
		}
		
		
	} // FIM DO METODO FIND
}// Fim da Classe
