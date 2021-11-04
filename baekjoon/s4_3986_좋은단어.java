package baekjoon;

import java.util.Scanner;

public class s4_3986_좋은단어 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();

			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i) == 'A') count++;
				else {
					count--;
				}
			}
		}

	}

}
