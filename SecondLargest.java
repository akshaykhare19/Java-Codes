package MyPrograms;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
			int n = sc.nextInt();
			int a[] = new int[n];
				for(int i = 0; i < n; i++) {
					a[i] = sc.nextInt();
					
						if(max1 < a[i]) {
							max2 = max1;
							max1 = a[i];
						}
						else if((a[i] > max2) && (a[i] < max1)) {
							max2 = a[i];
						}
				}
				
				System.out.println(max2);
				
			
	            sc.close();
	}
			
		}

	