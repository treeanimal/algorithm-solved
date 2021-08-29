package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s2_1541_ÀÒ¾î¹ö¸°°ýÈ£ {
	
	public static void main(String[] args) throws Exception{
		
		int sum = Integer.MAX_VALUE;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] array = input.split("-");
	
		for(int i = 0; i < array.length; i++) {
			
			int temp = 0;
			
			String[] add = array[i].split(",");
			
			for(int j = 0; j < add.length; j++) {
				temp += Integer.parseInt(add[j]);
			}
			
			if(sum == Integer.MAX_VALUE) {
				sum = temp;
			}else {
				sum -= temp;
			}
		}
		
		System.out.println(sum);
	}
}
