package baekjoon;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class s4_1320_º£½ºÆ®¼¿·¯ {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		int max = Integer.MIN_VALUE;
		String answer = "";
		for (Entry<String, Integer> entry : map.entrySet()) {
			int num = entry.getValue();
			
			if (num > max) {
				answer = entry.getKey();
			}
		}
		System.out.println(answer);
	}

}
