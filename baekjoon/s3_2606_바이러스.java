package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s3_2606_바이러스 {

	public static int N;
	public static boolean[] visited;
	public static int[][] array;
	public static int count;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int T = Integer.parseInt(br.readLine());
		
		visited = new boolean[N + 1];
		array = new int[N + 1][N + 1];
		for(int i = 0; i < T; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int one = Integer.parseInt(st.nextToken());
			int two = Integer.parseInt(st.nextToken());
			
			array[one][two] = array[two][one] = 1;
		}
		
		dfs(1);
		System.out.println(count - 1);
		count = 0;
		bfs(1);
		System.out.println(count - 1);
	}
	
	static void dfs(int start) {

		visited[start] = true;
		count++;
		
		for(int i = 1; i <= N; i++) {
			
			if(array[start][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
		
	}
	
	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			count++;
			for(int i = 1; i <= N; i++) {
				
				if(array[node][i] == 1 && visited[i] == false) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}

}
