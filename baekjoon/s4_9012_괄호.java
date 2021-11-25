package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class s4_9012_°ýÈ£ {

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			
			Stack<Character> stack = new Stack<Character>();
			String answer = "YES";			
			for (char c : str.toCharArray()) {
				if (c == '(') {
					stack.push(c);
				}else if (c == ')') {
					if (stack.isEmpty()) {
						answer = "NO";
						break;
					}
					stack.pop();
				}
			}
			if (!stack.isEmpty()) answer = "NO";
			System.out.println(answer);
		}
	}

}
