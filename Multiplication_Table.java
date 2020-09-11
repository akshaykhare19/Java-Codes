package MyPrograms;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number whose multiplication table you want to print: ");
		int n = sc.nextInt();
		
		System.out.println("MULTIPLICATION TABLE OF " + n);
		
		int i, result;
		
		for(i = 1; i <= 10; i++) {
			result = n * i;
			System.out.println(n + "    *    " + i + "    =    " + result);
		}
		
        sc.close();
	}

}
