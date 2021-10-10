package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse_Specific_Wrod {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		char[] s = str.toCharArray();
		
		int lt = 0, rt = str.length() -1;
		
		while(lt < rt) {
			
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char temp = s[lt];
				s[lt] = s[rt];
				s[rt] = temp;
				lt++;
				rt--;
			}
		}
		
		String temp = String.valueOf(s);
		
		System.out.println(temp);
	}
}
