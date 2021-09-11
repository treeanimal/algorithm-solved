package programmers;

public class level1_로또의최고순위와최저순위 {

	public static int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = {0, 0};
	        
	        int count = 0;
	        
	        for(int i = 0; i < lottos.length; i++) {
	        	for(int j = 0; j < win_nums.length; j++) {
	        		if(lottos[i] == win_nums[j]) {
	        			count += 1;
	        		}
	        	}
	        }
	        
	        int zero_cnt = 0;
	        
	        for(int i = 0; i < lottos.length; i++) {
	        	if(lottos[i] == 0) {
	        		zero_cnt += 1;
	        	}
	        }
	        
	        int max = Math.min(6, count + zero_cnt);
	        int min = Math.max(0, count);

	        answer[0] = max;
	        answer[1] = min;

	        for(int i = 0; i < 2; i ++) {
	        	switch (answer[i]) {
				case 6:
					answer[i] = 1;
					break;
				case 5:
					answer[i] = 2;
					break;
				case 4:
					answer[i] = 3;
					break;
				case 3:
					answer[i] = 4;
					break;
				case 2:
					answer[i] = 5;
					break;
				default:
					answer[i] = 6;
					break;
				}
	        }
//	        
//	        for(int i = 0; i < 2; i ++) {
//	        	System.out.println(answer[i]);
//	        }
	        
	        return answer;
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19}));
	}
}
