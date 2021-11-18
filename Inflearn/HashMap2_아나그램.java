package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap2_아나그램 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine();
		String s2 = br.readLine();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		String answer = "YES";
		for (char c : s2.toCharArray()) {
			if (!map.containsKey(c) || map.get(c) == 0) {
				answer = "NO";
				break;
			}
			map.put(c, map.get(c) - 1);
				
		}
		

		System.out.println(answer);

	}

}
