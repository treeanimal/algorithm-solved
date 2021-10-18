package Inflearn;

import java.util.Scanner;

public class Array4_피보나치수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] array = new int[N];
		array[0] = 1;
		array[1] = 1;
		
		for(int i = 2 ; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		
		for(int i = 0; i < array.length;i ++) {
			System.out.print(array[i] + " ");
		}
	}
}
