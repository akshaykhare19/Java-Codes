package MyPrograms;

import java.util.Scanner;

public class Pythagorean_Triplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any three positive integers :");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a<b && c>b) || (a>b && a<c))
		{
			if(c*c == (a*a + b*b)) {
			System.out.println("Yes, the numbers " + a +" " + b + " " + c + " "
					+ "are PYTHAGOREAN TRIPLETS, where " + c + " is the hypotenuse." );
			}else {
				System.out.println("No. they are not PYTHAGOREAN TRIPLETS.");	
			}
		}	
			
		else  if((a>b && a>c) || (b>c && a>b))
		{
			if(a*a == (c*c + b*b)) {
			System.out.println("Yes, the numbers " + a +" " + b + " " + c + 
					" are PYTHAGOREAN TRIPLETS., where " + a + " is the hypotenuse." );
			}
			else {
				System.out.println("No. they are not PYTHAGOREAN TRIPLETS.");	
			}
		}	
		
		else if((a<b && c<b) || (c<b && a<c))
		{
			if(b*b == (a*a + c*c)) {
			System.out.println("Yes, the numbers " + a +" " + b + " " + c + 
					" are PYTHAGOREAN TRIPLETS, where " + b + " is the hypotenuse." );
			}
			else {
				System.out.println("No. they are not PYTHAGOREAN TRIPLETS.");	
			}
		}	
		
		sc.close();
	}

}
