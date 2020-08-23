package eightqueens;

public class Result {

	private boolean result;
	private int quantityOfQueens;
	
	public Result(boolean result, int quantity) {
		this.result = result;
		this.quantityOfQueens = quantity;
	}

	public boolean getResult() {
		return result;
	}

	public int getQuantityOfQueens() {
		return quantityOfQueens;
	}
}
