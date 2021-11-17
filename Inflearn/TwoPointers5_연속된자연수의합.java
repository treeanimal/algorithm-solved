package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoPointers5_연속된자연수의합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int answer = 0, cnt = 0, lt = 0;
		for (int rt = 0; rt < N; rt++) {
			if (arr[rt] == 0) cnt++;
			while (cnt > K) {
				if (arr[lt] == 0) cnt --;
				lt ++;
			}
			answer = Math.max(answer, rt - lt + 1);
			
		}
		
		System.out.println(answer);

	}

}
