package aula19082020;

public class Fatorial {

	public static double fatorialIterativo (int num) {
		
		double fat = 1D;
		
		if (num == 0 || num == 1) {
			return 1D;
		}
		
		for(int i = num; i > 1; i--) {
			fat *= i;
		}
		
		
		return fat;
	}
	
	public static double fatorialRecursivo(int num) {
		
		if (num == 0 || num == 1) {
			return 1D;
		}  else {
			return fatorialRecursivo(num - 1 ) * num;
		}
	}
	
	
}
