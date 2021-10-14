package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array3_Rock_Scissors_Paper {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] A = new int[N];
		int[] B = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++	) {
			
			if(A[i] == B[i]) {
				System.out.println("D");
				continue;
			}
			if(A[i] == 1) {
				if(B[i] == 2) {
					System.out.println("B");
				}else if(B[i] == 3) {
					System.out.println("A");
				}
			}
			if(A[i] == 2) {
				if(B[i] == 1) {
					System.out.println("A");
				}else if(B[i] == 3) {
					System.out.println("B");
				}
			}
			if(A[i] == 3) {
				if(B[i] == 1) {
					System.out.println("B");
				}else if(B[i] == 2) {
					System.out.println("A");
				}
			}
		}
	}
}
