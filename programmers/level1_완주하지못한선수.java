package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class level1_완주하지못한선수 {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < participant.length; i++) {
			map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
		}

		for (int i = 0; i < completion.length; i++) {
			map.put(completion[i], map.get(completion[i]) - 1);
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				answer = entry.getKey();
			}
		}
		return answer;
	}
}
