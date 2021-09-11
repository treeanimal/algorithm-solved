package baekjoon;

import java.util.*;
import java.io.*;



public class s1_2178_¹Ì·ÎÅ½»ö {

	static int N;
	static int M;
	static int[][] graph;
	static boolean[][] visited; 
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int result;
	
	public static class Node{
		private int x;
		private int y;
		
		Node() {}
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
	}
	
	static int bfs(int x, int  y) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(new Node(x, y));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			visited[x][y] = true;
			
			int ax = node.getX();
			int ay = node.getY();
			
			for(int i = 0 ; i < 4; i++) {
				
				int nx = ax + dx[i];
				int ny = ay + dy[i];
				
				if(nx >= 1 && nx <= N && ny >= 0 && ny <= M) {
					if(graph[nx][ny] != 0 && visited[nx][ny] == true ) {
						result += 1;
						graph[nx][ny] = result;
						q.offer(new Node(nx, ny));
						visited[nx][ny] = true;
					}
				}
			}
		}
		return graph[N][M];
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graph = new int[N + 1][M + 1];
		visited = new boolean[N+1][M+1];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 1; j < M + 1; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i = 1; i < N + 1; i++) {
			for(int j = 1; j < M + 1; j++) {
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
		
//		bfs(1, 1);
		
		
	}
}
