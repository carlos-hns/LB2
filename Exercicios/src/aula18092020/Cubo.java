package aula18092020;

public class Cubo extends FormaTridimensional {

	public Cubo(double x, double y, double z, double lado) {
		super(x, y, z, lado, lado, lado);
	}
		
	public String getNome() {
		return "Cubo";
	}
	
	public double area() {
		return 6D * super.getDimensao1() * super.getDimensao1();
	}
	
	public double volume() {
		return super.getDimensao1() * super.getDimensao1() * getDimensao1();
	}
	
	public void setLado(double lado) {
		super.setDimensao1(lado);
	}
	
	@Override
	public String toString() {
		return String.format("Cubo é uma %s", super.toString());
	}
	
}
