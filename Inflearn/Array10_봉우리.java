package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array10_ºÀ¿ì¸® {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] array = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, 1, -1 };

		int answer = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					// »óÇÏÁÂ¿ì x,yÁÂÇ¥¸¦ ±¸ÇÑ´Ù.
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx >= 0 && ny >= 0 && nx < N && ny <N && array[nx][ny] >= array[i][j]) {
						flag = false;
						break;
					}
				}
				
				if(flag) answer++;
			}
		}
		
		System.out.println(answer);

	}

}
