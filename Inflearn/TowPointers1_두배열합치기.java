package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TowPointers1_두배열합치기 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[N];
		for(int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[M];
		for(int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		List<Integer> answer = new ArrayList<Integer>();
		
		int p1 = 0, p2 = 0;
		while(p1 < N && p2 < M) {
			if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
			else answer.add(arr2[p2++]);
		}
		
		while(p1 < N) answer.add(arr1[p1++]);
		while(p2 < M) answer.add(arr2[p2++]);

		for(int n : answer) {
			System.out.print(n + " ");
		}
	}

}
