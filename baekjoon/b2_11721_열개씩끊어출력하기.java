package baekjoon;

import java.util.Scanner;

public class b2_11721_열개씩끊어출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		while(str.length() > 0) {
			if(str.length() >= 10) {
				String tmp = str.substring(0, 10);
				sb.append(tmp + "\n");
			}else {
				String tmp = str.substring(0, str.length());
				sb.append(tmp + "\n");
				break;
			}
			
			str = str.substring(10, str.length());
		}
		
		System.out.println(sb);
	}

}
