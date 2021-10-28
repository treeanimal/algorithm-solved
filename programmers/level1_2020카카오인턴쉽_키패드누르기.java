package programmers;

public class level1_2020카카오인턴쉽_키패드누르기 {

	public String solution(int[] numbers, String hand) {
		String answer = "";

		int left_hand = 10;
		int right_hand = 12;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				left_hand = numbers[i];
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				right_hand = numbers[i];
			} else {
				int left_hand_distance = getLength(left_hand, numbers[i]);
				int right_hand_distance = getLength(right_hand, numbers[i]);

				if (left_hand_distance > right_hand_distance) {
					right_hand = numbers[i];
					answer += "R";
				} else if (left_hand_distance < right_hand_distance) {
					left_hand = numbers[i];
					answer += "L";
				} else {
					if (hand.equals("right")) {
						answer += "R";
						right_hand = numbers[i];
					} else {
						answer += "L";
						left_hand = numbers[i];
					}
				}
			}
		}

		return answer;
	}

	public static int getLength(int index, int number) {
		index = (index == 0) ? 11 : index;
		number = (number == 0) ? 11 : number;
		
		int x = (index - 1) / 3;
		int y = (index - 1) % 3;
		int num_x = (number - 1) / 3;
		int num_y = 1;
		
		return Math.abs(x- num_x) + Math.abs(y - num_y);
	}

	public static void main(String[] args) {
		level1_2020카카오인턴쉽_키패드누르기 a = new level1_2020카카오인턴쉽_키패드누르기();
		System.out.println(a.solution(new int[] { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 }, "right"));
	}

}
