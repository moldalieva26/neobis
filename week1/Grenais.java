package neobistasks.week1;

import java.text.ParseException;
import java.util.Scanner;

public class Grenais {
	public  static void main(String[] args) throws ParseException {
		Grenais.countScores();
	}
	
	public static void countScores() { // uri passed
		Scanner scan = new Scanner(System.in);
		int continueRequest;
		
		// while do
		int interWins = 0;
		int gremirWins = 0;
		int draws = 0;
		int incrementCount = 0;

		do  {
			int InterScore = scan.nextInt();
			int GremiroScore = scan.nextInt();
			System.out.println("Novo grenal (1-sim 2-nao)");
			incrementCount++;
			
			if(InterScore>GremiroScore) {
				interWins++;
			} else if(InterScore<GremiroScore) {
				gremirWins++;
			} else if (InterScore==GremiroScore){
				draws++;
				
			}
			continueRequest = scan.nextInt();
			
		} while(continueRequest!=2);
		System.out.println(incrementCount + " grenais");
		System.out.println("Inter:" + interWins);
		System.out.println("Gremio:" + gremirWins);
		System.out.println("Empates:" + draws);
		
		if(interWins>gremirWins) {
			System.out.println("Inter venceu mais");
			
		} else if(interWins<gremirWins) {
			System.out.println("Gremio venceu mais");
			
		} else {
			System.out.println("Draw");

		}

		


		
	
	}

}
