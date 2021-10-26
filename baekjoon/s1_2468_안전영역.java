package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class s1_2468_안전영역 {

/*
 * 
 * 
 * 
 * 
 *  -----------다---------------시---------------
 *   			   어려워서 못품
 * 
 * 
 * 
 */
	
	static int N;
//	static int[][] array;
	static boolean[][] visited;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int[] ax = { -1, 1, 0, 0 };
	static int[] ay = { 0, 0, -1, 1 };
	static int answer = 0;

	public static void main(String[] args) throws Exception {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		visited = new boolean[N][N];
		int[][] array = new int[N][N];

		// 배열 초기 배열 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				max = Math.max(max, num);
				min = Math.min(min, num);
				array[i][j] = num;
			}
		}
		
		int[][] array_copy = copy_array(array);

		List<Integer> result = new ArrayList<Integer>();
		for (int n = 1; n <= max; n++) {
			// 배열을 0, 1로 초기화
			reset_array(n, array);

			// bfs시작
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if (array[i][j] == 1) {
						bfs(i, j, array);
						answer++;
					}
				}
			}
			result.add(answer);
			
			answer = 0;

			// 배열을 다시 원래 상태로 복구
			array = array_copy;

			// visited 복구
			reset_visited();
			
		}
		
		Collections.sort(result);
		System.out.println(result.get(result.size() - 1));
	}
	
	static int[][] copy_array(int[][] array){
		int[][] copy = new int[array.length][array[0].length];
		
		copy = array.clone();
		return copy;
	}

	// 배열 0, 1로 초기화
	static void reset_array(int num, int[][] array) {

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (array[i][j] <= num) {
					array[i][j] = 0;
				} else {
					array[i][j] = 1;
				}
			}
		}

	}

	static void reset_visited() {

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				visited[i][j] = false;
			}
		}
	}

	public static void bfs(int x, int y, int[][] array) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(x, y));
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			x = node.getX();
			y = node.getY();

			for (int i = 0; i < 4; i++) {
				int nx = x + ax[i];
				int ny = y + ay[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
					if (visited[nx][ny] == false && array[nx][ny] == 1) {
						queue.add(new Node(nx, ny));
						visited[nx][ny] = true;
						array[nx][ny] = 0;
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
