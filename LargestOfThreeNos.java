package MyPrograms;

import java.util.Scanner;

public class LargestOfThreeNos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = 0;
		int x = 0, y = 0;
		
		System.out.print("Enter any three integers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if((a<b && c>b) || (a>b && a<c)) {
			L = c;
		}
		
		else if((a>b && a>c) || (b>c && a>b)) {
			L = a;
		}
		
		else if((a<b && c<b) || (c<b && a<c)) {
			L = b;
		}
		else {
			System.out.println("Invalid Input");
		}
		
		if(L==a) {
			x=b; y=c;
		}
		
		else if(L==b) {
			x=a; y=c;
		}
		
		else if(L==c) {
			x=b; y=a;
		}
		
		if(L*L == (x*x + y*y)) {
			System.out.println("Yes, the numbers " + L +" " + x + " " + y + " are PYTHAGOREAN TRIPLETS, where " + L + " is the hypotenuse." );
		}
		else {
			System.out.println("No. they are not PYTHAGOREAN TRIPLETS.");	
		}
		sc.close();
	}
	
}
