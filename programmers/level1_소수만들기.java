package programmers;

public class level1_�Ҽ������ {

	class Solution {
		public int solution(int[] nums) {
			int answer = 0;

			for (int i = 0; i < nums.length - 2; i++) {
				for (int j = i + 1; j < nums.length - 1; j++) {
					for (int h = j + 1; h < nums.length; h++) {
						int sum = nums[i] + nums[j] + nums[h];

						boolean check = true;
						for (int g = 2; g < sum; g++) {
							// �Ҽ��� �ƴѰ��
							if (sum % g == 0) {
								check = false;
								break;
							}
						}
						if (check == true) {
							answer++;
						}

					}
				}
			}

			return answer;
		}
	}
}
