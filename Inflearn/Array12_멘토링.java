package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array12_∏‡≈‰∏µ {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] array = new int[M][N];

		for (int i = 0; i < M; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				array[i][j] = Integer.parseInt(st1.nextToken());
			}
		}

		int answer = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				int cnt = 0;

				for (int k = 0; k < M; k++) {
					// ∏‡≈‰, ∏‡∆º
					int pi = 0, pj = 0;
					for (int s = 0; s < N; s++) {
						// ∏‡≈‰∂Û∏È
						if (array[k][s] == i) {
							pi = s;
						}
						if (array[k][s] == j) {
							pj = s;
						}
					}
					if (pi < pj) {
						cnt++;
					}
				}

				if (cnt == M) {
					answer++;
				}

			}
		}

		System.out.println(answer);
	}

}
