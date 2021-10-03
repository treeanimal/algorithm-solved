package baekjoon;

import java.util.Scanner;

public class s5_2581_소수 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		int sum = 0;
		int min = 0;
		for (int i = N; i <= M; i++) {
			boolean chk = true;
			
			if(i == 0 || i == 1) {
				chk = false;
				continue;
			}
			for (int j = 2; j < i; j++) {

				// 소수라면
				if (i % j == 0) {
					chk = false;
					break;
				}
			}
			if (chk) {
				sum += i;
				if (min == 0) {
					min = i;
				}
			}
		}

		if (sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}

	}
}
