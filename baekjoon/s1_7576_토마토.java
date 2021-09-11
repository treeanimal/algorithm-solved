package baekjoon;

import java.util.*;
import java.io.*;

class Node {
	private int x;
	private int y;
	private int day;

	public Node(int x, int y, int day) {
		this.x = x;
		this.y = y;
		this.day = day;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDay() {
		return day;
	}
}

public class s1_7576_토마토 {

	// 1 -> �떎 �씡�� 寃�
	// 0 -> �떎 �씡吏� �븡�� 寃�
	// -1 -> 鍮꾩뼱�엳�뒗 移�
	static int N;
	static int M;
	static int[][] graph;
	static int result;

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static void bfs() {
		Queue<Node> q = new LinkedList<Node>();
		int day = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (graph[i][j] == 1) {
					q.offer(new Node(i, j, 0));
				}
			}
		}

		while (!q.isEmpty()) {
			Node node = q.poll();
			day = node.getDay();

			for (int i = 0; i < 4; i++) {
				int nx = node.getX() + dx[i];
				int ny = node.getY() + dy[i];

				if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
					if (graph[nx][ny] == 0) {
						graph[nx][ny] = 1;
						q.offer(new Node(nx, ny, day + 1));
					}
				}

			}
		}

		if (checkTomato()) {
			System.out.println(day);
		} else {
			System.out.println(-1);
		}
	}

	static boolean checkTomato() {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (graph[i][j] == 0)
					return false;
			}
		}

		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new int[M][N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		bfs();

	}

}
