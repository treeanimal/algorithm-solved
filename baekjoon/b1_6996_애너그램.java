package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1_6996_애너그램 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<String> result=  new ArrayList<String>();
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String A = st.nextToken();
			String B = st.nextToken();
			
			char[] a_char_array = A.toCharArray();
			char[] b_char_array = B.toCharArray();
			
			Arrays.sort(a_char_array);
			Arrays.sort(b_char_array);
			
			String a_sort_char = new String(a_char_array);
			String b_sort_char = new String(b_char_array);
			
			if(a_sort_char.equals(b_sort_char)) {
				result.add(a_sort_char+ " & " + b_sort_char+ " are anagrams.");
			}else {
				result.add(a_sort_char+ " & " + b_sort_char+ " are Not anagrams.");
			}
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(result.get(i));
		}
	}

}
