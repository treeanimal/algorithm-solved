package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class s4_4949_±ÕÇüÀâÈù¼¼»ó {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		while (true) {

			String str = br.readLine();
			if (str == null || str.isEmpty()) {
				break;
			}

			int small_bracket = 0;
			int middle_bracket = 0;
			boolean flag = true;
			for (char c : str.toCharArray()) {
				if (c == ']' || c == ')') {
					if (c == ']') middle_bracket--;
					if (c == ')') small_bracket--;
					if (small_bracket < 0 || middle_bracket < 0) {
						flag = false;
						break;
					}
				}
				if (c == '[')
					middle_bracket++;
				if (c == '(')
					small_bracket++;

			}

			if (middle_bracket == 0 && small_bracket == 0)
				flag = true;
			else
				flag = false;

			if (flag == true)
				sb.append("YES\n");
			else
				sb.append("NO\n");

		}

		System.out.println(sb);
	}

}
