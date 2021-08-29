package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class level2_가장큰수 {

	public String solution(int[] numbers) {
		String answer = "";
		
		String[] str = new String[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			str[i] = String.valueOf(numbers[i]);
		} 
		
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				for(String c : str) {
					System.out.print(c + " ");
				}
				System.out.println();
				System.out.println(a);
				System.out.println(b);
				System.out.println(b+a);
 				System.out.println(a+b);
				return (b+a).compareTo(a+b);
			}
			
		});
		
		

		if(str[0].equals("0")) return "0";
		
		for(String s : str) answer += s;
		
		return answer;
	}

	public static void main(String[] args) {
		
		level2_가장큰수 numbers = new level2_가장큰수();
		numbers.solution(new int[] {5, 1, 3, 9 ,13});
	}
}
