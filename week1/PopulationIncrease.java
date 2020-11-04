package neobistasks.week1;

import java.text.ParseException;
import java.util.Scanner;

public class PopulationIncrease {
	public  static void main(String[] args) throws ParseException {
		PopulationIncrease.findCityGrowthTime();

	}
	
	public static void findCityGrowthTime() {
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt(); // 3
		
		long cityAPopulation = scan.nextLong();
		long cityBPopulation = scan.nextLong();


		double cityAPopulationGrowthRate = scan.nextDouble();
		double cityBPopulationGrowthRate = scan.nextDouble();
		
		int years = 0;
		int numIncrement = 0;
		while(inputNum>numIncrement) {
			while(cityAPopulation<=cityBPopulation) {
				if (cityBPopulationGrowthRate==0 && cityAPopulationGrowthRate >0) {
					cityAPopulation = (long) (cityAPopulation * ((cityAPopulationGrowthRate + 100)/100));
					//System.out.println(cityAPopulation);
					//System.out.println(cityBPopulation);

				} if (cityBPopulationGrowthRate>0 && cityAPopulationGrowthRate >0) {
					cityAPopulation = (long) (cityAPopulation * ((cityAPopulationGrowthRate + 100)/100));
					cityBPopulation = (long) (cityBPopulation * ((cityBPopulationGrowthRate + 100)/100));
				}
				
				years ++;


			} 
			
			
			numIncrement++;
		}
		
		
		
		if(years>100) {
			System.out.println("Mais de 1 seculo.");
	
		} else {
		
		System.out.println( years + " anos.");
		
		}
		
		
		
	}

}
