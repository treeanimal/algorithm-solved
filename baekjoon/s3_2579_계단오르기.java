package baekjoon;
import java.util.Scanner;

 
public class s3_2579_��ܿ����� {
 
	static Integer dp[];
	static int arr[];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		dp = new Integer[N + 1];
		arr = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			arr[i] = in.nextInt();
		}
		
		dp[0] = arr[0];	// ����Ʈ���� null�̹Ƿ� 0���� �ʱ�ȭ ���־���Ѵ�.
		dp[1] = arr[1];
		
		if(N >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		
		System.out.println(find(N));
		
	}
	
	static int find(int N) {
		// ���� Ž������ �ʴ� N��° ����� ���
		if(dp[N] == null) {
			dp[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1]) + arr[N];
		}
		
		return dp[N];
	}
	
}