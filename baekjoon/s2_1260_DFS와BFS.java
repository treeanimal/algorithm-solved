package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class s2_1260_DFS¿ÍBFS{
	
	public static int N;
	public static int M;
	public static int V;
	
	public static boolean[] visited;
	public static int[][] array;
	
	public static void main(String[] arts) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N + 1];
		array = new int[N + 1][N + 1];
		for(int i = 0; i < M; i ++	) {
			st = new StringTokenizer(br.readLine());
			
			int one = Integer.parseInt(st.nextToken());
			int two = Integer.parseInt(st.nextToken());
			
			array[one][two] = array[two][one] = 1;
		}
		
		dfs(V);
		for(int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
		System.out.println("\n");
		bfs(V);
	}
	
	public static void dfs(int start) {
		visited[start] = true;
		System.out.print(start + " ");
		
		for(int i = 1; i <= N; i++) {
			if(array[start][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			visited[node] = true;
			System.out.println(node);
			
			for(int i = 1; i <= node; i++) {
				if(array[node][i] == 1 && visited[i] == false) {
					queue.add(i);
				}
			}
		}
	}
}