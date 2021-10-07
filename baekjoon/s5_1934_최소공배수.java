package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s5_1934_최소공배수 {

	static int GCD(int N, int M) {
		
		if(M == 0) {
			return N;
		}else {
			return GCD(M, N % M);
		}
	}
	
	static int LCM(int N, int M) {
		return N * M / GCD(N, M);
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			System.out.println(LCM(N, M));
		}
		
		
	}
}
