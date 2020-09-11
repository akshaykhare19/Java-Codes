package MyPrograms;
import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.print("N = ");
				int n = sc.nextInt();    
				int a[] = new int[n];
				
			    	for(int i = 0; i < n; i++) {
			    		a[i] = sc.nextInt();
			    	}
	    				int maxOfArray = a[0];
	    				
			    		for(int i = 0; i < n; i++) {
			    			
			    			if(a[i] > maxOfArray) {
			    				maxOfArray = a[i];
			        }
			    }
			    System.out.println(maxOfArray);
			    sc.close();
	}

}
