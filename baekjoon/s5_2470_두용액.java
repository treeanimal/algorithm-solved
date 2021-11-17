package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s5_2470_µÎ¿ë¾× {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int i = 0;
		int j = arr.length - 1;

		int gap = Integer.MAX_VALUE;
		int ans1 = 0;
		int ans2 = 0;

		int temp;
		int sum;
		while (i < j) {
			sum = arr[i] + arr[j];
			temp = Math.abs(sum);
			if (temp < gap) {
				gap = temp;
				ans1 = arr[i];
				ans2 = arr[j];
			}
			if (sum > 0)
				j--;
			else
				i++;
		}

		System.out.println(ans1 + " " + ans2);

	}

}
