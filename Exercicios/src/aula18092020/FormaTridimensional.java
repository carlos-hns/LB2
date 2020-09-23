package aula18092020;

public abstract class FormaTridimensional extends Forma {

	private double dimensao1, dimensao2, dimensao3;
	private double z;
	
	public FormaTridimensional(double x, double y, double z, double dimensao1, double dimensao2, double dimensao3) {
		super(x, y);
		this.z = z;
		this.dimensao1 = dimensao1;
		this.dimensao2 = dimensao2;
		this.dimensao3 = dimensao3;
	}

	public double getDimensao1() {
		return dimensao1;
	}

	public void setDimensao1(double dimensao1) {
		this.dimensao1 = dimensao1;
	}

	public double getDimensao2() {
		return dimensao2;
	}

	public void setDimensao2(double dimensao2) {
		this.dimensao2 = dimensao2;
	}

	public double getDimensao3() {
		return dimensao3;
	}

	public void setDimensao3(double dimensao3) {
		this.dimensao3 = dimensao3;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public abstract double area();
	public abstract double volume();
	
	@Override
	public String toString() {
		return String.format("FormaTridimensional é uma %s", super.toString());
	}

}
