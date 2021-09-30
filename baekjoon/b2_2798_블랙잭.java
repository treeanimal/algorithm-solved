package baekjoon;

import java.io.*;
import java.util.*;

public class b2_2798_∫Ì∑¢¿Ë {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] array = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				for(int h = j + 1; h < N; h++) {
					if( array[i] + array[j] + array[h] <= M) {
						if( array[i] + array[j] + array[h] > max) {
							max = array[i] + array[j] + array[h];
						}
					}
				}
			}
		}
		
		System.out.println(max);
	}

}
