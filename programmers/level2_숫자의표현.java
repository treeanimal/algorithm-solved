package programmers;

import java.util.Scanner;

public class level2_������ǥ�� {
    public int solution(int n) {
        int answer = 0;
        
        int count = 0;
        int start = 1;
        while(start <= n) {
        	
        	int sum = 0;
        	for(int i = start; i <= n; i++) {
        		sum += i;
        		if(sum >= n) {
        			if(sum == n) {
        				count+=1;
        				break;
        			}
        		}
        	}
        	
        	start ++;
        }
        
        answer = count;
        
        return answer;
    }
    
    public static void main(String[] args) {
    	level2_������ǥ�� a = new level2_������ǥ��();
    	System.out.println(a.solution(15));
    }
}
