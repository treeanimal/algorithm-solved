package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class b1_2750_수정렬하기 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0; i < input; i++) {
			array.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(array);
		
		for(int i = 0; i < input; i ++) {
			System.out.println(array.get(i));
		}
	}

}
