package Inflearn;

import java.util.Scanner;
import java.util.Stack;

public class StackNQueue1_¿Ã¹Ù¸¥°ýÈ£ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		
		String answer = "YES";	
		int sum = 0;
		for (char c : str.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			}
			else {
				if (stack.isEmpty()) {
					answer = "NO";
					break;
				}
				stack.pop();
			}
		}
		
		if (!stack.isEmpty()) {
			answer = "NO";
		}
		
		System.out.println(answer);
	}

}
