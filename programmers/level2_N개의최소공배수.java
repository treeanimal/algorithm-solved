package programmers;

public class level2_N개의최소공배수 {
	
	static int GCD(int A, int B) {
		
		if(B == 0) {
			return A;
		}else return GCD(B, A % B);
	}
	
	static int LCM(int A, int B) {
		return A * B / GCD(A, B);
	}
	
	
	public int solution(int[] arr) {
		int answer = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			answer = LCM(answer, arr[i]);
		}
		
		return answer;
	}
}
