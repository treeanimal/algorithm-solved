package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p5_16496_큰수만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] array = new String[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			array[i] = st.nextToken();
		}

		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return (o2 + o1).compareTo(o1 + o2);
			}
		});

		if (array[0].equals("0")) {
			System.out.println("0");
		} else {
			for (int i = 0; i < N; i++) {
				System.out.print(array[i]);
			}
		}

	}

}
