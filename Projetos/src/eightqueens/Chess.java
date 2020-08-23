package eightqueens;

import java.util.ArrayList;
import java.util.List;

public class Chess {
	
	private ChessItem[][] chess;
	private List<Tuple> freePositions = new ArrayList<>(); 
	private int chessSize;
	
	Chess(int chessSize){
		this.chessSize = chessSize;
		startChess();
	}
	
	private void startChess() {
		chess = new ChessItem[this.chessSize][this.chessSize];
		
		for (int i=0; i < this.chessSize; i++) {
			for (int j=0; j < this.chessSize; j++) {
				Tuple matrizTuple = Tuple.exchangeBetweenMatrizAndPositionalStyle(new Tuple(i, j));
				this.chess[i][j] = new ChessItem(matrizTuple, ChessItemType.isEmpty);
			}
		}
	}
	
	public void printChess() {
		System.out.printf("\n\n%10s\n", "CHESS");
		
		for (int i=0; i < this.chessSize; i++) {
			for (int j=0; j < this.chessSize; j++) {
				System.out.print(this.chess[i][j]);
			}
			System.out.println();
		}
	}
	
	public void insertChessItem(ChessItem chessItemPositional) {
		chessItemPositional.setPosition(Tuple.exchangeBetweenMatrizAndPositionalStyle(chessItemPositional.getPosition()));
		Tuple positionOfChessItem = chessItemPositional.getPosition();
		
		if (this.chess[positionOfChessItem.getX()][positionOfChessItem.getY()].getType() == ChessItemType.isEmpty) {
			ChessItem matrizChessItem = chessItemPositional;
			this.chess[positionOfChessItem.getX()][positionOfChessItem.getY()] = matrizChessItem;
		}
	}
	
	public void calculateFreePositions() {
		freePositions.clear();
		
		for (int i=0; i < chessSize; i++) {
			for (int j=0; j < chessSize; j++) {
				if (chess[i][j].getType() == ChessItemType.isEmpty) {
					freePositions.add(new Tuple(i, j));
				}
			}
		}
	} // FIM DO METODO
	
	public List<Tuple> getFreePosition() {
		calculateFreePositions();
		return this.freePositions;
	}

} // FIM DA CLASSE

