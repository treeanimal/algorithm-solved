package programmers;

import java.util.Arrays;

public class level1_Ã¼À°º¹ {
	
	public int solution(int n, int[] lost, int[] reserve) {

		int answer = n - lost.length;
		Arrays.sort(lost);
		Arrays.sort(reserve);

		for(int i = 0; i < reserve.length; i++) {
			for(int j = 0; j < lost.length; j++) {
				if(reserve[i] == lost[j]) {
					reserve[i] = Integer.MAX_VALUE;
					lost[j] = Integer.MAX_VALUE;
					answer++;
					break;
				}
			}
		}
		
		for(int i = 0; i < reserve.length; i++) {
			for(int j = 0; j < lost.length; j++) {
				if(reserve[i] == Integer.MAX_VALUE || lost[j] == Integer.MAX_VALUE) {
					continue;
				}
				
				if(reserve[i] + 1 == lost[j] || reserve[i] - 1 == lost[j]) {
					reserve[i] = Integer.MAX_VALUE;
					lost[j] = Integer.MAX_VALUE;
					answer++;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		level1_Ã¼À°º¹ a = new level1_Ã¼À°º¹();
		System.out.println(a.solution(3, new int[] {3}, new int[] {1}));
	}

}
