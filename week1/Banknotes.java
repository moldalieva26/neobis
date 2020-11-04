package neobistasks.week1;

import java.util.Scanner;

public class Banknotes {
	public static void main(String[] args) {
		//int x
		Banknotes.calculateSmallestBanknotes();
	}
	
	public static void calculateSmallestBanknotes() { // uri no passed
		
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		System.out.println(num);
		
		long hundreds, fifties, twenties, tens, fives, twos, ones;
		if(num>=100) {
			hundreds = (num / 100);                  // 5 -> 5*100 = 500
			System.out.println(hundreds + " nota(s) de R$ 100,00");
			fifties = (num - (hundreds * 100)) / 50; //    76
			System.out.println(fifties + " nota(s) de R$ 50,00");
			twenties = (num - ((hundreds * 100)+ (fifties * 50))) / 20;
			System.out.println(twenties + " nota(s) de R$ 20,00");
			tens = (num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20))) / 10;
			System.out.println(tens + " nota(s) de R$ 10,00");
			fives = (num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10))) / 5;
			System.out.println(fives + " nota(s) de R$ 5,00");
			twos = (num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10) + (fives * 5))) / 2;
			System.out.println(twos + " nota(s) de R$ 2,00");
			ones = (num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10) + (fives * 5) + (twos * 2))) / 1;
			System.out.println(ones + " nota(s) de R$ 1,00");
		}
		
	}

}
