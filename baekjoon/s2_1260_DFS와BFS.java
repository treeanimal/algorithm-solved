package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s2_1260_DFS¿ÍBFS {

	public static int[][] graph;
	public static boolean visited[];
	public static int N;
	public static int M;
	public static int V;
	public static StringBuilder sb = new StringBuilder();

	public static void initVisited() {
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
	}

	public static void dfs(int start) {

		visited[start] = true;
		sb.append(start + " ");

		for (int i = 1; i < visited.length; i++) {
			if (i != start && visited[i] == false && graph[start][i] == 1) {
				dfs(i);
			}
		}
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(start);
		visited[start] = true;

		while (!q.isEmpty()) {
			int num = q.poll();
			sb.append(num + " ");

			for (int i = 1; i < visited.length; i++) {
				if (i != start && visited[i] == false && graph[num][i] == 1) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		graph = new int[N + 1][N + 1];
		visited = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int V1 = Integer.parseInt(st.nextToken());
			int V2 = Integer.parseInt(st.nextToken());

			graph[V1][V2] = graph[V2][V1] = 1;

		}

		dfs(V);

		sb.append("\n");
		initVisited();

		bfs(V);

		System.out.println(sb);

	}
}
