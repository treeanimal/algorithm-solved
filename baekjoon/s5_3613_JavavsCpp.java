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
		// ù ���ڿ� �� ���ڰ� '_' �� ���
		if (start == '_' || end == '_') {
			language = "Error";
		}
		// ù ���ڰ� �빮���� ���
		else if (Character.isUpperCase(s.charAt(0))) {
			language = "Error";
		}
		// ���ڿ��� "_"�� �����ϰų� ������ �ʰ�, �ҹ��ڷ� ������ ��� -> Cpp�� Java�� �������� ��
		else {
			// java���� cpp���� Ȯ���ؾ� ��
			for (int i = 1; i < c_arr.length; i++) {
				// �ش� ���ڰ� "_"�� ���
				if (c_arr[i] == '_') {
					// ���� ���ڿ� ���� language�� java���µ� "_"�� ���� ���
					if (language.equals("Java")) {
						language = "Error";
						break;
					}
					// ���� ���ڿ� ���� language�� cpp���µ� "_"�� ���ӵ� ���
					else {
						if (c_arr[i + 1] == '_') {
							language = "Error";
							break;
						}
						// ���ڰ� "_"�� ���Դµ� ���� ���ڿ� ���� java �ƴϿ��ų�, "_"�� �������� ������ �ʴ� ���
						// �ش� �� cpp�̶�� �Ѵ�.
						// �� �ѹ� ���ϰ� �Ǹ� ���� for�� if���� ���� Error�� ����ų�, �ش� ����� ���ǿ� �������ų�.
						else {
							language = "Cpp";
						}
					}
				}
				// �ش� ���ڰ� �빮���� ���
				else if (Character.isUpperCase(c_arr[i])) {
					// ���ڰ� �빮���ε� �� Cpp�̶�� �Ǿ��ִ� ���
					if (language.equals("Cpp")) {
						language = "Error";
						break;
					}
					// �׷��� ���� ��� �� Java��� �Ѵ�.
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
		// �� Java�� ��� Cpp�� ��ȯ
		else if (language.equals("Java")) {
			for (int i = 0; i < c_arr.length; i++) {
				// �ش� ���ڰ� �빮���� ��� -> ���ڿ��� "_"�� �߰��ϰ�, �빮�ڿ��� ���ڸ� �ҹ��ڷ� �ٲ㼭 ���ڿ��� �߰��Ѵ�.
				if (Character.isUpperCase(c_arr[i])) {
					sb.append('_');
					sb.append(Character.toLowerCase(c_arr[i]));
				} else {
					sb.append(c_arr[i]);
				}
			}
			System.out.println(sb.toString());
		}
		// �� Cpp�� ��� Java�� ��ȯ
		else if (language.equals("Cpp")) {
			for (int i = 0; i < c_arr.length; i++) {
				// "_"�� ���
				if (c_arr[i] == '_') {
					// "_"���� ���ڸ� �빮�ڷ� �ٲٰ� ���ڿ��� �߰��Ѵ�.
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
