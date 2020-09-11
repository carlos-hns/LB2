package aula02092020;

public class Escopo {
	private static int x = 1;
	
	public static void useLocal() {
		int x = 20;
		System.out.printf("%nValor inicial de x local no método useLocal(): %d%n.", x);
		x += 1;
		System.out.printf("%nValor final de x local no método useLocal(): %d%n.", x);
	}
	
	public static void useCampo() {
		System.out.printf("%nValor inicial de x (campo) no método useCampo(): %d%n.", x);
		x *= 100;
		System.out.printf("%nValor final de x (campo) no método useCampo(): %d%n.", x);
	}
	
	public static void main(String[] args) {
		int x = 12;
		
		System.out.printf("Valor de x: %d%n.", x);
		
		useLocal();
		useCampo();
		useLocal();
		useCampo();
		
		System.out.printf("\nValor de local no main(): %d%n", x);
	}
}
