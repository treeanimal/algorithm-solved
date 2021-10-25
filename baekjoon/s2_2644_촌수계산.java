package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s2_2644_ÃÌ¼ö°è»ê {

	public static int N;
	public static int[][] array;
	public static boolean[] visited;
	public static int M;
	public static int[] depth;
	

	public static void main(String[] args) throws Exception {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		array = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		depth = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());

		M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int one = Integer.parseInt(st.nextToken());
			int two = Integer.parseInt(st.nextToken());

			array[one][two] = array[two][one] = 1;

		}

		bfs(start, end);
		if(depth[end] != 0) {
			System.out.println(depth[end]);
		}else
			System.out.println(-1);
	}

	public static void bfs(int start, int end) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int num = queue.poll();

			for (int i = 1; i <= N; i++) {
				if (array[num][i] == 1 && visited[i] == false) {
					visited[i] = true;
					queue.add(i);
					depth[i] = depth[num] + 1;
				}
			}
		}
	}
}