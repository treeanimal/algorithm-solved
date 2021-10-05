package programmers;

public class level1_콜라츠추측 {

	public static int solution(long num) {
		int answer = 0;

		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = num * 3 + 1;
			}

			++ answer;

			if (answer == 500) {
				answer = -1;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(level1_콜라츠추측.solution(626331));
	}
}
