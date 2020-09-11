package MyPrograms;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int n = sc.nextInt();
		
		int temp = n;
		int reversedNumber = 0;;
		
		while(temp > 0) {
			int lastDigit = temp % 10;
			reversedNumber = (reversedNumber * 10) + lastDigit;
			temp /= 10;
		}
			
			System.out.println("The reverse of " + n + " is " + reversedNumber);
		
		 sc.close();
		}
		
		

	}


