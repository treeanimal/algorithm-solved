package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s5_14582_오늘도졌다 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] arr1 = new int[9];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		int[] arr2 = new int[9];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}

		// 1. 원래 지고 있었다.
		// 2. 이기고 있었지만 역전을 당했다.
		
		String answer = "No";
		int A = 0;
		int B = 0;
		for (int i = 0; i < 9; i++) {
			A += arr1[i];
			if( A > B ) {
				answer = "Yes";
			}	
			B += arr2[i];
			
		}
		
		System.out.println(answer);
	}

}
