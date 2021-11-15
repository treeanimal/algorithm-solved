package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s5_1316_그룹단어체커 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int answer = 0;
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			boolean flag = true;

			for (int j = 0; j < str.length(); j++) {
				int index = str.indexOf(str.charAt(j));
				
				if (index < j) {
					if (str.charAt(j - 1) != str.charAt(j)) {
						flag = false;
					}
				}
			}
			if (flag == true) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
