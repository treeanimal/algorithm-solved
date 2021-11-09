package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s3_2003_수들의합2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int p1 = 0, p2 = 0, sum = 0, count = 0;
		while(p2 < N) {
			if(N == 1 && arr[0] == M) {
				count = 1;
				break;
			}
			if(sum >= M) {
				sum -= arr[p1++];
			}else {
				sum += arr[p2++];
			}
			if(sum == M) {
				count++;
			}
			
		}
		
		System.out.println(count);
	}
}
