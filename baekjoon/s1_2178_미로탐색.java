package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s1_2178_¹Ì·ÎÅ½»ö {

	static int N;
	static int M;
	static int[][] array;
	static boolean[][] visited;
	static int[] array_x = { -1, 1, 0, 0 };
	static int[] array_y = { 0, 0, -1, 1 };
	static int result = 1;

	public static void main(String[] args) throws Exception {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		array = new int[N + 1][M + 1];
		visited = new boolean[N + 1][M + 1];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				array[i + 1][j + 1] = str.charAt(j) - '0';
			}
		}

		bfs(1, 1);
		System.out.println(array[N][M]);

	}

	static void bfs(int x, int y) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(x, y));
		visited[x][y] = true;

		while (!queue.isEmpty()) {

			Node node = queue.poll();
			x = node.getX();
			y = node.getY();

			for (int i = 0; i < 4; i++) {
				int n_x = x + array_x[i];
				int n_y = y + array_y[i];

				if (n_x >= 1 && n_x <= N && n_y >= 1 && n_y <= M) {
					if (array[n_x][n_y] != 0 && visited[n_x][n_y] == false) {
						array[n_x][n_y] = array[x][y] + 1;
						queue.add(new Node(n_x, n_y));
						visited[n_x][n_y] = true;
					}
				}

			}

		}
	}

	static class Node {

		private int x;
		private int y;

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

}