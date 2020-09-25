package aula25092020;

public class TesteEmpregado {
	public static void main(String args[]) {
		Assalariado objetoAS = new Assalariado("João", "Lucas", "12345", 10000D);
		Comissionado objetoCS = new Comissionado("Maria", "Souza", "12378", 50000D, 0.08);
		
		System.out.println("Listagem dos empregados: ");
		System.out.printf("%s\n%s: R$ %.2f\n\n", objetoAS, "recebeu", objetoAS.vencimentos());
		System.out.printf("%s\n%s: R$ %.2f\n\n", objetoCS, "recebeu", objetoCS.vencimentos());
		
	}
}
