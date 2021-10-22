package programmers;

import java.util.Scanner;

public class level2_숫자의표현 {
	public int solution(int n) {
		int answer = 0;

		int count = 0;
		
		for(int j = 1; j <= n; j++) {

			int sum = 0;
			for (int i = j; i <= n; i++) {
				sum += i;

				if (sum == n) {
					count += 1;
					break;
				}else if(sum > n) break;

			}

		}

		answer = count;

		return answer;
	}

	public static void main(String[] args) {
		level2_숫자의표현 a = new level2_숫자의표현();
		System.out.println(a.solution(15));
	}
}
