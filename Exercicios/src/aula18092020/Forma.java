package aula18092020;

public abstract class Forma {

	private double x,y;

	public Forma(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public abstract String getNome();
	
	@Override
	public String toString() {
		return "Forma";
	}
	
}
