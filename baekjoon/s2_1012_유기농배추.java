package baekjoon;

import java.io.*;
import java.util.*;

public class s2_1012_¿Ø±‚≥ÛπË√ﬂ {

	static int M;
	static int N;
	static int K;
	static int[][] graph = new int[51][51];
	static int[] visited;
	static StringBuilder sb = new StringBuilder();
	
	static boolean dfs(int x, int y) {
		
		if( x <= -1 || x >= M || y <= -1 || y >= N) {
			return false;
		}
		
		if(graph[x][y] == 1) {
			graph[x][y] = 0;
			
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y + 1);
			dfs(x, y - 1);
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
	
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K= Integer.parseInt(st.nextToken());
			
			
			
			for(int j = 0; j < K; j ++) {
				st = new StringTokenizer(br.readLine());
				
				int n1 = Integer.parseInt(st.nextToken());
				int n2 = Integer.parseInt(st.nextToken());
				
				graph[n1][n2]= 1;
				
			}

			
			int result = 0;
			for(int a = 0; a < M; a ++) {
				for(int b = 0; b < N; b++) {
					if(dfs(a, b)) {
						result += 1;
					}
				}
			}
			
			sb.append(result + "\n");
			
			
		}
		
		System.out.println(sb);
	}
}
