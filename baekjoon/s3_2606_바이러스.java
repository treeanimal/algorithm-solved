package baekjoon;

import java.io.*;
import java.util.*;

public class s3_2606_바이러스 {

	static int N;
	static int M;
	static int[][] graph;
	static boolean[] visited;
	static int result;
	
	static int bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {

			start = q.poll();
			result += 1;
			
			for(int i = 1; i < visited.length; i++) {
				if( i != start && visited[i] == false && graph[start][i] == 1) {
					visited[i] = true;
					q.add(i);
				}
			}
			
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		graph = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		
		
		for(int i = 0; i < M; i ++) {
			st = new StringTokenizer(br.readLine());
			
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			graph[n1][n2] = graph[n2][n1] = 1;
			
		}
		
		for(int i = 1; i < N + 1; i++) {
			visited[i] = false;
		}
		
//		for(int i = 0; i < N + 1; i++) {
//			for(int j = 0; j < N + 1; j++) {
//				System.out.print(graph[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println(bfs(1) - 1);
		
	}
}
