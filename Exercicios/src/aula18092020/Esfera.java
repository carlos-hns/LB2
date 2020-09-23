package aula18092020;

public class Esfera extends FormaTridimensional {

	public Esfera(double x, double y, double z, double raio) {
		super(x, y, z, raio, raio, raio);
	}
	
	public void setRaio(double raio) {
		super.setDimensao1(raio);
	}
	
	public void getRaio() {
		super.getDimensao1();
	}
	
	public String getNome() {
		return "Esfera";
	}
	
	public double area() {
		return 4D * Math.PI * super.getDimensao1() * super.getDimensao1();
	}
	
	public double volume() {
		return 4.0/3.0 * Math.PI * super.getDimensao1() * super.getDimensao1() * super.getDimensao1();
	}
	
	@Override
	public String toString() {
		return String.format("Esfera é uma %s", super.toString());
	}
}
