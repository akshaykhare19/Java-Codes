package loop;

import java.util.Scanner;						       // 1 - 1/2 + 1/3 - 1/4 +....-1/n

public class SeriesSum2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of terms in the series: ");
        int n = sc.nextInt();
        float result = 0;
   
         for(float i = 1; i <= n; i++) {
        	if(i % 2 == 0) {
        		result -= 1/i;
        	} else {
        		result += 1/i;
        	}
        		
        }
        
        System.out.println("The sum of the series is "+result);
        sc.close();
	}

}
