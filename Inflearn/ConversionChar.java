package Inflearn;

import java.util.*;

public class ConversionChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
//		for(int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			
//		}
		for(char c : str.toCharArray()) {
			if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}else {
				sb.append(Character.toLowerCase(c));
			}
		}
		
		System.out.println(sb);
	}
}
