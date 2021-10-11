package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String12_Password {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		String answer = "";
		for(int i = 0; i < count; i++) {
			String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			
			char c =(char)Integer.parseInt(temp, 2);
			answer += c;
			str = str.substring(7);
			
			
		}
		
		System.out.println(answer);
		
	}
}
