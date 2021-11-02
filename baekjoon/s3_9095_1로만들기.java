package baekjoon;

import java.util.Scanner;

public class s3_9095_1로만들기 {

	public static Integer[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		arr = new Integer[11];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			System.out.println(dp(num[i])); 
			
		}
	}

	public static int dp(int num) {
		if (arr[num] == null) {
			arr[num] = dp(num - 3) + dp(num - 2) + dp(num - 1);
		}
		
		return arr[num];
	}

}
