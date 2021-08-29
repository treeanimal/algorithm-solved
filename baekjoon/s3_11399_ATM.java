package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s3_11399_ATM {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] P = new int[N];
		
		for(int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(P);
		
		int[] array = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += P[i];
			array[i] = sum;
		}
		
		int fin = 0;
		for(int i = 0; i < N; i++) {
			fin += array[i];
		}
	
		System.out.println(fin);

	}

}
