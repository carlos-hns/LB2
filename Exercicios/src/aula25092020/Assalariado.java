package aula25092020;

public class Assalariado extends Empregado {

	private double salarioSemanal;
	
	public Assalariado(String nome, String sobrenome, String matricula, double salarioSemanal) {
		super(nome, sobrenome, matricula);
		
		if (salarioSemanal < 0.0) {
			throw new IllegalArgumentException("Salario tem que ser maior que zero.");
		}
		
		this.salarioSemanal = salarioSemanal;
	}

	public double getSalarioSemanal() {
		return this.salarioSemanal;
	}
	
	@Override
	public double vencimentos() {
		return getSalarioSemanal();
	}
	
	@Override
	public String toString() {
		return String.format("Assalariado: %s\n%s\nR$ %.2f", super.toString(), "Salário Semanal", getSalarioSemanal());
	}
	
}
