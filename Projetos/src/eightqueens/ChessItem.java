package eightqueens;

public class ChessItem {

	private Tuple position;
	private ChessItemType type;
	
	public ChessItem() {
		
	}
	
	public ChessItem(Tuple position, ChessItemType type) {
		this.position = position;
		this.type = type;
	}

	public Tuple getPosition() {
		return position;
	}
	
	public void setPosition(Tuple position) {
		this.position = position;
	}
	
	public ChessItemType getType() {
		return type;
	}
	
	public void setType(ChessItemType type) {
		this.type = type;
	}
	
	@Override
    public String toString() {
		
		int typeInNumber = 0;
		switch(this.type) {
		case isEmpty:
			typeInNumber = 0;
			break;
		case isQueenMoviment:
			typeInNumber = 1;
			break;
		case isQueen:
			typeInNumber = 2;
			break;
		}
        return typeInNumber + " "; 
    }
} // Fim da Classe
