package programmers;

import java.util.Scanner;

public class level2_������ǥ�� {
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
		level2_������ǥ�� a = new level2_������ǥ��();
		System.out.println(a.solution(15));
	}
}
