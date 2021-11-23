import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String T = br.readLine();

		HashMap<Character, Integer> map1 = new HashMap();

		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (int i = 0; i < T.length(); i++) {
			map2.put(T.charAt(i), map2.getOrDefault(T.charAt(i), 0) + 1);
		}

		int lt = 0;
		int rt = 3;
		int answer = 0;
		String str = "";
		while (true) {
			if (rt > S.length() - 1)
				break;

			for (int i = lt; i < rt; i++) {
				map1.put(S.charAt(i), map1.getOrDefault(S.charAt(i), 0) + 1);
			}

			if (map2.equals(map1))
				answer++;

			rt++;
			lt++;
			str = "";
		}

		System.out.println(answer);

	}

}