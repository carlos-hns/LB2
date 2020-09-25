package aula25092020;

public class Comissionado extends Empregado {

	private double vendasBrutas;
	public double taxaComissao;
	
	public Comissionado(String nome, String sobrenome, String matricula, double vendasBrutas, double taxaComissao) {
		super(nome, sobrenome, matricula);
		setVendasBrutas(vendasBrutas);
		setTaxaComissao(taxaComissao);
	}
	
	public double getVendasBrutas() {
		return this.vendasBrutas;
	}
	
	public void setVendasBrutas(double vendasBrutas) {
		if (vendasBrutas < 0.0) {
			throw new IllegalArgumentException("Vendas brutas >= 0.0");
		}
		this.vendasBrutas = vendasBrutas;
	}

	public double getTaxaComissao() {
		return this.taxaComissao;
	}
	
	public void setTaxaComissao(double taxaComissao) {
		if (taxaComissao <= 0 || taxaComissao >= 1) {
			throw new IllegalArgumentException("0 < taxa < 1");
		}
		this.taxaComissao = taxaComissao;
	}
	
	@Override
	public double vencimentos() {
		return this.getTaxaComissao() * this.getVendasBrutas();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: R$ %.2f; %s: %.2f", "Comissionado", super.toString(), "Vendas brutas", getVendasBrutas(), "Taxa de Comissão", getTaxaComissao());
	}
	
}
