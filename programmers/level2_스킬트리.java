package programmers;

public class level2_��ųƮ�� {

	public int solution(String skill, String[] skill_trees) {
		int answer = 0;

		for (String skillTree : skill_trees) {
			String tempSkill = skillTree;

			for (int i = 0; i < skillTree.length(); i++) {
				String s = skillTree.substring(i, i + 1);
				if (!skill.contains(s)) {
					tempSkill = tempSkill.replace(s, ""); // �ʼ� ��ų�� �ƴ� ��� �������� ġȯ
				}
			}

			if (skill.indexOf(tempSkill) == 0)
				answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		level2_��ųƮ�� a = new level2_��ųƮ��();
		System.out.println(a.solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" }));

	}

}
