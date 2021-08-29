package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class s2_18870_ÁÂÇ¥¾ÐÃà {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		

	
		int[] array = new int[N];
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int[] temp = array.clone();
		
		Arrays.sort(array);
		
		int cnt = 0;
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < N; i++) {
			if(!hash.containsKey(array[i])) {
				hash.put(array[i], cnt++);
			}
		}
		
		for(int i = 0; i < N; i++) {
			sb.append(hash.get(temp[i])).append(" ");
		}
		
		System.out.println(sb.toString());
		
	}
}
