package programmers;

import java.util.HashSet;
import java.util.Set;

public class level2_방문길이 {

	public int solution(String dirs) {
		int answer = 0;

		Set<String> set = new HashSet<String>();

		int x = 0, y = 0;
		for (char c : dirs.toCharArray()) {
			int next_x = 0;
			int next_y = 0;

			if (c == 'U') {
				next_x = x + 1;
				next_y = y;
			} else if (c == 'R') {
				next_x = x;
				next_y = y + 1;
			} else if (c == 'L') {
				next_x = x;
				next_y = y - 1;
			} else {
				next_x = x - 1;
				next_y = y;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		level2_방문길이 a = new level2_방문길이();
		System.out.println(a.solution("ULURRDLLU"));

	}

}
