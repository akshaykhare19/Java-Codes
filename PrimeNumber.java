package loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int n = sc.nextInt();
		
		boolean isPrime = true;				
		
		for(int i = 2; i < n; i++) {		//for(int i = 2; i * i <= n; i++)
			if(n % i == 0) {				//this will decrease the time of running
				isPrime = false;			//if a no. has one or more factors,then atleast 
				break;						//one of them must lie between 1 and square 
			}								//root of that number.
			
		}
		
		if(n < 2) isPrime = false;
		
	    if(isPrime == false) System.out.println(n+" is not a prime number");
	    else {
	    	System.out.println(n+" is a prime number");
	    	
	    }
	    
	    sc.close();
	   	
	}
	
}
