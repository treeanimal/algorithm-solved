package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s2_10451_순열사이클 {

	public static int T;
	public static int N;
	public static int[][] array;
	public static boolean[] visited;
	public static int count;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		T = Integer.parseInt(br.readLine());

		for (int n = 0; n < T; n++) {
			N = Integer.parseInt(br.readLine());
			visited = new boolean[N + 1];
			array = new int[N + 1][N + 1];
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++) {
				int num = Integer.parseInt(st.nextToken());

				array[i][num] = array[num][i] = 1;
			}
			
			for(int i = 1; i <=N; i++) {
				if(visited[i] == false) {
//					dfs(i);
					bfs(i);
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
		

	}
	
	public static void dfs(int start) {
		visited[start] = true;
		
		for(int i = 1; i <= N; i++) {
			if(visited[i] == false && array[start][i] == 1) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int num = queue.poll();
			
			for(int i = 1; i <= N; i++) {
				if(array[num][i] == 1 && visited[i] == false) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
		
	}

}
