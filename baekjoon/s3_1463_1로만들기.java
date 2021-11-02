package baekjoon;

import java.util.Scanner;

public class s3_1463_1로만들기 {

	static Integer[] arr;
	public static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		arr = new Integer[N + 1];
		arr[0] = arr[1] = 0;
		
		System.out.println(dp(N));
	}
	
	public static int dp(int N) {
		
		if(arr[N] == null) {
			
			if(N % 6 == 0) {
				arr[N] = Math.min(dp(N - 1), Math.min(dp(N / 3), dp(N / 2))) + 1;
			}
			else if(N % 3 == 0 ) {
				arr[N] = Math.min(dp(N / 3), dp(N - 1)) + 1;
			}else if(N % 2 == 0) {
				arr[N] = Math.min(dp(N / 2), dp(N - 1)) + 1;
			}else {
				arr[N] = dp(N - 1) + 1;
			}
		}
		
		return arr[N];
		
		
	}

}
