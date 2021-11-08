package baekjoon;

import java.util.Scanner;

public class s5_3613_JavavsCpp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String answer = "";

		String language = "";
		char start = s.charAt(0);
		char end = s.charAt(s.length() - 1);
		char[] c_arr = s.toCharArray();
		// 첫 문자와 끝 문자가 '_' 인 경우
		if (start == '_' || end == '_') {
			language = "Error";
		}
		// 첫 문자가 대문자인 경우
		else if (Character.isUpperCase(s.charAt(0))) {
			language = "Error";
		}
		// 문자열이 "_"로 시작하거나 끝나지 않고, 소문자로 시작할 경우 -> Cpp과 Java로 선택히야 함
		else {
			// java인지 cpp인지 확인해야 함
			for (int i = 1; i < c_arr.length; i++) {
				// 해당 문자가 "_"인 경우
				if (c_arr[i] == '_') {
					// 전에 문자에 의해 language가 java였는데 "_"가 나온 경우
					if (language.equals("Java")) {
						language = "Error";
						break;
					}
					// 전에 문자에 의해 language가 cpp였는데 "_"가 연속된 경우
					else {
						if (c_arr[i + 1] == '_') {
							language = "Error";
							break;
						}
						// 문자가 "_"가 나왔는데 전에 문자에 의해 java 아니였거나, "_"가 연속으로 나오지 않는 경우
						// 해당 언어를 cpp이라고 한다.
						// 언어를 한번 정하게 되면 다음 for의 if문에 의해 Error가 생기거나, 해당 언어의 조건에 맞춰지거나.
						else {
							language = "Cpp";
						}
					}
				}
				// 해당 문자가 대문자인 경우
				else if (Character.isUpperCase(c_arr[i])) {
					// 문자가 대문자인데 언어가 Cpp이라고 되어있는 경우
					if (language.equals("Cpp")) {
						language = "Error";
						break;
					}
					// 그렇지 않은 경우 언어를 Java라고 한다.
					else {
						language = "Java";
					}
				}

			}
		}

		StringBuilder sb = new StringBuilder();

		if (language.equals("Error")) {
			System.out.println("Error!");
		}
		// 언어가 Java인 경우 Cpp로 변환
		else if (language.equals("Java")) {
			for (int i = 0; i < c_arr.length; i++) {
				// 해당 문자가 대문자인 경우 -> 문자열에 "_"을 추가하고, 대문자였던 문자를 소문자로 바꿔서 문자열에 추가한다.
				if (Character.isUpperCase(c_arr[i])) {
					sb.append('_');
					sb.append(Character.toLowerCase(c_arr[i]));
				} else {
					sb.append(c_arr[i]);
				}
			}
			System.out.println(sb.toString());
		}
		// 언어가 Cpp인 경우 Java로 변환
		else if (language.equals("Cpp")) {
			for (int i = 0; i < c_arr.length; i++) {
				// "_"인 경우
				if (c_arr[i] == '_') {
					// "_"다음 문자를 대문자로 바꾸고 문자열에 추가한다.
					i++;
					sb.append(Character.toUpperCase(c_arr[i]));
				} else {
					sb.append(c_arr[i]);
				}
			}
			System.out.println(sb.toString());
		} else {
			for (int i = 0; i < c_arr.length; i++) {
				sb.append(c_arr[i]);
			}
			System.out.println(sb.toString());
		}

	}
}
