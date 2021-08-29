package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s2_11047_µ¿Àü0 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		for(int  i = 0 ; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(A);
		
		int count = 0;
		for(int i = N-1; i >= 0; i--) {
			if((K - A[i]) >= 0) {
				int quotient =  K / A[i];
				count += quotient;
				
				K -= quotient * A[i];
			}
		}
		
		System.out.println(count);
		
		
	}

}
