package Inflearn;

import java.util.Scanner;
import java.util.Stack;

public class StackNQueue2_괄호문자제거 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		String str = sc.nextLine();
		for (char c : str.toCharArray()) {
			
			if (c == ')') {
				while(stack.pop() != '(');
			}else stack.push(c);
		}
		for (int i = 0; i < stack.size(); i++) sb.append(stack.get(i));
		
		
		System.out.println(sb);

	}

}
