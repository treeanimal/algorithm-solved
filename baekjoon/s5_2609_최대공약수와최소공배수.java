package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s5_2609_최대공약수와최소공배수 {

	static int GCD(int N, int M) {
		// 최대 공약수
		if((M) == 0) {
			return N;
		}else return GCD(M, N % M);
		
	}
	
	static int LCM(int N, int M) {
		return N * M / GCD(N, M);
	}
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		System.out.println(GCD(N, M));
		System.out.println(LCM(N, M));
	}
}
