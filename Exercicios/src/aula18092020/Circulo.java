package aula18092020;

public class Circulo extends FormaBidimensional {

	public Circulo(double x, double y, double raio) {
		super(x,y,raio, raio);
	}
	
	public void setRaio(double raio) {
		super.setDimesao1(raio);
	}
	
	public double getRaio() {
		return super.getDimesao1();
	}
	
	@Override
	public double area() {
		return Math.PI * super.getDimesao1() * super.getDimesao1();
		//return Math.PI * this.getRaio() * this.getRaio();
	}

	@Override
	public String getNome() {
		return "Circulo";
	}

	
	
}
