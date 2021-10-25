package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class s1_2667_단지번호붙이기 {

	static int N;
	static int[][] array;
	static boolean[][] visited;
	static int[] ax = { -1, 1, 0, 0 };
	static int[] ay = { 0, 0, -1, 1 };
	static int total = 0;
	static int house = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		visited = new boolean[N + 1][N + 1];
		array = new int[N + 1][N + 1];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				array[i + 1][j + 1] = str.charAt(j) - '0';
			}
		}

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (array[i][j] == 1) {
//					bfs(i, j);
					dfs(i, j);
					total++;
					list.add(house);
					house = 0;
				}
			}
		}

		Collections.sort(list);
		System.out.println(total);
		for (int n : list) {
			System.out.println(n);
		}
	}

	public static void bfs(int x, int y) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(x, y));
		visited[x][y] = true;
		house++;
		array[x][y] = 0;

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			x = node.getX();
			y = node.getY();

			for (int i = 0; i < 4; i++) {
				int nx = x + ax[i];
				int ny = y + ay[i];

				if (nx >= 1 && ny >= 1 && nx <= N && ny <= N) {
					if (array[nx][ny] != 0 && visited[nx][ny] == false) {
						queue.add(new Node(nx, ny));
						visited[nx][ny] = true;
						house++;
						array[nx][ny] = 0;
					}
				}
			}
		}
	}

	public static void dfs(int x, int y) {

		if (x < 1 || y < 1 || x > N || y > N) {
			return;
		}

		if (array[x][y] == 1) {

			array[x][y] = 0;
			house++;

			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y - 1);
			dfs(x, y + 1);

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