package loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number whose factorial you want: ");
		int n = sc.nextInt();
		int i, result = 1;
		
		System.out.print("1");
		
		for(i = 2; i <= n; i++) {
			result = result * i;
			System.out.print(" X " + i);
		}
		System.out.println(" = " + result);
		System.out.println  ("The factorial of " + n + " is " + result);
		
		sc.close();
	}
	
}
