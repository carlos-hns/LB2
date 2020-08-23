package eightqueens;

public class Tuple {

	private int x;
	private int y;
	
	public Tuple() {
	}
	
	public Tuple(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public static Tuple exchangeBetweenMatrizAndPositionalStyle(Tuple tuple) {
		//Example:
		// (5,2) -> (2,5)
		// (2,5) -> (5,2)
		return new Tuple(tuple.getY(), tuple.getX());
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d) ", getX(), getY());
	}
	
} // Fim da Classe
