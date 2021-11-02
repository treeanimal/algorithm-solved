package baekjoon;

import java.util.Scanner;

class b1_2748피보나치수2{
    
	public static int[] array;
	public static int sum;
	public static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		array = new int[N + 1];
		array[0] = 0;
		array[1] = 1;

		for (int i = 0; i <= array.length; i++) {
			array[i] = -1;
		}
		
		dp(N);
	}

	public static int dp(int now) {
		if(array[now] == -1) {
			array[now] = dp(now - 1) + dp(now -2);
		}
		
		return array[now];
	}
}