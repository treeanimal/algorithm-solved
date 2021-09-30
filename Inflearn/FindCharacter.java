package Inflearn;

import java.util.*;

public class FindCharacter {
	

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);

		str = str.toLowerCase();
		c = Character.toLowerCase(c);
		
		int result = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				result++;
			}
		}
		
		
		
		System.out.println(result);
		
	}
}
