package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s4_2960_에라토스테네스의체 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		boolean[] array = new boolean[N + 1];
		
		
		int count  = 0;
		int result = 0;
		
		Loop1:
		for(int i = 2; i < array.length; i++) {
			if(array[i] != true) {
				array[i] = true;
				count++;
				
				if(count == M) {
					result = i;
					break;
				}
			}
			for(int j = i*i; j < array.length; j = j+i) {
				if(array[j] != true) {
					array[j] = true;
					count++;
					
					if(count == M) {
						result = j;
						break Loop1;
					}
				}
			}
		}
		
		System.out.println(result);
	}
}
