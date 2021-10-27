package programmers;

public class level2_Ÿ�ٳѹ� {

//	2021/10/27 �ٽ�-----------------
	
	static int answer;

	// 3. dfs(numbers, target, idx:�� ��° �ε�������, sum: idx���� ������ ��).
	public void dfs(int[] numbers, int target, int idx, int sum) {
		// 4. ��� ������ Ž������ ��,
		if (idx == numbers.length) {
			// 5. �������� target�� �����ϸ� answer++ �� �޼ҵ� ����.
			if (sum == target)
				answer++;
			return;
		}

		// 6. ���� �ε����� ������ +�� �����ش�.
		sum += numbers[idx];
		// 7. ���� �ε��� dfs ����.
		dfs(numbers, target, idx + 1, sum);
		// 8. 6.�� ���� �ٽ� ���� ��,
		sum -= numbers[idx];
		// 9. ���� �ε����� ������ -�� �����ش�.
		sum += (-1 * numbers[idx]);
		// 10. �ٽ� ���� �ε��� dfs ����.
		dfs(numbers, target, idx + 1, sum);

	}

	public int solution(int[] numbers, int target) {
		// 1. answer�� ���������� ����.
		answer = 0;

		// 2. dfs����.
		dfs(numbers, target, 0, 0);

		return answer;
	}

	public static void main(String[] args) {
		level2_Ÿ�ٳѹ� a = new level2_Ÿ�ٳѹ�();
		System.out.println(a.solution(new int[] { 1, 1, 1, 1, 1 }, 3));
	}

}
