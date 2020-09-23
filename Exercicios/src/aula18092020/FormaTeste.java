package aula18092020;

public class FormaTeste {

	private Forma[] vetorDeFormas;
	
	public FormaTeste() {
		vetorDeFormas = new Forma[5];
		vetorDeFormas[0] = new Quadrado(80D,30D,4D);
		vetorDeFormas[1] = new Cubo(20D, 15D, 15D, 5D);
		vetorDeFormas[2] = new Circulo(10D, 45D, 13D);
		vetorDeFormas[3] = new Esfera(12D, 3D, 15D ,6D);
		vetorDeFormas[4] = new Quadrado(80D,30D,4D);
	}
	
	public void exibicao() {
		for(int i=0; i < vetorDeFormas.length; i++) {
			System.out.printf("%s: %s\n", vetorDeFormas[i].getNome(), vetorDeFormas[i]);
			if (vetorDeFormas[i] instanceof FormaBidimensional) {
				FormaBidimensional ob2D = (FormaBidimensional) vetorDeFormas[i];
				System.out.printf("A área de %s é %.4f.\n", ob2D.getNome(), ob2D.area());
			}
			
			if (vetorDeFormas[i] instanceof FormaTridimensional) {
				FormaTridimensional ob3D = (FormaTridimensional) vetorDeFormas[i];
				System.out.printf("A área de %s é %.4f.\n", ob3D.getNome(), ob3D.area());
			}
		
		}
	}
	
	public static void main(String args[]) {
		FormaTeste objeto = new FormaTeste();
		objeto.exibicao();
	}
	
}
