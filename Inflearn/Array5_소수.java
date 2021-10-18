package Inflearn;

import java.util.Scanner;

public class Array5_¼Ò¼ö {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int answer = 0;
		int[] array = new int[N + 1];
		for(int i = 2; i <= N; i++	) {
			if(array[i] == 0) {
				answer++;
				for(int j = i; j <= N; j = j + i) {
					array[j] = 1;
				}
			}
		}
		
		System.out.println(answer);
	}
}
