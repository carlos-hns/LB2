package aula18092020;

public abstract class FormaBidimensional extends Forma {
	
	private double dimesao1;
	private double dimensao2;
	
	public FormaBidimensional(double x, double y, double dimensao1, double dimensao2) {
		super(x,y);
		this.dimesao1 = dimensao1;
		this.dimensao2 = dimensao2;
	}
	
	public double getDimesao1() {
		return dimesao1;
	}

	public void setDimesao1(double dimesao1) {
		this.dimesao1 = dimesao1;
	}

	public double getDimensao2() {
		return dimensao2;
	}

	public void setDimensao2(double dimensao2) {
		this.dimensao2 = dimensao2;
	}
	
	public abstract double area();
}
