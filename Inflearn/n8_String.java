package Inflearn;

import java.util.Scanner;

public class n8_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.toLowerCase().replaceAll("[^a-z]", "");
		System.out.println(str);
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reverse)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
