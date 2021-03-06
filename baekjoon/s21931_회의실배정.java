package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class s21931_ΘΈΐΗ½ΗΉθΑ€ {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] A = new int[N][2];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			A[i][0] = Integer.parseInt(st.nextToken());
			A[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			
			// μ§μ  μ’λ£?κ°μ΄ ?€? ?? ?? ?κ°λ³΄?€ ?κ±°λ κ°μ?? ( ??κ°? ??κ±°λ ?€? ?? λ°λ‘ ? ? ??κ±°λ ?  ?)
			if(prev_end_time <= A[i][0]) {
				prev_end_time = A[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
