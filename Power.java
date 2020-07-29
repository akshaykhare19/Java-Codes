package loop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("Enter the base: ");
		float a = sc.nextFloat();
		
		System.out.print("Enter the power: ");
		float b = sc.nextFloat();
		
		float result = 1f;
		
		for(int i = 0; i < b; i++) {
			result = result * a;
		}

		System.out.println(a+" raised to the power "+b+" is "+result);
		
		sc.close();
	}

}
