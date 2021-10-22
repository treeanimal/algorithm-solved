package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array7_점수계산 {

	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(array[i] == 0) {
				count = 0;
			}
			else {
				count++;
				answer += count;
			}
		}
		
		System.out.println(answer);
	}
}
