package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class s5_1251_단어나누기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
//		System.out.println(N.length());
		
		Set<String> set = new TreeSet<String>();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < N.length(); i++) {
			for (int j = i + 1; j < N.length(); j++) {
				String s1 = sb.append(N.substring(0, i)).reverse().toString();
				sb.setLength(0);
				String s2 = sb.append(N.substring(i, j)).reverse().toString();
				sb.setLength(0);
				String s3 = sb.append(N.substring(j, N.length())).reverse().toString();
				sb.setLength(0);
				set.add(s1 + s2 +s3);
			}
			
		}
		
		System.out.println(set.iterator().next());
		
	}
}
