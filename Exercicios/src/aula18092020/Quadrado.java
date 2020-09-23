package aula18092020;

public class Quadrado extends FormaBidimensional {
	
	public Quadrado(double x, double y, double lado) {
		super(x,y,lado,lado);
	}
	
	public String getNome() {
		return "Quadrado";
	}
	
	public double area() {
		return super.getDimesao1() * super.getDimesao1();
	}

	public void setLado(double lado) {
		super.setDimesao1(lado);
	}
	
	public double getLado() {
		return super.getDimesao1();
	}
	
	@Override
	public String toString() {
		return String.format("Quadrado é uma %s", super.toString());
	}
}
