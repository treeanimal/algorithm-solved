package programmers;

public class level1_x��ŭ�������ִ�n���Ǽ��� {

	public long[] solution(long x, int n) {
		long[] answer = new long[n];

		int num = 0;
		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1);

		}

		return answer;
	}
}
