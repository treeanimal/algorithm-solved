package programmers;

public class level2_스킬트리 {

	public int solution(String skill, String[] skill_trees) {
		int answer = 0;

		for (String skillTree : skill_trees) {
			String tempSkill = skillTree;

			for (int i = 0; i < skillTree.length(); i++) {
				String s = skillTree.substring(i, i + 1);
				if (!skill.contains(s)) {
					tempSkill = tempSkill.replace(s, ""); // 필수 스킬이 아닐 경우 공백으로 치환
				}
			}

			if (skill.indexOf(tempSkill) == 0)
				answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		level2_스킬트리 a = new level2_스킬트리();
		System.out.println(a.solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" }));

	}

}
