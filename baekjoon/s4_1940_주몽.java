package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s4_1940_аж╦Ы {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] arr1 = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr1);
		int p1 = 0, p2 = arr1.length - 1;
		int count = 0;
		while(p1 < p2) {
			if(arr1[p1] + arr1[p2] == M) {
				count++;
				p1++;
				p2--;
			}
			else {
				if(arr1[p1] + arr1[p2] > M) {
					p2--;
				}else p1++;
			}
		}
		
		System.out.println(count);
		
	}
}
