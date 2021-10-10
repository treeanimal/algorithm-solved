package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String10_Shortest_Char_Distance {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		char t = st.nextToken().charAt(0);
		
		int[] array = new int[str.length()];
		
		int p = 1000;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == t) {
				p = 0;
				array[i] = p;
			}
			else {
				p++;
				array[i] = p;
			}
		}
		
		p = 1000;
		for(int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == t) {
				p = 0;
				array[i] = p;
			}
			else {
				p++;
				array[i] = Math.min(array[i], p);
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
