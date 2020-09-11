package MyPrograms;


import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string:");
		String a = sc.nextLine();
		
		System.out.print("Enter another string:");
		String b = sc.nextLine();
		
//		boolean visited[] = new boolean[b.length()];
//		
		boolean isAnagram = true;
//		
//		if(a.length() == b.length()) {
//			
//			for(int i = 0; i < a.length(); i++) {
//				
//				char c =  a.charAt(i);
//				isAnagram = false;
//				
//					for(int j = 0; j < b.length(); j++) {
//						
//						if(b.charAt(j) == c && !visited[j]) {
//							visited[j] = true;
//							isAnagram = true;
//							break;
//						}
//				}
//					if(!isAnagram) {
//						break;
//					}
//			}
//		}
		
		int al[] = new int[256];
		//int bl[] = new int[256];							//Remove this array
		
		for(char c: a.toCharArray())  {
			int index = (int) c;
			al[index]++;
		}
		
		for(char c: b.toCharArray())  {
			int index = (int) c;
			/*bl[index]++;*/									 al[index]--;
		}
		
		for(int i = 0; i < 256; i++) {
			/*if(al[i] != bl[i]) {*/							if(al[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		
				
		if(isAnagram) {
			System.out.println("The two strings " + a + " and " + b + " are Anagrams.");
		}
		 else {
			System.out.println("The two strings " + a + " and " + b + " are not Anagrams.");
		}
		sc.close();
	}

}
