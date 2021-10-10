package Inflearn;

import java.util.Scanner;

public class String9_extract_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		str = str.toLowerCase().replaceAll("[a-z]", "");
		
		System.out.println(Integer.parseInt(str));
	}
}
