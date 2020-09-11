package MyPrograms;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int principle, time;
		 float rate, SI;
		 
		 System.out.println("WELCOME TO SIMPLE INTEREST CALCULATOR");
		 
		 System.out.print("Enter the principle amount: ");
		 
		 principle = sc.nextInt();
		 
		 System.out.print("Enter the rate of interest: ");
		 
		 rate = sc.nextFloat();
		 
		 System.out.print("Enter the time in months: ");
		 
		 time = sc.nextInt();
		 
		 SI = principle * rate * time / 100;
		 
		 System.out.print("The simple interest is: " + SI);
		 
		 sc.close();
		  
	 }

}
