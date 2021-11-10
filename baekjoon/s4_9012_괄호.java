package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s4_9012_°ýÈ£ {

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			solution(str);
		}
		
		System.out.println(sb);
	}

	public static void solution(String str) {

		char[] c_arr = str.toCharArray();
		int answer = 0;
		for (char c : c_arr) {
			if (answer == -1) {
				sb.append("NO\n");
				return;
			}
			if (c == '(') answer++;
			else if (c == ')') answer--;
			
		}
		if(answer != 0) {
			sb.append("NO\n");
		}else {
			sb.append("YES\n");
		}
	}

}
