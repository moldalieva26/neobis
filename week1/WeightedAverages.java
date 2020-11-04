package neobistasks.week1;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeightedAverages {
	public  static void main(String[] args) throws ParseException {
		WeightedAverages.getWeightedAverages();
	}
	
	public static void getWeightedAverages() { // uri no pass
		float weight1 = 0.2f;
		float weight2 = 0.3f;
		float weight3 = 0.5f;
		
		float weightAvg = 0;
		
		Scanner scan = new Scanner(System.in);
		int numCases = scan.nextInt();

		DecimalFormat df = new DecimalFormat("#.#");
		for(int n=0; n<numCases; n++) {
			List<Float> list = new ArrayList<Float>();
			for (int i=0; i<3; i++) {
				float numValue= scan.nextFloat();
				weightAvg = numValue * weight1;
				list.add(numValue); 
			}
			weightAvg =  (list.get(0)*weight1) + (list.get(1)*weight2) + (list.get(2)*weight3);
			System.out.println(df.format(weightAvg) );	
		}		
	}
}
