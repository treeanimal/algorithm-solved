package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class TwoPointers2_공통원소구하기 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;
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

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		List<Integer> answer = new ArrayList<Integer>(); 
		int p1 = 0, p2 = 0;
		while (p1 < N && p2 < M) {
			if(arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1++]);
				p2++;
			}
			else if(arr1[p1] < arr2[p2]) p1++;
			else p2++;
		}
		
		for(int n : answer) {
			System.out.print(n + " ");
		}

	}

}
