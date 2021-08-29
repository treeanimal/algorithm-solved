package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s4_1026_보물 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
//		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		int[] B = new int[N];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());

		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st1.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		for(int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(st2.nextToken());
		}
		
		int sum = 0;
//		int[] index = new int[N];
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i = 0; i < N; i++) {
			sum += A[i] * B[N - 1 -i];
		}
		
		System.out.println(sum);
		
	}

}
