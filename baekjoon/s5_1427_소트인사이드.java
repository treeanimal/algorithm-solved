package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class s5_1427_소트인사이드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] arr = str.toCharArray();
		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
