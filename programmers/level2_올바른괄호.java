package programmers;

public final class level2_올바른괄호 {

	boolean solution(String s) {
		boolean answer = true;

		if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(')
			return false;

		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(')
				cnt++;
			else {
				if (cnt <= 0)
					return false;

				cnt--;
			}
		}

		if (cnt != 0)
			return false;

		return answer;
	}

	public static void main(String[] args) {
		level2_올바른괄호 a = new level2_올바른괄호();
		System.out.println(a.solution("(())()"));

	}

}
