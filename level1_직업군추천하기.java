
public class level1_직업군추천하기 {
	
	static class Solution {
	    public String solution(String[] table, String[] languages, int[] preference) {
	        String answer = "";
	        int max = 0;
	        String maxJob = "";
	        // 필요한 변수
	        // 1. 기업체 (SI, CONTENT 등)을 걸러야 한다.
	        // for문을 돌면서 하나의 문자열당 배열에 기업체와 언어를 걸러야 한다.
	        // 업체별마다 선호 점수가 있으니까 score를 알아 내야 한다.for문을 돌며 table을 돌면서 
	        // 두번째 for문을 돌면서 languages를 비교하며 맞는 것이 있다면 preference * score를 한다.
	        // 동점이 있는지 없는지 검사한다.
	        
	        for(int i = 0; i < table.length; i++) {
	        	String[] table_array = table[i].split(" ");
	        	String job = "";
	        	int sum = 0;
	        	
	        	// split으로 쪼갠 배열을 다시 array를 반복문으로 돌린다.
	        	for(int j = 0; j < table_array.length; j++) {
	        		int score = table_array.length - j;
	        		
	        		if(j == 0) {
	        			job = table_array[j];
	        			continue;
	        		}
	        		
	        		// 언어를 반복문으로 돌려 
	        		for(int k = 0; k < languages.length; k++) {
	        			if(languages[k].equals(table_array[j])) {
	        				sum += preference[k] * score;
	        			}
	        		}
	        	}
	        	
	        	// 
	        	if(max <= sum) {
	        		
	        		if(max == sum) {
	        			if(maxJob.compareTo(job) < 0) {
	        				continue;
	        			}
	        		}
	        	}
	        	
	        	max = sum;
	        	maxJob = job;

	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		
	}
}
