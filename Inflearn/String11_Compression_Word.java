package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String11_Compression_Word {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str + " ";
		String answer = "";
		int count = 1;
		for(int i = 0; i < str.length() - 1; i ++) {
			if(str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}else {
				answer += str.charAt(i);
				if(count > 1) {
					answer += String.valueOf(count);
				}
				count = 1;
			}
		}
		
		System.out.println(answer);
	}

}
