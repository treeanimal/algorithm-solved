package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class s4_10828_Ω∫≈√ {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			
			if (str.contains("push")) {
				String[] s = str.split(" ");
				stack.push(Integer.parseInt(s[1]));
			}else if (str.equals("top")) {
				if (!stack.isEmpty()) System.out.println(stack.peek());
				else System.out.println(-1);
			}else if (str.equals("size")) System.out.println(stack.size());
			else if (str.equals("empty")) {
				if (stack.isEmpty()) System.out.println(1);
				else System.out.println(0);
			}else if(str.equals("pop")) {
				if (!stack.isEmpty()) System.out.println(stack.pop());
				else System.out.println(-1);
			}
		}

	}

}
