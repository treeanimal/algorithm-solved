package Algorithm;

import java.util.ArrayList;

public class ReverseWord_IndexOf {

	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();
			
			int lt = 0, rt = x.length() - 1;
			while(lt < rt) {
				
				char temp = s[lt];
				s[lt] = s[rt];
				s[rt] = temp;
				lt++;
				rt--;
			}
			
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		ReverseWord_IndexOf a = new ReverseWord_IndexOf();
		System.out.println(a.solution(2, new String[] {"good", "Time"}));
	}
}
