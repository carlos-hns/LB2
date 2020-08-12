package capitulo4;

public class CrescimentoDemografico {
	
	static public void printGrowth(double currentPopulation, double growthRate) {
		int year = 1;
		
		System.out.printf("%5s%15s%18s\n", "Ano", "Estimativa", "Mudança Anual");
		while (year <= 75) {
			double futurePopulation = currentPopulation * (1 + growthRate);
			System.out.printf("%5d%15.4f%18.4f\n", year, futurePopulation, futurePopulation - currentPopulation);
		
			year++;
			currentPopulation = futurePopulation;
		}
	}

}
