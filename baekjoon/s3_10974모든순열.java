package baekjoon;

import java.util.*;
import java.io.*;

public class s3_10974모든순열 {
	static int N;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	static int[] result;
	static boolean[] visited;

	static void dfs(int depth) {
		if (depth == N) {
			for (int i = 0; i < N; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				result[i] = i + 1;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		arr = new int[N];
		result = new int[N];
		visited = new boolean[N];

		for (int i = 1; i < N; i++) {
			arr[i] = i + 1;
		}

		dfs(0);
		System.out.println(sb);
	}

}
