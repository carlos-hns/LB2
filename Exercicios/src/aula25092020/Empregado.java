package aula25092020;

public abstract class Empregado {
	
	private final String nome;
	private final String sobrenome;
	private final String matricula;
	
	public Empregado(String nome, String sobrenome, String matricula) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s\nMatricula: %s\n", this.getNome(), this.getSobrenome(), this.getMatricula());
	}
	
	public abstract double vencimentos();
}
