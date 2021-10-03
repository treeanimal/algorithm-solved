package Inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
	
public class LongWordInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] array = str.split(" ");
		
		int max = 0;
		String result = "";
		for(int i = 0; i < array.length; i++) {
			
			int word = array[i].length();
			
			if(max < word) {
				max = word;
				result = array[i];
			}
		}
		
		System.out.println(result);
	}
}
