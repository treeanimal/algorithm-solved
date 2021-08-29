package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class g3_2437_Àú¿ï {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] array = new int[N];
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		
		int sum = 0;
 		for(int i = 0; i < N; i++) {
			if(sum + 1 < array[i]) {
				break;
			}
			
			sum += array[i];
			
		}
		System.out.println(sum + 1);
	}

}
