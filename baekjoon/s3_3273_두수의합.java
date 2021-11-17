package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s3_3273_두수의합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int X = Integer.parseInt(br.readLine());

		Arrays.sort(arr);

		int i = 0;
		int j = arr.length - 1;

		int sum = 0, answer =0;
		while (i < j) {
			sum = arr[i] + arr[j];
			
			if(sum == X) {
				answer ++;
				i++;
				j--;
			}
			if(sum > X) {
				j--;
			}
			if (sum < X) {
				i++;
			}
			
		}
		
		System.out.println(answer);

	}

}
