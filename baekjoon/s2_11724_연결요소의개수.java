package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s2_11724_연결요소의개수 {

	public static int N;
	public static int M;
	public static boolean[] visited;
	public static int[][] array;
	public static int count;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		visited = new boolean[N + 1];
		array = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int one = Integer.parseInt(st.nextToken());
			int two = Integer.parseInt(st.nextToken());

			array[one][two] = array[two][one] = 1;
		}

		for (int i = 1; i <= N; i++) {
			if (visited[i] == false) {
				count++;
//				dfs(i);
				bfs(i);
			}
		}
		System.out.println(count);
	}

	public static void dfs(int start) {
		visited[start] = true;

		for (int i = 1; i <= N; i++) {
			if (array[start][i] == 1 && visited[i] == false) {
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
