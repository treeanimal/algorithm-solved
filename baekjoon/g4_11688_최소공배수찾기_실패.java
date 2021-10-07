package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class g4_11688_최소공배수찾기_실패 {

	// L의 약수
//	static ArrayList<Integer> array = new ArrayList<Integer>();
	static int result;
	
	static int GCD2(int A, int B) {
		if(B == 0) {
			return A;
		}else return GCD2(B, A % B);
	}

	static int LCM2(int A, int B) {
		return A * B / GCD2(A, B);
	}
	
	static int get_result(int lcm, int L) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		// L의 약수를 구한다.
		for(int i = 0; i < L; i ++) {
			if(L % (i + 1) == 0) {
				array.add(i + 1);
			}
		}
		
		// 약수들을 순회하며 최소공배수가 L이라면 return 하고, 없으면 -1을 리턴한다.
		for(int i = 0; i < array.size(); i++) {
			// 미리 구한 A, B의 최소공배수의 값과 L의 약수와의 최수공배수를 구하여 L과 같으면 약수를 리턴, 없으면 -1 리턴
			// result_L : A, B의 최소공배수 & L의 약수의 최소공배수
			int result_L = LCM2(lcm, array.get(i));
			if(result_L == L) {
				result = array.get(i);
				break;
			}else result = -1;
		}
		
		return result;
	}

	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		try {
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			
			int lcm = LCM2(A, B);
			System.out.println(get_result(lcm, L)); 
		}catch (Exception e) {
			System.out.println("-1");
		}
		
	
	}
}
