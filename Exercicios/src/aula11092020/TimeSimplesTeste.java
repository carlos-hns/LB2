package aula11092020;

public class TimeSimplesTeste {

	public static void main(String arg[]) {
		TimeSimples objeto1 = new TimeSimples();
		
		try {
			objeto1.setHora(24, 32, -50);
			System.out.printf("%s \n", objeto1);
		} catch (IllegalArgumentException e) {
			System.out.printf("Exceção ocorrida: %s\n\n", e.getMessage());
			objeto1.setHora(0, 0, 0);
		}
		
		System.out.println(objeto1.horaUniversal());
	}
	
}
