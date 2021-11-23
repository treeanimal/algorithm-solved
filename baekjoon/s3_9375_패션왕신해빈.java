package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class s3_9375_ÆÐ¼Ç¿Õ½ÅÇØºó {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			
			int K = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			for (int j = 0; j < K; j++) {
				String str = br.readLine();
				String[] s_arr = str.split(" ");
				
				map.put(s_arr[1], map.getOrDefault(s_arr[1], 0) + 1);
			}
			
			int answer = 1;
			for (int n : map.values()) {
				answer *= n + 1;
			}
			
			System.out.println(answer - 1);
			
			
		}
	}

}
