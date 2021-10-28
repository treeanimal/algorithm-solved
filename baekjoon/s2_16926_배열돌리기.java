package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s2_16926_배열돌리기 {

	// 우상좌하
	private static int[] dx = { 0, 1, 0, -1 };
	private static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		int[][] array = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int group_value = Math.min(N, M) / 2;

		for (int i = 0; i < R; i++) {

			for (int j = 0; j < group_value; j++) {
				int x = j;
				int y = j;

				int value = array[x][y];

				int idx = 0;
				while (idx < 4) {
					int nx = x + dx[idx];
					int ny = y + dy[idx];

					if (nx >= j && ny >= j && nx < N - j && ny < M - j) {
						array[x][y] = array[nx][ny];
						x = nx;
						y = ny;
					} else
						idx++;
				}
				array[j + 1][j] = value;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
