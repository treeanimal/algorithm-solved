package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array8_등수구하기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i ++ ) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] count = new int[N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(array[i] < array[j]) {
					count[i] += 1;
				}
				
			}
			count[i] +=1;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(count[i] + " ");
		}
	}
}
