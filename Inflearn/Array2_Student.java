package Inflearn;

import java.util.Scanner;

public class Array2_Student {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] array = new int[N];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int count = 0;
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				count++;
			}
		}
		
		System.out.println(count);
	}

}
