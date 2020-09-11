package MyPrograms;

import java.util.Scanner;

public class Full_Multiplication_Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int result;
		int i, j;
		System.out.print("Enter the number until which you want to print the multiplication table: ");
		int n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
	 		System.out.println();
			for(j = 1; j <= 10; j++) {
					result = i * j;
					System.out.print(result + " ");
			}
		}
		
		sc.close();
	}

}
