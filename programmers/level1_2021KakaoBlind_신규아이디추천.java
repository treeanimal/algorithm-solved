package programmers;

public class level1_2021KakaoBlind_�űԾ��̵���õ {

	public String solution(String new_id) {
		String answer = "";

		// 1 �ܰ�
		new_id = new_id.toLowerCase();
		// 2 �ܰ�
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		// 3 �ܰ�
		new_id = new_id.replaceAll("[.]{2,}", ".");
		// 4 �ܰ�
		new_id = new_id.replaceAll("^[.]|[.]$", "");
		// 5 �ܰ�
		if (new_id.equals("")) {
			new_id += "a";
		}
		// 6 �ܰ�
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			new_id = new_id.replaceAll("^[.]|[.]$", "");
		}
		// 7 �ܰ�
		if(new_id.length() <= 2 ) {
			while(new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length() - 1);
			}
		}
		return new_id;
	}

	public static void main(String[] args) {
		level1_2021KakaoBlind_�űԾ��̵���õ a = new level1_2021KakaoBlind_�űԾ��̵���õ();
//		System.out.println(a.solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(a.solution("=.="
));
	}
}
