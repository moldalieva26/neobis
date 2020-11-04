package neobistasks.week1;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleTypes {
	public  static void main(String[] args) {
		//System.out.println("Let's go to git hub!");
		//TriangleTypes.finTriangleType2(7.0, 5.0, 7.0);
		TriangleTypes.finTriangleType2();
	}
	
	public static void finTriangleType2() {  // uri no pass
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();


		
		double[] doubleArr =  {num1, num2, num3};
		Arrays.sort(doubleArr);
		
		double a = 0, b = 0, c = 0;
		
		a = doubleArr[2];
		b = doubleArr[1];
		c = doubleArr[0];
		//System.out.println(a + " " + b + " " + c);
		
		if(a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else if((a*a) == ((b*b) + (c*c))) {
			System.out.println("TRIANGULO RECTANGULO");
		}  else if((a*a) > ((b*b) + (c*c))) {
			System.out.println("TRIANGULO OBTUSANGULO");
		} else if((a*a) < ((b*b) + (c*c))) {
			System.out.println("TRIANGULO ACUTANGULO");
		}  
		
		
		if(a==b && a==c) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if(a==b || a==c || b==c) {
			System.out.println("TRIANGULO ISOSCELES");  
		} 
	}
	
	
	
	public static void finTriangleType(double num1, double num2, double num3) {
		double a = 0, b = 0, c = 0;
		if (num1 > num2 && num1>num3) {
			a = num1;
			if (num2 > num3) {
				b = num2;
				c = num3;
			} else if (num3 > num2) {
				b = num3;
				c = num2;
			}
		} else if (num2 > num1 && num2>num3) {
			a = num2;
			if (num1>num3) {
				b = num1;
				c = num3;
			} else if (num3 > num1) {
				b = num3;
				c = num1;
			}
		} else if (num3 > num1 && num3 > num2) {
			a = num3;
			if(num1>num2) {
				b = num1;
				c = num2;
			} else if(num2>num1) {
				b = num2;
				c = num1;
			}
		} else if (num1 == num2 && num1 == num3) {
			a=num1;
			b=num2;
			c=num3;
			
		} else if (num1 == num2) {
			if(num1 > num3) {
				a = num1;
				b = num1;
				c = num3;
						
			}  else if (num3 > num1) {
				a = num3;
				b = num1;
				c = num1;
				
			}
		} else if (num1 == num3) {
			if(num1 > num2) {
				a = num1;
				b = num1;
				c = num2;
			} else if(num2>num1) {
				a = num2;
				b = num1;
				c = num1;
				
			}
		} else if (num2 == num3) {
			if(num2 > num1) {
				a = num2;
				b = num2;
				c = num1;
				
			} else if (num1 > num2) {
				a = num1;
				b = num2;
				c = num2;
			}
		}
		
		
		if(a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} if((a*a) == ((b*b) + (c*c))) {
			System.out.println("TRIANGULO RECTANGULO");
		}  if((a*a) > ((b*b) + (c*c))) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}  if((a*a) < ((b*b) + (c*c))) {
			System.out.println("TRIANGULO ACUTANGULO");
		}  if(a==b && a==c) {
			System.out.println("TRIANGULO EQUILATERO");
		}  if(a==b || a==c || b==c) {
			System.out.println("TRIANGULO ISOSCELES");
		} 
		

	}
	
	
}
