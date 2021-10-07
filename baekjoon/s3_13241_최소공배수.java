package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s3_13241_최소공배수 {

	static long GCD(long N, long M) {
		if(M == 0) {
			return N;
		}else return GCD(M, N % M);
	}
	
	static long LCM(long N, long M) {
		return N * M / GCD(N, M);
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = (long) Integer.parseInt(st.nextToken());
		long M = (long) Integer.parseInt(st.nextToken());
		
		LCM(N, M);
		
		
	}
}
