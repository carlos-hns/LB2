package eightqueenpermutacao;

public class Resultado {

	private int numeroDaIteracao;
	private boolean solucaoValida;
	
	Resultado(int numeroDaIteracao, boolean solucaoValida){
		this.numeroDaIteracao = numeroDaIteracao;
		this.solucaoValida = solucaoValida;
	}
	
	public boolean isSolucaoValida() {
		return solucaoValida;
	}

	@Override
	public String toString() {
		return String.format("%10d %10b", this.numeroDaIteracao, this.solucaoValida);
	}
	
}
