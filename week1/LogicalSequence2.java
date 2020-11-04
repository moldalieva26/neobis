package neobistasks.week1;

import java.text.ParseException;

public class LogicalSequence2 {
	public  static void main(String[] args) throws ParseException {
		LogicalSequence2.showSequence1ToY(3, 99);
	}
	
	public static void showSequence1ToY(long x, long y) {
		
		for (long i=1; i<= y; i++) {
			for(int n=0; n<x; n++) {
				System.out.print(i + " ");
				i++;
			}
			i--;
			System.out.println();
			
		}
	}

}
