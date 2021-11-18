package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class s4_10816_숫자카드2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[M];
		for (int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : arr1) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		StringBuilder sb = new StringBuilder();
		for (int n : arr2) {
			if (!map.containsKey(n)) {
				sb.append(0 + " ");
			} else {
				sb.append(map.get(n) + " ");
			}
		}

		System.out.println(sb);
	}

}
