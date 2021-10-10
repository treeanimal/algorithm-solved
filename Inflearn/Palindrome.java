package Inflearn;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.toLowerCase();;
		
		String sb = new StringBuilder(str).reverse().toString();
		
		String answer = "YES";
		for(int i = 0; i <str.length(); i++) {
		
			if(str.charAt(i) != sb.charAt(i)) {
				answer = "NO";
			}
		}
		
//		if(str.equals(sb)) answer = "YES";
		System.out.println(answer);
	}
}
