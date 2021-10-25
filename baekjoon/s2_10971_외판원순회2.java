package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s2_10971_외판원순회2 {

	public static int N;
	public static int[][] array;
	public static boolean[] visited;
	public static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		visited = new boolean[N + 1];
		array = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 1; j <= N; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		visited[1] = true;
		dfs(1, 1, 1, 0);
		
		System.out.println(min);

	}

	public static void dfs(int start, int now, int cnt, int sum) {

		if (start == now && sum > 0) {
			min = Math.min(min, sum);
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			
			if (array[now][i] > 0) {
				
				if(i == start && cnt == N) {
					sum += array[now][i];
					dfs(start, i, cnt + 1, sum);
				}
				
				else if (visited[i] == false) {
					
					visited[i] = true;
					sum += array[now][i];
					
					dfs(start, i, cnt + 1, sum);
					
					sum -= array[now][i];
					visited[i] = false;
					
				}
				
			}
			
		}
	}
}