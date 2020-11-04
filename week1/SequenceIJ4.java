package neobistasks.week1;

import java.text.DecimalFormat;
import java.text.ParseException;

public class SequenceIJ4 {
	public  static void main(String[] args) throws ParseException { // uri passed
		//SequenceIJ4.printSequence();  
		
		DecimalFormat df = new DecimalFormat("#.##");

		for (double e=0; e<=2; e=e+0.2) {
			for(int n=1; n<=3; n++) {
				double num = n + e;
				System.out.println("I=" + df.format(e) + " J=" + df.format(num));
				
			}
			
		}
	}
	
	public static void printSequence() {
		DecimalFormat df = new DecimalFormat("#.##");

		for (double e=0; e<=2; e=e+0.2) {
			for(int n=1; n<=3; n++) {
				double num = n + e;
				System.out.println("I=" + df.format(e) + " J=" + df.format(num));
				
			}
			
		}
		
		
	}

}
