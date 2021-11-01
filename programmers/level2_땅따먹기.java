package programmers;

public class level2_¶¥µû¸Ô±â {

	int solution(int[][] land) {
		int answer = 0;

		int max_index = -1;
		for (int i = 0; i < land.length; i++) {
			
			int max = Integer.MIN_VALUE;
			int index = 0;
			
			for (int j = 0; j < 4; j++) {
				
				int num = land[i][j];
				
				if (num > max && index != max_index) {
					max = num;
					max_index = index;
				}
				
				index++;
				
			}
			System.out.println(max);
			answer += max;
		}

		return answer;
	}
}
