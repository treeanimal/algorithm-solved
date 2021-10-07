package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class g4_11688_�ּҰ����ã��_���� {

	// L�� ���
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
		
		// L�� ����� ���Ѵ�.
		for(int i = 0; i < L; i ++) {
			if(L % (i + 1) == 0) {
				array.add(i + 1);
			}
		}
		
		// ������� ��ȸ�ϸ� �ּҰ������ L�̶�� return �ϰ�, ������ -1�� �����Ѵ�.
		for(int i = 0; i < array.size(); i++) {
			// �̸� ���� A, B�� �ּҰ������ ���� L�� ������� �ּ�������� ���Ͽ� L�� ������ ����� ����, ������ -1 ����
			// result_L : A, B�� �ּҰ���� & L�� ����� �ּҰ����
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
