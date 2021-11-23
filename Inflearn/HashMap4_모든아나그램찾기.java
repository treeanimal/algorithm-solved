package Inflearn;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.BufferedReader;

public class HashMap4_모든아나그램찾기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (int i = 0; i < str2.length(); i++) {
			map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
		}

		for (int i = 0; i < str2.length() - 1; i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
		}

		int lt = 0;
		int answer = 0;
		for (int rt = str2.length() - 1; rt < str1.length(); rt++) {
			map1.put(str1.charAt(rt), map1.getOrDefault(str1.charAt(rt), 0) + 1);
			if ( map1.equals(map2)) answer++;
			map1.put(str1.charAt(lt), map1.get(str1.charAt(lt)) - 1);
			if (map1.get(str1.charAt(lt)) == 0) map1.remove(str1.charAt(lt));
			lt++;
		}
		
		System.out.println(answer);
	}

}
