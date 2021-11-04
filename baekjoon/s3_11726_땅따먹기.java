package baekjoon;

import java.util.Scanner;

public class s3_11726_¶¥µû¸Ô±â {

	static Integer[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		arr = new Integer[N + 1];
		
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		
		System.out.println(dp(N));
	}

	static int dp(int N) {
		if (arr[N] == null) {
			arr[N] = (dp(N - 2) + dp(N - 1)) % 10007;
		}
		
		return arr[N];
	}

}
