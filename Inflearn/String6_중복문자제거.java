package Inflearn;

import java.util.Scanner;

public class String6_중복문자제거 {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i)
				answer += str.charAt(i);
		}
		
		System.out.println(answer);
	}

}
