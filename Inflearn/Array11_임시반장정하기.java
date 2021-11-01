package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array11_임시반장정하기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[N + 1][6];
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j < 6; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int answer = 0, max = Integer.MIN_VALUE;
		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			for (int j = 1; j <= N; j++) {
				for(int k = 1; k <= 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i;
			}
		}

		System.out.println(answer);
	}
}
