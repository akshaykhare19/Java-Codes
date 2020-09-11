package MyPrograms;

import java.util.Scanner;

public class RotationOfArray {
	
	static void rotateClockwise(int s[],  int r) {
		
		while(r-- > 0) {
		int temp = s[0];
		int i = 0;
		while(i < s.length - 1) {
			s[i] = s[i+1];
			i++;
		}
		s[s.length - 1] = temp;
		}
		for(int j = 0; j < s.length; j++) {
			System.out.print(s[j] + " ");
		}
	}
	
	static void rotateCounterClockwise(int s[], int r) {
		
		while(r-- > 0) {
			int temp = s[s.length-1];
			int i = s.length-1;
			while(i > 0) {
				s[i] = s[i-1];
				i--;
			}
			s[0] = temp;
		}
			for(int j = 0; j < s.length; j++) {
				System.out.print(s[j] + " ");
			}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array:");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.print("Enter the elements:");
		for(int i = 0; i < n; i++) {
			a[i] =  sc.nextInt();
		}
		
		System.out.print("Enter the no. of times the array is to be rotated:");
		int d = sc.nextInt();
	
		System.out.println("Enter your choice:\n1 for CLOCKWISE ROTATION\n2 for COUNTER CLOCKWISE ROTATION\n0 to EXIT");
		int rotate = sc.nextInt();
		switch(rotate) {
			
		case 1:
			rotateClockwise(a, d);
			break;
			
		case 2:
			rotateCounterClockwise(a, d);
			break;
			
		case 0:
			System.out.println("No process was selected!!\n\\t EXIT");
		}
		

		sc.close();
	}

}
