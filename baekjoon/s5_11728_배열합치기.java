package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s5_11728_배열합치기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[M];
		for (int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		int p1 = 0, p2 = 0;
		while(p1 < N && p2 < M) {
			if(arr1[p1]< arr2[p2]) sb.append(arr1[p1++] + " ");
			else sb.append(arr2[p2++] + " ");
		}
		while(p1 < N) sb.append(arr1[p1++] + " ");
		while(p2 < M) sb.append(arr2[p2++] + " ");
		
		System.out.println(sb);
	}
}
