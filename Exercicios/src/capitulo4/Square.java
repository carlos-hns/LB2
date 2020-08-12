package capitulo4;

public class Square {

	static public void printSquare(int squareSide) {
		for (int row = 1; row <= squareSide; row++) {
			if (row == 1 || row == squareSide) {
				for (int column = 1; column <= squareSide; column++) {
					System.out.print("*");
				}
				System.out.print("\n");
			} else {
				System.out.print("*");
				for (int column = squareSide - 2; column > 0; column--) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}// Fim do For
	} // Fim do printSquare
} // Fim da Classe
