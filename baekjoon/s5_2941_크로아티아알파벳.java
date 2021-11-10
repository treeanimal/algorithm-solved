package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s5_2941_크로아티아알파벳 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		char[] c_arr = str.toCharArray();

		int answer = 0;
		for (int i = 0; i < c_arr.length; i++) {
			if (c_arr[i] == '=' || c_arr[i] == '-' || c_arr[i] == 'j' || c_arr[i] == 'z') {
				
				if(c_arr[i] == 'j') {
					if(c_arr[i - 1] == 'l' || c_arr[i - 1] == 'n') {
						continue;
					}else {
						answer++;
					}
				}
				
				if(c_arr[i]== 'z') {
					if(c_arr[i - 1] == 'd') {
						continue;
					}else {
						answer++;
					}
				}
				
				continue;
			}
			
			answer++;
		}

		System.out.println(answer);
	}

}
