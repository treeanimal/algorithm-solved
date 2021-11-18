package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class s4_1764_µË∫∏¿‚ {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] arr1 = new String[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = br.readLine();
		}

		String[] arr2 = new String[M];
		for (int i = 0; i < M; i++) {
			arr2[i] = br.readLine();
		}

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			map.put(arr1[i], 1);
		}

		List<String> array = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < M; i++) {
			if (map.containsKey(arr2[i])) {
				count++;
				array.add(arr2[i]);
			}
		}
		
		Collections.sort(array);
		StringBuilder sb = new StringBuilder();
		sb.append(count + "\n");
		for (int i = 0; i < array.size(); i++) {
			sb.append(array.get(i) + "\n");
		}
		
		System.out.println(sb);

	}

}
