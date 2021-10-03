package Inflearn;

import java.util.*;
import java.io.*;

public class ReverseChar {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		String[] array = new String[N];
		for(int i = 0; i < N; i++) {
			array[i] = br.readLine();
			
			for(int j = array[i].length() - 1; j >= 0; j--) {
				char c = array[i].charAt(j);
				sb.append(c);
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb);
		
	}
}
