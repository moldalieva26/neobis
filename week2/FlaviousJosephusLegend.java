package neobistasks.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlaviousJosephusLegend {
	public static void main(String[] args) { // uri:  incomplete
		FlaviousJosephusLegend.findRemainingPerson();
	}
	
	public static void findRemainingPerson() {
		Scanner scan = new Scanner(System.in);
		//int testCasesNum = scan.nextInt();
		int peopleNum = scan.nextInt();
		int steps = scan.nextInt();
		
		List<Integer> listPeople = new ArrayList<Integer>();
		for (int i=1; i<=peopleNum; i++ ) {
			listPeople.add(i);
		} 
		System.out.println(listPeople);
		
		findRemainingPersonPosition(listPeople, steps );
		
			
	}
	
	public static void  findRemainingPersonPosition(List<Integer> listPeople, int steps){
		
		int kill = 0; //2
		int stop = 0;
		
		//while list size >1
		for(int i=listPeople.size(); i>=1; i--) {
			if(kill<=(listPeople.size()-steps)) { //?
				kill=kill + steps-1;
				System.out.println("killed " + listPeople.get(kill));
				listPeople.remove(kill);
			} else {
				List<Integer> newListPeople = new ArrayList<Integer>();
				newListPeople.addAll(listPeople);
				//findRemainingPersonPosition(newListPeople, steps); // does not work
				//break; //start over??
			}	
		}
		System.out.println("remained " + listPeople);
	}
	
	
	
	
	public static void findRemainingPerson3() {
		Scanner scan = new Scanner(System.in);
		//int testCasesNum = scan.nextInt();
		int numOfPeople = scan.nextInt();
		int steps = scan.nextInt(); 
		int winner; // winner
		int l; //remider
		
		int biggestPower = 2;
		int power = 2;

		while(power<=numOfPeople) {
			biggestPower = power;
			power=power*2;
			//System.out.println(power);

			if(power>numOfPeople) {
				break;
			}

		} System.out.println("biggestPower " + biggestPower);
		
		l = numOfPeople - biggestPower;
		System.out.println("L " + l); 
		
		winner = (2 * l) + 1; 
		System.out.println("winner is " + winner);

		
	}
	

	
	public static void findRemainingPerson2() {
		Scanner scan = new Scanner(System.in);
		int testCasesNum = scan.nextInt();
		int peopleNum = scan.nextInt();
		int stepSize = scan.nextInt();
		
		int remainingPerson = 0;
		int start = 0;
		int kill = 0;
		
		int n = 0;
		while(n<testCasesNum) {
			for(int i=0; i<peopleNum-1; i++ ) {
				if(start>=peopleNum) {
				
				kill = start + stepSize;
				start = kill +1;
				System.out.println(start);
				} else {
					//start = 
				}
			}
			n++;
			System.out.println("Case " + n + ": " + start);
		}
	}


}
