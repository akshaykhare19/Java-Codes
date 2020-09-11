package MyPrograms;
import java.util.Scanner;

public class largestWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int T = sc.nextInt();
		
		String s = " ";
		//for(int i = 0; i < T; i++) {	
		    int N = sc.nextInt();
		    String str[] = new String[N];
		    
		        for(int k = 0; k < N; k++)
		        {
		            str[k] = sc.next();
		        }
		        int maxLength = 0;
		            for(int j = 0;  j < N;  j++) {
		                if(str[j].length() > maxLength)
		            {
		                maxLength = str[j].length();
		                s = str[j];  
		            }
		    }
	//	}
		System.out.println(s);
		sc.close();
	    }
	}
