package programmers;

public class level2_다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        
        String binary = Integer.toBinaryString(n);
        
        int sum = 0;
        
        for(char c : binary.toCharArray()) {
        	if(c == '1') {
        		sum++;
        	}
        }
        
        for(int i = 1; i < 1000000; i++) {
        	int next_n = n + i;
        	
        	String next_binary = Integer.toBinaryString(next_n);
        	
        	int new_sum =0 ;
        	for(char c : next_binary.toCharArray()) {
        		if(c == '1') {
        			new_sum++;
        		}
        	}
        	
        	if(sum == new_sum) {
        		answer = next_n;
        		break;
        	}
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	System.out.println(Integer.toBinaryString(77));
    }
}
