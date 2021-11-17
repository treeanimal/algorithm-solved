package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s3_2559_¼ö¿­ {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int sum = 0, lt = 0, length = 0, answer = 0;
		for (int rt = 0; rt < N; rt++) {
			if ((rt - lt)  > K - 1) {
				sum -= arr[lt];
				lt++;
			}
			sum += arr[rt];
			answer = Math.max(sum, answer);

		}

		System.out.println(answer);

	}

}
