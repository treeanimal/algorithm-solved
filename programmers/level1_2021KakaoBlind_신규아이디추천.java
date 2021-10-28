package programmers;

public class level1_2021KakaoBlind_신규아이디추천 {

	public String solution(String new_id) {
		String answer = "";

		// 1 단계
		new_id = new_id.toLowerCase();
		// 2 단계
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		// 3 단계
		new_id = new_id.replaceAll("[.]{2,}", ".");
		// 4 단계
		new_id = new_id.replaceAll("^[.]|[.]$", "");
		// 5 단계
		if (new_id.equals("")) {
			new_id += "a";
		}
		// 6 단계
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			new_id = new_id.replaceAll("^[.]|[.]$", "");
		}
		// 7 단계
		if(new_id.length() <= 2 ) {
			while(new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length() - 1);
			}
		}
		return new_id;
	}

	public static void main(String[] args) {
		level1_2021KakaoBlind_신규아이디추천 a = new level1_2021KakaoBlind_신규아이디추천();
//		System.out.println(a.solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(a.solution("=.="
));
	}
}
