package programmers;

public class level1_문자열다루기기본 {

	public boolean solution(String s) {
		boolean answer = true;

		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i] - 0);
			if ((c[i] - 0 >= 65 && c[i] - 0 <= 90) || (c[i] - 0 >= 97 && c[i] - 0 <= 122)) {
				answer = false;
			}

		}

		if (s.length() != 4 && s.length() != 6) {
			answer = false;
		}
		System.out.println(answer);
		return answer;
	}
}
