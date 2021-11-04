package baekjoon;

import java.util.Scanner;

public class g4_16916_부분문자열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String P = sc.nextLine();

		String temp = S;
		int answer = 0;
		for (int i = 0; i < S.length(); i++) {
			String s = S.substring(i, i + 1);
			if (!P.contains(s)) {
				temp = temp.replace(s, "");
			}
		}

		if (P.indexOf(temp) == 0) {
			answer = 1;
		}

		System.out.println(answer);
	}

}
