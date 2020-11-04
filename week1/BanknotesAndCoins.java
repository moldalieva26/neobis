package neobistasks.week1;

public class BanknotesAndCoins {
	public  static void main(String[] args) {
		//System.out.println("Let's go to git hub!");
		
		BanknotesAndCoins.calculateSmallestBanknotesAndCoins(576.73f);

	}
	
	public static void calculateSmallestBanknotesAndCoins(float num) {
		int hundreds, fifties, twenties, tens, fives, twos, ones, fiftyCents, twentyfiveCents, tenCents, fiveCents, oneCents;
		if(num>=100) {
			hundreds = (int) (num / 100);                  // 5 -> 5*100 = 500
			System.out.println(hundreds);
			fifties = (int) ((num - (hundreds * 100)) / 50); //    76
			System.out.println(fifties);
			twenties = (int) ((num - ((hundreds * 100)+ (fifties * 50))) / 20);
			
			System.out.println(twenties);
			tens = (int) ((num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20))) / 10);
			System.out.println(tens);
			fives = (int) ((num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10))) / 5);
			System.out.println(fives);
			twos = (int) ((num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10)
					+ (fives * 5))) / 2);
			System.out.println(twos);
			System.out.println("Monedas");
			ones = (int) ((num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10)
					+ (fives * 5) + (twos * 2))) / 1);
			System.out.println(ones);
			
			fiftyCents = (int) ((num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10)
					+ (fives * 5) + (twos * 2) + (ones * 1))) / 0.50);
			System.out.println(fiftyCents);
			
			twentyfiveCents = (int) ((num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10)
					+ (fives * 5) + (twos * 2) + (ones * 1) + (fiftyCents * 0.50))) / 0.25);
			System.out.println(twentyfiveCents);
			
			tenCents = (int) ((num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10) + 
					(fives * 5) + (twos * 2) + (ones * 1) + (fiftyCents * 0.50) + 
					(twentyfiveCents * 0.25))) / 0.10);
			System.out.println(tenCents);
			
			fiveCents = (int) ((num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10) + 
					(fives * 5) + (twos * 2) + (ones * 1) + (fiftyCents * 0.50) + 
					(twentyfiveCents * 0.25) + (tenCents * 0.10))) / 0.05);
			System.out.println(fiveCents);
	
			oneCents = (int) ((num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10) + 
					(fives * 5) + (twos * 2) + (ones * 1) + (fiftyCents * 0.50) + 
					(twentyfiveCents * 0.25) + (tenCents * 0.10) + (fiveCents * 0.05))) / 0.01); // incorrect
			System.out.println(oneCents);
	
		
				
			



		}
	}

}
