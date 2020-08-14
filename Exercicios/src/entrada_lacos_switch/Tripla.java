package entrada_lacos_switch;

public class Tripla {

	static public void calcularPitagoras() {
		double lado1, lado2, hipotenusa;
		
		System.out.printf("%10s%10s%12s\n", "Lado 1", "Lado 2", "Hipotenusa");
		
		for (lado1=1; lado1 <= 500; lado1++) {
			for (lado2=1; lado2 <= 500; lado2++) {
				for (hipotenusa=1; hipotenusa <= 500; hipotenusa++) {
					if ((lado1 * lado1) + (lado2 * lado2) == (hipotenusa * hipotenusa)) {
						System.out.printf("%10s%10s%12s\n", lado1, lado2, hipotenusa);
						
					}
					
				}
			}
		}
		
	}
	
	
}
