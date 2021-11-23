package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class HashMap5_K번째큰수 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					set.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		
		int answer = -1;
		int cnt = 0;
		for (int n : set) {
			cnt++;
			if (cnt == K) {
				answer = n;
				break;
			}
		}
		
		System.out.println(answer);

	}

}
