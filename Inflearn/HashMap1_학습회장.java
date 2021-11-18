package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1_학습회장 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		char answer = 0;
		int max = Integer.MIN_VALUE;
		for (char key : map.keySet()) {
			
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		System.out.println(answer);
		
		

	}

}
