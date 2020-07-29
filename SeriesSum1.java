package loop;

import java.util.Scanner;						/*Series sum of 1 + 1/2 + 1/3 .... + 1/n*/

public class SeriesSum1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of terms of the series: ");
		int n = sc.nextInt();
		float sum = 0;
		
		for(float i = 1; i <= n; i++) {
			sum += 1/i;
		}
		
		System.out.println("The sum of the series is "+sum);
		sc.close();

	}

}
