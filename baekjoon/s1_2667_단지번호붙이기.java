package baekjoon;

import java.io.*;
import java.util.*;

public class s1_2667_단지번호붙이기 {

	static int[][] graph;
	static int visited[];
	static int N;
	static int result;
	static int sum;
	
	static int[] dx = new int[] { -1, 1, 0, 0 };
	static int[] dy = new int[] { 0, 0, -1, 1 };

	static boolean dfs(int x, int y) {

		if (x <= -1 || x >= N || y <= -1 || y >= N) {
			return false;
		}

		if (graph[x][y] == 1) {
			graph[x][y] = 0;
			sum += 1;
			
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y - 1);
			dfs(x, y + 1);

			return true;
		}

		return false;

	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		graph = new int[26][26];
		visited = new int[((N * N) / 2) / 2];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		
		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (dfs(i, j)) {
					result += 1;
					array.add(sum);
					sum = 0;
				}
			}
		}
		
		Collections.sort(array);

		System.out.println(result);
		for(Integer a : array) {
			System.out.println(a);
		}

	}
}
