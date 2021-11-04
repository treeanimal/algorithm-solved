package programmers;

import java.util.Arrays;

public class level2_�����Ա� {

	int solution(int[][] land) {

		for (int i = 1; i < land.length; i++) {
			land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
			land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
			land[i][2] += Math.max(Math.max(land[i - 1][1], land[i - 1][0]), land[i - 1][3]);
			land[i][3] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][0]);
		}

		int[] answer = land[land.length - 1];
		Arrays.sort(answer);

		return answer[answer.length - 1];
	}

	public static void main(String[] args) {
		level2_�����Ա� a = new level2_�����Ա�();
		System.out.println(a.solution(new int[][] { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } }));
	}

}
