package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class s1_1697_¼û¹Ù²ÀÁú {

	static int[] visited = new int[100001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		if (start == end) {
			System.out.println(0);
		} else
			bfs(start, end);
	}

	static void bfs(int start, int end) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visited[start] = 1;

		while (!queue.isEmpty()) {
			int num = queue.poll();

			for (int i = 0; i < 3; i++) {
				int next;
				if (i == 0) {
					next = num + 1;
				} else if (i == 1) {
					next = num - 1;
				} else {
					next = num * 2;
				}

				if (next == end) {
					System.out.println(visited[num]);
					return;
				}

				if (next >= 0 && next < visited.length && visited[next] == 0) {
					visited[next] = visited[num] + 1;
					queue.add(next);
				}
			}

		}

	}
}